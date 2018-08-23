import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener{
	JButton terus;
	
	public MainFrame() {
		Container pane = getContentPane();
		
		setLayout(new FlowLayout());
		setLayout(null);
		setSize(500, 500);
		setResizable(false);
		setLocation(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//insert app logo here
		JLabel Main1 = new JLabel("Jom Meetup");
		Main1.setBounds(210, 180, 150, 20);
		pane.add(Main1);
		
		JLabel Main2 = new JLabel("Di sini permulaan perkongsian ilmu...");
		pane.add(Main2);
		Main2.setBounds(140, 230, 300, 20);
		
		terus = new JButton("Seterusnya");
		pane.add(terus);
		terus.setBounds(170, 280, 150, 30);
		terus.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrame();
	}
}
