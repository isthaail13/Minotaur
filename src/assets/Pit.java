/**
 * 
 * Wrote by Ian
 * 
 */

package assets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Pit {
	
	// Two timers 
	// timer1 : timer for checking the event happening (e.g. character met monster)
//	// timer1 : toggle pit every 1.5 second
//	Timer timer1 = new Timer(1000 / 30, new TimerListenerA());
//	Timer timer2 = new Timer(1500, new TimerListenerB()); // every 1.5 second
	
	private int x = 0;
	private int y = 0;
	protected boolean active;
	
	public Pit(){
		
	}
	
	Pit(int x, int y){
		this.x = x;
		this.y = y;
	}
	//Set position
	public void setPosition(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	//Setter... getter for active
	public boolean getActive(){
		return this.active;
	}
	
	public void setActive(boolean active){
		this.active = active;
	}
	
	public boolean switchActive(boolean active){
		if(active)
			return false;
		else
			return true;
	}
	
	public boolean checkEvent(){
		if(GenLevel.mainChar.getX() == this.x && GenLevel.mainChar.getY() == this.y 
				&& getActive())
			return true;
		else
			return false;
	}
	
	// For anything that needs to be instantaneous, let it fall under timer1.
	
	// Ian - this timer check when the character fall into the pit
//	class TimerListenerA implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			if(checkEvent()){
//				GenLevel.mainChar.substractLives();
//				GenLevel.mainChar.checkGameOver();		
//			}		
//		}
//		
//	}
	
	// Ian - this timer is for toggling the pit
	//this line with 'extends Pit' causes stack-overflow error
	//class TimerListenerB extends Pit implements ActionListener { 
//	class TimerListenerB implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			//if(checkEvent())
//				//this.setActive(switchActive(this.active));	
//		}
//
//	}

}
