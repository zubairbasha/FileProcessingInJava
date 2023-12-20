package fileprocessing;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequencialInputStram {
	public static void main(String[] args) {
		/*
		 * It allows to read the Data from two files sequenctially, one by one.
		 * 
		 */
		try {
			FileInputStream inputStream = new FileInputStream("E:\\Input.txt");
			FileInputStream inputStream2 = new FileInputStream("E:\\Input2.txt");
			SequenceInputStream sqInputStream = new SequenceInputStream(inputStream, inputStream2);
			int i;
			while ((i = sqInputStream.read()) != -1) {
				System.out.print((char) i);
			}
			sqInputStream.close();
			inputStream.close();
			inputStream2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * In this example we are trying to read the data from two different input files
		 * and Write in single file
		 * 
		 */
		try {
			FileInputStream inputStream=new FileInputStream("E:\\Input.txt");
			FileInputStream inputStream2=new FileInputStream("E:\\Input2.txt");
			SequenceInputStream sqInputStream=new SequenceInputStream(inputStream, inputStream2);
			FileOutputStream outputStream =new FileOutputStream("E:\\Output.txt");
			BufferedOutputStream bufferOutputStream=new BufferedOutputStream(outputStream);
			int i;
			while((i=sqInputStream.read())!=-1) {
				bufferOutputStream.write((char)i);
				
			}
			bufferOutputStream.close();
			sqInputStream.close();
			inputStream.close();
			inputStream2.close();
		}
		
		catch(Exception e) {
			
		}
		/*If we want to read more than one file we can use Enumaration where we use Vector of Enumeration*/
	}
}
