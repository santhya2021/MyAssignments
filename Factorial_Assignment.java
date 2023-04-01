package week1.day2;

public class Factorial_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=6,total=1;
		for(int i=1;i<=number;i++)
		{
			total=i*total;				
		}
		System.out.println("The factorial of the given number is:"+total);
	}

}
