package com.learnspring.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gamerunner {
	
	@Autowired
	private GameConsole game;
	public Gamerunner(GameConsole game) {
		this.game = game;
	}
	public void rungame() {
		game.up();
		game.down();
		game.right();
	}
}
