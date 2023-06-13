import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyJFileChooser extends JFrame implements ActionListener{
	
	JButton button;
	
	MyJFileChooser(){
		button = new JButton("Обрати файл");
		button.addActionListener(this);
		
		this.add(button);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("."));
		
//		int response = fileChooser.showOpenDialog(null);  //to open file
		int response = fileChooser.showSaveDialog(null);  //to save file
		
		if(response == JFileChooser.APPROVE_OPTION) { //or == 0
			File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
			System.out.println(file);
		}
	}

}
