import java.util.Scanner;

public class Bookwork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println();
//		
//		System.out.println("Type something:");
//		String word = input.next();
//		System.out.println(word);
//		
//		input.nextLine();
//		
//		System.out.println("Type something:");
//		String word1 = input.next();
//		System.out.println(word1);
//		
		
//		final double CM_PER_INCH = 2.54;
//		
//		int inch = 100; 
//		double cm = inch * CM_PER_INCH;
//		
		
//		System.out.println("How many inches?");
//		inch = input.nextInt();
//	
//		cm = inch * CM_PER_INCH;
//		System.out.print(inch + " in = ");
//		System.out.println(cm + " cm ");
		
//		System.out.printf("Four thirds = %.3f\n ", 4.0/3);
//		System.out.printf("%d in = %.3f cm\n", inch, cm);
//		
//		String num = "73";
//		double pi = 3.14;
//				
//		System.out.println((int)pi + " " + pi);
//		System.out.println(Integer.parseInt(num) + pi);
//		System.out.println(num + pi);
//		
//		int feet = 76/12;
//		int inches = 76%12;
//		
//		System.out.println(feet + "' " + inches + "\"");
		
	double cm;
	int feet, inches, remainder;
	final int IN_PER_FOOT = 12;
	final double CM_PER_inch = 2.54;
	
	System.out.println("Exactly how many centimeters?");
	cm = input.nextDouble();
	
	inches = (int)(cm/CM_PER_inch);
	feet = inches / IN_PER_FOOT;
	remainder =  inches % IN_PER_FOOT;
	System.out.printf("%.2f cm is %d ft and %d in\n", cm, feet, remainder);
		
		````````````````````
		
	}
	

}
