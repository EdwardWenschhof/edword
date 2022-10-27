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

public class SaveButton extends JButton
{

	JFileChooser jfc;
	
	public SaveButton(AppPanel appPanel, SavePrompt savePrompt)
	{
		this.setText("Save");
		this.setPreferredSize(new Dimension(100, 50));
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					AppFrame.getDocument().save();
				} catch (IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				savePrompt.dispose();
					
			}
			
		});
	}
	
}
