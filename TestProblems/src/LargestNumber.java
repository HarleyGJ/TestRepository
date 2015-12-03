import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Please input 10 numbers.");
		numbers.add(sc.nextInt());
		
		
		for(int x = 1; x < 10; x++){
			System.out.println("Next number:");
			numbers.add(sc.nextInt());
		}
		
		Collections.sort(numbers);;
		System.out.println("The largest number entered was: " + numbers.get(9));
		
		//I did something
	}

}
