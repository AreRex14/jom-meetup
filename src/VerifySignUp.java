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
		setSize(500, 500);
		setLocation(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		pane.add(new JLabel("Kami sudah menghantar kod verifikasi ke emel anda."));
		pane.add(new JLabel("Ia mungkin mengambil masa. Semak peti masuk emel anda."));
		
		pane.add(new JLabel("Masukkan kod: "));
		kod = new JTextField(6);
		pane.add(kod);
		
		sahkan = new JButton("Sahkan");
		pane.add(sahkan);
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
