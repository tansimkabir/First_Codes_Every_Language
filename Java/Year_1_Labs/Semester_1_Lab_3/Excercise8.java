import java.util.Scanner;
public class Excercise8 {

	public static void main(String[] args) {


		        Scanner scan = new Scanner(System.in);
		        
		        while (true) {
		            System.out.print("Enter a character (or 'Done' to exit): ");
		            String input = scan.nextLine();
		            
		            // Check if user wants to exit
		            if (input.equalsIgnoreCase("Done")) {
		                System.out.println("Thank you");
		                break;
		            }
		            
		            // Check if input is exactly one character
		            if (input.length() != 1) {
		                System.out.println("Please enter exactly one character");
		                continue;
		            }
		            
		            char ch = input.charAt(0);
		            
		            // Determine character type
		            if (Character.isUpperCase(ch)) {
		                System.out.println("Capital letter");
		            } else if (Character.isLowerCase(ch)) {
		                System.out.println("Small letter");
		            } else if (Character.isDigit(ch)) {
		                System.out.println("Digit");
		            } else {
		                System.out.println("Special symbol");
		            }
		        }
		        
		        scan.close();		
		
	}

}
