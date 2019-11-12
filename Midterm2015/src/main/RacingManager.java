package main;

import java.util.Scanner;

import character.*;
import simInterface.ICharacter;

public class RacingManager {
	private static final double GOAL = 100.00;
	private static ICharacter[] characters;
	private static boolean hasWinner = false;

	RacingManager() {

	}

	public static void main(String[] args) {
		System.out.println("Welcome to CHOCOBO RACING.");
		System.out.println("The goal at distance 100 m.");
		System.out.println();
		System.out.println("Press 'any key' to START.");
		Scanner kb = new Scanner(System.in);
		kb.nextLine();
		kb.close();

		// Initialized Characters
		initializeCharacter();
		System.out.println("Initialized Characters");
		System.out.println();

		int round = 1;
		String name = null;
		while (true) {
			System.out.println("Round " + round);

			// Sort characters' running order
			sortCharacter();

			// Decrease obstructedDuration
			decreaseObstructedDuration();

			// Randomly obstruct character
			randomObstructedCharacters();

			// RUN each character
			for (int i = 0; i < characters.length; i++) {
				characters[i].run();
				if(checkWinner(characters[i])) {
					if (characters[i] instanceof Pikachu) {
						name = "Pikachu";
					} else if (characters[i] instanceof JumperChocobo) {
						name = "JumperChocobo";
					} else if (characters[i] instanceof RunnerChocobo) {
						name = "RunnerChocobo";
					}
				}
				
			}

			System.out.println();
			if (hasWinner())
				break;

			round++;
		}
		System.out.println(name + " is the WINNER !!!");
	}

	public static void initializeCharacter() {
		characters = new ICharacter[3];

		RunnerChocobo temp1 = new RunnerChocobo();
		temp1.start();
		characters[0] = temp1;

		JumperChocobo temp2 = new JumperChocobo();
		temp2.start();
		characters[1] = temp2;

		Pikachu temp3 = new Pikachu();
		temp3.start();
		characters[2] = temp3;
	}

	public static void sortCharacter() {
		for (int i = 0; i < characters.length; i++) {
			for (int j = i; j < (characters.length-1); j++) {
				if (characters[j].compareTo(characters[j+1]) == 1) {
					ICharacter temp = characters[j+1];
					characters[j+1] = characters[j];
					characters[j] = temp;
				}
			}
		}
	}

	public static boolean checkWinner(ICharacter crt) {
		if (crt.getDistance() >= getGoal()) {
			hasWinner = true;
			return true;
		}
		return false;
	}

	public static void randomObstructedCharacters() {
		int x = (int) ((Math.random()*100)+1);
		if (x >= 1 && x <= 20) {
			for (int i = 0; i < characters.length; i++) {
				if (characters[i] instanceof JumperChocobo) {
					((JumperChocobo) characters[i]).obstructed();
				}
			}
		} else if (x > 20 && x <= 40) {
			for (int i = 0; i < characters.length; i++) {
				if (characters[i] instanceof Pikachu) {
					((Pikachu) characters[i]).obstructed();
				}
			}
		} else if (x > 40 && x <= 60) {
			for (int i = 0; i < characters.length; i++) {
				if (characters[i] instanceof JumperChocobo) {
					((JumperChocobo) characters[i]).obstructed();
				} else if (characters[i] instanceof Pikachu) {
					((Pikachu) characters[i]).obstructed();
				}
			}
		}
	}

	public static void decreaseObstructedDuration() {
		for (int i = 0; i < characters.length; i++) {
			if (characters[i] instanceof JumperChocobo) {
				if (((JumperChocobo) characters[i]).getObstructedDuration() > 0) {
					((JumperChocobo) characters[i])
							.setObstructedDuration(((JumperChocobo) characters[i]).getObstructedDuration() - 1);
					if (((JumperChocobo) characters[i]).getObstructedDuration() == 0) {
						((JumperChocobo) characters[i]).setSpeed(7.5);
					}
				}
			} else if (characters[i] instanceof Pikachu) {
				if (((Pikachu) characters[i]).getObstructedDuration() > 0) {
					((Pikachu) characters[i])
							.setObstructedDuration(((Pikachu) characters[i]).getObstructedDuration() - 1);
					if (((Pikachu) characters[i]).getObstructedDuration() == 0) {
						((Pikachu) characters[i]).setSpeed(4);
					}
				}
			}
		}
	}

	public static double getGoal() {
		return GOAL;
	}

	public static ICharacter[] getCharacters() {
		return characters;
	}

	public static boolean hasWinner() {
		return hasWinner;
	}

}
