import java.util.Scanner;

public class GasMileage {
	
	public static void main (String [] args) {
		
		int kilometers = 0;

		int litres = 0;
		
		int tripCount = 0;
		
		int kilometersPerLitre = 0;
		
		int kilometersTotal = 0;
		
		int litresTotal = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Kilometers driven or -1 to quit:  ");
		
		kilometers = input.nextInt();
		
		while (kilometers != -1) {		
			
			kilometersTotal = kilometers + kilometersTotal;
		
			System.out.println("Enter litres used: ");
		
			litres = input.nextInt();
			
			litresTotal = litres + litresTotal;
		
			kilometersPerLitre = kilometers / litres;
			
			tripCount++;
		
			System.out.println("Trip: " + tripCount + " Kilometers Driven : " + kilometers + " Litres Used: " + litres + " Kilometrers per Litre:  " + kilometersPerLitre);
			
			System.out.println("Enter kilometers driven or -1 to quit:  ");
			
			kilometers = input.nextInt();
		
		}
		
		if(tripCount != 0) {
			
			int entireTrip=  kilometersTotal / litresTotal;
			System.out.println("Total Kilometers Driven: " + kilometersTotal );
			System.out.println("Total Litres Used: " + litresTotal);
			System.out.println("Total Kilometers used per Liter for all trips: " + entireTrip);
		}
		
		else {
			System.out.println("No kilometers entered");
		}
		
		
		
		
		
	
	
	
	
	
	
	
	}
}
