package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 98654l;
	boolean isPunctured = false;
	String bikeName = "Apache";
	double runningKM = 1024.23;
	
	public void bike()
	{
		System.out.println(noOfWheels);
		System.out.println(noOfMirrors);
		System.out.println(chassisNumber);
		System.out.println(bikeName);
		System.out.println(runningKM);
	}

	public static void main (String[] args) {
		
		TwoWheeler details = new TwoWheeler();
		details.bike();
	}
}
