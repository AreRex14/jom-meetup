import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JTextField;

public abstract class App extends MainFrame {
	JButton tetapan, cari;
	JTextField carian;
	
	// private String searchInput; implement if still has time
	
	public App() {
		Container pane = getContentPane();
		
		tetapan = new JButton("Tetapan");
		pane.add(tetapan);
		tetapan.setBounds(10, 20, 80, 30);
		// tetapan.addActionListener(arg0);
		carian = new JTextField("Cari...");
		pane.add(carian);
		carian.setBounds(260, 20, 150, 30);
		cari = new JButton("Cari");
		pane.add(cari);
		cari.setBounds(410, 20, 60, 30);
		// cari.addActionListener(arg0);
	}
}
