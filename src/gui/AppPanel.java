package gui;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Dimension;

public class AppPanel extends JPanel
{

	public AppPanel()
	{
		this.setPreferredSize(new Dimension(500, 500));
	}
	
	public void setTextArea(JTextArea area)
	{
		this.add(area);
	}
	
}
