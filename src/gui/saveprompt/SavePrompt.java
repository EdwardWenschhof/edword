package gui.saveprompt;

import java.awt.GridLayout;

import javax.swing.JFrame;

import gui.AppPanel;

public class SavePrompt extends JFrame
{
	
	private boolean saveDecision;
	private AppPanel appPanel;
	private boolean closed = true;
	
	public SavePrompt(AppPanel appPanel)
	{
		this.appPanel = appPanel;

	}
	
	public void createAndShow()
	{
		closed = false;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(new GridLayout(1, 1));
		this.add(new SavePromptPanel(appPanel, this));
		this.pack();
		this.setLocationRelativeTo(null);
	}
	
	public boolean getClosed()
	{
		return closed;
	}
	
	public void setDecision(boolean decision)
	{
		saveDecision = decision;
	}
	
	public boolean getDecision()
	{
		return saveDecision;
	}
	
	public void close()
	{
		closed = true;
		this.dispose();
	}

}