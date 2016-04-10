package assets;

public class Paint {
	char[][] array = new char[30][30];

	public void paint(Maze[][] grid) {
		char out = '\u0000';
		int count = 0;
		String[][] arrayThreadBall;
		for (int i = 0; i < 30; i++){
			for (int j = 0; j < 30; j++) {
				out = getChar(i, j, grid);
		//printing if the code is in array
				if(GenLevel.mainChar.getX() == GenLevel.ball.getX()
						&& GenLevel.mainChar.getY() == GenLevel.ball.getY()) {
					arrayThreadBall = GenLevel.threadBall.DimensionalArrayList();
					try{
						if(arrayThreadBall[i][j] == "+"){
							System.out.print(arrayThreadBall[i][j]);
						}else{
							System.out.print(out);
						}
					}catch(Exception e){
						System.out.print(out);
					}
				}else{
				System.out.print(out);
				}
				array[i][j] = out;
			}
			System.out.println();
		}
		
		for (int i = 0; i < GenLevel.coinArray.size(); i++) {
			if (GenLevel.mainChar.getX() == GenLevel.coinArray.get(i).getX()
					&& GenLevel.mainChar.getY() == GenLevel.coinArray.get(i).getY()) {
				GenLevel.coinArray.remove(i);
				GenLevel.mainChar.addCoins();
			}
		}

		if (GenLevel.mainChar.getX() == GenLevel.transporter.getX()
				&& GenLevel.mainChar.getY() == GenLevel.transporter.getY()) {
			GenLevel.mainChar.setLocation(8, 3);
		}
		for (int i = 0; i < GenLevel.life.size(); i++) {
			if (GenLevel.life.size() > 0) {
				if (GenLevel.life.get(i).getX() == GenLevel.mainChar.getX()
						&& GenLevel.life.get(i).getY() == GenLevel.mainChar.getY()) {
					GenLevel.mainChar.addLives();
					GenLevel.life.remove(i);
				}
			}
		}
		System.out.print(GenLevel.mainChar.path.toString());

	}

	char getChar(int i, int j, Maze[][] grid) {
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
					return '.';
			else if (j % 3 == 1)
				if (grid[y][x].getCanMoveUp() == false)
					return 'x';
				else
					return '.';
			else {
				if (grid[y][x].getCanMoveUp() == false || grid[y][x].getCanMoveRight() == false)
					return 'x';
				else
					return '.';
			}
		} else if (i % 3 == 1) {
			if (j % 3 == 0)
				if (grid[y][x].getCanMoveLeft() == false)
					return 'x';
				else
					return '.';
			else if (j % 3 == 1) {
				return paintMiddle(x, y);
			} else {
				if (grid[y][x].getCanMoveRight() == false)
					return 'x';
				else
					return '.';
			}
		} else {

			if (j % 3 == 0)
				if (grid[y][x].getCanMoveDown() == false || grid[y][x].getCanMoveLeft() == false)
					return 'x';
				else
					return '.';

			else if (j % 3 == 1)
				if (grid[y][x].getCanMoveDown() == false)
					return 'x';
				else
					return '.';

			else {
				if (grid[y][x].getCanMoveDown() == false || grid[y][x].getCanMoveRight() == false)
					return 'x';
				else
					return '.';
			}
		}
	}

	static char paintMiddle(int x, int y) {

		if (GenLevel.mainChar.getX() == x && GenLevel.mainChar.getY() == y)
			return 'C';
		if (GenLevel.end.getX() == x && GenLevel.end.getY() == y)
			return 'E';
		if (GenLevel.start.getX() == x && GenLevel.start.getY() == y)
			return 'S';
		if (GenLevel.rr.getX() == x && GenLevel.rr.getY() == y)
			return 'Y';
		if (GenLevel.transporter.getX() == x && GenLevel.transporter.getY() == y)
			return 'T';
		if (GenLevel.ball.getX() == x && GenLevel.ball.getY() == y)
			return '+';
		for (int i = 0; i < GenLevel.life.size(); i++) {
			if (GenLevel.life.size() > 0) {
				if (GenLevel.life.get(i).getX() == x && GenLevel.life.get(i).getY() == y)
					return 'L';
			}
		}

		for (int i = 0; i < GenLevel.coinArray.size(); i++) {
			if (GenLevel.coinArray.get(i).getX() == x && GenLevel.coinArray.get(i).getY() == y)
				return '@';
		}
		
		if (GenLevel.ball.getX() == GenLevel.mainChar.getX() && GenLevel.ball.getY() == GenLevel.mainChar.getY()){
			for (int i = 0; i < GenLevel.threadBall.pathObjects.size(); i++) {
				if (GenLevel.threadBall.pathObjects.get(i).getX() == x && GenLevel.threadBall.pathObjects.get(i).getY() == y)
					return '+';
			}
		}
		
		return '.';

	}
}
