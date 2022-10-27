package document;

import java.awt.Component;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import functions.OpenFunction;
import functions.SaveFunction;
import gui.AppPanel;

public class Document
{
	private File file;
	private String content = "";
	private JTextArea guiRep = new JTextArea();
	private AppPanel parent;
	private String filename;
	private boolean saved;
	
	public Document(File file, String content, AppPanel parent)
	{
		this.file = file;
		this.content = content;
		this.parent = parent;
		guiRep.setEditable(true);
		guiRep.setLineWrap(true);
		guiRep.setPreferredSize(new Dimension(500, 500));
	}
	
	public Document(AppPanel parent)
	{
		this.parent = parent;
	}

	public void showDocument()
	{
		parent.setTextArea(guiRep);
		parent.add(guiRep);
		parent.revalidate();
		parent.setText(content);
	}
	
	/**
	 * NEEDS FIXED
	 * @throws IOException
	 */
	public void closeDoc() throws IOException
	{
		save();
		if(parent.getTextArea() != null)
		{
			Component[] components = parent.getComponents();
			for(Component c : components)
			{
				if(c instanceof JTextArea)
					parent.remove(c);
			}
		}

	}
	
	public void attachFile(File file)
	{
		this.file = file;
	}
	
	public void updateContent(String newContent)
	{
		content = newContent;
	}
	
	public void save() throws IOException
	{
		saved = true;
		SaveFunction.save(this);
	}
	
	public boolean getSaved()
	{
		return saved;
	}
	
	public void setSaved(boolean saved)
	{
		this.saved = saved;
	}

	public String getContent()
	{
		return content;
	}
	
	public File getFile()
	{
		return file;
	}
	
	public AppPanel getParent()
	{
		return parent;
	}
	
	public JTextArea getTextArea()
	{
		return guiRep;
	}
	
	public String getFilename()
	{
		return filename;
	}

	public void setFilename(String filename)
	{
		this.filename = filename;
	}
	
}
