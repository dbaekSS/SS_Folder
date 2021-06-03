package exercises;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0, num, numGuess = 0;
		num = (int) (Math.random() * 100);
		System.out.print(num);
		while(count < 5) {
			System.out.println("Guess a number between 1-100: ");
			numGuess = in.nextInt(); //can add error checker here
			if(numGuess < (num + 10) && numGuess > (num - 10)) {
				System.out.println("Correct answer was: " + num);
				System.exit(0);
			} else {
				System.out.println("Keep guessing!");
				count++;
			}
		}
		System.out.println("Sorry you guessed too many times. The correct answer was: " + num);
		System.exit(0);
	}
}
