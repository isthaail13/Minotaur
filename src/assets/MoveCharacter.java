package assets;

import java.util.ArrayList;

public class MoveCharacter extends Block{

	// Data Fields.
	private int x;
	private int y;
	private int orientation;
	private final int MAXORIENTATION = 3;
	private final int MINORIENTATION = 0;
	public static int lives;
	private int coins = 0;
	private String name;
	public static ArrayList<String> path = new ArrayList<String>();
	private MovesMade movements = new MovesMade();

	// Constructors
	public MoveCharacter() {
	}

	public MoveCharacter(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public MoveCharacter(int x, int y, int orientation) {
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
		if (GenLevel.grid[this.getY()][this.getX()].getCanMoveRight() == true) {
			this.setX(this.getX() + 1);
			// path.add(String.valueOf(this.getX()));
			// path.add(String.valueOf(this.getY()));
			// path.add("-");
			movements.addMovements();
		} else
			return;
	}

	public void moveLeft() {
		setOrientation(1);
		if (GenLevel.grid[this.getY()][this.getX()].getCanMoveLeft() == true){
			this.setX(this.getX() - 1);
			movements.addMovements();
		}else
			return;
	}

	public void moveUp() {
		setOrientation(0);
		if (GenLevel.grid[this.getY()][this.getX()].getCanMoveUp() == true) {
			this.setY(this.getY() - 1);
			// //path.add("%s %s".format(String.valueOf(this.getX()),
			// String.valueOf(this.getY())));
			// path.add(String.valueOf(this.getX()));
			// path.add(String.valueOf(this.getY()));
			// path.add("-");
			movements.addMovements();
		} else
			return;
	}

	public void moveDown() {
		setOrientation(2);
		if (GenLevel.grid[this.getY()][this.getX()].getCanMoveDown() == true){
			this.setY(this.getY() + 1);
			movements.addMovements();
		}else
			return;
	}

	/***************************************************
	 * Code added by Alex Coins
	 ******************************************************/
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void addCoins() {
		this.coins += 1;
	}
	
	public int getCoins() {
		return this.coins;
	}

	public void substractCoins() {
		this.coins += 1;
	}

	public void resetCoinsCounter() {
		this.coins = 0;
	}

	/***************************************************
	 * Code added by Alex Movements
	 ******************************************************/

	public void addMoves() {
		this.movements.addMovements();;
	}

	public void resetMovesCounter() {
		this.movements.resetMovements();
	}

	public int getMoves() {
		return this.movements.getMovements();
	}
	
	/***************************************************
	 * Code added by Alex Lives
	 ******************************************************/
	public void substractLives() {
		if (this.lives > 0) {
			this.lives -= 1;
		}
	}
	
	public void addLives() {
		this.lives+=1;
	}

	public void resetLives() {
		this.lives+=1;
	}

	public int getLives() {
		return this.lives;
	}

}
