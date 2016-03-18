package assets;

import java.util.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ReadFileScores {
	ReadFileScores() throws IOException {
		String filePath = "C:/Users/Alex/workspace/Minotaur/src/assets/Scores.txt";
		ReadFile file = new ReadFile(filePath);
		ArrayList<String> aryLines = file.openFile();
		int i, index = 0;
		for (i = 0; i < aryLines.size(); i++) {
			// String line = new String(aryLines[i]);
			System.out.println(aryLines.get(i));
		}
	}
}

class ReadFile {
	private String path;
	ReadFile(String path, boolean appendFile) {
		this.path = path;
	}

	ReadFile(String path) {
		this.path = path;
	}

	public ArrayList<String> openFile() throws IOException {
		ArrayList<String> textData = new ArrayList<String>();
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		int numberOfLines = readLines();
		for (int i = 0; i < numberOfLines; i++) {
			textData.add(textReader.readLine());
		}
		textReader.close();
		return textData;
	}

	int readLines() throws IOException {
		FileReader file = new FileReader(path);
		BufferedReader bf = new BufferedReader(file);
		String aLine;
		int numberOfLines = 0;
		while ((aLine = bf.readLine()) != null) {
			numberOfLines++;
		}
		bf.close();
		return numberOfLines;
	}

//	public void writeToFile(String name, int moves, int coins, Date time) throws IOException {
//		FileWriter write = new FileWriter(path, appendToFile);
//		PrintWriter printLine = new PrintWriter(write);
//		printLine.printf("%s %d %d %s", name, moves, coins, time);
//		printLine.close();
//	}

}

class WriteToFile {
	String filePath = "C:/Users/Alex/workspace/Minotaur/src/assets/Scores.txt";
	private boolean appendFile = false;
	
	WriteToFile(String file_path, boolean append_value) {

		filePath = file_path;
		appendFile = append_value;

	}

	WriteToFile() {

	}

	public void writeToFile(String name,int lives, int moves, int coins, String time) throws IOException {
		FileWriter write = new FileWriter(filePath, appendFile);
		PrintWriter printLine = new PrintWriter(write);
		printLine.printf("%s %d %d %d %s", name,lives, moves, coins, time);
		printLine.close();
	}
}