
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class MyLabel extends JFrame {

	MyLabel(){
		ImageIcon icon = new ImageIcon("src/img/cat.png");
		Border boder = BorderFactory.createLineBorder(Color.green,10);
		
		JLabel label = new JLabel();
		label.setText("Bro, do you even code?"); 
		label.setIcon(icon);
		label.setHorizontalTextPosition(JLabel.RIGHT);  //LEFT, CENTER, RIGHT вирівнювання відносно зображення
//		label.setVerticalTextPosition(JLabel.TOP); 	 	//TOP, MIDDLE, BOTTOM
		label.setForeground(new Color(100,255,100)); //колір тексту
		label.setFont(new Font("MV Boli", Font.PLAIN,20));
//		label.setIconTextGap(100); //відступ від зображення
		label.setBackground(Color.DARK_GRAY);	//встановлюємо колір фону
		label.setOpaque(true);
		label.setBorder(boder);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);	
//		label.setBounds(100,100,400,250); //встановимо координати та розміри мітки
		
//		JFrame frame = new JFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setLayout(null);
//		frame.setSize(600,500);
		this.setVisible(true);		
		this.add(label);
		this.pack();		//встановити розмір вікна за розміром змісту мітка картинки та 
	}
}
