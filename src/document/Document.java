package document;

import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import functions.ReadFunction;
import functions.SaveFunction;
import gui.AppPanel;

public class Document
{
	private File file;
	private String content;
	private JTextArea guiRep = new JTextArea();
	private AppPanel parent;
	
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
	
	public void createGUIDoc()
	{
		parent.addDocument(this);
	}
	
	public void closeDoc() throws IOException
	{
		save(content);
		parent.remove(guiRep);	
	}
	
	public void attachFile(File file)
	{
		this.file = file;
	}
	
	public void updateContent(String newContent)
	{
		content = newContent;
	}
	
	public void save(String string) throws IOException
	{
		SaveFunction.save(string, file);
	}
	
	public String read() throws FileNotFoundException
	{
		String contents = ReadFunction.read(file);
		return contents;
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

}
