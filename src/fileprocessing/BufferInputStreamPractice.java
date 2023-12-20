package fileprocessing;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputStreamPractice {
	public static void main(String[] args) throws IOException {
		/*
		 * Buffer Input stream is used to read information from the stream. What is a
		 * Stream:- Stream doesnot store elements, it simply conveys the element from
		 * source to destination.
		 * Buffer Input stream uses the mechanism of buffer to process the Input Operation
		 */
		try {
			FileInputStream inputStream=new FileInputStream("E:\\Input.txt");
			BufferedInputStream bufferInputStream=new BufferedInputStream(inputStream);
			int i;
			while((i=bufferInputStream.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
