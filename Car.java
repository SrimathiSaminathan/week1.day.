package week1.day1;

	public class Car {

	public void applyBreak()
	{
		System.out.println("Apply Break");	
	}
	
	public void applyGear()
	{
		System.out.println("Apply Gear");
	}
	
	public void switchonAc()
	{	
		System.out.println("Switch on AC");	
	}
	
	public void applyAcclerate()
	{
		System.out.println("Apply Acclerate");
	}
	
	public static void main(String[] args) {
		
		Car vechileFunction = new Car();
		vechileFunction.applyBreak();
		vechileFunction.applyGear();
		vechileFunction.switchonAc();
		vechileFunction.applyAcclerate();
	}

}
