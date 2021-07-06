package com.sudheer.Introductiontospiring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements Game{

	@Override
	public void up() {
		
		System.out.println("Jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Crounch");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Move backword");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub'
		System.out.println("Move Forward");
	}
	

}
