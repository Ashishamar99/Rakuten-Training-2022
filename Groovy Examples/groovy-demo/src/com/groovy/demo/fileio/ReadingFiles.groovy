package com.groovy.demo.fileio

import java.nio.file.Path

public class ReadingFiles {
	
	static String defaultFileName = "src/com/groovy/demo/fileio/input.txt"
	// File path specification answer -> https://stackoverflow.com/questions/19871955/java-io-filenotfoundexception-the-system-cannot-find-the-file-specified
	
	static def ReadFileContentAsString(String filename=defaultFileName) {
		File file = new File(filename)
		println(file.text)
	}
	
	static def ReadFileContentLineByLine(String filename=defaultFileName) {
		new File(filename).eachLine { 
			single_line -> println "line: $single_line"
		}
	}
	
	static void main(String[] args) {
//		def fileOutputOfWriteFileDemo = "src/com/groovy/demo/fileio/"
//		def defaultTextFile = "output.txt"
//		def otherTextFile = "nananana.txt"
		
		ReadFileContentAsString()
		ReadFileContentLineByLine()
		
//		ReadFileContentAsString(fileOutputOfWriteFileDemo + defaultTextFile)
//		ReadFileContentLineByLine(fileOutputOfWriteFileDemo + otherTextFile)
	}
}
