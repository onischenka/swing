import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyJSlider extends JFrame implements ChangeListener{
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	MyJSlider(){
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,25);
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli",Font.PLAIN,15));
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.addChangeListener(this);
		
		label.setText("°C = " + slider.getValue());
		label.setFont(new Font("MV Boli",Font.PLAIN,25));
		
		panel.add(slider);
		panel.add(label);
		
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("*C = " + slider.getValue());
		if(slider.getValue()==0)
			System.out.print("Зимно!!!");
		
		if(slider.getValue()==100)
			System.out.print("HOT!!!");
		
	}
}
