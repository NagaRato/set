package controller;

import view.frameGame;
import model.Game;

public class controllerGame {

	public controllerGame() {
		Game gameModel = new Game();
		
		frameGame framegame = new frameGame(gameModel);
	}
	
}
