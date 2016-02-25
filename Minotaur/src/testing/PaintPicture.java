package testing;

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PaintPicture extends JFrame {
	DrawPanel drawPanel = new DrawPanel();
	
	
	public PaintPicture() {
		add(drawPanel);
	    
	}
	

	public static void main(String[] args) {
		PaintPicture frame = new PaintPicture();
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	static class DrawPanel extends JPanel {
		
		private BufferedImage image;
		
		public DrawPanel() {
		                      
		          try {
					image = ImageIO.read(new File("C:\\Users\\salem_000\\Desktop\\tut10-1.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		
		
		
		@Override /** Draw the character */
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(image, 0, 0, null);
		}
	}

}
