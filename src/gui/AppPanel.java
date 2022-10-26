package gui;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import document.Document;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

public class AppPanel extends JPanel
{
	JTextArea area;
	public AppPanel()
	{
		this.setLayout(new GridLayout(1, 1));
		this.setPreferredSize(new Dimension(500, 500));
	}
	
	public void addDocument(Document document)
	{

		if(area != null)
		{
			Component[] components = this.getComponents();
			for(Component c : components)
			{
				if(c instanceof JTextArea)
					this.remove(c);
			}
			this.revalidate();
			JTextArea newArea = document.getTextArea();
			area = newArea;
			this.add(newArea);
		}
			
		else 
		{
			JTextArea newArea = document.getTextArea();
			area = newArea;
			this.add(newArea);
		}
		
	}
	
	public void setText(String text)
	{
		area.setText(text);
	}
	
	public void clearText()
	{
		area.setText("");
	}
	
	public String getText()
	{
		String text = area.getText();
		return text;
	}
	
}
