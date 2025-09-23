import java.util.Scanner;

public class theFirstexam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This is my first programming test");
        //drink choice
        System.out.println("Pick a drink 1=Water 2=Coke 3=Coffee");
        int d = in.nextInt();
       
        if(d==1){
            System.out.println("Water");
        } 
        else if(d==2)
        {
            System.out.println("Coke");
        } 
        else if(d==3)
        {
            System.out.println("Coffee");
        } 
        {
        }
        // --- Divider ---
        System.out.print("First number: ");
        double a = in.nextDouble();
        System.out.print("Second number: ");
        double b = in.nextDouble();  
        double c = a/b; 
        c = Math.round(c*100.0)/100.0; //  rounding
        System.out.println("Result: "+c+" ("+a+" / "+b+")");
        // Accumulator 
        int sum = 0;
        int n = -1;
        while(n != 0){
        		System.out.print("Enter number (0 to end): ");
            n = in.nextInt();
            sum = sum + n;
        }
        System.out.println("Sum of all numbers: "+sum);
    }
}
