import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String input = null;
		int number = 0;
		
		boolean valid = false;
		while (!valid) {
			System.out.println("Please enter a number between 4 and 10");
			input = sc.next();
			if(input.length()==1&&
					Character.isDigit(input.charAt(0))){
				number = Character.getNumericValue(input.charAt(0));
				if(number > 4&&number<10){
					valid = true;
				}else System.out.println("Number must be between 4 and 10");
				
			}else System.out.println("That is not a valid number");
		}
		
	 
		int factorial = getFactorial(number);
		
		System.out.println("The factorial of " + number + " is: " + factorial);
	}

	private static int getFactorial(int number) {
		int factorial = 1;
		for(int x = 2; x <= number; x++){
			factorial = factorial*x;
		}
		return factorial;
		
	}

}
