package fileprocessing;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutputStreamPractice {
	public static void main(String[] args) {
		try {
			FileOutputStream outputStream=new FileOutputStream("E:\\Input.txt");
			BufferedOutputStream bOut=new BufferedOutputStream(outputStream);
			String s="Welcome to Java File";
			byte[]  b=s.getBytes();
			bOut.write(b);
			bOut.flush();
			bOut.close();
			outputStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
