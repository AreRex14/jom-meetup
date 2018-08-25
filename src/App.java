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
		// tetapan.addActionListener(arg0);
		carian = new JTextField("Cari...");
		pane.add(carian);
		cari = new JButton("Cari");
		pane.add(cari);
		// cari.addActionListener(arg0);
	}
}
