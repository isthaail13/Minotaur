package maze;

import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Array;
import Monster.Monster;

public class Maze {
	
	public static void moveCharacter(String[][] arrayMazeChangeable, int row, int col, char move){
			row = getPositionInRow(arrayMazeChangeable);
			col = getPositionInCol(arrayMazeChangeable);
			try{
				int status = checkIfMove(arrayMazeChangeable, row, col,move);
				if(status == 1){
				switch(move){
				case 'w':moveUp(arrayMazeChangeable, row, col);break;
				case 'd':moveRight(arrayMazeChangeable, row, col);break;
				case 's':moveDown(arrayMazeChangeable, row, col);break;
				case 'a':moveLeft(arrayMazeChangeable, row, col);break;
				}
				arrayMazeChangeable[row][col] = " ";
				}
				if(status == 2){
					System.out.println("\nEnd of the game\n");
					return;
				}
			}catch (Exception e){
				System.out.printf("\nIt cannot move %s\n", textDirection(move));
			}
		}
	
	public static void paintingMaze(String[][] array){
		try {
			FileData fileMaze = new FileData(array);
			for(int i=0; i<array.length;i++){
				for(int j=0; j<array[0].length;j++){
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void loadingArrayMaze(String[][] array){
		try {
			FileData fileMaze = new FileData(array);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void rePaintingMaze(String[][] array){
			for(int i=0; i<array.length;i++){
				for(int j=0; j<array[0].length;j++){
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
	}
	
	public static int getPositionInRow(String[][] array){
		for(int i=0; i<array.length;i++){
			for(int j=0; j<array[0].length;j++){
				if(array[i][j].equalsIgnoreCase("C")){
					return i;
				}
			}
		}
		return -1;
	}
	
	public static int getPositionInCol(String[][] array){
		for(int i=0; i<array.length;i++){
			for(int j=0; j<array[0].length;j++){
				if(array[i][j].equalsIgnoreCase("C")){
					return j;
				}
			}
		}
		return -1;
	}
	
	//This funciton to move the character
	public static void moveLeft(String[][] array, int row,int col){
		array[row][col-1] = "C";
	}
	public static void moveRight(String[][] array, int row,int col){
		array[row][col+1] = "C";
	}
	public static void moveUp(String[][] array, int row,int col){
		array[row-1][col] = "C";
	}
	public static void moveDown(String[][] array, int row,int col){
		array[row+1][col] = "C";
	}
	
	//Checking if possible to move
	public static String textDirection(char direction){
		String string = "Woow!!!";
		switch(direction){
		case 'w': string = "Up";break;
		case 'd': string = "Right";break;
		case 's': string = "Down";break;
		case 'a': string = "Left";break;
		}
		return string;
	}
	
	public static int checkIfMove(String[][] array, int row, int col, char direction){
		switch(direction){
		case 'w': row -= 1;break;
		case 'd': col += 1;break;
		case 's': row += 1;break;
		case 'a': col -= 1;break;
		}
		if(array[row][col].equalsIgnoreCase(" ")){
			return 1;
		}
		if(array[row][col].equalsIgnoreCase("E")){
			return 2;
		}
		return -1;
	}
}
