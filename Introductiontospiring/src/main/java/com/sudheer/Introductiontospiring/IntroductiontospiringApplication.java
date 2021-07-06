package com.sudheer.Introductiontospiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sudheer.Introductiontospiring.game.GameRunner;

@SpringBootApplication
public class IntroductiontospiringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(IntroductiontospiringApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		runner.runGame();
		
	}

}
