import java.awt.*;
import javax.swing.*;

public class SignIn extends JFrame {

	public SignIn() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
	
		pane.add(new JLabel("Log masuk"));
		
		JLabel emel = new JLabel("Emel: ");
		pane.add(emel);
		JTextField emelInput = new JTextField(20);
	    pane.add(emelInput);
	    JLabel password = new JLabel("Kata laluan: ");
		pane.add(password);
		JPasswordField passwordInput = new JPasswordField(10);
		pane.add(passwordInput);
		
		JButton masuk = new JButton("Log masuk");
		pane.add(masuk);
		//add code for user that forgot log in detail
	}

}
