import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignIn extends MainFrame implements ActionListener{
	private JTextField emelInput;
	private JPasswordField passwordInput;
	private JButton masuk;
	
	protected String email, pass; // need to declared as private for real
	
	public SignIn() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
	
		JLabel logIn = new JLabel("Log masuk");
		pane.add(logIn);
		logIn.setBounds(225, 100, 230, 30);
		
		JLabel emel = new JLabel("Emel: ");
		pane.add(emel);
		emelInput = new JTextField(20);
		emel.setBounds(125, 150, 150, 30);
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
		email = emelInput.getText();
		pass  = new String(passwordInput.getPassword());
		
		this.setVisible(false);
	    new AppActivity().setVisible(true);
	}
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignIn();
		
	}

}
