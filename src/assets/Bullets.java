package assets;

import java.util.Random;

//The Block class is easily our most important class. 
//It creates the data for our map world, which is incredibly important!
public class Bullets {

	private int x;
	private int y;
	public static final int MAXX = 9;
	public static final int MAXY = 9;
	public static final int MINX = 0;
	public static final int MINY = 0;
	boolean lethal;

	// Constructors below.
	public Bullets() {
	}

	public Bullets(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(){
		if(x > 6){
			x=0;
		}
		
		if(y > 6){
			y=0;
		}
		this.x = 1;
		this.y += 1;
	}

	// Setters below.
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setLethal(boolean lethal) {
		this.lethal = lethal;
	}

	// Getters below.
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean getLethal() {
		return lethal;
	}

	// Methods:

	// I don't remember why I made this method, but I'm keeping it in until I
	// know I don't need it.
	public static void kill() {

	}
}
