package LoopExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("../Com.Loop/FileInput.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int r;
		while((r=br.read())!=-1)
		{
			System.out.print((char)r);
		}
		br.close();
	}

}
