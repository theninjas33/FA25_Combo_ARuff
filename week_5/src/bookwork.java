import java.util.Scanner;

public class bookwork {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 10; 
        if (x > 0) {
            System.out.println("X is positive");
        } else if (x < 0) {
            System.out.println("X is negative");
        } else {
            System.out.println("X is 0");
        }

        if (x % 2 == 0) {
            System.out.println("X is even");
        } else {
            System.out.println("X is odd");
        }

        System.out.println("Enter a number between 1 and 5");
        int num = input.nextInt();   

        String word;   

        switch (num) {
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            default:
                word = "Unknown";
                break;  
        }

        System.out.println(word);   

        int n = 10;
        while (n > 0) {   
            System.out.println(n);
            n--;
        }
        System.out.println("Blast off");
        //inin, cond., changer all in one
        for (int i = 1; i < 10; i++) {  
            System.out.println(i);
        }
        System.out.println("Enter the number of column for the timestable");
        int cols = input.nextInt();
        
        System.out.println("Enter the number of rows for the times table");
        int rows = input.nextInt();
        
        for(int i = 0;i <= rows; i++)
        {
        		for(int j = 0;j < cols; j++)
        		{
        			System.out.printf("%5d", (i * j));
        		}
        		System.out.println();
        }
        int count = 0;
        for(char c = 'A', count = 0; c <= 'z'; c++, count++)
        {
        if(count % 10 ==0)System.out.println();
        System.out.println(c + " ");
        }
        System.out.println("done");
    }
    
}
