import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignIn extends MainFrame implements ActionListener{
	private JTextField emelInput;
	private JPasswordField passwordInput;
	private JButton masuk;
	private JLabel signInStat;
	
	private String mail, pass, storedMail, storedPass, storedfname, storedlname, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules; // need to declared as private for real
	
	public SignIn(String regfname, String reglname, String regEmail, String regPass, String regTitle, String regOrg, String regLoc, String regDate, String regDesc, String regRules) {
		// TODO Auto-generated constructor stub
		storedMail = regEmail;
		storedPass = regPass;
		storedfname = regfname;
		storedlname = reglname;
		
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
	    emelInput.setText(storedMail);
	    
	    JLabel password = new JLabel("Kata laluan: ");
		pane.add(password);
		password.setBounds(90, 200, 150, 30);
		passwordInput = new JPasswordField(10);
		pane.add(passwordInput);
		passwordInput.setBounds(170, 200, 230, 30);
		// passwordInput.setText(storedPass);
		
		masuk = new JButton("Log masuk");
		pane.add(masuk);
		masuk.setBounds(250, 250, 150, 30);
		masuk.addActionListener(this);
		//add code for user that forgot log in detail
		
		signInStat = new JLabel("");
		pane.add(signInStat);
		signInStat.setBounds(100, 270, 150, 30);
		// signInStat.setText(storedMail + storedPass);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 // need to invoke a pop-up for failed sign in or stay at same windows with error message print out
		//this.setVisible(true);
		// Object obj = e.getSource();
		
		// get email and password recently signing up from SignUp class
		// compare with the given user input
		
		
		mail = emelInput.getText();
		pass  = new String(passwordInput.getPassword());
		
		this.setVisible(false);
		new AppActivity(storedfname, storedlname, storedMail, storedPass, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules).setVisible(true);
		
		// validateCredentials(mail, pass);
		
		/*
		if (obj == masuk) {
			mail = emelInput.getText();
			pass  = new String(passwordInput.getPassword());
			
			if(mail == storedMail && pass == storedPass) {
				this.setVisible(false);
				new AppActivity().setVisible(true);
			} else {
				this.setVisible(true);
				signInStat.setText("Invalid credentials provided!");
			} 
		}
		*/	
	}
	
	/*
	public void validateCredentials(String getMail, String getPass) {
		if(getMail != storedMail || getPass != storedPass) {
			emelInput.setText("");
			passwordInput.setText("");
			signInStat.setText("Invalid credentials provided!");
		} else {
			emelInput.setText(getMail);
			passwordInput.setText(getPass);
			this.setVisible(false);
			new AppActivity().setVisible(true);
		} 
	}
	*/
	
	// for testing purpose
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignIn();
		
	}
	*/

}
