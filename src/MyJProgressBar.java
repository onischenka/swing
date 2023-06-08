import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyJProgressBar extends JFrame {
	JProgressBar progressBar;
	MyJProgressBar(){
		progressBar = new JProgressBar();
		progressBar.setValue(10);
		progressBar.setBounds(0, 0, 420, 50);
		progressBar.setStringPainted(true);
		progressBar.setFont(new Font("MV Boli", Font.BOLD, 25));
		progressBar.setForeground(Color.pink);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(420,420);
		this.setVisible(true);
		this.add(progressBar);
		
		fill();
	}
	
	public void fill() {
		int counter = 0;
		while(counter<=420) {
			progressBar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter +=1;
		}
		progressBar.setString("Done!");
	}
}
