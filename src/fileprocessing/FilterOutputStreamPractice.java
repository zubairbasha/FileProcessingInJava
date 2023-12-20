package fileprocessing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterOutputStreamPractice {
	public static void main(String[] args) {
		try {
			FileOutputStream outputStream=new FileOutputStream("E:\\input.txt");
			UpperCaseFilterOutputStream up=new UpperCaseFilterOutputStream(outputStream);
			String str="hello world";
			up.write(str.getBytes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class UpperCaseFilterOutputStream extends FilterOutputStream {

	public UpperCaseFilterOutputStream(OutputStream out) {
		super(out);
	}

	@Override
	public void write(int i) throws IOException {
		if (Character.isLowerCase(i)) {
			i = Character.toUpperCase(i);
		}
		super.write(i);
	}

}