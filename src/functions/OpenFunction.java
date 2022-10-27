package functions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import document.Document;
import gui.AppFrame;

public class OpenFunction
{
	
	private static Scanner scan;
	
	/**
	 * NEEDS A LOT OF WORK
	 * @throws IOException
	 */
	public static /*String*/ void open() throws IOException
	{

		if(AppFrame.getDocument() != null)
		{
			SaveWithPromptFunction.saveWithPrompt(AppFrame.getDocument());
		}
		
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(AppFrame.getPanel());
		File read = jfc.getSelectedFile();
		
		String contents = "";
		scan = new Scanner(read);
		while(scan.hasNextLine())
		{
			contents += scan.nextLine() + "\n";
		}
		scan.close();
		
		Document newDoc = new Document(read, contents, AppFrame.getPanel());
		AppFrame.setDocument(newDoc);
		newDoc.showDocument();
	}

}
