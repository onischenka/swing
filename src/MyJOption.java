import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MyJOption {
	MyJOption(){
//		JOptionPane.showMessageDialog(null, "This is some useless","title",JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless","title",JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless","title",JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless","title",JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless","title",JOptionPane.ERROR_MESSAGE);
	
//		int answer = JOptionPane.showConfirmDialog(null, "This confirm dialog","title", JOptionPane.YES_NO_CANCEL_OPTION);
//		System.out.println(answer);
		
//		String name = JOptionPane.showInputDialog("What is your name?:");
//		System.out.println(name);
		String[] responses = {"No me", "thank", "bla"};
		ImageIcon icon = new ImageIcon("emo.png");
		JOptionPane.showOptionDialog(null, 
									"You are awesome!", 
									"secret message", 
									JOptionPane.YES_NO_CANCEL_OPTION, 
									JOptionPane.INFORMATION_MESSAGE, 
									icon, 
									responses, 
									0);
	}
}
