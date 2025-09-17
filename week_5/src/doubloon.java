import java.util.Scanner;

public class doubloon {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a word and I will tell you if it is a Doubloon.");
        String word = input.next();   
        word = word.toLowerCase();
        
        boolean isDub = isDoubloon(word);

     
        if (isDub) {
            System.out.println(" is a Doubloon!");
        } else {
            System.out.println(" is NOT a Doubloon.");
        }
    }

    private static boolean isDoubloon(String word) {
        int len = word.length();

        for (int i = 0; i < len; i++) {   
            int count = 0;
            char letter = word.charAt(i);  

            for (int j = 0; j < len; j++) {
                if (word.charAt(j) == letter) {
                    count++;
                }
            }

            if (count != 2) {
                return false;
            }
        }
        return true;
    }
}
