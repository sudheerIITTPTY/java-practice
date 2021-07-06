package com.sudheer.Introductiontospiring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SuperContra implements Game {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Up");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Down");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Right");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Left");
	}

}
