package gui;

import javax.swing.JMenuBar;

public class AppMenuBar extends JMenuBar
{
	
	private static FileMenuOption fmoption;
	
	public AppMenuBar(AppPanel appPanel)
	{
		fmoption = new FileMenuOption(appPanel);
		this.add(fmoption);
	}
	
}
