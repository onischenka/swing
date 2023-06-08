import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyJComboBox extends JFrame implements ActionListener {
	private static int i = 0;
	JComboBox comboBox;
	MyJComboBox(){
		String[] animals = {"Cat", "Dog", "Bird"};
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		comboBox.setEditable(true);
		comboBox.insertItemAt("Pig", 1);
		comboBox.setSelectedIndex(1);
		comboBox.removeItem("Bird");
		comboBox.removeItemAt(2);
//		comboBox.removeAllItems();
		System.out.println(comboBox.getItemCount());
		
		
		this.add(comboBox);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem());
			comboBox.addItem("Item" + i++);
		}
	}
}
