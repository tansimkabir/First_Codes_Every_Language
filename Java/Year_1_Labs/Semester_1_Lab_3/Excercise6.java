
public class Excercise6 {

	public static void main(String[] args) {

		/*	for(int i=1; i<=5; i++) { //No. 1
			for (int j = 1; j<=i + 1; j++) {				
				System.out.print(i);				
			}			
		}*/
		/*	for(int i=2; i<=6; i++) {  // No. 2
			for (int j = 1; j<=i; j++) {				
				System.out.print(i);				
			}			
		}*/
		/*		for(int i=1; i<=5; i+= 2) {  // No. 3
			for (int j = 1; j<=i ; j++) {						
				System.out.print(i);				
			}			
		}*/		
		/*	for(int i=1; i<=7; i+=2) {  //No. 5
			int repeat = (i + 1) / 2; 			
			for (int j = 1; j <= repeat; j++) {				
				System.out.print(i);				
			}			
		}*/
		/*	for(int i=5; i>=1; i--) {  //No. 5
			for (int j = 1; j <= i; j++) {				
				System.out.print(i);
			}
		}*/
		/*	for(int i=5; i>=1; i--) {  //No. 6
			for (int j = 1; j <= 6-i; j++) {				
				System.out.print(i);
			}
		}*/
		/*	for(int i=5; i>=1; i--) {  //No. 7
			char symbol = (i%2 == 1) ? '+' : '*';
					for (int j = 1; j <= 6-i; j++) {				
				System.out.print(symbol);
			}
		}*/
		char[] symbols = {'-','*','+'};
		for(int i=2; i<=7; i++) {  //No. 8
			char symbol = symbols[(i-2)%3];
			for (int j = 1; j <= i; j++) {				
				System.out.print(symbol);
			}
		}







	}

}
