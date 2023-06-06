import java.awt.BorderLayout;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyJPanel extends JFrame {
	MyJPanel(){
//		ImageIcon icon = new ImageIcon("emo.png");
		ImageIcon icon = new ImageIcon(getClass().getResource("/resources/emo.png"));
		
		JLabel label = new JLabel();
		label.setText("Привіт!");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(0, 0, 250, 250);

		JPanel yellowPanel = new JPanel();
		yellowPanel.setBackground(Color.yellow);
		yellowPanel.setBounds(250, 0, 250, 250);
		
		
		JPanel pinkPanel = new JPanel();
		pinkPanel.setBackground(Color.pink);
		pinkPanel.setBounds(0, 250, 500, 250);
		pinkPanel.setLayout(new BorderLayout());		
		pinkPanel.add(label);
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		
		
		frame.add(yellowPanel);
		frame.add(bluePanel);
		frame.add(pinkPanel);	
	}
}
