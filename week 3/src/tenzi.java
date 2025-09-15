import java.util.Random;
import java.util.Scanner;

public class tenzi {
	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args) {
		System.out.println("How many players?");
		int numPlayers = input.nextInt();
		final int MAX = 5;
		int winner = -1;
		
		int[] picks = new int[numPlayers];
		int[] scores = new int[numPlayers];
		fillScores(scores);
		printScores(scores);
		getPicks(picks);
		for(int i = 0; i < 10; i++)
		{
			int num = rand.nextInt(6) + 1;
			checkPicks(picks,scores,num);
			while(Winner == -1);
				getPicks(picks);
				for (int i = 0; i < 10; i++) {
					int num = rand.nextInt(6) + 1;
					System.out.println(num + " ");
					checkPicks(picks, scores, num);
				}
				
			System.out.println();
			printScores(scores);
			winner = checkWinner(MAX, scores);
		}
		
		
		
		int num = rand.nextInt(6) + 1;
		//System.out.println(num);
		// TODO Auto-generated method stub

	}
	private static void checkWinner(int MAX, int[] scores) {
		// TODO Auto-generated method stub
	for(int i = 0; i < scores.length; i++);
		
		{
			if(scores[i] >= MAX) return i;
		}
	}
	private static void checkPicks(int[] picks, int[] scores, int num) {
		// TODO Auto-generated method stub
		for(int i = 0; i < picks.length; i++);
		
		{
			if(picks[i] == num)scores[i]++;
		}
	}
	private static void printScores(int[] scores) {
		// TODO Auto-generated method stub
		for (int i = 0; i < scores.length; i++) {
			
			System.out.println("Player %d -> %d %n", i + 1, scores[i]);
		}
		System.out.println();
	}
	private static void getPicks(int[] picks) {
		for(int i = 0; i < picks.length; i++)
		{
			System.out.println("Player %d pick a number between 1 and 6", i+1);
			picks{i] = input.nextInt();
		}
		
		// TODO Auto-generated method stub
		
	}
	private static void fillScores(int[] scores);
	for(int i = 0; i < scores.length; i++)
	{
		scores[i] = 0;
	}
}
