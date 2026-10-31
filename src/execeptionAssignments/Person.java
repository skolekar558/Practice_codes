package execeptionAssignments;

public class Person {
	 private String name;

	    public Person(String name) {
	        this.name = name;
	    }

	    // Commenting out the implementation of Cloneable to demonstrate the exception
	    // protected Object clone() throws CloneNotSupportedException {
	    //     return super.clone();
	    // }

	    public String getName() {
	        return name;
	    }
}
