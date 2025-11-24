import java.util.Scanner;

public class PracticingScanner {

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter your full name");
		String name = myscanner.nextLine();
		
		System.out.println("Enter your Zodiac sign");
		String zodiac = myscanner.nextLine();
		
		System.out.println("Enter your weight (kg)");
		double weight = myscanner.nextDouble();
		
		System.out.println("Enter your lucky number: ");
		int luckyNum = myscanner.nextInt();
		
		System.out.println("Hello, " + name + ".");
		System.out.println("Wonderful it seems you have an intriguing zodiac sign "+zodiac+ ".");
		System.out.println("It seems you need to work out a bit with this weight = "+weight+" kg.");
		System.out.println("You have a really common lucky number it seems "+luckyNum+ ".");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
