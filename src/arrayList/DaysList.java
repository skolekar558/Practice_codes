package arrayList;

import java.util.ArrayList;

/*Create arraylist of string. Add 7 days to list ( Monday , Sunday etc) Remove elements from list for which string length is more than 7 */
public class DaysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> days = new ArrayList<>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		System.out.println(days);
		for (int i = days.size() - 1; i >= 0; i--) {
			if (days.get(i).length() > 7) {
				days.remove(i);
			}
		}
		System.out.println("Modified List:" + days);
	}

}
