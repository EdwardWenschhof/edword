package gui.fileoptions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.filechooser.*;

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
				/* Opens the file system
				JFileChooser fc = new JFileChooser();
				fc.showOpenDialog(appPanel);
				*/
			}
			
		});
	}

}
