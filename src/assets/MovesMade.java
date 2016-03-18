package assets;

public class MovesMade {
	private int moves = 0;
	
	MovesMade(){
		
	}
	
	public void addMovements(){
		this.moves += 1;
	}
	
	public int getMovements(){
		return this.moves;
	}
	
	public int resetMovements(){
		return this.moves;
	}

}
