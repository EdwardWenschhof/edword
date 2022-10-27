package gui;

import javax.swing.JFrame;

import document.Document;

import java.awt.GridLayout;

public class AppFrame extends JFrame
{
	private static Document currentDoc;
	private static AppPanel appPanel = new AppPanel();
	
	public AppFrame() 
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("edword");
		this.setResizable(false);
		this.setJMenuBar(new AppMenuBar(appPanel));
		this.setLayout(new GridLayout(1, 1));
		this.add(appPanel);
		this.pack();
		this.setLocationRelativeTo(null);
	}
	
	public static AppPanel getPanel()
	{
		return appPanel;
	}
	
	public static void setDocument(Document doc)
	{
		currentDoc = doc;
	}
	
	public static Document getDocument()
	{
		return currentDoc;
	}
}
