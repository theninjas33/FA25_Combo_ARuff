public class inClassLoops 
{ 
    public static void main(String[] args) 
    {
        int termNum = 10;
        int rows = 7;

        forFibonacci(termNum);

        System.out.println("\n\nRight triangle pattern:");
        rightTri(rows);

        int sum = sumFirstTen();
        System.out.println("\nThe sum of the first 10 natural numbers is: " + sum);
    }
    
    private static void rightTri(int rows) 
    {
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 0; j < rows - i; j++) 
            {
                System.out.print("  "); 
            }
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    private static void forFibonacci(int terms) 
    {
        if (terms < 1) 
        {
            System.out.println("Please use positive integers only");
            return;
        }
        
        int firstTerm = 0;
        int secondTerm = 1;
        
        if (terms == 1) 
        {
            System.out.println(firstTerm);
            return;
        }
        
        System.out.print("Fibonacci sequence: ");
        System.out.print(firstTerm + ", " + secondTerm);
        for (int i = 2; i < terms; i++) 
        {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }    
        System.out.println();
    }
    
    private static int sumFirstTen() 
    {
        int sum = 0;
        for (int i = 1; i <= 10; i++) 
        {
            sum += i;
        }
        return sum;
    }
}