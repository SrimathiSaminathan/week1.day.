package week1.day1;

public class FibonacciSeries{  
	
public static void main(String args[])  
	{    
		int a=0;
		int b=1;
		int c;
		int i;
		int count=7;  
			
			System.out.println("Finbonacci Series upto Range 8");
			System.out.print(" "+a);
			System.out.print(" "+b);
    
 for(i=2;i<count;++i)
 {    
  c=a+b;    
  System.out.print(" "+c);    
  a = b;    
  b = c;    
 }     
}
// My Learnings
// 1. Learned to use for loop (I have faced some errors while using it but now I learned it)
// 2. Learned to print a range of numbers
}