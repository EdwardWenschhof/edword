package gui.fileoptions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import gui.saveprompt.SavePrompt;

public class SaveOption extends JMenuItem
{

	public SaveOption()
	{
		this.setText("Save");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				new SavePrompt();
				
			}
			
		});
	}
	
}
