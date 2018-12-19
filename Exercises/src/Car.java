
public class Car {
	
	private String model;
	
	private String year;
	
	private double price;
	
	Car(String model, String year, double price){
		this.model = model;
		this.year = year;
		
		if (price > 0.0) {
			this.price = price;		
		}		
	}
	
	public double getDiscount() {
		return price;
	}
	
	
	public void setDiscount(double discount) {
		price = price * discount;
	}	

	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

}
