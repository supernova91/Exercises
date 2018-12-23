
public class Student {
	
	private String name;
	
	private int average;
	
	Student(String name, int average){	
		
		this.name = name;
		
		if(average > 0 && average <= 100) {
			this.average = average;
		}			
	}
	
	public String getGrade() {
		String letterGrade = "";
		
		if (average >= 90) {
			letterGrade = "A";
		}
		
		else if (average >= 70) {
			letterGrade = "B";
		}
		
		else if (average >= 50) {
			letterGrade = "C";
		}
		
		else {
			letterGrade = "F";
		}
		
		return letterGrade;
	}
	
	public int getAverage() {
		return average;
	}
	
	public void setAverage(int average) {
		this.average = average;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
