package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeFile {

	public static void main(String[] args) throws IOException {
		String s1="Bhargs"+"\n";
		String s2="SUjana"+"\n";
		String s3="Bad girl of test yantra";
		FileOutputStream fos=new FileOutputStream("Sample.txt");
		fos.write(s1.getBytes());
		fos.write(s2.getBytes());
		fos.write(s3.getBytes());
		
		
	}
}
