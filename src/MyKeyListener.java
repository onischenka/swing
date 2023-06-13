import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyKeyListener extends JFrame implements KeyListener {
	JLabel label;
	ImageIcon icon;
	MyKeyListener(){
		icon = new ImageIcon("rocket2.png");
				
		label = new JLabel();
//		label.setText("TEXT");
		label.setBounds(230, 360, 100, 100);
		label.setIcon(icon);
//		label.setBackground(Color.red);
//		label.setOpaque(true);
		
		this.add(label);
		this.getContentPane().setBackground(Color.darkGray);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.addKeyListener(this);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {			//e.getKeyChar() case 'a'
		case 'a': label.setLocation(label.getX()-10, label.getY());
			break;
		case 's': label.setLocation(label.getX()+10, label.getY());
			break;
		case 'w': label.setLocation(label.getX(), label.getY()-10);
			break;
		case 'z': label.setLocation(label.getX(), label.getY()+10);
			break;
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {	
		case 37: label.setLocation(label.getX()-10, label.getY());
			break;
		case 39: label.setLocation(label.getX()+10, label.getY());
			break;
		case 38: label.setLocation(label.getX(), label.getY()-10);
			break;
		case 40: label.setLocation(label.getX(), label.getY()+10);
			break;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Char Released: " + e.getKeyChar());
		System.out.println("Code Released: " + e.getKeyCode());		
	}

}
