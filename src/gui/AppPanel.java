package gui;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import document.Document;
import functions.NewFunction;

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
	
	public JTextArea getTextArea()
	{
		return area;
	}
	
	public void setTextArea(JTextArea area)
	{
		this.area = area;
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
