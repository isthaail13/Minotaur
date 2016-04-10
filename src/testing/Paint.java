package testing;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import assets.Block;
import assets.GenLevel;

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
		System.out.print(34234);
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
		
			drawObjects("ImgAlex/green.png",(Object)assets.GenLevel.end, g);
			drawObjects("ImgAlex/Jewels/green.png",(Object)assets.GenLevel.start, g);
			String pathIcon = String.format("icons/mainChar/%d.png", assets.GenLevel.mainChar.getOrientation());
			drawObjects(pathIcon,(Object)assets.GenLevel.mainChar, g);
			drawObjects("ImgAlex/Jewels/monster.png",(Object)assets.GenLevel.monster, g);
			drawObjects("ImgAlex/Jewels/pit.png",(Object)assets.GenLevel.pit, g);
			drawObjects("ImgAlex/Jewels/monster2.png",(Object)assets.GenLevel.mummy, g);
			/***************************************************************************
			//Setting the location of teh transporter and the mainchar
			/***************************************************************************/
			drawObjects("ImgAlex/Jewels/teleporter.png",(Object)assets.GenLevel.transporter, g);
			if (GenLevel.mainChar.getX() == GenLevel.transporter.getX()
					&& GenLevel.mainChar.getY() == GenLevel.transporter.getY()) {
				GenLevel.mainChar.setLocation(8, 3);
			}
			/***************************************************************************
			//Here I read the coins array and print/delete them
			/***************************************************************************/
			for (int i = 0; i < GenLevel.coinArray.size(); i++) {
				if (GenLevel.mainChar.getX() == GenLevel.coinArray.get(i).getX() && GenLevel.mainChar.getY() == GenLevel.coinArray.get(i).getY())
					//remove coin if character eats them
					GenLevel.coinArray.remove(i);
				else
					//Prints them 
					drawObjects("ImgAlex/Jewels/j.gif",(Object)assets.GenLevel.coinArray.get(i), g);
					
			}
			
			/***************************************************************************
			//Here I read the lives array and print/delete them
			/***************************************************************************/
			for (int i = 0; i < GenLevel.life.size(); i++) {
				if (GenLevel.mainChar.getX() == GenLevel.life.get(i).getX() && GenLevel.mainChar.getY() == GenLevel.life.get(i).getY())
					//remove coin if character eats them
					GenLevel.life.remove(i);
				else
					//Prints them 
					drawObjects("ImgAlex/Jewels/lives.png",(Object)assets.GenLevel.life.get(i), g);
					
			}
			// g.drawImage(blocky, assets.GenLevel.mainChar.getX() * 70 + 13,
			// assets.GenLevel.mainChar.getY() * 70, 50, 70,
			// null);

		}
		//This is a master method. Here Alex applies inheritance and polymorphism 
		public void drawObjects(String pathIcon, Object object,Graphics g){
			Image blocky;
			ImageIcon icon;
			icon = new ImageIcon(pathIcon);
			blocky = icon.getImage();
			// Adjustable positioning below.
			//It uses the extends Block property and cat them into components and block objects
			if (getWidth() > getHeight())
				g.drawImage(blocky, ((Block) object).getX() * getHeight() / 12 + getHeight() / 12 / 6,
						((Block) object).getY() * getHeight() / 12 + getHeight() / 12 / 4,
						getHeight() / 12 * 5 / 7 + 1, getHeight() / 12 * 5 / 7 +1, null);
			else

				g.drawImage(blocky, ((Block) object).getX() * getWidth() / 12/* + 13 */,
						((Block) object).getY() * getWidth() / 12, getWidth() / 12 * 5 / 7,
						getWidth() / 12 * 5 / 7, null);
		}
		@Override /** Draw the character */
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			loopy(g);

		}
	}

}
