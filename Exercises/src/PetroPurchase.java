
public class PetroPurchase {

	private String location;
	
	private String petroType;
	
	private int quantity;
	
	private double pricePerLitre;
	
	private double percentageDiscount;
	
	
	PetroPurchase(String location, String petroType, int quantity, double pricePerLitre, double percentageDiscount){
		
		this.location = location;
		
		this.petroType = petroType;
		
		this.quantity = quantity;
		
		this.pricePerLitre = pricePerLitre;
		
		this.percentageDiscount = percentageDiscount;
	}
	
	double getPurchaseAmount() {
		double purchaseTotal = quantity * pricePerLitre - percentageDiscount;
		return purchaseTotal;
	}
	
	public double getPercentageDiscount() {
		return percentageDiscount;
	}
	
	public void setPercentageDiscount(double percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}
	
	public double getPricePerLitre() {
		return pricePerLitre;
	}
	
	public void setPricePerLitre(double pricePerLitre) {
		this.pricePerLitre = pricePerLitre;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getPetroType() {
		return petroType;
	}
	
	public void setPetroType(String petroType) {
		this.petroType = petroType;
	}
	
	String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
