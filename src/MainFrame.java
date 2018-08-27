import java.awt.FlowLayout;
import javax.swing.JFrame;

public abstract class MainFrame extends JFrame{
	public MainFrame() {
		setLayout(null); // Absolute layout
		setSize(500, 500);
		setLocation(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
}
