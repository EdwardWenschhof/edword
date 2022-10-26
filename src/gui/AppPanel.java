package gui;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Dimension;

public class AppPanel extends JPanel
{
	JTextArea area = new JTextArea();
	public AppPanel()
	{
		this.setPreferredSize(new Dimension(500, 500));
		area.setLineWrap(true);
		this.setLayout(new BorderLayout());
		this.add(area, BorderLayout.CENTER);
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
