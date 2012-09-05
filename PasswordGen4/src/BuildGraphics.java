

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BuildGraphics extends JFrame {
	private myPanel p = new myPanel();
	private JCheckBox caps = new JCheckBox("Capitals");
	private JCheckBox nums = new JCheckBox("Numbers");
	private JCheckBox symbs = new JCheckBox("Symbols");
	private JLabel pass = new JLabel();
	private JTextField passlen = new JTextField("10", 3);
	private JButton generate = new JButton("Generate!");
	
	private boolean capitals;
	private boolean numbers;
	private boolean symbols;
	private int length;
	
	public BuildGraphics() {
		setVisible(true);
		setSize(500, 125);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(p);
		caps.setBackground(Color.BLACK); caps.setForeground(Color.WHITE); p.add(caps);
		nums.setBackground(Color.BLACK); nums.setForeground(Color.WHITE); p.add(nums);
		symbs.setBackground(Color.BLACK); symbs.setForeground(Color.WHITE); p.add(symbs);
		passlen.setBackground(Color.BLACK); passlen.setForeground(Color.WHITE); p.add(passlen);
		generate.setBackground(Color.GRAY); caps.setForeground(Color.WHITE); p.add(generate);
		p.add(pass);
		
		generate.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e) {
            	capitals = caps.isSelected() ? true:false;
            	numbers = nums.isSelected() ? true:false;
            	symbols = symbs.isSelected() ? true:false;
                length = Integer.parseInt(passlen.getText());
                String password = Generator.generate(capitals, numbers, symbols, length);
                pass.setForeground(Color.WHITE);
                pass.setText(password);
            }
        });
	}
	
	public boolean[] getInfo() {
		boolean[] info = {capitals, numbers, symbols};
		return info;
	}
}
