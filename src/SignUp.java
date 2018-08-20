import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {
	JTextField fnameInput, lnameInput, emelInput;
	JPasswordField passwordInput, password2Input;
	JButton daftar;
	
	public SignUp() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		// try build the layout on MainFrame only, this is just for test view
		setLayout(new FlowLayout());
		setSize(500, 500);
		setLocation(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		pane.add(new JLabel("Perkara pertama..."));
		pane.add(new JLabel("Daftar masuk"));
		
		JLabel fname = new JLabel("Nama pertama: ");
	    pane.add(fname);
        fnameInput = new JTextField(15);
        pane.add(fnameInput);
        
		JLabel lname = new JLabel("Nama terakhir: ");
		pane.add(lname);
		lnameInput = new JTextField(15);
	    pane.add(lnameInput);
	    
		JLabel emel = new JLabel("Emel: ");
		pane.add(emel);
		emelInput = new JTextField(20);
	    pane.add(emelInput);
	        
		JLabel password = new JLabel("Kata laluan: ");
		pane.add(password);
		passwordInput = new JPasswordField(10);
		pane.add(passwordInput);
		
		JLabel password2 = new JLabel("Isi semula kata laluan: ");
		pane.add(password2);
		password2Input = new JPasswordField(10);
		pane.add(password2Input);
		
		daftar = new JButton("Daftar masuk");
		pane.add(daftar);
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
		/*
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
