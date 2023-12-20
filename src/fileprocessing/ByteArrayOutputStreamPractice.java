package fileprocessing;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamPractice {
	public static void main(String[] args) {
		try {
		ByteArrayOutputStream byteArrayOutputStream=
				new ByteArrayOutputStream();
		String text="Hello World";
		byte[] textBytes=text.getBytes();
		byteArrayOutputStream.write(textBytes);
		String text2="Hello Good Morning";
		byteArrayOutputStream.write(text2.getBytes());
		System.out.println(byteArrayOutputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
