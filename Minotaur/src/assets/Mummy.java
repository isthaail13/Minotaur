/**
 * 
 * Wrote by Ian
 * 
 */

package assets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import assets.Monster.TimerListenerA;
import assets.Monster.TimerListenerB;

public class Mummy {
	
	// Two timers 
	// timer1 : timer for checking the event happening (e.g. character met monster)
	// timer1 : toggle mummy every 2 second
	Timer timer1 = new Timer(1000 / 30, new TimerListenerA());
	Timer timer2 = new Timer(2000, new TimerListenerB()); //every 2 second

	private int x = 0;
	private int y = 0;
	private boolean active;

	public Mummy(){
		
	}
	
	public Mummy(int x, int y){
		this.x = x;
		this.y = y;
	}
	
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

	public boolean checkEvent(){
		if(GenLevel.mainChar.getX() == this.x && GenLevel.mainChar.getY() == this.y 
				&& getActive())
			return true;
		else
			return false;
	}
	
	
	// Ian - this timer check when the character hit the pit
		class TimerListenerA implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkEvent()){
					GenLevel.mainChar.substractLives();
					GenLevel.mainChar.checkGameOver();		
				}		
			}
			
		}
		
		// Ian - this timer is for toggling the mummy
		//this line with 'extends Mummy' causes stack-overflow error
		//class TimerListenerB extends mummy implements ActionListener { 
		class TimerListenerB implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				//if(checkEvent())
					//this.setActive(switchActive(this.active));	
			}

		}

}
