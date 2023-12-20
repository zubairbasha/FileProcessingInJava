package fileprocessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FilePractice {
	public static void main(String[] args) throws IOException {
		/*
		 * Three Streams are created automatically In java.
		 *System.in
		 *System.out
		 *System.err 
		 * */
		//File OutputStream
		/*
		 * File OutputStream is used to write the content to the destination
		 */
		//Read a Text File
		File inputStream=new File("E:\\Input.txt");
		BufferedReader bufferReader=new BufferedReader(new FileReader(inputStream));
		while(bufferReader.read()!=-1) {
			System.out.println(bufferReader.readLine());
		}
		bufferReader.close();
	}
}
