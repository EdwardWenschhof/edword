package gui;

import javax.swing.JMenu;

import gui.fileoptions.ExitOption;
import gui.fileoptions.NewOption;
import gui.fileoptions.OpenFileOption;

public class FileMenuOption extends JMenu
{

	public FileMenuOption(AppPanel appPanel)
	{
		this.setText("File");
		this.add(new NewOption(appPanel));
		this.add(new OpenFileOption());
		this.add(new ExitOption());
	}
	
}
