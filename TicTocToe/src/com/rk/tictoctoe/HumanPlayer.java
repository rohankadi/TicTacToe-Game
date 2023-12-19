package com.rk.tictoctoe;

import java.util.Scanner;

public class HumanPlayer {

	String name;
	char mark;
	
	public HumanPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}
	
	void makeMove() {
		Scanner scan = new Scanner(System.in);
		int row;
		int col;
		do {
			System.out.println("Enter the row and col");
			 row = scan.nextInt();
			 col = scan.nextInt();		
		} while (!isValidMove(row, col));
		
		TicTocToe.placeMark(row, col, mark);
	}
	
	boolean isValidMove(int row, int col) {
		if(row >= 0 && row <= 2 && col >=0 && col <=2) {
			if(TicTocToe.board[row][col] == ' ') {
				return true;
			}
		}
		return false;
	}
}
