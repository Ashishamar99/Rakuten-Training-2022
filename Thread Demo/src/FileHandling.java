import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileHandling {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		readFileUsingBufferedReaderAndFileReader();
		readFileUsingScanner();
		readFileUsingStreams();
	}

	private static void readFileUsingStreams() throws FileNotFoundException, IOException {
		FileReader reader = new FileReader("input.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		Stream<String> myStream = bufferedReader.lines();
		myStream.forEach((line) -> System.out.println(line));
		
	}

	private static void readFileUsingScanner() {
		try {
			
			FileInputStream fs = new FileInputStream("input.txt");
			Scanner sc = new Scanner(fs);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());;
			}
			
			sc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

	private static void readFileUsingBufferedReaderAndFileReader() throws FileNotFoundException, IOException {
		
		FileReader reader = new FileReader("input.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		System.out.println(bufferedReader.readLine());
	}
}
