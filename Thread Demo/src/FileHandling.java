import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		readFile();
	}

	private static void readFile() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader("input.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		System.out.println(bufferedReader.readLine());
	}
}
