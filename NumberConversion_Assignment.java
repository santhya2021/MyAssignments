package week1.day2;

public class NumberConversion_Assignment {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=-100;
		if(num<0)
		{
			System.out.println("the given negative number "+num+" is converted to positive number "+-(num));
		}
		else if(num>0)
		{
			System.out.println("the given number is not negative");
		}
		else
		{
			System.out.println("the given number is neither positive nor negative");	
		}
		
	}
}
