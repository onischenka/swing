import javax.swing.JFrame;

public class My2DAnimation extends JFrame{
	MyJPanelA panel;
	
	My2DAnimation(){
		panel = new MyJPanelA();
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
