package manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import bean.Academy;
import bean.Attendance;
import bean.Transaction;



public class TransactionManager {

	public static void addTransaction(int courseId) {

		List<Transaction> transactionlist = Academy.transactionMap.get(courseId);
		Transaction t1 = new Transaction(10000, 101, new Date(3 / 10 / 2017));
		Transaction t2 = new Transaction(5000, 102, new Date(4 / 10 / 2017));
		Transaction t3 = new Transaction(15000, 106, new Date(5 / 10 / 2017));
		Transaction t4 = new Transaction(20000, 103, new Date(21 / 10 / 2017));
		Transaction t5 = new Transaction(10000, 104, new Date(22 / 10 / 2017));
		

		if(courseId==1) {
			ArrayList<Transaction>tr1=new ArrayList<Transaction>();
			tr1.add(t2);
			tr1.add(t3);
			Academy.transactionMap.put(1, tr1);
		}else if(courseId==2) {
			ArrayList<Transaction>tr2=new ArrayList<Transaction>();
			tr2.add(t5);
			tr2.add(t4);
			Academy.transactionMap.put(1, tr2);
		}else if(courseId==3) {
			ArrayList<Transaction>tr3=new ArrayList<Transaction>();
			tr3.add(t1);
			
			Academy.transactionMap.put(1, tr3);
		}
		
	}
	public static void show() {
		Iterator<Entry<Integer,List<Transaction>>>itr=Academy.transactionMap.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

}
}