package com.snakeandladderprogram;

public class SnakeAndLadderProgram {
	public static final int START_POSITION = 0;
	public static final int FINAL_POSITION = 100;
	public static int currentPosition;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game!!");
		currentPosition = START_POSITION;
		System.out.println(diceRoll());
	}

	public static int diceRoll() {
		int diceResult = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		return diceResult;

	}
}
