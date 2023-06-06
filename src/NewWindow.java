import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("HEY HEY!");
	NewWindow(){
		label.setBounds(0,0,400,40);
		label.setBackground(Color.green);
		label.setOpaque(true);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 600);
		frame.setLayout(null); 
		frame.setVisible(true);
		
		
	
	}
}
