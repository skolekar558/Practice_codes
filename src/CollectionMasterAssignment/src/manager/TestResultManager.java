package manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import bean.Academy;
import bean.TestResult;
import bean.Transaction;

public class TestResultManager {
	public static void addTestResult(int courseId) {

		
		
		TestResult t1 =new TestResult(new Date(1/12/2023), 1, 12345, 55, 100);
		TestResult t2 = new TestResult(new Date(2/12/2023), 2, 123456, 65, 100);
		TestResult t3 = new TestResult(new Date(3/12/2023), 3, 123457, 75, 100);
		TestResult t4 = new TestResult(new Date(3/12/2023), 4, 123458, 80, 100);
		TestResult t5 = new TestResult(new Date(4/12/2023), 5, 123459, 85, 100);
		

		if(courseId==1) {
			ArrayList<TestResult>T1=new ArrayList<TestResult>();
			T1.add(t2);
			T1.add(t3);
			Academy.test_map.put(1, T1);
		}else if(courseId==2) {
			ArrayList<TestResult>T2=new ArrayList<TestResult>();
			T2.add(t5);
			T2.add(t4);
			Academy.test_map.put(2, T2);
		}else if(courseId==3) {
			ArrayList<TestResult>T3=new ArrayList<TestResult>();
			T3.add(t1);
			
			Academy.test_map.put(3, T3);
		}
		
	}
	public static void show() {
		Iterator<Entry<Integer,List<TestResult>>>itr=Academy.test_map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	}
}
