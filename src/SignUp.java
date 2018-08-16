import java.awt.*;
import javax.swing.*;

public class SignUp extends JFrame {
	private String fname, lname, emel, password;
	
	public SignUp() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		pane.add(new JLabel("Perkara pertama..."));
		pane.add(new JLabel("Daftar masuk"));
		
		JLabel fname = new JLabel("Nama pertama: ");
	    pane.add(fname);
        JTextField fnameInput = new JTextField(15);
        pane.add(fnameInput);
        
		JLabel lname = new JLabel("Nama terakhir: ");
		pane.add(lname);
		JTextField lnameInput = new JTextField(15);
	    pane.add(lnameInput);
	    
		JLabel emel = new JLabel("Emel: ");
		pane.add(emel);
		JTextField emelInput = new JTextField(20);
	    pane.add(emelInput);
	        
		JLabel password = new JLabel("Kata laluan: ");
		pane.add(password);
		JPasswordField passwordInput = new JPasswordField(10);
		pane.add(passwordInput);
		
		JLabel password2 = new JLabel("Isi semula kata laluan: ");
		pane.add(password2);
		JPasswordField password2Input = new JPasswordField(10);
		pane.add(password2Input);
		
		JButton daftar = new JButton("Daftar masuk");
		pane.add(daftar);
		//add line for user already sign up
	}
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame testFrame = new SignUp();
		
		testFrame.setLayout(new BorderLayout());
		testFrame.setSize(500, 500);
		testFrame.setLocation(500, 100);
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testFrame.setVisible(true);
	}

}
