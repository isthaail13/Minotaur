package assets;

import java.io.IOException;
import java.util.ArrayList;

//This class creates levels based on fun stuff.
public class GenLevel {

	// Grid here will be recreated in the official controller method.
	public static Maze[][] grid = new Maze[10][10];
	public static MoveCharacter mainChar = new MoveCharacter();
	public static int level = 1;
	public static End end = new End();
	public static Start start = new Start();
	public static RunnerRobot rr = new RunnerRobot();
	public static ArrayList<Coins> coinArray = new ArrayList<Coins>();
	public static Transporter transporter = new Transporter();
	public static ArrayList<Lives> life = new ArrayList<Lives>();
	public static ThreadBall threadBall = new ThreadBall();
	public static Ball ball = new Ball(9, 5);
	public static MovesMade moves = new MovesMade();
	public static TimerMoves timerMoves = new TimerMoves();
	private static long startTime;
	
	private static long stopTime;
	private static ReadFileScores fileMaze;
	private static WriteFile writeToFile;
	
	public static Pit pit = new Pit();
	public static Monster monster = new Monster();
	public static Mummy mummy = new Mummy();

	// The main method is only here for testing purposes. When the game finally
	// runs, main method will be taken out.
	public static void main(String[] args) {
//		try {
//			fileMaze = new ReadFileScores();
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
			startTime = timerMoves.Time();
			//if(Login.getName()!= null){
			for(int i = 0;i<11;i++){
				coinArray.add(new Coins());
			}
			//Adding lives
			life.add(new Lives(1,1));
			life.add(new Lives(9,8));
			life.add(new Lives(9,6));
			genLevel1(grid);
			testing.Paint.main();
			testing.KeyEventDemo.begin();
			OpsTimer.timer1.start();
			//}
	}

	public static void genLevel() {
		level++;
		switch (level) {
		case 1:
			genLevel1(grid);
			break;
		case 2:
			genLevel2(grid);
			break;
		case 3:
			genLevel3(grid);
			break;
		case 4:
			genLevel5(grid);
			break;
		case 5:
			genLevel4(grid);
			break;
		case 6:
			genLevel6(grid);
			break;
		default:
			printScores();
		}
	}
	
	public static void printScores(){
		try {
			writeToFile = new WriteFile();
			OpsTimer.timer1.stop();
			if(!OpsTimer.timer1.isRunning()){
			stopTime = timerMoves.Time();
			System.out.println("Lives: " + mainChar.lives + "\nCoins: " + mainChar.getCoins() + "\nMovements: "
					+ mainChar.getMoves() + "\nTime Spent: " + timerMoves.computeTimer(startTime, stopTime));
			}
			writeToFile.writeToFile(mainChar.getName(),mainChar.getLives(), mainChar.getMoves(), mainChar.getCoins(), timerMoves.computeTimer(startTime, stopTime));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Start with level 1.
	private static void genLevel1(Maze[][] grid) {
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++)
				grid[i][j] = new Maze(i + 1, j + 1);

		// first row
		grid[0][0].setType(11);
		grid[0][1].setType(5);
		grid[0][2].setType(5);
		grid[0][3].setType(5);
		grid[0][4].setType(5);
		grid[0][5].setType(5);
		grid[0][6].setType(5);
		grid[0][7].setType(5);
		grid[0][8].setType(5);
		grid[0][9].setType(12);

		// second row

		grid[1][0].setType(2);
		grid[1][1].setType(1);
		grid[1][2].setType(1);
		grid[1][3].setType(1);
		grid[1][4].setType(1);
		grid[1][5].setType(1);
		grid[1][6].setType(1);
		grid[1][7].setType(1);
		grid[1][8].setType(1);
		grid[1][9].setType(6);

		// third row

		grid[2][0].setType(2);
		grid[2][1].setType(1);
		grid[2][2].setType(1);
		grid[2][3].setType(1);
		grid[2][4].setType(1);
		grid[2][5].setType(1);
		grid[2][6].setType(1);
		grid[2][7].setType(1);
		grid[2][8].setType(1);
		grid[2][9].setType(6);

		// fourth row

		grid[3][0].setType(2);
		grid[3][1].setType(1);
		grid[3][2].setType(1);
		grid[3][3].setType(1);
		grid[3][4].setType(1);
		grid[3][5].setType(1);
		grid[3][6].setType(1);
		grid[3][7].setType(1);
		grid[3][8].setType(1);
		grid[3][9].setType(6);

		// fifth row

		grid[4][0].setType(2);
		grid[4][1].setType(1);
		grid[4][2].setType(1);
		grid[4][3].setType(1);
		grid[4][4].setType(1);
		grid[4][5].setType(1);
		grid[4][6].setType(1);
		grid[4][7].setType(1);
		grid[4][8].setType(1);
		grid[4][9].setType(6);

		// sixth row

		grid[5][0].setType(2);
		grid[5][1].setType(1);
		grid[5][2].setType(1);
		grid[5][3].setType(1);
		grid[5][4].setType(1);
		grid[5][5].setType(1);
		grid[5][6].setType(1);
		grid[5][7].setType(1);
		grid[5][8].setType(1);
		grid[5][9].setType(6);

		// seventh row

		grid[6][0].setType(2);
		grid[6][1].setType(1);
		grid[6][2].setType(1);
		grid[6][3].setType(1);
		grid[6][4].setType(1);
		grid[6][5].setType(1);
		grid[6][6].setType(1);
		grid[6][7].setType(1);
		grid[6][8].setType(1);
		grid[6][9].setType(6);

		// 8th row

		grid[7][0].setType(2);
		grid[7][1].setType(1);
		grid[7][2].setType(1);
		grid[7][3].setType(1);
		grid[7][4].setType(1);
		grid[7][5].setType(1);
		grid[7][6].setType(1);
		grid[7][7].setType(1);
		grid[7][8].setType(1);
		grid[7][9].setType(6);

		// 9th row

		grid[8][0].setType(2);
		grid[8][1].setType(1);
		grid[8][2].setType(1);
		grid[8][3].setType(1);
		grid[8][4].setType(1);
		grid[8][5].setType(1);
		grid[8][6].setType(1);
		grid[8][7].setType(1);
		grid[8][8].setType(1);
		grid[8][9].setType(6);

		// 10th row

		grid[9][0].setType(13);
		grid[9][1].setType(7);
		grid[9][2].setType(7);
		grid[9][3].setType(7);
		grid[9][4].setType(7);
		grid[9][5].setType(7);
		grid[9][6].setType(7);
		grid[9][7].setType(7);
		grid[9][8].setType(7);
		grid[9][9].setType(9);

		// Main character.
		start.setX(0);
		start.setY(9);
		end.setX(9);
		end.setY(0);
		mainChar.setLocation(start.getX(), start.getY());
	}

	private static void genLevel2(Maze[][] grid) {
		// first row
		grid[0][0].setType(11);
		grid[0][1].setType(7);
		grid[0][2].setType(10);
		grid[0][3].setType(12);
		grid[0][4].setType(13);
		grid[0][5].setType(10);
		grid[0][6].setType(13);
		grid[0][7].setType(10);
		grid[0][8].setType(11);
		grid[0][9].setType(10);

		// second row

		grid[1][0].setType(6);
		grid[1][1].setType(13);
		grid[1][2].setType(9);
		grid[1][3].setType(8);
		grid[1][4].setType(10);
		grid[1][5].setType(8);
		grid[1][6].setType(7);
		grid[1][7].setType(4);
		grid[1][8].setType(14);
		grid[1][9].setType(6);

		// third row

		grid[2][0].setType(8);
		grid[2][1].setType(7);
		grid[2][2].setType(5);
		grid[2][3].setType(5);
		grid[2][4].setType(4);
		grid[2][5].setType(11);
		grid[2][6].setType(7);
		grid[2][7].setType(9);
		grid[2][8].setType(11);
		grid[2][9].setType(9);

		// fourth row

		grid[3][0].setType(12);
		grid[3][1].setType(11);
		grid[3][2].setType(9);
		grid[3][3].setType(6);
		grid[3][4].setType(14);
		grid[3][5].setType(8);
		grid[3][6].setType(7);
		grid[3][7].setType(7);
		grid[3][8].setType(4);
		grid[3][9].setType(12);

		// fifth row

		grid[4][0].setType(8);
		grid[4][1].setType(9);
		grid[4][2].setType(11);
		grid[4][3].setType(3);
		grid[4][4].setType(10);
		grid[4][5].setType(13);
		grid[4][6].setType(7);
		grid[4][7].setType(10);
		grid[4][8].setType(8);
		grid[4][9].setType(4);

		// sixth row

		grid[5][0].setType(11);
		grid[5][1].setType(10);
		grid[5][2].setType(8);
		grid[5][3].setType(10);
		grid[5][4].setType(8);
		grid[5][5].setType(10);
		grid[5][6].setType(11);
		grid[5][7].setType(9);
		grid[5][8].setType(12);
		grid[5][9].setType(6);

		// seventh row

		grid[6][0].setType(6);
		grid[6][1].setType(8);
		grid[6][2].setType(7);
		grid[6][3].setType(9);
		grid[6][4].setType(12);
		grid[6][5].setType(8);
		grid[6][6].setType(9);
		grid[6][7].setType(11);
		grid[6][8].setType(3);
		grid[6][9].setType(9);

		// 8th row

		grid[7][0].setType(8);
		grid[7][1].setType(10);
		grid[7][2].setType(11);
		grid[7][3].setType(7);
		grid[7][4].setType(9);
		grid[7][5].setType(13);
		grid[7][6].setType(10);
		grid[7][7].setType(8);
		grid[7][8].setType(7);
		grid[7][9].setType(10);

		// 9th row

		grid[8][0].setType(11);
		grid[8][1].setType(9);
		grid[8][2].setType(2);
		grid[8][3].setType(15);
		grid[8][4].setType(11);
		grid[8][5].setType(10);
		grid[8][6].setType(2);
		grid[8][7].setType(5);
		grid[8][8].setType(15);
		grid[8][9].setType(6);

		// 10th row

		grid[9][0].setType(8);
		grid[9][1].setType(7);
		grid[9][2].setType(3);
		grid[9][3].setType(7);
		grid[9][4].setType(9);
		grid[9][5].setType(8);
		grid[9][6].setType(9);
		grid[9][7].setType(8);
		grid[9][8].setType(7);
		grid[9][9].setType(9);

		// Main character.
		start.setX(5);
		start.setY(9);
		mainChar.setLocation(5, 9);
		end.setX(4);
		end.setY(0);
		rr.setX(4);
		rr.setY(2);
	}

	private static void genLevel3(Maze[][] grid) {
		// first row
		grid[0][0].setType(11);
		grid[0][1].setType(5);
		grid[0][2].setType(11);
		grid[0][3].setType(5);
		grid[0][4].setType(7);
		grid[0][5].setType(5);
		grid[0][6].setType(5);
		grid[0][7].setType(7);
		grid[0][8].setType(10);
		grid[0][9].setType(12);

		// second row

		grid[1][0].setType(2);
		grid[1][1].setType(8);
		grid[1][2].setType(7);
		grid[1][3].setType(3);
		grid[1][4].setType(7);
		grid[1][5].setType(4);
		grid[1][6].setType(6);
		grid[1][7].setType(12);
		grid[1][8].setType(14);
		grid[1][9].setType(6);

		// third row

		grid[2][0].setType(8);
		grid[2][1].setType(10);
		grid[2][2].setType(12);
		grid[2][3].setType(11);
		grid[2][4].setType(15);
		grid[2][5].setType(2);
		grid[2][6].setType(3);
		grid[2][7].setType(3);
		grid[2][8].setType(15);
		grid[2][9].setType(4);

		// fourth row

		grid[3][0].setType(12);
		grid[3][1].setType(6);
		grid[3][2].setType(8);
		grid[3][3].setType(1);
		grid[3][4].setType(7);
		grid[3][5].setType(3);
		grid[3][6].setType(7);
		grid[3][7].setType(10);
		grid[3][8].setType(12);
		grid[3][9].setType(4);

		// fifth row

		grid[4][0].setType(8);
		grid[4][1].setType(3);
		grid[4][2].setType(7);
		grid[4][3].setType(4);
		grid[4][4].setType(11);
		grid[4][5].setType(7);
		grid[4][6].setType(10);
		grid[4][7].setType(2);
		grid[4][8].setType(9);
		grid[4][9].setType(4);

		// sixth row

		grid[5][0].setType(11);
		grid[5][1].setType(5);
		grid[5][2].setType(7);
		grid[5][3].setType(9);
		grid[5][4].setType(4);
		grid[5][5].setType(13);
		grid[5][6].setType(4);
		grid[5][7].setType(8);
		grid[5][8].setType(4);
		grid[5][9].setType(6);

		// seventh row

		grid[6][0].setType(6);
		grid[6][1].setType(6);
		grid[6][2].setType(11);
		grid[6][3].setType(5);
		grid[6][4].setType(9);
		grid[6][5].setType(12);
		grid[6][6].setType(8);
		grid[6][7].setType(7);
		grid[6][8].setType(7);
		grid[6][9].setType(4);

		// 8th row

		grid[7][0].setType(2);
		grid[7][1].setType(4);
		grid[7][2].setType(6);
		grid[7][3].setType(2);
		grid[7][4].setType(5);
		grid[7][5].setType(3);
		grid[7][6].setType(2);
		grid[7][7].setType(7);
		grid[7][8].setType(9);
		grid[7][9].setType(6);

		// 9th row

		grid[8][0].setType(6);
		grid[8][1].setType(8);
		grid[8][2].setType(9);
		grid[8][3].setType(14);
		grid[8][4].setType(8);
		grid[8][5].setType(3);
		grid[8][6].setType(3);
		grid[8][7].setType(7);
		grid[8][8].setType(15);
		grid[8][9].setType(6);

		// 10th row

		grid[9][0].setType(8);
		grid[9][1].setType(7);
		grid[9][2].setType(7);
		grid[9][3].setType(7);
		grid[9][4].setType(7);
		grid[9][5].setType(7);
		grid[9][6].setType(7);
		grid[9][7].setType(7);
		grid[9][8].setType(7);
		grid[9][9].setType(15);

		// Main character.
		start.setX(2);
		start.setY(3);
		mainChar.setLocation(9, 9);
		end.setX(7);
		end.setY(8);
		rr.setX(4);
		rr.setY(2);
	}

	private static void genLevel4(Maze[][] grid) {
		// first row
		grid[0][0].setType(11);
		grid[0][1].setType(5);
		grid[0][2].setType(11);
		grid[0][3].setType(5);
		grid[0][4].setType(7);
		grid[0][5].setType(5);
		grid[0][6].setType(5);
		grid[0][7].setType(7);
		grid[0][8].setType(10);
		grid[0][9].setType(12);

		// second row

		grid[1][0].setType(2);
		grid[1][1].setType(8);
		grid[1][2].setType(7);
		grid[1][3].setType(3);
		grid[1][4].setType(7);
		grid[1][5].setType(4);
		grid[1][6].setType(6);
		grid[1][7].setType(12);
		grid[1][8].setType(14);
		grid[1][9].setType(6);

		// third row

		grid[2][0].setType(8);
		grid[2][1].setType(10);
		grid[2][2].setType(12);
		grid[2][3].setType(11);
		grid[2][4].setType(15);
		grid[2][5].setType(2);
		grid[2][6].setType(3);
		grid[2][7].setType(3);
		grid[2][8].setType(15);
		grid[2][9].setType(4);

		// fourth row

		grid[3][0].setType(12);
		grid[3][1].setType(6);
		grid[3][2].setType(8);
		grid[3][3].setType(1);
		grid[3][4].setType(7);
		grid[3][5].setType(3);
		grid[3][6].setType(7);
		grid[3][7].setType(10);
		grid[3][8].setType(12);
		grid[3][9].setType(4);

		// fifth row

		grid[4][0].setType(8);
		grid[4][1].setType(3);
		grid[4][2].setType(7);
		grid[4][3].setType(4);
		grid[4][4].setType(11);
		grid[4][5].setType(7);
		grid[4][6].setType(10);
		grid[4][7].setType(2);
		grid[4][8].setType(9);
		grid[4][9].setType(4);

		// sixth row

		grid[5][0].setType(11);
		grid[5][1].setType(5);
		grid[5][2].setType(7);
		grid[5][3].setType(9);
		grid[5][4].setType(4);
		grid[5][5].setType(13);
		grid[5][6].setType(4);
		grid[5][7].setType(8);
		grid[5][8].setType(4);
		grid[5][9].setType(6);

		// seventh row

		grid[6][0].setType(6);
		grid[6][1].setType(6);
		grid[6][2].setType(11);
		grid[6][3].setType(5);
		grid[6][4].setType(9);
		grid[6][5].setType(12);
		grid[6][6].setType(8);
		grid[6][7].setType(7);
		grid[6][8].setType(7);
		grid[6][9].setType(4);

		// 8th row

		grid[7][0].setType(2);
		grid[7][1].setType(4);
		grid[7][2].setType(6);
		grid[7][3].setType(2);
		grid[7][4].setType(5);
		grid[7][5].setType(3);
		grid[7][6].setType(2);
		grid[7][7].setType(7);
		grid[7][8].setType(9);
		grid[7][9].setType(6);

		// 9th row

		grid[8][0].setType(6);
		grid[8][1].setType(8);
		grid[8][2].setType(3);
		grid[8][3].setType(14);
		grid[8][4].setType(8);
		grid[8][5].setType(3);
		grid[8][6].setType(3);
		grid[8][7].setType(7);
		grid[8][8].setType(15);
		grid[8][9].setType(6);

		// 10th row

		grid[9][0].setType(8);
		grid[9][1].setType(7);
		grid[9][2].setType(7);
		grid[9][3].setType(7);
		grid[9][4].setType(7);
		grid[9][5].setType(7);
		grid[9][6].setType(7);
		grid[9][7].setType(7);
		grid[9][8].setType(7);
		grid[9][9].setType(15);

		// Main character.
		start.setX(2);
		start.setY(3);
		mainChar.setLocation(9, 9);
		end.setX(7);
		end.setY(8);
		rr.setX(4);
		rr.setY(2);
	}
	
	/**
	 *  from here by Ian
	 */
	
	// Level 5 - open top stage
	private static void genLevel5(Maze[][] grid) {
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++)
				grid[i][j] = new Maze(i + 1, j + 1);

		// first row
		grid[0][0].setType(11);
		grid[0][1].setType(5);
		grid[0][2].setType(5);
		grid[0][3].setType(5);
		grid[0][4].setType(5);
		grid[0][5].setType(5);
		grid[0][6].setType(5);
		grid[0][7].setType(5);
		grid[0][8].setType(5);
		grid[0][9].setType(10);

		// second row

		grid[1][0].setType(2);
		grid[1][1].setType(3);
		grid[1][2].setType(3);
		grid[1][3].setType(3);
		grid[1][4].setType(1);
		grid[1][5].setType(3);
		grid[1][6].setType(3);
		grid[1][7].setType(1);
		grid[1][8].setType(3);
		grid[1][9].setType(4);

		// third row

		grid[2][0].setType(8);
		grid[2][1].setType(7);
		grid[2][2].setType(5);
		grid[2][3].setType(5);
		grid[2][4].setType(4);
		grid[2][5].setType(11);
		grid[2][6].setType(7);
		grid[2][7].setType(9);
		grid[2][8].setType(11);
		grid[2][9].setType(9);

		// fourth row

		grid[3][0].setType(12);
		grid[3][1].setType(11);
		grid[3][2].setType(9);
		grid[3][3].setType(6);
		grid[3][4].setType(14);
		grid[3][5].setType(8);
		grid[3][6].setType(7);
		grid[3][7].setType(7);
		grid[3][8].setType(4);
		grid[3][9].setType(12);

		// fifth row

		grid[4][0].setType(8);
		grid[4][1].setType(9);
		grid[4][2].setType(11);
		grid[4][3].setType(3);
		grid[4][4].setType(10);
		grid[4][5].setType(13);
		grid[4][6].setType(7);
		grid[4][7].setType(10);
		grid[4][8].setType(8);
		grid[4][9].setType(4);

		// sixth row

		grid[5][0].setType(11);
		grid[5][1].setType(10);
		grid[5][2].setType(8);
		grid[5][3].setType(10);
		grid[5][4].setType(2);
		grid[5][5].setType(10);
		grid[5][6].setType(11);
		grid[5][7].setType(9);
		grid[5][8].setType(12);
		grid[5][9].setType(6);

		// seventh row

		grid[6][0].setType(6);
		grid[6][1].setType(8);
		grid[6][2].setType(7);
		grid[6][3].setType(9);
		grid[6][4].setType(6);
		grid[6][5].setType(8);
		grid[6][6].setType(9);
		grid[6][7].setType(11);
		grid[6][8].setType(3);
		grid[6][9].setType(9);

		// 8th row

		grid[7][0].setType(8);
		grid[7][1].setType(10);
		grid[7][2].setType(11);
		grid[7][3].setType(7);
		grid[7][4].setType(9);
		grid[7][5].setType(13);
		grid[7][6].setType(10);
		grid[7][7].setType(8);
		grid[7][8].setType(7);
		grid[7][9].setType(10);

		// 9th row

		grid[8][0].setType(11);
		grid[8][1].setType(9);
		grid[8][2].setType(2);
		grid[8][3].setType(15);
		grid[8][4].setType(11);
		grid[8][5].setType(10);
		grid[8][6].setType(2);
		grid[8][7].setType(5);
		grid[8][8].setType(15);
		grid[8][9].setType(6);

		// 10th row

		grid[9][0].setType(8);
		grid[9][1].setType(7);
		grid[9][2].setType(3);
		grid[9][3].setType(7);
		grid[9][4].setType(9);
		grid[9][5].setType(8);
		grid[9][6].setType(9);
		grid[9][7].setType(8);
		grid[9][8].setType(7);
		grid[9][9].setType(9);

		// This level's start/end point set in the maze 
		start.setX(0);
		start.setY(9);
		end.setX(2);
		end.setY(9);
		// Character's starting position set
		mainChar.setLocation(start.getX(), start.getY());
		
		// Obstacle-pit settings in the maze
//		pit.setPosition(1, 7);
//		pit.setPosition(4, 5);
//		pit.setPosition(5, 8);
//		
//		// Obstacle-monster settings in the maze
//		monster.setPosition(0, 1);
//		monster.setPosition(2, 3);
//		monster.setPosition(4, 0);
//		monster.setPosition(4, 1);
//		monster.setPosition(8, 6);
//		monster.setPosition(9, 2);
//		
//		// Obstacle-mummy settings in the maze
//		mummy.setPosition(4, 7);
//		mummy.setPosition(5, 3);
//		mummy.setPosition(6, 2);
//		mummy.setPosition(7, 1);
//		mummy.setPosition(8, 0);
//		mummy.setPosition(9, 7);
	}
	
	// Level 6 - Snail Stage
	
	private static void genLevel6(Maze[][] grid) {
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++)
				grid[i][j] = new Maze(i + 1, j + 1);

		// first row
		grid[0][0].setType(11);
		grid[0][1].setType(7);
		grid[0][2].setType(7);
		grid[0][3].setType(7);
		grid[0][4].setType(7);
		grid[0][5].setType(7);
		grid[0][6].setType(7);
		grid[0][7].setType(7);
		grid[0][8].setType(7);
		grid[0][9].setType(10);

		// second row

		grid[1][0].setType(6);
		grid[1][1].setType(11);
		grid[1][2].setType(7);
		grid[1][3].setType(7);
		grid[1][4].setType(7);
		grid[1][5].setType(7);
		grid[1][6].setType(7);
		grid[1][7].setType(7);
		grid[1][8].setType(8);
		grid[1][9].setType(9);

		// third row

		grid[2][0].setType(6);
		grid[2][1].setType(6);
		grid[2][2].setType(11);
		grid[2][3].setType(7);
		grid[2][4].setType(7);
		grid[2][5].setType(7);
		grid[2][6].setType(7);
		grid[2][7].setType(10);
		grid[2][8].setType(6);
		grid[2][9].setType(6);

		// fourth row

		grid[3][0].setType(6);
		grid[3][1].setType(6);
		grid[3][2].setType(6);
		grid[3][3].setType(11);
		grid[3][4].setType(7);
		grid[3][5].setType(7);
		grid[3][6].setType(10);
		grid[3][7].setType(6);
		grid[3][8].setType(6);
		grid[3][9].setType(6);

		// fifth row

		grid[4][0].setType(6);
		grid[4][1].setType(6);
		grid[4][2].setType(6);
		grid[4][3].setType(6);
		grid[4][4].setType(13);
		grid[4][5].setType(10);
		grid[4][6].setType(6);
		grid[4][7].setType(6);
		grid[4][8].setType(6);
		grid[4][9].setType(6);

		// sixth row

		grid[5][0].setType(6);
		grid[5][1].setType(6);
		grid[5][2].setType(6);
		grid[5][3].setType(8);
		grid[5][4].setType(7);
		grid[5][5].setType(9);
		grid[5][6].setType(6);
		grid[5][7].setType(6);
		grid[5][8].setType(6);
		grid[5][9].setType(6);

		// seventh row

		grid[6][0].setType(6);
		grid[6][1].setType(6);
		grid[6][2].setType(8);
		grid[6][3].setType(7);
		grid[6][4].setType(7);
		grid[6][5].setType(7);
		grid[6][6].setType(9);
		grid[6][7].setType(6);
		grid[6][8].setType(6);
		grid[6][9].setType(6);

		// 8th row

		grid[7][0].setType(6);
		grid[7][1].setType(8);
		grid[7][2].setType(7);
		grid[7][3].setType(7);
		grid[7][4].setType(7);
		grid[7][5].setType(7);
		grid[7][6].setType(7);
		grid[7][7].setType(9);
		grid[7][8].setType(6);
		grid[7][9].setType(6);

		// 9th row

		grid[8][0].setType(8);
		grid[8][1].setType(7);
		grid[8][2].setType(7);
		grid[8][3].setType(7);
		grid[8][4].setType(7);
		grid[8][5].setType(7);
		grid[8][6].setType(7);
		grid[8][7].setType(7);
		grid[8][8].setType(9);
		grid[8][9].setType(6);

		// 10th row

		grid[9][0].setType(13);
		grid[9][1].setType(7);
		grid[9][2].setType(7);
		grid[9][3].setType(7);
		grid[9][4].setType(7);
		grid[9][5].setType(7);
		grid[9][6].setType(7);
		grid[9][7].setType(7);
		grid[9][8].setType(7);
		grid[9][9].setType(9);

		
		// This level's start/end point set in the maze
		start.setX(4);
		start.setY(4);
		end.setX(0);
		end.setY(9);
		// Character's starting position set
		mainChar.setLocation(start.getX(), start.getY());
		
		// Obstacle-pit settings in the maze
//		pit.setPosition(4, 5);
//		pit.setPosition(4, 6);
//		pit.setPosition(4, 7);
//		pit.setPosition(4, 8);
//		pit.setPosition(4, 9);
//		
//		// Obstacle-monster settings in the maze
//		monster.setPosition(4, 0);
//		monster.setPosition(4, 1);
//		monster.setPosition(4, 2);
//		monster.setPosition(4, 3);
//		monster.setPosition(0, 4);
//		monster.setPosition(1, 4);
//		monster.setPosition(2, 4);
//		monster.setPosition(3, 4);
//		monster.setPosition(6, 4);
//		monster.setPosition(7, 4);
//		monster.setPosition(8, 4);
//		monster.setPosition(9, 4);
//		
//		// Obstacle-mummy settings in the maze
//		mummy.setPosition(0, 9);
//		mummy.setPosition(1, 8);
//		mummy.setPosition(2, 7);
//		mummy.setPosition(3, 6);
//		mummy.setPosition(4, 5);
//		mummy.setPosition(5, 3);
//		mummy.setPosition(6, 2);
//		mummy.setPosition(7, 1);
//		mummy.setPosition(8, 0);
//		mummy.setPosition(9, 1);
	}



}
