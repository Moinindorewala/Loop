package LoopExample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {
	
	public static void main(String[] args) throws IOException {
		File f = new File("../Com.Loop/FileOutput.txt");
		FileWriter wr = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(wr);
		br.write("hey this is automation class");
		br.newLine();
		br.write("this is nice");
		br.close();
	}

}
