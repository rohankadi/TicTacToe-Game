package com.rk.tictoctoe;

public class LaunchGame {

	public static void main(String[] args) {
		TicTocToe t = new TicTocToe();
		
		HumanPlayer p1 = new HumanPlayer("Ron", 'X');
		HumanPlayer p2 = new HumanPlayer("Dan", 'O');
		
		//choose current player 
		 HumanPlayer cp;
		 cp = p1;
		 
		 while(true) {
			 System.out.println(cp.name + " turn");
			 cp.makeMove();
			 TicTocToe.displayBoard();
			 
			 if(TicTocToe.checkDiagWin() || TicTocToe.columnWin() || TicTocToe.rowWin()) 
			 {
				 System.out.println(cp.name + " has won!");
				 break;
			 }
			 else 
			 {
				 if(cp == p1) {
					 cp = p2;
				 }
				 else {
					 cp = p1;
				 }
			 }
		 }	
	}
}  
