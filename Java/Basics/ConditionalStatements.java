
public class ConditionalStatements {

	public static void main(String[] args) 
	{

		/* Lecture 3 Part 1 Examples

		int a = 10;
		int b = 4;
		char c = 'a';

		System.out.println(a < 20);
		System.out.println(a + b <= 14);
		System.out.println(c != 'a');

		if (a < 20)
		System.out.println("True!");

		else 
		System.out.println("False");  */

		/*
		String colour = "green";

		if (colour == "green");
		System.out.println("walk");

		String color = "red";

		if (color == "green")
		System.out.println("walk");

		else 
		System.out.println("wait");   */

		/*
		String colour = "red";

		if (colour == "green")
		System.out.println("walk");

		else if (colour == "yellow")
		System.out.println("okay");

		else 
		System.out.println("wait");    */

		/*
		int a = 1;
		int b = 1;

		if ((a < 10 || a > 20) && ! (b == 2))
		{
			System.out.println("True!");
		}

		else 
		{
			System.out.println("False!");
		}
		 */
		/*
		int x = 1;
		switch (x)
		{

		case 1:
			System.out.println("x=1");
			break;

		case 2:

			System.out.println("x=2");
			break;

		default:

			System.out.println("Running default...");
			break;
		}

		int month = 8;
		int January = 8;

		switch (month) {

		case 1:
			System.out.println(January);
			break;

		case 2:
			System.out.println("February");
			break;

		case 3:
			System.out.println("March");
			break;

		default:
			System.out.println("Invalid Month");
			break;

		}

		int month =8;
		if (month== 1)
		{
			System.out.println("January");
		}
		else if (month == 2) 
		{
			System.out.println("February");
		}
		else if (month == 3) 
		{
			System.out.println("March");
		}
		else 
		{
			System.out.println("Invalid month");

		}
		 */
		
		int x = 2;
		int y = 3;
		int max;

		max = (x>y) ? x:y;

		System.out.println("The biggest number is " +  max);

		int a,b;
		a = 200;
		b = (a < 0) ?-1:1;
		System.out.println(b);
		/*
		a = -97;
		b = (a < 0) ? -1:1;
		System.out.println(b);

		boolean isHappy = true;
		String mood;

		if (isHappy == true)
			mood = "I'm ";
		else 
			mood = "I'm Sad";
		System.out.println(mood);
		 */

		boolean isHappy = true;
		String mood;

		mood = (isHappy == true) ?"I'm Happy":"I'm Sad";
		System.out.println(mood);









	}





}
