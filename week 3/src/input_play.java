import java.util.Scanner;

public class input_play {

	public static void main(String[] args) {
		
		java.util.Scanner input =  new Scanner(System.in);
		
		System.out.println(printInput()); //here we are calling a method with no parameters or returns
		
		
		
//		System.out.println("What is your name");
//		
//		String name = input.next();
//		
//		System.out.println("Great " + name + "!");
//		
//		System.out.println("Enter your age in years");
//		
//		int age = input.nextInt();
		
		System.out.println("");
		
		System.out.println("What is the temp in F");
		
		double fTemp = input.nextDouble(); //input for a floating point number doubble
		
		double cTemp = convertToC(fTemp);// calling a method that returns a double and takes a double as a param
		
		double kTemp = convertToK(cTemp);
		
	    System.out.println(fTemp + "F is " + cTemp + "C and " + kTemp + "K");
		
	    System.out.printf("%.2f F is %.2fC and %.2fK", fTemp, cTemp,kTemp);
		
		// TODO Auto-generated method stub

	}
//public lets everyone use this
//double is the data type of what is returned
//double fTemp is the variable used inside this method it is a parameter/argument
	public static double convertToC(double fTemp)
	
	{
		return (fTemp - 32) *5/9;
	}
	
	
	
	public static double convertToK(double fTemp)
		
		{
		return cTemp + 273.15;
	}

// private is the access static means its outside of main
//void is the return type for returning nothing
//input is the name and there are no perams
private static void printInput() {
System.out.println("What is your name");

String name = input.next();

System.out.println("Great " + name + "!");

System.out.println("Enter your age in years");

int age = input.nextInt();
}







{
	

int kilos;
double kilos = 0;
double kilos = convertToPounds(kilos);
return kilos *2.2
system.out.printf("%.2f", pounds)

private static double convertToPounds(int kilos)
}