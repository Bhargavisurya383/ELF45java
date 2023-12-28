package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		File file=new File("Sample.txt");
		File f=new File("D://programming//sample.txt");
		if(!f.exists())
		{
			System.out.println("file is created");
			f.createNewFile();
		}
		else
		{
			System.out.println("File already exists");
		}
		FileOutputStream fos=new FileOutputStream(f);
	
		
		String s1="I live in Bengalore\n";
		fos.write(s1.getBytes());
		String s2="I work for testYantra\n";
		
		fos.write(s2.getBytes());
		String s3="Native is Shivamogga";
		fos.write(s3.getBytes());
		
		FileInputStream fis=new FileInputStream(file);
		int i=fis.read();
		while(i!=-1)
		{
			System.out.print((char) i);
			i=fis.read();
		}
	}

}
