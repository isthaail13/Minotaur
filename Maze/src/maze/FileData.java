package maze;
import java.util.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileData {
	FileData(String[][] array) throws IOException {
		String filePath = "C:/Users/Alex/Documents/JC.txt";
		ReadFile file = new ReadFile(filePath);
		String[] aryLines = file.openFile();
		int i, index = 0;
		for (i = 0; i < 10; i++) {
			for (int j = 0; j < 22; j++) {
				array[i][j]=aryLines[index];
				index++;
			}
		}
	}
}
	
class ReadFile {
	private String path;

	ReadFile(String path) {
		this.path = path;
	}

	public String[] openFile() throws IOException {
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		int numberOfLines = 220;
		String[] textData = new String[numberOfLines];
		for (int i = 0; i < numberOfLines; i++) {
				textData[i] = textReader.readLine();
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

}