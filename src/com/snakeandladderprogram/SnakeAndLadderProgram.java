package com.snakeandladderprogram;

public class SnakeAndLadderProgram {
	public static final int START_POSITION = 0;
	public static final int FINAL_POSITION = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game!!");
		int rollPlayer1 = diceRoll("player1");
		int rollPlayer2 = diceRoll("player2");
		if (rollPlayer1 > rollPlayer2) {
			System.out.println("Player2 is the winner");
		} else if (rollPlayer1 < rollPlayer2) {
			System.out.println("Player1 is the winner");
		} else {
			System.out.println("It is a tie.");
		}

	}

	public static int diceRoll(String player) {
		int currentPosition = START_POSITION;
		int noOfRolls = 0;
		while (currentPosition < FINAL_POSITION) {
			int diceResult = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			noOfRolls++;
			int playCheck = (int) (Math.floor(Math.random() * 10) % 3);
			if (playCheck == 0) {
				currentPosition += 0;
			} else if (playCheck == 1) {
				currentPosition += diceResult;
				if (currentPosition > 100) {
					currentPosition -= diceResult;
				}
			} else {
				currentPosition -= diceResult;
				if (currentPosition < 0) {
					currentPosition = START_POSITION;
				}
			}
			System.out.println(currentPosition);
		}
		System.out.println("No. of total Dice Rolls by " + player + " are: " + noOfRolls);
		return noOfRolls;
	}
}
