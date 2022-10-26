package gui.saveprompt;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import gui.AppPanel;

public class SavePromptPanel extends JPanel
{
	
	public SavePromptPanel(AppPanel appPanel, SavePrompt savePrompt)
	{
		this.setLayout(new FlowLayout());
		this.add(new SavePromptLabel());
		this.add(new SaveButton(appPanel, savePrompt));
		this.add(new DontSaveButton());
		this.setPreferredSize(new Dimension(400, 100));
	}

}
