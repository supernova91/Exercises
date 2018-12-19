
public class PetroPurchaseMain {

	public static void main(String[] args) {
		
		PetroPurchase petroPurchaseOne = new PetroPurchase("Toronto", "Premium", 20 , 3.00 , 0.15);
		
		double purchaseAmount = petroPurchaseOne.getPurchaseAmount();
		
		System.out.println("Purchase Total: " + purchaseAmount);

	}

}
