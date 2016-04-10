package assets;

public class Start extends Block {
	private boolean active = true;
	public Start(){
		
	}
	
	public Start(int x, int y){
		this.setX(x);
		this.setY(y);
	}
	
	public void setActive(boolean active){
		this.active = active;
	}
	
	
}