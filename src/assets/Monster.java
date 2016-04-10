/**
 * 
 * Wrote by Ian
 * 
 */

package assets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Monster extends Block{

	// Two timers 
	// timer1 : timer for checking the event happening (e.g. character met monster)
	// timer1 : toggle monster every 1 second
	Timer timer1 = new Timer(1000 / 30, new TimerListenerA());
	Timer timer2 = new Timer(1000, new TimerListenerB()); //every 1 second

	// Basic positions of this obstacle on the maze
	private int x = 0;
	private int y = 0;
	
	// this is for the activation of obstacle
	private boolean active; 

	// constructors
	public Monster(){
		this.x = (int) (Math.random()*10);
		this.y = (int) (Math.random()*10);
	}
	
	public Monster(int x, int y){
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

	// This method check if the obstacle and character meet
	public boolean checkEvent(){
		if(GenLevel.mainChar.getX() == this.x && GenLevel.mainChar.getY() == this.y 
				&& getActive())
			return true;
		else
			return false;
	}
	
	
	// Ian - this timer check when the character hit the pit
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
		//this line with 'extends Monster' causes stack-overflow error
		//class TimerListenerB extends Monster implements ActionListener { 
		class TimerListenerB implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				//if(checkEvent())
					//this.setActive(switchActive(this.active));	
			}

		}
}
