import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
	
public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	MyFrame(){
		ImageIcon image = new ImageIcon("img/crze.png");
			
		button = new JButton();
		button.setBounds(100, 200, 100, 50);
		button.addActionListener(this);
		button.setText("HEY HEY");
		button.setFocusable(false);
		button.setIcon(image);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.TOP);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(20);
		button.setForeground(Color.cyan);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());

		this.setIconImage(image.getImage());  //встановити іконку заголовку вікна
		this.getContentPane().setBackground(Color.DARK_GRAY);
		
//		JFrame frame = new JFrame();  //створити новий екран
		this.setTitle("Новенький екран");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(null);
//		this.setResizable(false);
		this.setSize(400,600); //встановити розмір фрейму
		this.setVisible(true); //показати екран(за замовченням він прихований)
		
		this.add(button);
	
		
		//		System.out.print(frame.getContentPane());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("HEY HEY");
		}
		
//		System.out.print(e.getSource());
	}
}
