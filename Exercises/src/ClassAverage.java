import java.util.Scanner;

public class ClassAverage {
	
	public static void main (String [] args) {
		
		int counter = 1;
		
		int total = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (counter <= 10) {
			System.out.println("Enter Grade");
			int grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		
		int average = total / 10;
		
		System.out.printf("Grade Total: %d%n Grade Average:%d", total, average);
		
	}

}
