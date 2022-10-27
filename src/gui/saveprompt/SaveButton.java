package gui.saveprompt;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import functions.SaveFunction;
import gui.AppFrame;
import gui.AppPanel;

public class SaveButton extends JButton implements ActionListener
{
	
	private AppPanel appPanel;
	private SavePrompt savePrompt;
	
	public SaveButton(AppPanel appPanel, SavePrompt savePrompt)
	{
		this.appPanel = appPanel;
		this.savePrompt = savePrompt;
		this.setText("Save");
		this.setPreferredSize(new Dimension(100, 50));
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		savePrompt.setDecision(true);
		savePrompt.close();
	}
	
}
