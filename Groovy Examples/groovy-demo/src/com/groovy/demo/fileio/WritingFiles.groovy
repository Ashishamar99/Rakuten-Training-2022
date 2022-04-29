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
		println("New Files Created !!!.")
		println("--------------------------------------------------")
		}
	}
	
	static void main(String[] args) {
		
		def fileOutputOfWriteFileDemo = "src/com/groovy/demo/fileio/"
		def defaultTextFile = "output.txt"
		def otherTextFile = "nananana.txt"
		
		WriteToFile()
		WriteToFile(otherTextFile)
		
		println("Invoking read functions on the newly written files...")
		ReadingFiles.ReadFileContentAsString(fileOutputOfWriteFileDemo + defaultTextFile)
		ReadingFiles.ReadFileContentLineByLine(fileOutputOfWriteFileDemo + otherTextFile)
	}
}
