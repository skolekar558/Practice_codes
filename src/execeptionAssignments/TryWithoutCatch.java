package execeptionAssignments;

public class TryWithoutCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int result=10/0;
	System.out.println(result);
}
finally {
	System.out.println("Always execute");
}
	}

}
