package com.learnspring;

import com.learnspring.enterprise.controller.Controller1;
import com.learnspring.game.GameConsole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learnspring.game.ContraGame;
import com.learnspring.game.Gamerunner;
import com.learnspring.game.MarioGame;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		Gamerunner runner = context.getBean(Gamerunner.class);
//		runner.rungame();
//		GameConsole game = new MarioGame();
//		GameConsole game = new ContraGame();
//		Gamerunner runner = new Gamerunner(game);
		Gamerunner runner = context.getBean(Gamerunner.class);
		runner.rungame();
		Controller1 controller = context.getBean(Controller1.class);
				System.out.println(controller.getResult());

	}

}
