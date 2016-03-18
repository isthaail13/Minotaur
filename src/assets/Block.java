package assets;

//The Block class is easily our most important class. 
//It creates the data for our map world, which is incredibly important!
public class Block {

	private int x;
	private int y;
	public static final int MAXX = 9;
	public static final int MAXY = 9;
	public static final int MINX = 0;
	public static final int MINY = 0;
	boolean lethal;

	// Constructors below.
	public Block() {
	}

	public Block(int x, int y) {
		this.x = x;
		this.y = y;
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
