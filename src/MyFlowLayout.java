import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFlowLayout extends JFrame {
	MyFlowLayout(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
//		this.setLayout(new FlowLayout()); // за замовченням вирівнює по центру
//		this.setLayout(new FlowLayout(FlowLayout.LEADING)); // вирівнює по лівому краю
		this.setLayout(new FlowLayout(FlowLayout.TRAILING)); // вирівнює по правому краю
		this.setLayout(new FlowLayout(FlowLayout.CENTER,0,0)); //встановлює 0 відступ
				
//		JButton button1 = new JButton();
//		this.add(button1);
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250,250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
	
		this.add(panel);
		this.setVisible(true);
		
	}	
}
