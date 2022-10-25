package gui.fileoptions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class ExitOption extends JMenuItem
{

	public ExitOption()
	{
		this.setText("Exit");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				exitProcedure();
			}
			
		});
	}
	
	public void exitProcedure() 
	{
		System.exit(0);
	}
	
}
