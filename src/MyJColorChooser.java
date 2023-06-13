import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJColorChooser extends JFrame implements ActionListener  {
	JButton button;
	JLabel label;
	
	MyJColorChooser(){
		button = new JButton("Pick a color");
		button.addActionListener(this);
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("Some text :D");
		label.setFont(new Font("Consolas",Font.PLAIN,35));
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
//			JColorChooser colorChooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
			label.setForeground(color);
		}
	}
}
