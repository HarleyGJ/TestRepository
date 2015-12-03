import java.util.HashMap;


public class Timetable {

	public static void main(String[] args) {

		HashMap<String, String> timetable = createTimetable();
		
		printTimetable(timetable);
		
	}


	private static HashMap<String, String> createTimetable() {
		HashMap<String, String> timetable = new HashMap <String, String>();
		timetable.put("Monday", "Job");
		timetable.put("Tuesday", "Job");
		timetable.put("Wednesday", "Badminton");
		timetable.put("Thursday", "Music");
		timetable.put("Friday", "Meditation");
		return timetable;		
	}
	private static void printTimetable(HashMap<String, String> timetable) {
		
		System.out.println("Personal Time Table");
		
		
		
		System.out.println(timetable.get(1));
		
	}

}
