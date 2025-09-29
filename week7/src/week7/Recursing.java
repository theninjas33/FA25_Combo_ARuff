package week7;

import java.util.Scanner;

public class Recursing {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 10;

        // Countdown
        countdown(n);

       
        System.out.println("Factorial of " + n + " = " + factorial(n));

      
        for (int i = 0; i < n; i++) {
            System.out.println("Factorial of " + i + " = " + factorial(i));
        }

       
        String another = "y";
        while (another.equalsIgnoreCase("y")) {
            System.out.println("Enter the fib level you want to go to:");
            int fibNum = input.nextInt();

            System.out.println("Fibonacci sequence up to " + fibNum + ":");
            for (int i = 1; i <= fibNum; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println();

            System.out.println("again? (y/n)");
            another = input.next();
        }
    }

  
    private static int fibonacci(int n) {
        if (n <= 0) {
            return 0; 
        } else if (n == 1 || n == 2) {
            return 1; 
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
    }


    private static int factorial(int n) {
        if (n == 0) return 1; 
        return n * factorial(n - 1);
    }

   
    private static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }
}
