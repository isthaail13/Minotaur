package assets;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class CheckerBoard extends JFrame {

	static JFrame board = new JFrame("Checkers Board");

	public static void main(String[] args) {

		board.setSize(700, 700);
		board.setLayout(new GridLayout(8, 8, 0, 0));
		fill();
		board.setDefaultCloseOperation(EXIT_ON_CLOSE);
		board.setVisible(true);
	}

	static void fill() {

		JButton square = new JButton();

		boolean alternate = false;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				square = new JButton();
				square.setSize(70, 70);
				if (alternate) {
					square.setBackground(Color.black);
					alternate = false;
				} else {
					square.setBackground(Color.white);
					alternate = true;
				}
				board.add(square);
			}
			if (alternate)
				alternate = false;
			else
				alternate = true;
		}
	}

}
