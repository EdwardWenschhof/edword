package gui.fileoptions;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import gui.AppPanel;

public class NewOption extends JMenuItem
{
	
	AppPanel panel;

	public NewOption(AppPanel panel) 
	{
		this.panel = panel;
		this.setText("New");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				createNewFile();
			}
			
		});
	}
	
	public void createNewFile()
	{
		JTextArea textArea = new JTextArea();
		textArea.setPreferredSize(new Dimension(500, 500));
		panel.remove(textArea);
		panel.setTextArea(textArea);
	}
	
}
