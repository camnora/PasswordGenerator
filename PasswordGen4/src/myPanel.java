import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class myPanel extends JPanel
{
	public void paint(Graphics g)
	{
		super.paint(g);
		setBackground(Color.BLACK);
	}
}
