package com.yourname.guessergame;

import java.util.Random;
import java.util.Scanner;

public class MyNumberGuesserGame {

		/*number generator creates number
		 * scanner takes in user input
		 * if lower println("too high")
		 * if higher println("too low")
		 * if same println("correct") + terminate program
		 * */
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Please enter the maximum number: ");
			int maxNum = sc.nextInt();
			int n = generate(maxNum);
			//System.out.println(number);
			
			int guess = 0;
				
			while(guess != n) {
				System.out.println("Please guess the correct number: ");
				guess = sc.nextInt(); 
				
				if (guess > n) {
					System.out.println("Too high!");
				}
				else if (guess < n) {
					System.out.println("Too low!");
				}
				else if (guess == n) {
					System.out.println("Correct");
				}
			}
		}
		
		public static int generate(int max) {
			Random rand = new Random();
			return rand.nextInt(max);
		}

		
}
