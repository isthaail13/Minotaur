package assets;

public class Lives extends Block {
	private int x=0;
	private int y=0;
	Lives(){
		
	}
	
	Lives(int x, int y){	
		this.x = x;
		this.y = y;
	}
	
	public void setLive(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public void resetLive(){
		this.x = 0;
		this.y = 0;		
	}
}
