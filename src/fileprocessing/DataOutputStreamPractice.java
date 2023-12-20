package fileprocessing;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataOutputStreamPractice {
	public static void main(String[] args) {
		try {
			FileOutputStream outputStream = new FileOutputStream(new File("E:\\Input.txt"));
			DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
			dataOutputStream.writeInt(65);
			InputStream inputStream=new FileInputStream("E:\\Input.txt");
			DataInputStream dataInputStream=new DataInputStream(inputStream);
			int in=dataInputStream.available();
			byte[] b=new byte[in];
			dataInputStream.read(b);
			  for (byte bt : b) {  
			      char k = (char) bt;  
			      System.out.print(k);  
			    }  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
