package assets;

import java.util.ArrayList;

public class ThreadBall {
	public static ArrayList<Integer> array = new ArrayList<Integer>();
	public static ArrayList<Path> pathObjects = new ArrayList<Path>();

	ThreadBall() {
		loadArrayList();
	}
	
	public String[][] DimensionalArrayList(int lev) {
		switch(lev){
		case 1: return DimensionalArrayListLevel1();
		case 2: return DimensionalArrayListLevel2();
		case 3: return DimensionalArrayListLevel3();
		case 4: return DimensionalArrayListLevel4();
		default:
			return DimensionalArrayListDefault();
		}
	}

	public void loadArrayList() {
		// Loading the first row
		array.add(1);
		array.add(9);
		array.add(2);
		array.add(9);
		array.add(3);
		array.add(9);
		array.add(4);
		array.add(9);
		array.add(5);
		array.add(9);
		array.add(6);
		array.add(9);
		array.add(7);
		array.add(9);
		array.add(8);
		array.add(9);
		array.add(9);
		array.add(9);
		// Loading the second half of the path
		array.add(9);
		array.add(8);
		array.add(9);
		array.add(7);
		array.add(9);
		array.add(6);
		array.add(9);
		array.add(5);
		array.add(9);
		array.add(4);
		array.add(9);
		array.add(3);
		array.add(9);
		array.add(2);
		array.add(9);
		array.add(1);
		array.add(9);
		array.add(0);
	}
	public String[][] DimensionalArrayListDefault() {
		String[][] arrayLocation = new String[0][0];
		return arrayLocation;
	}
	public String[][] DimensionalArrayListLevel1() {
		String[][] arrayLocation = new String[90][90];
		// for(int i = 0; i<arrayList.size(); i++){
		arrayLocation[1][9] = "+";
		arrayLocation[2][9] = "+";
		arrayLocation[3][9] = "+";
		arrayLocation[4][9] = "+";
		arrayLocation[5][9] = "+";
		arrayLocation[6][9] = "+";
		arrayLocation[7][9] = "+";
		arrayLocation[8][9] = "+";
		arrayLocation[9][9] = "+";

		arrayLocation[9][1] = "+";
		arrayLocation[9][2] = "+";
		arrayLocation[9][3] = "+";
		arrayLocation[9][4] = "+";
		arrayLocation[9][5] = "+";
		arrayLocation[9][6] = "+";
		arrayLocation[9][7] = "+";
		arrayLocation[9][8] = "+";
		arrayLocation[9][9] = "+";
		return arrayLocation;

	}
	
	public String[][] DimensionalArrayListLevel2() {
		String[][] arrayLocation = new String[90][90];
		// for(int i = 0; i<arrayList.size(); i++){
		arrayLocation[1][9] = "+";
		arrayLocation[2][9] = "+";
		arrayLocation[3][9] = "+";
		arrayLocation[4][9] = "+";
		arrayLocation[5][9] = "+";
		arrayLocation[6][9] = "+";
		arrayLocation[7][9] = "+";
		arrayLocation[8][9] = "+";
		arrayLocation[9][9] = "+";

		arrayLocation[9][1] = "+";
		arrayLocation[9][2] = "+";
		arrayLocation[9][3] = "+";
		arrayLocation[9][4] = "+";
		arrayLocation[9][5] = "+";
		arrayLocation[9][6] = "+";
		arrayLocation[9][7] = "+";
		arrayLocation[9][8] = "+";
		arrayLocation[9][9] = "+";
		return arrayLocation;
	}

	public String[][] DimensionalArrayListLevel3() {
		String[][] arrayLocation = new String[90][90];
		/*
		 * [8, 9, -, 7, 9, -, 6, 9, -, 5, 9, -, 4, 9, -, 3, 9, -, 2, 9, -, 1, 9,
		 * -, 0, 9, -, 0, 8, -, 0, 7, -, 0, 6, -, 0, 5, -, 1, 5, -, 2, 5, -, 3,
		 * 5, -, 3, 4, -, 3, 3, -, 3, 2, -, 3, 3, -, 4, 3, -, 5, 3, -, 5, 2, -,
		 * 5, 1, -, 5, 0, -, 6, 0, -, 7, 0, -, 8, 0, -]
		 */
		arrayLocation[9][8] = "+";
		arrayLocation[9][8] = "+";
		arrayLocation[9][7] = "+";
		arrayLocation[9][6] = "+";
		arrayLocation[9][5] = "+";
		arrayLocation[9][4] = "+";
		arrayLocation[9][3] = "+";
		arrayLocation[9][2] = "+";
		arrayLocation[9][1] = "+";
		arrayLocation[9][0] = "+";

		arrayLocation[0][8] = "+";
		arrayLocation[0][7] = "+";
		arrayLocation[0][6] = "+";
		arrayLocation[0][5] = "+";
		arrayLocation[1][5] = "+";
		arrayLocation[2][5] = "+";
		arrayLocation[3][5] = "+";
		arrayLocation[3][4] = "+";
		arrayLocation[3][3] = "+";

		arrayLocation[4][3] = "+";
		arrayLocation[5][3] = "+";
		arrayLocation[5][2] = "+";
		arrayLocation[5][1] = "+";
		arrayLocation[5][0] = "+";
		arrayLocation[6][0] = "+";
		arrayLocation[7][0] = "+";
		arrayLocation[8][0] = "+";

		// }
		return arrayLocation;
	}

	public String[][] DimensionalArrayListLevel4() {
		String[][] arrayLocation = new String[90][90];
		// for(int i = 0; i<arrayList.size(); i++){
		arrayLocation[1][9] = "+";
		arrayLocation[2][9] = "+";
		arrayLocation[3][9] = "+";
		arrayLocation[4][9] = "+";
		arrayLocation[5][9] = "+";
		arrayLocation[6][9] = "+";
		arrayLocation[7][9] = "+";
		arrayLocation[8][9] = "+";
		arrayLocation[9][9] = "+";

		arrayLocation[9][1] = "+";
		arrayLocation[9][2] = "+";
		arrayLocation[9][3] = "+";
		arrayLocation[9][4] = "+";
		arrayLocation[9][5] = "+";
		arrayLocation[9][6] = "+";
		arrayLocation[9][7] = "+";
		arrayLocation[9][8] = "+";
		arrayLocation[9][9] = "+";
		return arrayLocation;
	}
	
	public void readArray() {
		for (int i = 0; i < array.size(); i = i + 2) {
			if (i % 2 == 0) {
				pathObjects.add(new Path());
			}
		}
	}

}

class Path {
	private int x;
	private int y;

	Path() {

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

class Ball {
	private int x = 0;
	private int y = 0;

	Ball() {

	}

	Ball(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setBall(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void resetBall() {
		this.x = 0;
		this.y = 0;
	}

}
