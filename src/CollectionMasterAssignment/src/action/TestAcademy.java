package action;

import manager.AttendanceManager;
import manager.CourseManager;
import manager.StudentManager;
import manager.TestResultManager;
import manager.TransactionManager;

public class TestAcademy {
	public static void main(String[] args) {

		CourseManager.addCourse();
		
		StudentManager.addStudent(1);
		StudentManager.show();
		AttendanceManager.addAttendance(1);
		AttendanceManager.show();
        TransactionManager.addTransaction(1);
        TransactionManager.show();
        TestResultManager.addTestResult(1);
        TestResultManager.show();
		// data creation for 3 entries in student map
		// 1st 1 entry, 2nd 3 entries, 3rd 1 entry
		StudentManager.addDummyStudents();
		CourseManager.printMostFavouredCourse();
	}
}