package assets;

public class RunnerRobot {

	// Data Fields.
	private int x;
	private int y;
	private int orientation;
	private final int MAXORIENTATION = 3;
	private final int MINORIENTATION = 0;
	public static int lives;

	// Constructors
	public RunnerRobot() {
	}

	public RunnerRobot(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public RunnerRobot(int x, int y, int orientation) {
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}

	// Setters
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}

	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setLocation(int x, int y, int orientation) {
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}

	// Getters
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getOrientation() {
		return this.orientation;
	}

	// Methods

	public void moveRight() {
		setOrientation(3);
		if (GenLevel.grid[this.getY()][this.getX()].getCanMoveRight() == true)
			this.setX(this.getX() + 1);
		else
			return;
	}

	public void moveLeft() {
		setOrientation(1);
		if (GenLevel.grid[this.getY()][this.getX()].getCanMoveLeft() == true)
			this.setX(this.getX() - 1);
		else
			return;
	}

	public void moveUp() {
		setOrientation(0);
		if (GenLevel.grid[this.getY()][this.getX()].getCanMoveUp() == true)
			this.setY(this.getY() - 1);
		else
			return;
	}

	public void moveDown() {
		setOrientation(2);
		if (GenLevel.grid[this.getY()][this.getX()].getCanMoveDown() == true)
			this.setY(this.getY() + 1);
		else
			return;
	}

	public void substractLives() {
		if (this.lives > 0) {
			this.lives -= 1;
		}
	}

}
