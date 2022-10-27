package functions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

import document.Document;

public class SaveFunction
{
	private static FileWriter fileWriter;
	private static JFileChooser jfc;

	public static void save(Document document) throws IOException
	{
		document.updateContent(document.getParent().getText());
		if(document.getFilename() == null || document.getFile() == null)
		{
			jfc = new JFileChooser();
			jfc.showSaveDialog(document.getParent());
			File selected = jfc.getSelectedFile();
			
			document.attachFile(selected);
			document.setFilename(jfc.getName(selected));
		}
			
			fileWriter = new FileWriter(document.getFile(), false);
			fileWriter.write(document.getContent());
			fileWriter.close();
		
		
	}
	
}
