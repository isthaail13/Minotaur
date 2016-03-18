package Monster;

import java.util.Random;

public class Monster {
	public static int row=1, col=0;
	String[][] arrayMonster;
	public Monster(String[][] array){
		createMonster(array);
	}
	
	public boolean createMonster(String[][] array){
		boolean continueIteration = true;
		do{
		Random seed = new Random();
		Random indexRow = new Random(seed.nextInt(10));
		int row = indexRow.nextInt(3);
		Random indexCol = new Random(seed.nextInt(22));
		int col = indexCol.nextInt(3);
		if(array[row][col].equalsIgnoreCase("@")){
			array[row][col] = "M";
			this.row = row;
			this.col = col;
			continueIteration = false;
		}
		}while(continueIteration);
		return true;
	}
	
	public boolean monsterkillsCharacter(String[][] array){
		if(array[this.row][this.col].equalsIgnoreCase("C")){
			array[this.row][this.col]="M";
			System.out.println("It killed you");
			return true;
		}
		return false;
	}
	
	public void deleteMonster(String[][] array){
//		for(int i=0; i<array.length;i++){
//			for(int j=0; j<array[0].length;j++){
//					if(array[i][j].equalsIgnoreCase("M")){
//						array[i][j] = "@";
//					}
//			}
//		}
		array[this.row][this.col] = "@";
	}
}
