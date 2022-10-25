import javax.swing.*;
import java.awt.GridLayout;

public class AppFrame extends JFrame
{
	public AppFrame() 
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(new GridLayout(1, 1));
		this.pack();
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args)
	{
		AppFrame frame = new AppFrame();
	}
}
