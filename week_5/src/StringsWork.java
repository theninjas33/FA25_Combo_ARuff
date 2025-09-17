import java.util.Scanner;

public class StringsWork {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String word = "bananas";
		
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(word.charAt(i));
		}
		System.out.println("" + word.charAt(5) + word.charAt(6)  + " is the " + (word.indexOf("as", 3) + 1) + " letter");		
		System.out.println(word.substring(0, 3));
		System.out.println(word.substring(3, 6));
		System.out.println(word.substring(0, 3) + "d" + word.substring(3));
		
		
		String reversed = reverse(word);
		System.out.println(reversed);
	
		
		
		
		
		System.out.println("shal we go?");
		String answer = input.nextLine();
		answer = answer.toLowerCase();
		
		if(answer.equals ("yes"))
		{
			System.out.println("let's go!!");
		}else
		{
			System.out.println("Wha, wha whaaaa......");
		}
		
		String name1 = "Alan Tuting";
		String name2 = "Ada jhonson";
		
		int diff = name1.compareTo(name2);
		
		if(diff < 0)
		{
			System.out.println(name1 + "comes before" + name2);
		}
		else if (diff > 0)
		{
			System.out.println(name2 + " comes before " + name1);
		}else
		{
			System.out.println("The names are the same.");
		}
		System.out.println("Enter the hour:");
		int hour = input.nextInt();
		System.out.println("Enter the minute");
		int min = input.nextInt();
		
		String time = timeString(hour, min);
	}
	
	private static String timeString(int hour, int min) {
		String ampm;
		if (hour < 12)
		{
			ampm = "AM";
			if(hour == 0)
			{
				hour = 12;
			}
		}else
		{
			ampm = "PM";
			hour = hour - 12;
		}
		return String.format("%02d:%02d %s", hour, min, ampm);
		return null;
	}

	private static String reverse(String word) {
		String r = "";
		for(int i = word.length()-1; i>=0; i--)
		{
			r += word.charAt(i);
		}
		return null;
	}
}
