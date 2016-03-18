package assets;

import java.util.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;



public class WriteFile {
	String filePath = "C:/Users/Alex/workspace/Minotaur/src/assets/Scores.txt";
	private boolean appendFile = true;
	
	WriteFile(String file_path, boolean append_value) {
		filePath = file_path;
		appendFile = append_value;
	}

	WriteFile() {

	}

	public void writeToFile(String name,int lives, int moves, int coins, String time) throws IOException {
		FileWriter write = new FileWriter(filePath, appendFile);
		PrintWriter printLine = new PrintWriter(write);
		printLine.printf("\n%-5s %-5d %-5d %-5d %-5s", name,lives, moves, coins, time);
		printLine.close();
	}
}