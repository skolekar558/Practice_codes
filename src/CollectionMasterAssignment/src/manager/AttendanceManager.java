package manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import bean.Academy;
import bean.Attendance;
import bean.Student;



public class AttendanceManager {
	
public static void addAttendance(int courseId) {
		
		List<Attendance> attendancelist = Academy.attendanceMap.get(courseId);
		 
			Attendance a2=new Attendance(112, 102, "a", new Date(8/10/2017));
			Attendance a3=new Attendance(113, 101, "p", new Date(9/10/2017));
			Attendance a4=new Attendance(114, 102, "p", new Date(10/10/2017));
			Attendance a5=new Attendance(115, 103, "a", new Date(11/10/2017));
			Attendance a6=new Attendance(116, 103, "p", new Date(12/10/2017));
			Attendance a7=new Attendance(117, 103, "a", new Date(13/10/2017));
			
			if(courseId==1) {
				ArrayList<Attendance>ar1=new ArrayList<Attendance>();
				ar1.add(a2);
				ar1.add(a3);
				Academy.attendanceMap.put(1, ar1);
			}else if(courseId==2) {
				ArrayList<Attendance>ar2=new ArrayList<Attendance>();
				ar2.add(a5);
				ar2.add(a4);
				Academy.attendanceMap.put(1, ar2);
			}else if(courseId==3) {
				ArrayList<Attendance>ar3=new ArrayList<Attendance>();
				ar3.add(a6);
				ar3.add(a7);
				Academy.attendanceMap.put(1, ar3);
			}
		
	}
public static void show() {
	Iterator<Entry<Integer,List<Attendance>>>itr=Academy.attendanceMap.entrySet().iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}


}
