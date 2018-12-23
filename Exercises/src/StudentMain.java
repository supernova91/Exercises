
public class StudentMain {
	
	
	public static void main(String [] args) {
	
	Student studentOne = new Student("John Smith", 75);
	
	System.out.printf("%s 's LetterGrade: is %s or %d percent" , studentOne.getName(), studentOne.getGrade(), studentOne.getAverage());

	}
}
