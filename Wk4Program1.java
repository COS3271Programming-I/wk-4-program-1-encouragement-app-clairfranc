package Condtionals;
import java.util.Scanner;

// Claire Francis, Wk4Program1, September 21, 2025

// Write a program that asks two questions "How old are you?" and "How are you doing today?"
// Based upon the responses to these two questions the program will give an appropriate message.
// There should be at least 5 possible messages.


public class Wk4Program1 {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		int age;
		String mood;
		boolean oldunhappy, younghappy;
		boolean middleAge;
		
		System.out.print("How old are you? ");
		age = userinput.nextInt();
		userinput.nextLine();
		
		System.out.print("How are you doing today?(Good, Bad, other?) ");
		mood = userinput.nextLine();
		
		
				
		oldunhappy = ((mood.equals("Bad")) && (age >= 50));
		middleAge = ((age > 25)&&(age < 50));
		
		younghappy = ((age < 25)&&(mood.equals("Good")));
		
		
		
		if(age <= 25) {
			System.out.println("Remember to enjoy life while you're still young!");
		}
		if(mood == "Good") {
			System.out.println("That's Great! It's alays nice to stay positive. ");
		}
		if(oldunhappy) {
			System.out.println("Look on the bright side of things for what little time you have left.");
		}
		if(middleAge) {
		System.out.println("You can't go back and change the past but you can change the future!");
		}
		if(younghappy) {
			System.out.println("It's the little things that count, so spread your happiness with the world.");
		}
		
	}

}
