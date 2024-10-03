package guessthenumber;

import java.util.Scanner;

public class GuessTheNumber {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		int guessed_number;
		int random_number;
		random_number =(int)(Math.random()*100);
		
		boolean flag_variable =false;
		
		while (!flag_variable) {
			System.out.println("Enter an interger greater than 0 and less than 100");
			guessed_number = console.nextInt();
			
			if(guessed_number == random_number) {
				System.out.println("Congratulations!! You guessed the correct number");
				flag_variable = true;
				}
				else if (guessed_number < random_number) {
					System.out.println("The number you guessed is less than the random number");
					System.out.println("Guess again !!!!");
				}
				else {
					System.out.println("The number you guessed is greater than the random number");
					System.out.println("Guess again !!!");
				}
			}
		}
	}


