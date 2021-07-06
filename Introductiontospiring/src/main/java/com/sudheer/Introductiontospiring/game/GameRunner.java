package com.sudheer.Introductiontospiring.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	private Game game;
	
	public void runGame() {
		game.up();
		game.left();
		game.right();
		game.down();
	}

}
