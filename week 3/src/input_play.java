import java.util.Scanner;

public class input_play {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     
        printInput(input);

        System.out.println();

        System.out.println("What is the temp in F");
        double fTemp = input.nextDouble(); 

        double cTemp = convertToC(fTemp);
        double kTemp = convertToK(cTemp);

        System.out.println(fTemp + "F is " + cTemp + "C and " + kTemp + "K");
        System.out.printf("%.2f F is %.2fC and %.2fK\n", fTemp, cTemp, kTemp);

        System.out.println("Enter Kilos");
        double kilos = input.nextDouble();

        double pounds = convertToPounds(kilos);
        System.out.printf("%.2f kilos is %.2f pounds\n", kilos, pounds);

        input.close();
    }

    private static double convertToPounds(double kilos) {
        return kilos * 2.2;
    }

    public static double convertToC(double fTemp) {
        return (fTemp - 32) * 5 / 9;
    }

    public static double convertToK(double cTemp) {
        return cTemp + 273.15;
    }

    private static void printInput(Scanner input) {
        System.out.println("What is your name");
        String name = input.next();
        System.out.println("Great " + name + "!");

        System.out.println("Enter your age in years");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old.");
    }
}





















































