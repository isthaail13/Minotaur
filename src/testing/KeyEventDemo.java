package testing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyEventDemo extends JFrame {

	private KeyboardPanel keyboardPanel = new KeyboardPanel();
	static final int TIME_LAPSE = 250;
	private static Timer keyPause = new Timer(TIME_LAPSE, new KeyPause());
	static boolean pause;
	static int udlr;

	public KeyEventDemo() {
		keyPause.setInitialDelay(0);
		add(keyboardPanel);
		keyboardPanel.setFocusable(true);
	}

	public static void begin() {

		KeyEventDemo frame = new KeyEventDemo();
		frame.setTitle("KeyEventDemo");
		frame.setSize(1, 1);
		frame.setAlwaysOnTop(true);

		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	static class KeyboardPanel extends JPanel {
		
		// Alright, I figured out how to make the character move smoothly at
		// regular intervals, yet stop when I tell him to. That's awesome.
		//The only thing left to do is to optimize movement speed. Do I want
		//there to be a delay when you first press the button?
		public KeyboardPanel() {
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					switch (e.getKeyCode()) {
					case KeyEvent.VK_DOWN:
						if (pause == false) {
							//keyPause.setRepeats(false);
							//assets.GenLevel.mainChar.moveDown();
							//pause = true;
							udlr = 0;
							keyPause.start();
						}
						break;
					case KeyEvent.VK_UP:
						if (pause == false) {
							//keyPause.setRepeats(false);
							//assets.GenLevel.mainChar.moveUp();
							//pause = true;
							udlr = 1;
							keyPause.start();
						}
						break;
					case KeyEvent.VK_LEFT:
						if (pause == false) {
							//keyPause.setRepeats(false);
							//assets.GenLevel.mainChar.moveLeft();
							//pause = true;
							udlr = 2;
							keyPause.start();
						}
						break;
					case KeyEvent.VK_RIGHT:

						// keyPause.setRepeats(false);
						// assets.GenLevel.mainChar.moveRight();
						// pause = true;
						udlr = 3;
						keyPause.start();

						break;
					default:

					}

				}

				private void showMessageDialog(Object begin, String string) {
					// TODO Auto-generated method stub
					
				}
			});

			addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					switch (e.getKeyCode()) {
					case KeyEvent.VK_DOWN:
						if (pause == false) {
							/*keyPause.setRepeats(false);
							assets.GenLevel.mainChar.moveDown();
							pause = true;
							keyPause.start();*/
							keyPause.stop();
						}
						break;
					case KeyEvent.VK_UP:
						if (pause == false) {
							/*keyPause.setRepeats(false);
							assets.GenLevel.mainChar.moveUp();
							pause = true;
							keyPause.start();*/
							keyPause.stop();
						}
						break;
					case KeyEvent.VK_LEFT:
						if (pause == false) {
							//keyPause.setRepeats(false);
							//assets.GenLevel.mainChar.moveLeft();
							//pause = true;
							//keyPause.start();
							keyPause.stop();
						}
						break;
					case KeyEvent.VK_RIGHT:
						// keyPause.setRepeats(false);
						// assets.GenLevel.mainChar.moveRight();
						// pause = true;
						// keyPause.start();
						keyPause.stop();

						break;
					default:

					}

				}
			});

		}

	}

}

class KeyPause implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// KeyEventDemo.pause = false;
		switch (KeyEventDemo.udlr){
		
		case 0: assets.GenLevel.mainChar.moveDown();
		assets.GenLevel.rr.moveDown(); break;
		case 1: assets.GenLevel.mainChar.moveUp();
		assets.GenLevel.rr.moveUp(); break;
		case 2: assets.GenLevel.mainChar.moveLeft();
		assets.GenLevel.rr.moveLeft(); break;
		case 3: assets.GenLevel.mainChar.moveRight();
		assets.GenLevel.rr.moveRight(); break;
		
		
		}
		

	}

}