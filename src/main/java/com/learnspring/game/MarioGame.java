package com.learnspring.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GameConsole {
	
	@Override
	public void up() {
		System.out.println("up");
	}
	@Override
	public void down() {
		System.out.println("down");
	}
	@Override
	public void right() {
		System.out.println("right");
	}

}
