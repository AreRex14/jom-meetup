import java.awt.*;
import javax.swing.*;

public class VerifySignUp extends JFrame {

	public VerifySignUp() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		pane.add(new JLabel("Kami sudah menghantar kod verifikasi ke emel anda."));
		pane.add(new JLabel("Ia mungkin mengambil masa. Semak peti masuk emel anda."));
		
		pane.add(new JLabel("Masukkan kod: "));
		JTextField kod = new JTextField(6);
		pane.add(kod);
		
		JButton sahkan = new JButton("Sahkan");
		pane.add(sahkan);
	}

}
