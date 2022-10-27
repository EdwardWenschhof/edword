package functions;

import java.awt.Component;

import javax.swing.JTextArea;

import document.Document;
import gui.AppPanel;

public class NewFunction
{
	
	public static Document newDocument(AppPanel panel)
	{
		Document document = new Document(panel);
		
		if(panel.getTextArea() != null)
		{
			Component[] components = panel.getComponents();
			for(Component c : components)
			{
				if(c instanceof JTextArea)
					panel.remove(c);
			}
			JTextArea newArea = document.getTextArea();
			panel.setTextArea(newArea);
			panel.add(newArea);
			panel.revalidate();
		}
			
		else 
		{
			JTextArea newArea = document.getTextArea();
			panel.setTextArea(newArea);
			panel.add(newArea);
			panel.revalidate();
		}
		
		return document;
	}

}
