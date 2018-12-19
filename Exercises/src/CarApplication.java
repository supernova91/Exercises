
public class CarApplication {

	public static void main(String[] args) {
		Car carOne = new Car("Toyota", "2010", -1000.00);
		
		Car carTwo = new Car("Honda", "2016", 5000.00);
		
		double carOnePrice = carOne.getPrice();
		
		System.out.println("Car One Price: " + carOnePrice);
		
		double carTwoPrice = carTwo.getPrice();
		
		System.out.println("Car One Price: " + carTwoPrice);
		
		carTwo.setDiscount(0.15);
		
		double carTwoDiscountPrice = carTwo.getDiscount();
		
		System.out.println("Car Two's price with 15% discount: " + carTwo.getDiscount());
		
		

	}

}
