package com.learnspring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContraGame implements GameConsole{
	@Override
	public void up() {
		System.out.println("cup");
	}
	@Override
	public void down() {
		System.out.println("cdown");
	}
	@Override
	public void right() {
		System.out.println("cright");
	}

}
