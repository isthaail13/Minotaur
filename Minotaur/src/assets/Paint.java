package assets;

public class Paint {

	public static void paint(Maze[][] grid) {
		char out = '\u0000';
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 30; j++) {
				out = getChar(i, j, grid);
				System.out.print(out);
			}
			System.out.println("");
		}

	}

	static char getChar(int i, int j, Maze[][] grid) {
		int y = (i / 3);
		int x = (j / 3);

		// NOT IN FINAL CODE. USE FOR TEST ONLY!!!
		// int charx = 5;
		// int chary = 1;
		// END TEST CODE!!

		if (i % 3 == 0) {
			if (j % 3 == 0)
				if (grid[y][x].getCanMoveUp() == false || grid[y][x].getCanMoveLeft() == false)
					return 'x';
				else
					return ' ';
			else if (j % 3 == 1)
				if (grid[y][x].getCanMoveUp() == false)
					return 'x';
				else
					return ' ';
			else {
				if (grid[y][x].getCanMoveUp() == false || grid[y][x].getCanMoveRight() == false)
					return 'x';
				else
					return ' ';
			}
		} else if (i % 3 == 1) {
			if (j % 3 == 0)
				if (grid[y][x].getCanMoveLeft() == false)
					return 'x';
				else
					return ' ';
			else if (j % 3 == 1) {

				return paintMiddle(x, y);

			} else {
				if (grid[y][x].getCanMoveRight() == false)
					return 'x';
				else
					return ' ';
			}
		} else {

			if (j % 3 == 0)
				if (grid[y][x].getCanMoveDown() == false || grid[y][x].getCanMoveLeft() == false)
					return 'x';
				else
					return ' ';

			else if (j % 3 == 1)
				if (grid[y][x].getCanMoveDown() == false)
					return 'x';
				else
					return ' ';

			else {
				if (grid[y][x].getCanMoveDown() == false || grid[y][x].getCanMoveRight() == false)
					return 'x';
				else
					return ' ';
			}
		}
	}

	static char paintMiddle(int x, int y) {
		if (GenLevel.mainChar.getX() == x && GenLevel.mainChar.getY() == y)
			return 'C';
		else if (GenLevel.end.getX() == x && GenLevel.end.getY() == y)
			return 'E';
		else if (GenLevel.start.getX() == x && GenLevel.start.getY() == y)
			return 'S';
		else
			return ' ';
	}

}
