package gui.fileoptions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.filechooser.*;

import functions.ReadFunction;
import gui.AppPanel;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

public class OpenFileOption extends JMenuItem
{
	
	
	
	public OpenFileOption(AppPanel appPanel)
	{
		this.setText("Open");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				String contents = "";
				JFileChooser fc = new JFileChooser();
				fc.showOpenDialog(appPanel);
				File file = fc.getSelectedFile();
				try
				{
					contents = ReadFunction.read(file);
				} catch (FileNotFoundException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				appPanel.setText(contents);
				
			}
			
		});
	}

}
