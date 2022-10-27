package gui.saveprompt;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AppPanel;

public class DontSaveButton extends JButton implements ActionListener
{
	private AppPanel appPanel;
	private SavePrompt savePrompt;
	
	public DontSaveButton(AppPanel appPanel, SavePrompt savePrompt)
	{
		this.appPanel = appPanel;
		this.savePrompt = savePrompt;
		this.setText("Don't Save");
		this.setPreferredSize(new Dimension(100, 50));
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		savePrompt.setDecision(false);
		savePrompt.close();
		
	}
	
}
