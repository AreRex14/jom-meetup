import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends MainFrame implements ActionListener{
	JButton terus;
	
	public Welcome() {
		Container pane = getContentPane();
		
		setLayout(new FlowLayout());
		setSize(500, 500);
		setLocation(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//insert app logo here
		JLabel h1 = new JLabel("Jom Meetup");
		h1.setBounds(210, 180, 150, 20);
		pane.add(h1);
		
		JLabel h2 = new JLabel("Di sini permulaan perkongsian ilmu...");
		h2.setBounds(140, 230, 300, 20);
		pane.add(h2);
		
		terus = new JButton("Seterusnya");
		pane.add(terus);
		terus.setBounds(170, 280, 150, 30);
		terus.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 this.setVisible(false);
	     new SignUp().setVisible(true); // Sign Up Form to show after Welcome window
	}
	
	/* for this window testing only
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Welcome();
	}
	*/
}
