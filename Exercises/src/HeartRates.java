import java.time.Period;
import java.time.LocalDate;
public class HeartRates {
	
	private String name;
	
	private String lastName;
	
	private int month;
	
	private int day;
	
	private int year;
	
	private int currentAge;
	
	HeartRates(String name, String lastName, int month, int day, int year){
		
		this.name = name;
		
		this.lastName = lastName;
		
		this.month = month;
		
		this.day = day;
		
		this.year = year;	
	}
	
	public void displayData() {
		int maximumHeartRate = maximumHeartRate();
		double lowerTargetRange = lowerTargetHeartRate();
		double upperTargetHeartRate = upperTargetHeartRate();
		System.out.println(name + "'s" + "  D.O.B: " + month +  "/ " + day + "/ " + year + "  Maximum Heart Rate: " + maximumHeartRate + " " + "Target Heart Rate Range: " + " " + lowerTargetRange + " - " + upperTargetHeartRate);
	}
	
	public double upperTargetHeartRate() {
		double upperTarget = maximumHeartRate() *.85;
		return upperTarget;
	}
	
	public double lowerTargetHeartRate() {
		double lowerTarget = maximumHeartRate() * .50;
		return lowerTarget;
	}
	
	public int maximumHeartRate() {
		
		int maximumHeartRate = 220 - currentAge;
		
		return maximumHeartRate;
		
	}
	
	public int age() {
		
		LocalDate today = LocalDate.now();                         
		
		LocalDate birthday = LocalDate.of(year, month, day); 
		 
		Period p = Period.between(birthday, today);
		
		currentAge = p.getYears();
		
		return currentAge;
		
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getDat() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
