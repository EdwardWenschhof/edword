package functions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFunction
{
	
	private static Scanner scan;
	
	public static String read(File file) throws FileNotFoundException
	{
		String contents = "";
		scan = new Scanner(file);
		while(scan.hasNextLine())
		{
			contents += scan.nextLine() + "\n";
		}
		scan.close();
		
		return contents;
	}

}
