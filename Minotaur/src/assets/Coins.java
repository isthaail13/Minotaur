package assets;

import java.util.Random;

import java.math.*;
//THis class creates the objects for each coin

public class Coins {
	//My local variables
	private int x;
	private int y;
	boolean lethal;
	
	// Constructors below.
	Coins() {
		setX();
		setY();
	}
	
	//This method generates a random number
	public int random(){
		int rnd = (int)(Math.random() * 10);
		return rnd;
	}

	// Setters below.
	public void setX() {
		
		this.x = random();
		int u = x;
	}

	public void setY() {
		this.y = random();
	}


	// Getters below.
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}


}
