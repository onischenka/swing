import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyJPanelA extends JPanel implements ActionListener{
	private static final int DEFAULT_PANEL_WIDTH = 500;
	private static final int DEFAULT_PANEL_HIGHT = 500;
	private static int xVelocity = 3;
	private static int yVelocity = 1;
	private static int xPos = 0;
	private static int yPos = 0;
	private Image monster;
	private Image backgroundImage;
	Timer timer;
	
	
	MyJPanelA(){
		backgroundImage = new ImageIcon("bgcosmic.png").getImage();
		monster = new ImageIcon("monster.png").getImage();
		timer = new Timer(1,this);
		timer.start();
		
		this.setBackground(Color.cyan);		
		this.setPreferredSize(new Dimension(DEFAULT_PANEL_WIDTH, DEFAULT_PANEL_HIGHT));
	}
	
	public void paint(Graphics g) {
		super.paint(g); //paint background		
		Graphics2D g2D = (Graphics2D)g;
		g2D.drawImage(backgroundImage, 0, 0, null);
		g2D.drawImage(monster, xPos, yPos, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(xPos > DEFAULT_PANEL_WIDTH - monster.getWidth(null) || xPos < 0) {
			xVelocity *= -1;
		}
		
		if(yPos > DEFAULT_PANEL_WIDTH - monster.getHeight(null) || yPos < 0) {
			yVelocity *= -1;
		}

		
		xPos += xVelocity;
		yPos += yVelocity;
		repaint();
	}
}
