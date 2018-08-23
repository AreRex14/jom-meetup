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
		setLayout(null);
		setSize(500, 500);
		setLocation(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// try build a separate module or component for settings and search bar
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
		
		JLabel step4 = new JLabel("Langkah 4...");
		pane.add(step4);
		step4.setBounds(50, 100, 200, 30);
		
		JLabel d1 = new JLabel("Apa maksud menjadi sebahagian daripada Meetup");
		pane.add(d1);
		d1.setBounds(80, 130, 500, 30);
		// add texts for Jom Meetup rules and values to be follow by organizer
		
		JButton setuju = new JButton("Setuju dan teruskan");
		pane.add(setuju);
		setuju.setBounds(80, 330, 180, 30);
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
