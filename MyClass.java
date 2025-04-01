package My_Project;
import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if (number > 100)
		{
			System.out.print("גדול");
		}
		else if (number < 100)
		{
			System.out.print("קטן");
		}
		else
		{
			System.out.print("100");
		}
		
		number = in.nextInt();
		if (number > 7)
		{
			System.out.print("הרבה");
		}
		else if (number < 7)
		{
			System.out.print("מעט");
		}
		else
		{
			System.out.print("בדיוק");
		}
		number = in.nextInt();
		int number2 = in.nextInt();
		if (number == number2)
		{
			System.out.print("שווים");
		}
		else
		{
			System.out.print("שונים");
		}
		number = in.nextInt();
		if (number > 0)
		{
			System.out.print("חיובי");
		}
		else if(number < 0)
		{
			System.out.print("שלילי");
		}
		else
		{
			System.out.print("שווה אפס");
		}
	}
}
