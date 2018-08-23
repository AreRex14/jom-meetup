import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignIn extends JFrame implements ActionListener{
	JTextField emelInput;
	JPasswordField passwordInput;
	JButton masuk;
	
	public SignIn() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		// try build the layout on MainFrame only, this is just for test view
		setLayout(new FlowLayout());
		setLayout(null);
		setSize(500, 500);
		setResizable(false);
		setLocation(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JLabel LogIn = new JLabel("Log masuk");
		pane.add(LogIn);
		LogIn.setBounds(225, 100, 230, 30);
		
		JLabel emel = new JLabel("Emel: ");
		pane.add(emel);
		emel.setBounds(125, 150, 150, 30);
		emelInput = new JTextField(20);
	    pane.add(emelInput);
	    emelInput.setBounds(170, 150, 230, 30);
	    
	    JLabel password = new JLabel("Kata laluan: ");
		pane.add(password);
		password.setBounds(90, 200, 150, 30);
		passwordInput = new JPasswordField(10);
		pane.add(passwordInput);
		passwordInput.setBounds(170, 200, 230, 30);
		
		masuk = new JButton("Log masuk");
		pane.add(masuk);
		masuk.setBounds(250, 250, 150, 30);
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
