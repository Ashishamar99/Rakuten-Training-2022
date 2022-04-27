package com.groovy.demo.fileio

class WritingFiles {
	
	static String outputFileName = "src/com/groovy/demo/fileio/"
	
	static void WriteToFile(String filename="output.txt") {
		if(filename.equals("output.txt")) {
			new File(outputFileName + filename).withWriter { 
				writer -> writer.writeLine("Default content = ${filename} (if this works, we can use php syntax for string formatting!!)")
			}
		}
		else {
			new File(outputFileName + filename).withWriter { 
				writer -> writer.writeLine("File name is $filename")
			}
		println("Done. Please run ReadingFiles for reading the newly written files.")
		}
	}
	
	static void main(String[] args) {
		WriteToFile()
		WriteToFile("nananana.txt")
	}
}
