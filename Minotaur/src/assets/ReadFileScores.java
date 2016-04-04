package assets;
//import the libraries needed to use the ReadFile and Write file capabilities
import java.util.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
//Main class
public class ReadFileScores {
	//this method reads the file scores and handle exceptions
	
	ReadFileScores() throws IOException {
		//the path of the current directory
		
		ReadFile file = new ReadFile(GenLevel.FILEPATH);
		ArrayList<String> aryLines = file.openFile();
		int i, index = 0;
		System.out.printf("***************************************************\n"
				+ "%-10s %-10s %-10s %-10s %-10s \n"
				+ "***************************************************\n","Name","Lives","Moves","Coins","Time  *");
		for (i = 0; i < aryLines.size(); i++) {
			// String line = new String(aryLines[i]);
			System.out.println(aryLines.get(i));
		}
	}
}

//This class reads the file and loads it to the screen/array
class ReadFile {
	//Class variables and methods
	private String path;
	ReadFile(String path, boolean appendFile) {
		this.path = path;
	}

	ReadFile(String path) {
		this.path = path;
	}

	//It loads the array
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
	//It counst the lines
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

//It write the data to the file
class WriteToFile {
	//String filePath = "C:/Users/Alex/workspace/Minotaur/src/assets/Scores.txt";
	private boolean appendFile = false;
	
//	WriteToFile(String file_path, boolean append_value) {
//
//		filePath = file_path;
//		appendFile = append_value;
//
//	}

	WriteToFile() {

	}

	public void writeToFile(String name,int lives, int moves, int coins, String time) throws IOException {
		FileWriter write = new FileWriter(GenLevel.FILEPATH, appendFile);
		PrintWriter printLine = new PrintWriter(write);
		printLine.printf("%-10s %-10d %-10d %-10d %-10s", name,lives, moves, coins, time);
		printLine.close();
	}
}