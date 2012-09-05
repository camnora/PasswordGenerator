import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class myPanel extends JPanel
{
	String password;
	
	public void paint(Graphics g) {
		super.paint(g);
		setBackground(Color.BLACK);
	}
}
