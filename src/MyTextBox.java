import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyTextBox extends JFrame implements ActionListener {
	JButton button;
	JTextField textField;
	MyTextBox(){
		
		button = new JButton("SEND");
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas",Font.PLAIN,35));
		textField.setForeground(Color.pink);
		textField.setBackground(Color.DARK_GRAY);
		textField.setCaretColor(Color.white);
		textField.setText("Username");
		textField.setEditable(false);
		
		this.add(button);
		this.add(textField);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(textField.getText());
		}
		
	}
}
