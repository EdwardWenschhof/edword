package gui;

import javax.swing.JMenuBar;

public class AppMenuBar extends JMenuBar
{
	
	public AppMenuBar(AppPanel appPanel)
	{
		this.add(new FileMenuOption(appPanel));
	}
	
}
