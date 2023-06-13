import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyMouseListener extends JFrame implements MouseListener{
	JLabel label;
	ImageIcon icon1;
	ImageIcon icon2;
	ImageIcon icon3;
	ImageIcon icon4;
	
	MyMouseListener(){
		icon1 = new ImageIcon("smile1.png");
		icon2 = new ImageIcon("smile2.png");
		icon3 = new ImageIcon("smile3.png");
		icon4 = new ImageIcon("smile4.png");
		
		label = new JLabel();
		label.setIcon(icon1);
//		label.setBounds(0,0,100,100);
		label.addMouseListener(this);
//		label.setBackground(Color.red);
//		label.setOpaque(true);
		
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
//		this.setLocationRelativeTo(null);
//		this.setSize(500, 500);		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.print("You clicked the mouse");
		label.setBackground(Color.yellow);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.print("You pressed the mouse");
		label.setBackground(Color.green);
		label.setIcon(icon3);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.print("You released the mouse");
		label.setBackground(Color.white);
		label.setIcon(icon4);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.print("You entered the mouse");
		label.setBackground(Color.blue);
		label.setIcon(icon2);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setBackground(Color.red);
		System.out.print("You exited the mouse");
		label.setIcon(icon1);
		
	}
}
