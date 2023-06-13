import javax.swing.JFrame;

public class MyDrag extends JFrame {
	DragPanel dragPanel;
	MyDrag(){
		dragPanel = new DragPanel();
		
		this.add(dragPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(null);
		this.setSize(600, 600);
		this.setVisible(true);
	}
}
