package gui.fileoptions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.filechooser.*;

import functions.OpenFunction;
import gui.AppPanel;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

public class OpenFileOption extends JMenuItem implements ActionListener
{

	private AppPanel panel;
	
	public OpenFileOption(AppPanel appPanel)
	{
		panel = appPanel;
		this.setText("Open");
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			OpenFunction.open();
		} catch (FileNotFoundException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
