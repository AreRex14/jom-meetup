import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppActivity4 extends JFrame implements ActionListener {
	JButton tetapan, cari, terus;
	JTextField carian;
	JTextArea penerangan;
	// add JLabel to view JTextArea output characters count
	
	public AppActivity4() {
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
		
		JLabel step3 = new JLabel("Langkah 3...");
		pane.add(step3);
		step3.setBounds(50, 100, 200, 30);
		
		JLabel c1 = new JLabel("Terangkan siapa patut sertai dan apa aktiviti yang dirancang?");
		pane.add(c1);
		c1.setBounds(80, 130, 500, 30);
		
		penerangan = new JTextArea(15,30);
		pane.add(penerangan); 
		penerangan.setBounds(80, 160, 350, 150);
		JButton terus = new JButton("Seterusnya");
		pane.add(terus);
		terus.setBounds(80, 330, 100, 30);
		terus.addActionListener(this);
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
			// text area
			String text=penerangan.getText();   
		    // l2.setText("Characters: "+text.length()); for characters count
			// need to notify user if characters count are not enough
		}
		  
	}
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppActivity4();
	}

}
