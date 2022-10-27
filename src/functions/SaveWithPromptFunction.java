package functions;

import java.io.IOException;

import document.Document;
import gui.saveprompt.SavePrompt;

public class SaveWithPromptFunction
{
	
	public static void saveWithPrompt(Document document) throws IOException
	{
		
		SavePrompt savePrompt = new SavePrompt(document.getParent());
		savePrompt.createAndShow();
		if(savePrompt.getDecision() && savePrompt.getClosed())
		{
			SaveFunction.save(document);
		}
		
	}
	

}
