package br.com.philipe.tictactoe.core;

import br.com.philipe.tictactoe.Constants;
import br.com.philipe.tictactoe.ui.UI;

public class Game {
	
	Board board = new Board();
	Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	public void play() {
		UI.printGameTitle();
		board.print();
		//UI.readInput("Nome do jogador: ");
	}

}
