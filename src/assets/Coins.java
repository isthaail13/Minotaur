package assets;

import java.util.Random;
import java.math.*;
//The Block class is easily our most important class. 
//It creates the data for our map world, which is incredibly important!
public class Coins {

	private int x;
	private int y;
	boolean lethal;
	// Constructors below.
	Coins() {
		setX();
		setY();
	}
	
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
