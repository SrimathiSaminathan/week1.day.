package week1.day1;

public class PrimeNumber {
	
	public void pmMethod() {
		
		int a = 2;
		int b = 15;
		
		if (b==2)	
		{
			System.out.println("Given Number is a Prime Number");
		}	
		else if (b%a == 0 && b%b == 0)
		{
			System.out.println("Given Number is not a Prime Number");	
		} 
		else 
		{
			System.out.println("Given Number is a Prime Number");
		}
	}
	public static void main(String[] args) {
		
		PrimeNumber pmObj = new PrimeNumber();	
		pmObj.pmMethod();
		}
	}
//My Learnings
//1. Learned to use else if condition