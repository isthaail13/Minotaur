package maze;

import java.util.Scanner;

import Monster.Monster;;

public class Index {
	public static String[][] arrayMazeFixed = new String[10][22];
	public static String[][] arrayMazeChangeable = new String[10][22];
	public static String[][] arrayMonsterChangeable = new String[10][22];

	public static void main(String[] args) {
		Monster monster;
		Maze.loadingArrayMaze(arrayMazeFixed);
		Maze.loadingArrayMaze(arrayMazeChangeable);
		int row = Maze.getPositionInRow(arrayMazeFixed);
		int col = Maze.getPositionInCol(arrayMazeFixed);
		System.arraycopy(arrayMazeFixed, 0, arrayMonsterChangeable, 0, arrayMazeFixed.length);
		Maze.paintingMaze(arrayMazeFixed);
		System.out.println();
		char move = 'z';
		Scanner scan = new Scanner(System.in);
		int status = -1;
		while (true) {
			monster = new Monster(arrayMazeChangeable);
			System.out.print("Were do you wanna move?........");
			move = scan.next().charAt(0);
			// try {
			//arrayMazeChangeable[monster.row][monster.col]= "M";
			Maze.moveCharacter(arrayMazeChangeable, row, col, move);
			readingArrays.reading(arrayMazeChangeable, arrayMonsterChangeable);

			// } catch (Exception e) {
			// System.out.printf("Cannot move %s %s", Maze.textDirection(move),
			// e);
			// }
			Maze.rePaintingMaze(arrayMazeChangeable);
			monster.deleteMonster(arrayMazeChangeable);
		}
	}
}

class readingArrays {
	public static void reading(String[][] arraya, String[][] arrayb) {
		int ara = getPositionInRow(arraya, "C");
		int aca = getPositionInCol(arraya, "C");

		int arm = getPositionInRow(arrayb, "M");
		int acm = getPositionInCol(arrayb, "M");

		System.out.print(ara + "--" + aca + "\n" + arm + "--" + acm + "\n");

		if ((ara == arm) && (aca == acm)) {
			System.out.print("killed");
		}
	}

	public static int getPositionInRow(String[][] array, String elem) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j].equalsIgnoreCase(elem.toString())) {
					return i;
				}
			}
		}
		return -1;
	}

	public static int getPositionInCol(String[][] array, String elem) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j].equalsIgnoreCase(elem.toString())) {
					return j;
				}
			}
		}
		return -1;
	}

}
