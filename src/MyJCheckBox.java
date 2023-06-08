import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyJCheckBox extends JFrame implements ActionListener {
	JCheckBox checkBox;
	JButton button;
	ImageIcon xImage;
	ImageIcon oImage;
	MyJCheckBox(){
		xImage = new ImageIcon("zero.png");
		oImage = new ImageIcon("cross.png");
		
		button = new JButton("Send");		
		button.addActionListener(this);
		
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
		checkBox.addActionListener(this);
		checkBox.setIcon(xImage);
		checkBox.setSelectedIcon(oImage);
		
		this.add(button);
		this.add(checkBox);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			if(checkBox.isSelected()) {
				checkBox.setSelected(false);
			} else {
				checkBox.setSelected(true);
			}
		}
		if(e.getSource()==checkBox) {
		
		}
	}
}
