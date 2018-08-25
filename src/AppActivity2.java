import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppActivity2 extends App implements ActionListener {
	JButton terus;
	JTextField tajuk, penganjur;
	
	private String title, organizer;
	
	public AppActivity2() {
		// TODO Auto-generated constructor stub
		
		Container pane = getContentPane();
		
		JLabel step1 = new JLabel("Langkah 1...");
		pane.add(step1);
		step1.setBounds(130, 100, 200, 30);
		
		JLabel a1 = new JLabel("Apa tajuk sesi meetup anda?");
		pane.add(a1);
		a1.setBounds(150, 130, 250, 30);
		
		tajuk = new JTextField(30);
		pane.add(tajuk);
		tajuk.setBounds(150, 160, 250, 30);
		
		terus = new JButton("Seterusnya");
		pane.add(terus);
		terus.setBounds(150, 210, 100, 30);
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
			
		}
	}
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppActivity2();
	}
}
