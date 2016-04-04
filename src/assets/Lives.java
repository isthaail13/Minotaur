package assets;
//This class creates the object of each life
public class Lives {
	
	//This are my class variables and  my constructor
	private int x=0;
	private int y=0;
	Lives(){
		
	}
	
	//This is the arg constructor
	Lives(int x, int y){	
		this.x = x;
		this.y = y;
	}
	
	//It allows users to set the location of teh object
	public void setLive(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//It allows users to get the location of teh object
	public int getX(){
		return this.x;
	}
	//It allows users to get the location of teh object
	public int getY(){
		return this.y;
	}
	//It allows users to reset the location of teh object
	public void resetLive(){
		this.x = 0;
		this.y = 0;		
	}
}
