import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener{
	JButton terus;
	
	public MainFrame() {
		Container pane = getContentPane();
		
		setLayout(new FlowLayout());
		setSize(500, 500);
		setLocation(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//insert app logo here
		pane.add(new JLabel("Jom Meetup"));
		pane.add(new JLabel("Di sini permulaan perkongsian ilmu..."));
		
		terus = new JButton("Seterusnya");
		pane.add(terus);
		terus.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrame();
	}
}
