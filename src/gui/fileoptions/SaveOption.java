package gui.fileoptions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

import functions.SaveFunction;
import gui.AppPanel;
import gui.saveprompt.SavePrompt;

public class SaveOption extends JMenuItem
{

	JFileChooser jfc;
	
	public SaveOption(AppPanel appPanel)
	{
		this.setText("Save");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				jfc = new JFileChooser();
				jfc.showSaveDialog(appPanel);
				File file = jfc.getSelectedFile();
				String text = appPanel.getText();
				if(file != null && text != null)
				{
					try
					{
						SaveFunction.save(text, file);
					} catch (IOException e1)
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			
		});
	}
	
}
