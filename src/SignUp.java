import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.math.BigDecimal;
// import java.util.*; // for String manipulation
import java.sql.*;

public class SignUp extends MainFrame implements ActionListener {
	private JTextField fnameInput, lnameInput, emelInput;
	// private JLabel emelStatus, passwordStatus, password2Status;
	private JPasswordField passwordInput, password2Input;
	private JButton daftar, masuk;
	
	private String fName, lName, email, password, password2, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules; // need to declare as protected so that it can be accessed by other classes, no database yet 
	
	public SignUp() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		JLabel h1 = new JLabel("Perkara pertama...");
		pane.add(h1);
		h1.setBounds(200, 25, 230, 20);
		JLabel h2 = new JLabel("Daftar masuk");
		pane.add(h2);
		h2.setBounds(210, 50, 250, 25);
		
		JLabel fname = new JLabel("Nama pertama: ");
	    pane.add(fname);
	    fname.setBounds(40, 100, 100, 20);
        fnameInput = new JTextField("Arif", 15);
        pane.add(fnameInput);
        fnameInput.setBounds(200, 100, 250, 30);
        
		JLabel lname = new JLabel("Nama terakhir: ");
		pane.add(lname);
		lname.setBounds(40, 150, 100, 30);
		lnameInput = new JTextField("Tukiman", 15);
	    pane.add(lnameInput);
	    lnameInput.setBounds(200, 150, 250, 30);
	    
		JLabel emel = new JLabel("Emel: ");
		pane.add(emel);
		emel.setBounds(40, 200, 200, 30);
		emelInput = new JTextField("example@email.com",20);
	    pane.add(emelInput);
	    emelInput.setBounds(200, 200, 250, 30);
	    // emelStatus = new JLabel("");
	        
		JLabel password = new JLabel("Kata laluan: ");
		pane.add(password);
		password.setBounds(40, 250, 200, 30);
		passwordInput = new JPasswordField(10);
		pane.add(passwordInput);
		passwordInput.setBounds(200, 250, 250, 30);
		// passwordStatus = new JLabel("");
		
		JLabel password2 = new JLabel("Isi semula kata laluan: ");
		pane.add(password2);
		password2.setBounds(40, 300, 200, 30);
		password2Input = new JPasswordField(10);
		pane.add(password2Input);
		password2Input.setBounds(200, 300, 250, 30);
		// password2Status = new JLabel("");
				
		daftar = new JButton("Daftar masuk");
		pane.add(daftar);
		daftar.setBounds(200, 350, 150, 30);
		daftar.addActionListener(this);
		
		masuk = new JButton("Dah daftar! Log masuk sekarang...");
		pane.add(masuk);
		masuk.setBounds(200, 390, 200, 30);
		masuk.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		// assign user input values to variables
		fName = fnameInput.getText();
		lName = lnameInput.getText();
		email = emelInput.getText();
		email = email.toLowerCase();	
		password   = new String(passwordInput.getPassword());
		password2  = new String(password2Input.getPassword());	

		if (obj == daftar) {		
			
			new SignIn(fName,lName,email, password2, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules);
			this.setVisible(false);
		    new VerifySignUp().setVisible(true); // VerifySignUp Form to show after SignUp window
	     
	        // daftar.setText("Anda telah didaftarkan. Yeay!"); window close immediately
		}
		else {
			 this.setVisible(false);
			 new SignIn(fName, lName,email, password2, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules).setVisible(true); // VerifySignUp Form to show after SignUp window
		}
			
		//need to validate email, password, password2 before executing JButton daftar event
   } 
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignUp();
		
	}
	

}
