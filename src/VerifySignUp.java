import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerifySignUp extends JFrame implements ActionListener {
	JTextField kod;
	JLabel status;
	JButton sahkan;
	
	public VerifySignUp() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		// try build the layout on MainFrame only, this is just for test view
		setLayout(new FlowLayout());
		setLayout(null);
		setSize(500, 500);
		setLocation(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JLabel verify1 = new JLabel("Kami sudah menghantar kod verifikasi ke emel anda.");
		pane.add(verify1);
		verify1.setBounds(95, 90, 500, 30);
		
		JLabel verify2 = new JLabel("Ia mungkin mengambil masa. Semak peti masuk emel anda.");
		pane.add(verify2);
		verify2.setBounds(75, 120, 500, 30);
		
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
