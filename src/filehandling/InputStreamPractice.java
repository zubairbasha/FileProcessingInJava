package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;

public class InputStreamPractice {
	public static void main(String[] args) {
		try {
			FileInputStream inputStream = new FileInputStream("C:\\Users\\USER\\Downloads\\Photo.jpg");
			byte[] a=inputStream.readAllBytes();
			// Read the image file into the buffer
            int bytesRead = inputStream.read(a);

            // Create a BufferedImage from the buffer
          
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
