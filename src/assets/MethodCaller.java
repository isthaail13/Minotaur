package assets;

public class MethodCaller {
	
	public static void callCoins(){
		for (int i = 0; i < GenLevel.coinArray.size(); i++) {
			if (GenLevel.mainChar.getX() == GenLevel.coinArray.get(i).getX()
					&& GenLevel.mainChar.getY() == GenLevel.coinArray.get(i).getY()) {
				GenLevel.coinArray.remove(i);
				GenLevel.mainChar.addCoins();
			}
		}
	}
	
	public static void callTeleporter(){
		if (GenLevel.mainChar.getX() == GenLevel.transporter.getTransporterX()
				&& GenLevel.mainChar.getY() == GenLevel.transporter.getTransporterY()) {
			GenLevel.mainChar.setLocation(8, 3);
		}
	}
	
	public static void callLives(){
		for (int i = 0; i < GenLevel.life.size(); i++) {
			if (GenLevel.life.size() > 0) {
				if (GenLevel.life.get(i).getX() == GenLevel.mainChar.getX()
						&& GenLevel.life.get(i).getY() == GenLevel.mainChar.getY()) {
					GenLevel.mainChar.addLives();
					GenLevel.life.remove(i);
				}
			}
		}
	}
	
	public static void callRobotRunner(){
		if (GenLevel.mainChar.getX() == GenLevel.rr.getX()
				&& GenLevel.mainChar.getY() == GenLevel.rr.getY()) {
//			if(GenLevel.level==5){
				GenLevel.mainChar.substractLives();
//			}else{
//				GenLevel.mainChar.setLocation(GenLevel.start.getX(), GenLevel.start.getY());	
//			}
		}
	}
	public static void callPit(){
		if (GenLevel.pit.getX() == GenLevel.mainChar.getX() && GenLevel.pit.getY() == GenLevel.mainChar.getY())
			GenLevel.mainChar.substractLives();
	}
	
	public static void callMon(){
		if (GenLevel.monster.getX() == GenLevel.mainChar.getX() && GenLevel.monster.getY() == GenLevel.mainChar.getY())
			GenLevel.mainChar.substractLives();
	}
	
	public static void callMum(){
		if (GenLevel.mummy.getX() == GenLevel.mainChar.getX() && GenLevel.mummy.getY() == GenLevel.mainChar.getY())
			GenLevel.mainChar.substractLives();
	}
	

}
