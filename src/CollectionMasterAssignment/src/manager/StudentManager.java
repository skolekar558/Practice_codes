package manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import bean.Academy;
import bean.Course;
import bean.Student;

public class StudentManager {

	

	public static void addDummyStudents() {
		addStudent(1);
		addStudent(2);
		addStudent(3);
	}

	public static void addStudent(int courseId) {

		

		Student s1 = new Student(101, "john", 12345, "john@gmail.com");
		Student s2 = new Student(102, "smith", 12346, "smith@gmail.com");
		Student s3 = new Student(105, "robin", 12347, "robin@gmail.com");
		Student s4 = new Student(106, "james", 12348, "james@gmail.com");
		Student s5 = new Student(103, "ronald", 12349, "ronald@gmail.com");
		Student s6 = new Student(104, "shubhra", 12356, "shhggjh@gmail.com");
		Student s7 = new Student(105, "shiv", 123456, "dhjh@gmail.com");


		if(courseId==1) {
			ArrayList<Student>Student1=new ArrayList<Student>();
			Student1.add(s2);
			Student1.add(s3);
			Academy.studentMap.put(1, Student1);
		}else if(courseId==2) {
			ArrayList<Student>Student2=new ArrayList<Student>();
			Student2.add(s1);
			Student2.add(s4);
			Student2.add(s5);
		}
	
		else if(courseId==3) {
			ArrayList<Student>Student3=new ArrayList<Student>();
			Student3.add(s6);
			Student3.add(s7);
		}
	}
		public static void show() {
			Iterator<Entry<Integer,List<Student>>>itr=Academy.studentMap.entrySet().iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}
}

		