import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppActivity5 extends JFrame implements ActionListener{
	JButton tetapan, cari, setuju;
	JTextField carian;
	
	public AppActivity5() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		// try build the layout on MainFrame only, this is just for test view
		setLayout(new FlowLayout());
		setSize(500, 500);
		setLocation(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// try build a separate module or component for settings and search bar
		tetapan = new JButton("Tetapan");
		pane.add(tetapan);
		// tetapan.addActionListener(arg0);
		carian = new JTextField("Cari...");
		pane.add(carian);
		cari = new JButton("Cari");
		pane.add(cari);
		// cari.addActionListener(arg0);
		
		pane.add(new JLabel("Langkah 4..."));
		pane.add(new JLabel("Apa maksud menjadi sebahagian daripada Meetup"));
		// add texts for Jom Meetup rules and values to be follow by organizer
		JButton setuju = new JButton("Setuju dan teruskan");
		pane.add(setuju);
		setuju.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		if (obj == tetapan) {
			
		}
		else if (obj == cari) {
			
		}
		else {
			
		}
	}
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppActivity5();
	}

}
