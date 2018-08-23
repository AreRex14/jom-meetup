import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppActivity extends JFrame implements ActionListener{
	JButton tetapan, cari, mula;
	JTextField carian;
	
	public AppActivity() {
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
		
		mula = new JButton("Mulakan meetup baru");
		pane.add(mula);
		mula.setBounds(120, 100, 250, 30);
		mula.addActionListener(this);
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
		new AppActivity();
	}

}
