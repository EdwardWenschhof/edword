package gui;

import javax.swing.JFrame;
import java.awt.GridLayout;

public class AppFrame extends JFrame
{
	
	AppPanel appPanel = new AppPanel();
	
	public AppFrame() 
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setJMenuBar(new AppMenuBar(appPanel));
		this.setLayout(new GridLayout(1, 1));
		this.add(appPanel);
		this.pack();
		this.setLocationRelativeTo(null);
	}
}
