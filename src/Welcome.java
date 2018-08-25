import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends App implements ActionListener{
	JButton terus;
	
	public Welcome() {
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// for this window testing only
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Welcome();
	}
}
