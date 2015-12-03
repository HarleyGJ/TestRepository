import java.util.Scanner;


public class Grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your mark (0-100)");
		int mark = sc.nextInt();
		
		boolean valid = false;
		while (!valid) {
			if (mark > 100) {
				System.out
						.println("Someone's cheating, that mark is too high.");
			} else if (mark < 0) {
				System.out.println("You can't do that badly");
			}else valid = true;
		}
		
		char grade = getGrade(mark);
		
		System.out.println("Your mark of " + mark + " is a grade " + grade);

	}

	private static char getGrade(int mark) {
		char grade = ' ';
		if(mark<60){
			System.out.println("Grade \"F\" Corresponds to scores less than 60%");
			grade = 'F';
		}else if(mark<70){
			System.out.println("Grade \"D\" Corresponds to scores from 60% to 69%");
			grade = 'D';
		}else if(mark<80){
			System.out.println("Grade \"C\" Corresponds to scores from 70% to 79%");
			grade = 'C';
		}else if(mark<90){
			System.out.println("Grade \"B\" Corresponds to scores from 80% to 89%");
			grade = 'B';
		}else{
			System.out.println("Grade \"A\" Corresponds to scores from 90% to 100%");
			grade = 'A';
		}
		return grade;
	}
//more changes
}
