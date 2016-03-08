package testing;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.image.*;
import java.io.File;
import java.io.IOException;

public class Paint extends JFrame {

	final int STANDARD_WIDTH_FOR_HEIGHT = getHeight() / 12 * 5 / 7 + 1;
	final int STANDARD_HEIGHT_FOR_HEIGHT = getHeight() / 12 * 5 / 7 +1;
	final int STANDARD_XPOSITION_FOR_HEIGHT = getHeight() / 12 + getHeight() / 12 / 6;
	final int STANDARD_YPOSITION_FOR_HEIGHT = getHeight() / 12 + getHeight() / 12 / 6;
	
	
	public static DrawPanel drawPanel = new DrawPanel();

	public Paint() {
		add(drawPanel);
	}

	public static void main() {

		Paint frame = new Paint();
		// frame.setSize(700, 700);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static class DrawPanel extends JPanel {

		public DrawPanel() {
			// for (int i = 0; i < 10; i++) {
			// for (int j = 0; j < 10; j++) {
			/*
			 * try { image = ImageIO.read( new File(String.format(
			 * "C:\\Users\\salem_000\\Pictures\\MinotaurAssets\\maze\\%d.png",
			 * assets.GenLevel.grid[i][j].getType()))); } catch (IOException e)
			 * { // TODO Auto-generated catch block e.printStackTrace(); }
			 */
			// }
			// }
		}

		public void loopy(Graphics g) {
			Image blocky;
			ImageIcon icon;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					icon = new ImageIcon(String.format("icons/maze/type%d.png", assets.GenLevel.grid[i][j].getType()));
					blocky = icon.getImage();
					// Adjustable sizing, below.
					if (getWidth() > getHeight())
						g.drawImage(blocky, j * getHeight() / 12, i * getHeight() / 12, getHeight() / 12,
								getHeight() / 12, null);
					else
						g.drawImage(blocky, j * getWidth() / 12, i * getWidth() / 12, getWidth() / 12, getWidth() / 12,
								null);
					// g.drawImage(blocky, j*70, i*70, null);
				}
			}

			// Main Character display below.
			icon = new ImageIcon(String.format("icons/mainChar/%d.png", assets.GenLevel.mainChar.getOrientation()));
			blocky = icon.getImage();

			// Adjustable positioning below.
			if (getWidth() > getHeight())
				g.drawImage(blocky, assets.GenLevel.mainChar.getX() * getHeight() / 12 + getHeight() / 12 / 6,
						assets.GenLevel.mainChar.getY() * getHeight() / 12 + getHeight() / 12 / 4,
						getHeight() / 12 * 5 / 7 + 1, getHeight() / 12 * 5 / 7 +1, null);
			else

				g.drawImage(blocky, assets.GenLevel.mainChar.getX() * getWidth() / 12/* + 13 */,
						assets.GenLevel.mainChar.getY() * getWidth() / 12, getWidth() / 12 * 5 / 7,
						getWidth() / 12 * 5 / 7, null);

			// g.drawImage(blocky, assets.GenLevel.mainChar.getX() * 70 + 13,
			// assets.GenLevel.mainChar.getY() * 70, 50, 70,
			// null);

		}

		@Override /** Draw the character */
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			loopy(g);

		}
	}

}
