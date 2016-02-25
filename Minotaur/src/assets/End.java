package assets;

public class End extends Block {
	
	public End(){
		
	}

	public End(int x, int y){
		this.setX(x);
		this.setY(y);
	}
	
	public static void CheckEnd(){
		if (GenLevel.mainChar.getX() != GenLevel.end.getX() || GenLevel.mainChar.getY() != GenLevel.end.getY())
			return;
		else{
			GenLevel.genLevel();
		}
	}
	
}
