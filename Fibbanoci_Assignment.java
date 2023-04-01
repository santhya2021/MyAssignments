package week1.day2;

public class Fibbanoci_Assignment {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int firstNumber=1,secondNumber=1,seriesNumber=9;
		int thirdNumber;
		System.out.println("The fibonacci series of given numbers is:");
		System.out.println(firstNumber+"\n"+secondNumber);
		for(int i=3;i<=seriesNumber;i++)
		{
			thirdNumber=firstNumber+secondNumber;
			System.out.println(thirdNumber);
			firstNumber=secondNumber;
			secondNumber=thirdNumber;
		}
	}

}
