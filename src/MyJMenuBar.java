import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyJMenuBar extends JFrame implements ActionListener{
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon closeIcon;
	
	MyJMenuBar(){
		menuBar = new JMenuBar();
		fileMenu = new JMenu("Файл");
		editMenu = new JMenu("Редагувати");
		helpMenu = new JMenu("Довідка");
		loadItem = new JMenuItem("Загрузити");
		saveItem = new JMenuItem("Зберегти");
		exitItem = new JMenuItem("Закрити");
		
		loadIcon = new ImageIcon("load.png");
		saveIcon = new ImageIcon("save.png");
		closeIcon = new ImageIcon("close.png");
		
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
	
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(closeIcon);
		
		
		fileMenu.setMnemonic(KeyEvent.VK_F); //alt + F
		editMenu.setMnemonic(KeyEvent.VK_E);
		helpMenu.setMnemonic(KeyEvent.VK_H);
		loadItem.setMnemonic(KeyEvent.VK_L);  //L
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500,500);
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loadItem) {
			System.out.println("You load a file!!");
		}
		
		if(e.getSource()==saveItem) {
			System.out.println("You save a file!!");
		}
		
		if(e.getSource()==exitItem) {
//			this.dispose();
			System.exit(0);
		}
	}
}
