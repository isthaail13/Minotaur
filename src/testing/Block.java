package testing;

public class Block {

	private int type = 1;
	private int xLocation = 0;
	private int yLocation = 0;
	final static int MAX = 16;
	final static int MIN = 1;

	public Block() {

	}

	public Block(int newXLocation, int newYLocation) {
		xLocation = newXLocation;
		yLocation = newYLocation;
	}

	public Block(int newXLocation, int newYLocation, int newType) {
		xLocation = newXLocation;
		yLocation = newYLocation;
		if (newType >= MIN && newType <= MAX)
			type = newType;
	}

	public Block(int newType) {
		if (newType >= MIN && newType <= MAX)
			type = newType;
	}

	public void setType(int newType) {
		if (newType > MIN && newType < MAX) {
			type = newType;
		}
	}

	public void setX(int newX) {
		xLocation = newX;
	}
	
	

	public void setY(int newY) {
		yLocation = newY;
	}

	public void setXY(int newX, int newY) {
		xLocation = newX;
		yLocation = newY;
	}

	public void displayInfo() {
		System.out.printf("X = %d, Y =%d\n", xLocation, yLocation);
	}
}
