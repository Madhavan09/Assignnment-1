package week1.day1;

public class TwoWheeler {
	int noOfwheels=2;
	short noOfmirrors=2;
	long chassisNumbers=24765824737L;
	boolean isPunchered=false;
	String bikeName= "duke";
	double runningKM=123.3456;
	public static void main(String[] args) {
		TwoWheeler bike=new TwoWheeler();
		System.out.println("Bike Name ="+bike.bikeName);
		System.out.println("No Of wheels ="+bike.noOfwheels);
		System.out.println("No Of Mirrors ="+bike.noOfmirrors);
		System.out.println("Chassis Numbers ="+bike.chassisNumbers);
		System.out.println("Is Punchered ="+bike.isPunchered);
		System.out.println("Running KM ="+bike.runningKM);
	}
}
