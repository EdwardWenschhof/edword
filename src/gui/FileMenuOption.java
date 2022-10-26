package gui;

import javax.swing.JMenu;

import gui.fileoptions.ExitOption;
import gui.fileoptions.NewOption;
import gui.fileoptions.OpenFileOption;
import gui.fileoptions.SaveOption;

public class FileMenuOption extends JMenu
{

	public FileMenuOption(AppPanel appPanel)
	{
		this.setText("File");
		this.add(new NewOption(appPanel));
		this.add(new OpenFileOption(appPanel));
		this.add(new SaveOption(appPanel));
		this.add(new ExitOption());
		
	}
	
}
