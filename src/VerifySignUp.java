import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerifySignUp extends MainFrame implements ActionListener {
	JTextField kod;
	JLabel status;
	JButton sahkan;
	
	private String code;
	
	public VerifySignUp() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		JLabel h1 = new JLabel("Kami sudah menghantar kod verifikasi ke emel anda.");
		pane.add(h1);
		h1.setBounds(95, 90, 500, 30);
		
		JLabel h2 = new JLabel("Ia mungkin mengambil masa. Semak peti masuk emel anda.");
		pane.add(h2);
		h2.setBounds(75, 120, 500, 30);
		
		JLabel enter = new JLabel("Masukkan kod: ");
		pane.add(enter);
		enter.setBounds(205, 220, 150, 30);
		
		kod = new JTextField(6);
		pane.add(kod);
		kod.setBounds(145, 250, 200, 30);
		
		sahkan = new JButton("Sahkan");
		pane.add(sahkan);
		sahkan.setBounds(170, 300, 150, 30);
		sahkan.addActionListener(this);
		
		status = new JLabel("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		status.setText("Kod tidak sah");
	}
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VerifySignUp();
		
	}

}
