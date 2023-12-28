package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkingWithThrows {
	static String newfile="Sample.txt";
	public static void Createfile()
	{
	   File f=new File(newfile);
	   if(!f.exists())
	   {
		   System.out.println("File created");
		   
	   }
	   else
	   {
		   System.out.println("file exists already");
	   }
	}
	public static void writing() throws IOException
	{
		FileOutputStream fos=new FileOutputStream(newfile);
		String s1="I live in kolar\n";
		fos.write(s1.getBytes());
		String s2="I work in testyantra\n";
		fos.write(s2.getBytes());
	}
	public static void read() throws IOException 
	{
		FileInputStream fis=new FileInputStream(newfile);
		int i=fis.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fis.read();
		}
	}
		
	public static void main(String[] args) throws IOException
	{
		Createfile();
		writing();
		read();
		
		
	}
	}
	
	


