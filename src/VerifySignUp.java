import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerifySignUp extends MainFrame implements ActionListener {
	// private JLabel status;
	private JButton masuk;
	
	public VerifySignUp() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		JLabel h1 = new JLabel("Kami sudah menghantar kod verifikasi ke emel anda.");
		pane.add(h1);
		h1.setBounds(95, 90, 500, 30);
		
		JLabel h2 = new JLabel("Ia mungkin mengambil masa. Semak peti masuk emel anda.");
		pane.add(h2);
		h2.setBounds(75, 120, 500, 30);
		
		masuk = new JButton("Log masuk");
		pane.add(masuk);
		masuk.setBounds(170, 300, 150, 30);
		masuk.addActionListener(this);
		
		// status = new JLabel("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
		this.setVisible(false);
		new SignIn().setVisible(true); // VerifySignUp Form to show after SignUp window
		
	}
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VerifySignUp();
		
	}
}
