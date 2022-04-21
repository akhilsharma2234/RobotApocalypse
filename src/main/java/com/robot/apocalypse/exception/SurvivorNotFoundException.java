package com.robot.apocalypse.exception;

public class SurvivorNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6553522919178405045L;

	public SurvivorNotFoundException(String message) {
		super(message);
	}
}
