

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



@SuppressWarnings("serial")
public class BuildGraphics extends JFrame
{
	private myPanel p = new myPanel();
	private JCheckBox caps = new JCheckBox("Capitals");
	private JCheckBox nums = new JCheckBox("Numbers");
	private JCheckBox symbs = new JCheckBox("Symbols");
	private JLabel pass = new JLabel();
	private JTextField passlen = new JTextField("password length", 15);
	private JButton generate = new JButton("Generate!");
	
	private Generator gen = new Generator();
	
	private boolean capitals;
	private boolean numbers;
	private boolean symbols;
	private int length;
	
	public BuildGraphics()
	{
		setVisible(true);
		setSize(500, 125);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(p);
		p.add(caps);
		p.add(nums);
		p.add(symbs);
		p.add(passlen);
		p.add(generate);
		p.add(pass);
		
		generate.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                if(caps.isSelected())
                	capitals = true;
                else
                	capitals = false;
                if(nums.isSelected())
                	numbers = true;
                else 
                	numbers = false;
                if(symbs.isSelected())
                	symbols = true;
                else
                	symbols = false;
                length = Integer.parseInt(passlen.getText());
                
                String password = gen.generate(capitals, numbers, symbols, length);
                pass.setText(password);
            }
        });
		
	}
	
	public boolean[] getInfo()
	{
		boolean[] info = {capitals, numbers, symbols};
		return info;
	}
}
