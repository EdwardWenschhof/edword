package gui.fileoptions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

import functions.SaveFunction;
import gui.AppFrame;
import gui.AppPanel;
import gui.saveprompt.SavePrompt;

public class SaveOption extends JMenuItem implements ActionListener
{
	private AppPanel appPanel;
	private JFileChooser jfc;
	
	public SaveOption(AppPanel appPanel)
	{
		this.appPanel = appPanel;
		this.setText("Save");
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			AppFrame.getDocument().save();
		} catch (IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
