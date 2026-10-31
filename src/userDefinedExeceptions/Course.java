package userDefinedExeceptions;
/*In a university enrollment system, a CourseFullException should be raised when a student tries to enroll in a course that has reached its maximum capacity.
*/
public class Course {

private String cName;
private int capacity;
private int enrolled;

public Course(String cName,int capacity,int enrolled) {
	this.cName=cName;
	this.capacity=capacity;
	this.enrolled=enrolled;
}

public void enroll()throws CourseFullException{
	if(enrolled>=capacity) {
		throw new CourseFullException("cannot enroll in "+cName+"course is full");
	}
	enrolled++;
	System.out.println("Successfully enrolled in"+cName+"Total enrolled:"+enrolled);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c = new Course("Java Programming", 25,23);
        try {
            c.enroll(); // First enrollment
            c.enroll(); // Second enrollment
            // Keep enrolling until full for demonstration
            for (int i = 0; i < 24; i++) {
                c.enroll(); // Enroll additional students
            }
            c.enroll(); // This will cause an exception
        } catch (CourseFullException e) {
            System.out.println(e.getMessage());
        }

	}

}
