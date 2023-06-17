import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyJPanelG extends JPanel {
	Graphics2D g2D;
	Image image;
	MyJPanelG(){
		image = new ImageIcon("rocket.png").getImage();
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g) {
		g2D = (Graphics2D) g;
		g2D.setStroke(new BasicStroke(10));

		
		g2D.drawImage(image, 0, 0, null);
		
//		g2D.draw3DRect(50, 0, 200, 400, true);
		g2D.setPaint(Color.pink);
		g2D.drawRect(50, 5, 200, 300);
		g2D.fillRect(50, 5, 200, 300);
		
		g2D.setStroke(new BasicStroke(2));
		g2D.setPaint(Color.white);
		g2D.drawLine(47, 0, 255, 310);
		
		g2D.setPaint(Color.magenta);
		g2D.drawOval(75, 75, 150, 150);
		g2D.fillOval(75, 75, 150, 150);
		
		drawCircle();
		
		int[] xPoints = {155,255,355};
		int[] yPoints = {300,150,300};
		g2D.drawPolygon(xPoints,yPoints,3);
		
		g2D.setFont(new Font("Consolas", Font.PLAIN,22));
		g2D.drawString("ЯК ЯК ЯК", 300, 22);
		

		
	}
	
	public void drawCircle() {
		int angle = 0;
		
				
		while(angle<=180) {
		
		
			try {
				Thread.sleep(0);
				g2D.drawArc(350, 350, 100, 100, 0, angle);
				g2D.fillArc(350, 350, 100, 100, 0, angle);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			angle++;
		}
	}
}
