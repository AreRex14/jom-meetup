import java.awt.*;
import javax.swing.*;

public class AppActivity3 extends JFrame {

	public AppActivity3() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		JButton tetapan = new JButton("Tetapan");
		pane.add(tetapan);
		JTextField cari = new JTextField("Cari...");
		pane.add(cari);
		
		pane.add(new JLabel("Langkah 2..."));
		pane.add(new JLabel("Di mana lokasi sesi anda?"));
		// add list of lab locations to book
		JButton terus = new JButton("Seterusnya");
		pane.add(terus);
	}

}
