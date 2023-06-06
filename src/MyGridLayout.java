import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyGridLayout extends JFrame {
	MyGridLayout(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(250,250));
//		this.setLayout(new GridLayout());
//		this.setLayout(new GridLayout(9,1));//9 рядків та 1 колонка
		this.setLayout(new GridLayout(3,3,10,10));//+ відступи між рядками
		
		this.add(new JButton("1"));
		this.add(new JButton("2"));
		this.add(new JButton("3"));
		this.add(new JButton("4"));
		this.add(new JButton("5"));
		this.add(new JButton("6"));
		this.add(new JButton("7"));
		this.add(new JButton("8"));
		this.add(new JButton("9"));
				
		this.setVisible(true);
	}
}
