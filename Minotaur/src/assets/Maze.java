package assets;

//The Maze class is a subclass of the Block class, inheriting all methods and data fields from the Block class.
//The Maze class allows me 

public class Maze extends Block {

	// Data fields.
	private int type = 1;
	private int prevType = 1;
	private final int MAXTYPE = 16;
	private final int MINTYPE = 1;
	private boolean canMoveLeft = true;
	private boolean canMoveRight = true;
	private boolean canMoveUp = true;
	private boolean canMoveDown = true;

	// Constructors.
	public Maze() {

	}

	public Maze(int x, int y) {
		setX(x);
		setY(y);
	}

	public Maze(int x, int y, int type) {
		if (x > MAXX || x < MINX)
			x = MINX;
		if (y > MAXY || y < MINY)
			y = MINY;
		this.setX(x);
		this.setY(y);
		if (type > MAXTYPE || type < MINTYPE)
			type = 1;
		this.type = type;
		setMove(type);
	}

	// Getters and Setters. I do not allow the user to individually set movement
	// abilities. They must change the
	// type to change the movement restrictions. This is important for the GUI
	// output.
	public int getType() {
		return type;
	}

	// Note that this also uses the setMove method.
	public void setType(int type) {
		if (type > MAXTYPE || type < MINTYPE)
			type = 1;
		this.type = type;
		setMove(type);
	}

	public boolean getCanMoveUp() {
		return canMoveUp;
	}

	public boolean getCanMoveLeft() {
		return canMoveLeft;
	}

	public boolean getCanMoveRight() {
		return canMoveRight;
	}

	public boolean getCanMoveDown() {
		return canMoveDown;
	}

	// Methods below.

	// So, I wrote the following as extra code-- it's not necessary for what we
	// currently plan to do, but
	// if we ever decide to incorporate these concepts, life will be a bit
	// easier.
	public void pivotHall() {
		if (type == 6)
			type++;
		if (type == 7)
			type--;
		setMove(type);
	}

	public void pivotCornerClockWise() {
		switch (type) {
		case 8:
			type++;
			break;
		case 9:
			type++;
			break;
		case 10:
			type++;
			break;
		case 11:
			type = 8;
			break;
		default:
			break;
		}
		setMove(type);
	}

	public void pivotCornerCounterClockWise() {
		switch (type) {
		case 8:
			type = 11;
			break;
		case 9:
			type--;
			break;
		case 10:
			type--;
			break;
		case 11:
			type--;
			break;
		default:
			break;
		}
		setMove(type);
	}

	public void pivotSideClockWise() {
		switch (type) {
		case 2:
			type++;
			break;
		case 3:
			type++;
			break;
		case 4:
			type++;
			break;
		case 5:
			type = 2;
			break;
		default:
			break;
		}
		setMove(type);
	}

	public void pivotSideCounterClockWise() {
		switch (type) {
		case 2:
			type = 5;
			break;
		case 3:
			type--;
			break;
		case 4:
			type--;
			break;
		case 5:
			type--;
			break;
		default:
			break;
		}
		setMove(type);
	}

	public void alternateLeftRight() {
		if (type == 2)
			type = 4;
		if (type == 4)
			type = 2;
		setMove(type);
	}

	public void alternateUpDown() {
		if (type == 5)
			type = 3;
		if (type == 3)
			type = 5;
		setMove(type);
	}

	public void alternateOpenClose() {
		if (type == 16)
			type = prevType;
		if (type != 16) {
			prevType = type;
			type = 16;
		}
		setMove(type);
	}

	// This method uses the type to set the movement data of the Maze Blocks.
	// ABSOLUTELY VITAL!!!
	private void setMove(int type) {
		switch (type) {
		case 0:
		case 1:
			canMoveLeft = true;
			canMoveRight = true;
			canMoveUp = true;
			canMoveDown = true;
			break;
		case 2:
			canMoveLeft = false;
			canMoveRight = true;
			canMoveUp = true;
			canMoveDown = true;
			break;
		case 3:
			canMoveLeft = true;
			canMoveRight = true;
			canMoveUp = true;
			canMoveDown = false;
			break;
		case 4:
			canMoveLeft = true;
			canMoveRight = false;
			canMoveUp = true;
			canMoveDown = true;
			break;
		case 5:
			canMoveLeft = true;
			canMoveRight = true;
			canMoveUp = false;
			canMoveDown = true;
			break;
		case 6:
			canMoveLeft = false;
			canMoveRight = false;
			canMoveUp = true;
			canMoveDown = true;
			break;
		case 7:
			canMoveLeft = true;
			canMoveRight = true;
			canMoveUp = false;
			canMoveDown = false;
			break;
		case 8:
			canMoveLeft = false;
			canMoveRight = true;
			canMoveUp = true;
			canMoveDown = false;
			break;
		case 9:
			canMoveLeft = true;
			canMoveRight = false;
			canMoveUp = true;
			canMoveDown = false;
			break;
		case 10:
			canMoveLeft = true;
			canMoveRight = false;
			canMoveUp = false;
			canMoveDown = true;
			break;
		case 11:
			canMoveLeft = false;
			canMoveRight = true;
			canMoveUp = false;
			canMoveDown = true;
			break;
		case 12:
			canMoveLeft = false;
			canMoveRight = false;
			canMoveUp = false;
			canMoveDown = true;
			break;
		case 13:
			canMoveLeft = false;
			canMoveRight = true;
			canMoveUp = false;
			canMoveDown = false;
			break;
		case 14:
			canMoveLeft = false;
			canMoveRight = false;
			canMoveUp = true;
			canMoveDown = false;
			break;
		case 15:
			canMoveLeft = true;
			canMoveRight = false;
			canMoveUp = false;
			canMoveDown = false;
			break;
		case 16:
			canMoveLeft = false;
			canMoveUp = false;
			canMoveDown = false;
			canMoveRight = false;
		}
	}

}
