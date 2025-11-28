

public class Excercise5 {

	public static void main(String[] args) {
		int a;
		int b;
		
	System.out.println("HCF(88,26) = " + hcf(88,26));
	System.out.println("HCF(54,87) = " + hcf(54,87));
	System.out.println("HCF(16,84) = " + hcf(16,84));
	System.out.println("HCF(55,25) = " + hcf(55,25));
	System.out.println("HCF(42,72) = " + hcf(42,72));
	System.out.println("HCF(77,28) = " + hcf(77,28));
	System.out.println("HCF(80,88) = " + hcf(80,88));	
	}
	
	public static int hcf(int a, int b) {
		while (b != 0) {
			int temp = a% b;
			a = b;
			b = temp;
		}
		return a;
		
		}
		
		
		
		
		
		
		
	}	
		
		
		
		
	
	
	
	
	
	

	
	
	
	
	

