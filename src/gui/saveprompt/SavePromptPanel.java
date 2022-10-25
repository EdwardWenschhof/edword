package gui.saveprompt;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class SavePromptPanel extends JPanel
{
	
	public SavePromptPanel()
	{
		this.setLayout(new FlowLayout());
		this.add(new SavePromptLabel());
		this.add(new SaveButton());
		this.add(new DontSaveButton());
		this.setPreferredSize(new Dimension(400, 100));
	}

}
