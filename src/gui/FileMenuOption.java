package gui;

import javax.swing.JMenu;

import gui.fileoptions.ExitOption;
import gui.fileoptions.NewOption;
import gui.fileoptions.OpenFileOption;
import gui.fileoptions.SaveOption;

public class FileMenuOption extends JMenu
{
	
	private static NewOption newOption;
	private static OpenFileOption openOption;
	private static SaveOption saveOption;
	private static ExitOption exitOption;
	
	private static FileMenuOption fmoption;
	
	private AppPanel appPanel;

	private FileMenuOption(AppPanel appPanel)
	{
		newOption = new NewOption(appPanel);
		openOption = new OpenFileOption(appPanel);
		saveOption = new SaveOption(appPanel);
		exitOption = new ExitOption();
		this.setText("File");
		this.add(newOption);
		this.add(openOption);
		this.add(saveOption);
		this.add(exitOption);
		
	}
	
	public static FileMenuOption getFileMenuOption(AppPanel appPanel)
	{
		if(fmoption == null)
		{
			fmoption = new FileMenuOption(appPanel);
		}
		return fmoption;
	}
	
	public AppPanel getParentPanel()
	{
		return appPanel;
	}
	
}
