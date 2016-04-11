<<<<<<< HEAD
package assets;

public class Transporter extends Block {
	private int firstLocationX=0;
	private int firstLocationY=0;
	private int newLocationX=0;
	private int newLocationY=0;
	
	Transporter(){	
		firstLocationX=(int) (Math.random()*10);
		firstLocationY=(int) (Math.random()*10);
		newLocationX = (int) (Math.random()*10);
		newLocationY = (int) (Math.random()*10);
	}
	
	Transporter(int firstLocationX, int firstLocationY, int newLocationX,int newLocationY){	
		this.firstLocationX = newLocationX;
		this.firstLocationY = newLocationY;
		this.newLocationX = newLocationX;
		this.newLocationY = newLocationY;
	}
	
	public void setTransporter(int firstLocationX, int firstLocationY, int newLocationX, int newLocationY){
		this.firstLocationX = newLocationX;
		this.firstLocationY = newLocationY;
		this.newLocationX = newLocationX;
		this.newLocationY = newLocationY;
	}

	public int getX(){
		return this.newLocationX;
	}
	
	public int getY(){
		return this.newLocationY;
	}
	
	public void resetTransporterX(){
		this.firstLocationX = 0;
		this.firstLocationY = 0;
		this.newLocationX = 0;
		this.newLocationY = 0;		
	}
	
	
	

}
=======
package assets;

public class Transporter {
	private int firstLocationX=0;
	private int firstLocationY=0;
	private int newLocationX=0;
	private int newLocationY=0;
	
	Transporter(int firstLocationX, int firstLocationY, int newLocationX,int newLocationY){	
		this.firstLocationX = newLocationX;
		this.firstLocationY = newLocationY;
		this.newLocationX = newLocationX;
		this.newLocationY = newLocationY;
	}
	
	public void setTransporter(int firstLocationX, int firstLocationY, int newLocationX, int newLocationY){
		this.firstLocationX = newLocationX;
		this.firstLocationY = newLocationY;
		this.newLocationX = newLocationX;
		this.newLocationY = newLocationY;
	}

	public int getTransporterX(){
		return this.newLocationX;
	}
	
	public int getTransporterY(){
		return this.newLocationY;
	}
	
	public void resetTransporterX(){
		this.firstLocationX = 0;
		this.firstLocationY = 0;
		this.newLocationX = 0;
		this.newLocationY = 0;		
	}
	
	
	

}
>>>>>>> master
