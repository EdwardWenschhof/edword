package gui.fileoptions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import document.Document;
import functions.NewFunction;
import gui.AppFrame;
import gui.AppPanel;

public class NewOption extends JMenuItem implements ActionListener
{
	
	AppPanel panel;

	public NewOption(AppPanel panel) 
	{
		this.panel = panel;
		this.setText("New");
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Document currentDoc = NewFunction.newDocument(panel);
		AppFrame.setDocument(currentDoc);
	}
	
}
