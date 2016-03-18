package assets;
import java.util.ArrayList;
public class ThreadBall {
	public static ArrayList<Integer> array = new ArrayList<Integer>();
	public static ArrayList<Path> pathObjects = new ArrayList<Path>();
	
	ThreadBall(){
		loadArrayList();
	}
	
	public void loadArrayList(){
		//Loading the first row
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
		//Loading the second half of the path
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
	
	public  String[][] DimensionalArrayList(){
		String[][] arrayLocation = new String[90][90];
		//for(int i = 0; i<arrayList.size(); i++){
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
				
		//}
		return arrayLocation;
	}
	
	public void readArray(){
		for(int i = 0; i<array.size();i=i+2){
			if(i % 2 == 0){
				pathObjects.add(new Path());
			}
		}
	}

}

class Path{
	private int x;
	private int y;
	Path(){
		
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
	private int x=0;
	private int y=0;
	Ball(){
		
	}
	
	Ball(int x, int y){	
		this.x = x;
		this.y = y;
	}
	
	public void setBall(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public void resetBall(){
		this.x = 0;
		this.y = 0;		
	}
	
	
	

}
