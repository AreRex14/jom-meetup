import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
	public MainFrame() {
		Container pane = getContentPane();
		
		//insert app logo here
		pane.add(new JLabel("Jom Meetup"));
		pane.add(new JLabel("Di sini permulaan perkongsian ilmu..."));
		
		JButton terus = new JButton("Seterusnya");
		pane.add(terus);
	}
}
