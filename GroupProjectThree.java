
import java.util.Scanner;

public class GroupProjectThree {

	public static void main(String[] args) {
		boolean yes = true;
		Scanner scnr = new Scanner(System.in);
		System.out.println("enter a char");
		char input1 = scnr.next().charAt(0);
		System.out.println("you enterd " + input1);
		if (yes = Character.isLetter(input1))
		{
			System.out.println("you put in a letter");
			System.out.println("your letter lowercase is " + Character.toLowerCase(input1));
			System.out.println("your letter uppercase is " + Character.toUpperCase(input1));
		}
		else if (yes = Character.isDigit(input1))
		{
			System.out.println("you put in a number");
		}
		else
		{
			System.out.println("you input a symbol");
		}
		scnr.close();
		System.out.println(yes);
	}

}
