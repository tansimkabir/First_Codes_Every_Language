
public class Excercise1 {

	public static void main(String[] args) {

		int a;

		a = 100;
		if (a%2 == 0 && a%3 == 0)
			System.out.println("a is divisible by both 2 and 3");
		else 
			System.out.println("a is not divisible by both 2 and 3");

		a = 14;
		if (a%7 == 0 || a%9 == 0)
			System.out.println("a is divisible by 7 or 9");
		else
			System.out.println("a is not divisible by 7 or 9");

		a = 48;
		if (a%2 == 0 && a%3 == 0 && a%5 != 0)
			System.out.println("a is divisible by 2 and 3 but not 5");
		else if (a%2 == 0 && a%3 != 0 && a%5 == 0)
			System.out.println("a is not divisible by 2 and 3 but 5");


		for (a = 0; a <= 100; a++) 
		{
			if (a%7 == 0 || a%9 == 0)			
				System.out.println(a +" is not divisible by both 2 and 3");			
			else					
				System.out.println(a +" is divisible by 7 or 9");			

			if (a%2 == 0 && a%3 == 0)
				System.out.println(a +" is divisible by both 2 and 3");
			else 
				System.out.println(a +" is not divisible by both 2 and 3");

			if (a%2 == 0 && a%3 == 0 && a%5 != 0)
				System.out.println(a+ " is divisible by 2 and 3 but not 5");
			else if (a%2 == 0 && a%3 != 0 && a%5 == 0)
				System.out.println(a +" is not divisible by 2 and 3 but 5");

		}



















	}

}
