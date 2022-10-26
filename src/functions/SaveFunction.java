package functions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFunction
{
	private static FileWriter fileWriter;

	public static void save(String string, File file) throws IOException
	{
		fileWriter = new FileWriter(file);
		fileWriter.write(string);
		fileWriter.close();
	}
	
}
