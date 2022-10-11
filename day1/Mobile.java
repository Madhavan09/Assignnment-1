package week1.day1;

public class Mobile {
	String mobileBrandname = "Oppo";
	char mobileLogo = 'O'; 
	short noOfmobilePiece = 999;
	int modelNumder = 86352788;
	long mobiliemeiNumber = 79379262695680L;
	float mobilePrice = 15000.99F;
	boolean isDamage = false;
	private String modelNumber;
	public static void main(String[] args) {
		Mobile details = new Mobile(); 
		System.out.println("Brand Name ="+details.mobileBrandname);
		System.out.println("Mobile Logo ="+details.mobileLogo);
		System.out.println("Piece ="+details.noOfmobilePiece);
		System.out.println("Model Number ="+details.modelNumber);
		System.out.println("imei Number="+details.mobiliemeiNumber);
		System.out.println("Piece ="+details.mobilePrice);
		System.out.println("Is Damage ="+details.isDamage);
}
}