import javax.swing.JFrame;

public class MyGraphics extends JFrame {
	
	MyJPanelG panel;
	MyGraphics(){
		panel = new MyJPanelG();
		
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLocationRelativeTo();
		this.pack();
		this.setVisible(true);
	}

	

}
