import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ForLoopDemo {
	/**
	 * 
	 * @param row
	 * This class has a method which takes in a line number as a parameter and prints a star pattern using a for loop.
	 * @throws IllegalAccessException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//printStarPatternUsingSingleForLoop(5);
		//The above method uses a single for loop and a count variable to do the task in a single loop.
		
		String result = printStarPatternUsingTwoForLoops(5);
		//In the above method we use 2 loops and initialize the iteration variable as a parameter of the method.
		
		writeFile("output.txt", result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character you want to print:: ");
		char inputPattern = sc.next().toCharArray()[0];
		
		printStarPatternUsingTwoWhileLoops(inputPattern, 4);
		
	}
	
	private static void writeFile(String fileNameToWrite, String textToWrite) throws IOException {
		File file = new File("/Users/ashish.amar/Documents/workspace-spring-tool-suite-4-4.14.0.RELEASE/Java Basics 2/" + fileNameToWrite);
		FileWriter writer = new FileWriter(file);
		
		writer.write(textToWrite);
		writer.close();
		
	}
	
	private static void printStarPatternUsingTwoWhileLoops(char pattern, int row)  {
		String starPattern = "";
		
		if(row <= 0) {
			throw new IllegalArgumentException("Row value should be greater than 0");
		}
		while(row>=1) {
			int columns = 0;
			while(columns<row) {
				starPattern += pattern;
				columns++;
			}
			starPattern += "\n";
			row--;
		}
		System.out.println(starPattern);
		
		
	}

	private static String printStarPatternUsingTwoForLoops(int row) throws IllegalArgumentException {
		String starPattern = "";
		
		if(row <= 0) {
			throw new IllegalArgumentException("Row value should be greater than 0");
		}
		for(;row>=1;row--) {
			for(int column=0;column<row;column++)
				starPattern += "*";
			starPattern += "\n";
		}
		return starPattern;
		
	}

//	private static void printStarPatternUsingSingleForLoop(int n) {
//		int count=0;
//		for(int i = n;i >= 1;) {
//			if(count < i) {
//				System.out.print("*");
//				count++;
//				continue;
//			}
//			if(count == i) {
//				System.out.println("");
//				i--;
//				count = 0;
//			}
//		}
//		
//	}
}
