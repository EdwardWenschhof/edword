package gui.saveprompt;

import java.awt.Dimension;

import javax.swing.JLabel;

public class SavePromptLabel extends JLabel
{
	
	public SavePromptLabel()
	{
		this.setText("Would you like to save this document?");
		this.setPreferredSize(new Dimension(400, 50));
	}

}
