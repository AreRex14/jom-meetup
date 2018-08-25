import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignIn extends JFrame implements ActionListener{
	JTextField emelInput;
	JPasswordField passwordInput;
	JButton masuk;
	
	private String email, pass; 
	
	public SignIn() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		// try build the layout on MainFrame only, this is just for test view
		setLayout(new FlowLayout());
		setSize(500, 500);
		setLocation(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
		pane.add(new JLabel("Log masuk"));
		
		JLabel emel = new JLabel("Emel: ");
		pane.add(emel);
		emelInput = new JTextField(20);
	    pane.add(emelInput);
	    JLabel password = new JLabel("Kata laluan: ");
		pane.add(password);
		passwordInput = new JPasswordField(10);
		pane.add(passwordInput);
		
		masuk = new JButton("Log masuk");
		pane.add(masuk);
		masuk.addActionListener(this);
		//add code for user that forgot log in detail
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		 // need to invoke a pop-up for failed sign in or stay at same windows with error message print out
	}
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignIn();
		
	}

}
