/**
 * 
 * Wrote by Ian
 * This class is one of the obstacles in the maze. 
 * Later in GUI it might be changed to other one. 
 */

package assets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Pit extends Block{
	
	// Two timers 
	// timer1 : timer for checking the event happening (e.g. character met monster)
	// timer1 : toggle pit every 1.5 second
	Timer timer1 = new Timer(1000 / 30, new TimerListenerA());
	Timer timer2 = new Timer(1500, new TimerListenerB()); // every 1.5 second
	
	// Basic location in x-y axis in the maze
	private int x = 0;
	private int y = 0;
	
	// this is for the activation of obstacle
	protected boolean active;
	
	
	// constructors
	public Pit(){
		this.x = (int) (Math.random()*10);
		this.y = (int) (Math.random()*10);
	}
	
	Pit(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// getters and setters
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
	
	// This method check if the obstacle and character meet
	public boolean checkEvent(){
		if(GenLevel.mainChar.getX() == this.x && GenLevel.mainChar.getY() == this.y 
				&& getActive())
			return true;
		else
			return false;
	}
	

	// Ian - this timer check when the character fall into the pit
	// then if hit, reduce the life of character and decide game is over or
	// continue
	class TimerListenerA implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(checkEvent()){
				GenLevel.mainChar.substractLives();
				//GenLevel.mainChar.checkGameOver();		
			}		
		}
		
	}
	
	// Ian - this timer is for toggling the pit (not using at this point for GUI)
	//this line with 'extends Pit' causes stack-overflow error
	//class TimerListenerB extends Pit implements ActionListener { 
	class TimerListenerB implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//if(checkEvent())
				//this.setActive(switchActive(this.active));	
		}

	}

}
