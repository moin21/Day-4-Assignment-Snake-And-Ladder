package com.snakeandladderprogram;

public class SnakeAndLadderProgram {
	public static final int START_POSITION = 0;
	public static final int FINAL_POSITION = 100;
	public static int currentPosition;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game!!");
		currentPosition = START_POSITION;
		diceRoll();
	}

	public static void diceRoll() {
		while(currentPosition < FINAL_POSITION) {
		int diceResult = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		int playCheck = (int) (Math.floor(Math.random() * 10) % 3);
		if(playCheck == 0) {
			currentPosition += 0;
		}
		else if(playCheck == 1) {
			currentPosition += diceResult;
		}
		else {
			currentPosition -= diceResult;
			if(currentPosition<0) {
				currentPosition = START_POSITION;
			}
		}
		System.out.println(currentPosition);
	}
}
}
