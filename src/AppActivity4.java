import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppActivity4 extends JFrame implements ActionListener {
	JButton tetapan, cari, terus;
	JTextField carian;
	// add textarea component for meetup desc
	
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
		// add a text area for user to insert meetup long description
		JButton terus = new JButton("Seterusnya");
		pane.add(terus);
		terus.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppActivity4();
	}

}
