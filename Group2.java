
	import java.util.Scanner;

public class Group2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number: ");
		int userNum = input.nextInt();
		if (userNum > 0)
		{
			System.out.println("your number was " + userNum);
		}
		
		//one way if statement
		
		if (userNum % 2 == 0)
		{
			System.out.println("your number was even");
		}
		else
		{
			System.out.println("your number was odd");
		}
		
		// two way if statement
		
		int num2 = 12;
		num2 += userNum;
		System.out.println("that number added to 12 is " + num2);
		if (num2 > 20)
		{
			System.out.println("that number was greater than 20");
		}
		else if (num2 > 15)
		{
			System.out.println("that number was greater than 15");
		}
		else if (num2 > 10)
		{
			System.out.println("that number was greater than 10");
		}
		else if (num2 > 5)
		{
			System.out.println("that number was greater than 5");
		}
		num2 *= 10;
		System.out.println("that number by 10 is " + num2);
		input.close();
		
	}
}
