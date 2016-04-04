package assets;
//This class counst the moves made in the game
public class MovesMade {
	//Class variable moves.
	private int moves = 0;
	
	//Non-arg consrtuctor
	MovesMade(){
		
	}
	//This method adds increments the the variable 
	public void addMovements(){
		this.moves += 1;
	}
	
	//It returns the movements of the player
	public int getMovements(){
		return this.moves;
	}
	
	//It reset movements 
	public int resetMovements(){
		return this.moves;
	}

}
