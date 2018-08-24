import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppActivity4 extends App implements ActionListener {
	JButton tetapan, cari, terus;
	JTextField carian;
	JTextArea penerangan;
	// add JLabel to view JTextArea output characters count
	
	public AppActivity4() {
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
		
		pane.add(new JLabel("Langkah 3..."));
		pane.add(new JLabel("Terangkan siapa patut sertai dan apa aktiviti yang dirancang?"));
		penerangan = new JTextArea(15,30);
		pane.add(penerangan); 
		JButton terus = new JButton("Seterusnya");
		pane.add(terus);
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
			String desc = penerangan.getText();   
		    // l2.setText("Characters: "+desc.length()); for characters count
			// need to notify user if characters count are not enough
		}
		  
	}
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppActivity4();
	}

}
