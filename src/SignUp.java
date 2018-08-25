import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*; // for String manipulation

public class SignUp extends MainFrame implements ActionListener {
	JTextField fnameInput, lnameInput, emelInput;
	JLabel emelStatus, passwordStatus, password2Status;
	JPasswordField passwordInput, password2Input;
	JButton daftar;
	
	private String fName, lName, email, pass, pass2;
	
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
	    emelStatus = new JLabel("");
	        
		JLabel password = new JLabel("Kata laluan: ");
		pane.add(password);
		password.setBounds(40, 250, 200, 30);
		passwordInput = new JPasswordField(10);
		pane.add(passwordInput);
		passwordInput.setBounds(200, 250, 250, 30);
		passwordStatus = new JLabel("");
		
		JLabel password2 = new JLabel("Isi semula kata laluan: ");
		pane.add(password2);
		password2.setBounds(40, 300, 200, 30);
		password2Input = new JPasswordField(10);
		pane.add(password2Input);
		password2Input.setBounds(200, 300, 250, 30);
		password2Status = new JLabel("");
		
		daftar = new JButton("Daftar masuk");
		pane.add(daftar);
		daftar.setBounds(170, 370, 150, 30);
		daftar.addActionListener(this);
		//add line for user already sign up
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			String fname, lname, emel;
			char[] password, password2;
			
			fname = fnameInput.getText();
			lname = lnameInput.getText();
			emel = emelInput.getText();
			password  = passwordInput.getPassword();
			password2  = password2Input.getPassword();
			
			emel = emel.toLowerCase();
		/*
		 * need to validate email, password, password2 before executing JButton daftar event
		 emelStatus.setText("Emel tidak sah");
		 passwordStatus.setText("Kata laluan tidak menepati piawaian");
		 password2Status.setText("Kata laluan tidak sama");
		 
		 // need to invoke a pop-up for failed sign up or stay at same windows with error message print out
		 
           if ( )
          {

               try
              {

                  
               }
         catch (Exception ex)
               {

                   System.out.println(ex);

               }

           }
         else
          {

               JOptionPane.showMessageDialog(daftar, "");

           } 


       

           fnameInput.setText("");

           lnameInput.setText("");

           emelInput.setText("");

           passwordInput.setText("");

           password2Input.setText("");
	*/
   } 
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignUp();
		
	}
 

}
