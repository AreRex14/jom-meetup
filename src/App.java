import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JTextField;

public abstract class App extends MainFrame implements ActionListener {
	protected JButton tetapan, meetups;
	// protected JButton cari; not implemented 
	// protected JTextField carian; not implemented
	
	// private String searchInput; implement if still has time
	
	public App() {
		setSize(1000, 700);
		setLocation(100,10);
		
		Container pane = getContentPane();
		
		tetapan = new JButton("Tetapan");
		pane.add(tetapan);
		tetapan.setBounds(10, 20, 80, 30);
		tetapan.addActionListener(this);
		
		meetups = new JButton("Senarai meetup");
		pane.add(meetups);
		meetups.setBounds(800, 20, 150, 30);
		meetups.addActionListener(this);
		
		/* not enough time to implement
		carian = new JTextField("Cari...");
		pane.add(carian);
		carian.setBounds(260, 20, 150, 30);
		cari = new JButton("Cari");
		pane.add(cari);
		cari.setBounds(410, 20, 60, 30);
		cari.addActionListener(arg0);
		 */
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
