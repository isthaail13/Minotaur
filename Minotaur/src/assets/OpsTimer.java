package assets;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OpsTimer {

	static Timer timer1 = new Timer(1000 / 30, new TimerListener1());
	static Timer timer2 = new Timer(200, new TimerListener2());
}

// For anything that needs to be instantaneous, let it fall under timer1.
class TimerListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		End.CheckEnd();
		//Paint.paint(GenLevel.grid);
		testing.Paint.drawPanel.repaint();
	}

}

// For anything that needs to take a measured amount of time, let it fall under
// timer2. We don't have anything for that yet, but we will.
class TimerListener2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}