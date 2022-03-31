package FileHandlingAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class FileHandlingAssignmentSolution {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		writeFile("output.txt", "Some output text");
		readFileUsingStreams("output.txt");
	}
	
	private static void writeFile(String fileNameToWrite, String textToWrite) throws IOException {
		File file = new File("/Users/ashish.amar/Documents/workspace-spring-tool-suite-4-4.14.0.RELEASE/assignments/" + fileNameToWrite);
		FileWriter writer = new FileWriter(file);
		
		writer.write(textToWrite);
		writer.close();
		
	}

	private static void readFileUsingStreams(String filename) throws FileNotFoundException, IOException {
		FileReader reader = new FileReader(filename);
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		Stream<String> myStream = bufferedReader.lines();
		myStream.forEach((line) -> System.out.println(line));
		
	}
}
