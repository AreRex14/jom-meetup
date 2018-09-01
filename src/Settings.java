import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Settings extends App implements ActionListener {
	
	private JTextField fnameInput, lnameInput, emelInput;
	private JPasswordField passwordInput, password2Input;
	private JLabel emelStatus, passwordStatus, password2Status, suntingStatus;
	private JButton sunting;
	
	private String fName, lName, email, pass, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules; // may need to use super()
	
	public Settings(String regEmail, String regPass, String regfname, String reglname,  String regTitle, String regOrg, String regLoc, String regDate, String regDesc, String regRules) {
		// TODO Auto-generated constructor stub
		fName = regfname;
		lName = reglname;
		email  = regEmail;
		pass   = regPass;
		inputTitle  = regTitle;
		inputOrg    = regOrg;
		inputLoc    = regLoc;
		inputDate   = regDate;
		inputDesc   = regDesc;
		inputRules  = regRules;
		
		Container pane = getContentPane();
		
		JLabel h1 = new JLabel("Sunting maklumat anda...");
		pane.add(h1);
		h1.setBounds(210, 50, 250, 25);
		
		JLabel fname = new JLabel("Nama pertama: ");
	    pane.add(fname);
	    fname.setBounds(40, 100, 100, 20);
        fnameInput = new JTextField(15);
        pane.add(fnameInput);
        fnameInput.setBounds(200, 100, 250, 30);
        fnameInput.setText(fName);
        
		JLabel lname = new JLabel("Nama terakhir: ");
		pane.add(lname);
		lname.setBounds(40, 150, 100, 30);
		lnameInput = new JTextField(15);
	    pane.add(lnameInput);
	    lnameInput.setBounds(200, 150, 250, 30);
	    lnameInput.setText(lName);
	    
		JLabel emel = new JLabel("Emel: ");
		pane.add(emel);
		emel.setBounds(40, 200, 200, 30);
		emelInput = new JTextField(20);
	    pane.add(emelInput);
	    emelInput.setBounds(200, 200, 250, 30);
	    emelInput.setText(email);
	    // emelStatus = new JLabel("");
	        
		JLabel password = new JLabel("Kata laluan asal: ");
		pane.add(password);
		password.setBounds(40, 250, 200, 30);
		passwordInput = new JPasswordField(10);
		pane.add(passwordInput);
		passwordInput.setBounds(200, 250, 250, 30);
		// passwordStatus = new JLabel("");
		
		JLabel password2 = new JLabel("Kata laluan baru: ");
		pane.add(password2);
		password2.setBounds(40, 300, 200, 30);
		password2Input = new JPasswordField(10);
		pane.add(password2Input);
		password2Input.setBounds(200, 300, 250, 30);
		password2Status = new JLabel("");
					
		sunting = new JButton("Sunting");
		pane.add(sunting);
		sunting.setBounds(170, 370, 150, 30);
		sunting.addActionListener(this);
		//add line for user already sign up
		
		suntingStatus = new JLabel("");
		pane.add(suntingStatus);
		suntingStatus.setBounds(170, 390, 200, 30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		if (obj == meetups) {
			this.setVisible(false);
		    new AppActivity3(fName, lName, email, pass, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules).setVisible(true);
		} else {
			this.setVisible(true);
			fName = fnameInput.getText();
			lName = lnameInput.getText();
			email = emelInput.getText();
			pass  = new String(password2Input.getPassword());
			
			suntingStatus.setText("Maklumat telah dikemaskini");
		}
			
	}
	
	/* for testing this window only
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Settings();
	}
	*/

}
