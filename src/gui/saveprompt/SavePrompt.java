package gui.saveprompt;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class SavePrompt extends JFrame
{
	
	public SavePrompt()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(new GridLayout(1, 1));
		this.add(new SavePromptPanel());
		this.pack();
		this.setLocationRelativeTo(null);
	}

}