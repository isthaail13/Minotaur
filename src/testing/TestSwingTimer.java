package testing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestSwingTimer extends JPanel implements ActionListener {
	private static Timer timer;
	public final static int ONE_SECOND = 1000;
	public static int i = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		timer = new Timer(ONE_SECOND, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.out.println(i);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		timer.start();
		
	}

}
