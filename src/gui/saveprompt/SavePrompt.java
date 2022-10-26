package gui.saveprompt;

import java.awt.GridLayout;

import javax.swing.JFrame;

import gui.AppPanel;

public class SavePrompt extends JFrame
{
	
	public SavePrompt(AppPanel appPanel)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(new GridLayout(1, 1));
		this.add(new SavePromptPanel(appPanel, this));
		this.pack();
		this.setLocationRelativeTo(null);
	}
	
	public void close()
	{
		this.dispose();
	}

}