import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppActivity5 extends App implements ActionListener{
	JButton setuju;
	JTextArea peraturan;
	
	private String rules;
	
	public AppActivity5() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		JLabel step4 = new JLabel("Langkah 4...");
		pane.add(step4);
		step4.setBounds(50, 100, 200, 30);
		
		JLabel d1 = new JLabel("Apa maksud menjadi sebahagian daripada Meetup");
		pane.add(d1);
		d1.setBounds(80, 130, 500, 30);
		// add texts for Jom Meetup rules and values to be follow by organizer
		
		// Below componnets not yet properly layout
		JLabel d2 = new JLabel("Ada peraturan anda sendiri? Sila nyatakan...");
		pane.add(d2);
		d2.setBounds(90, 160, 200, 20);
		peraturan = new JTextArea(15, 30);
		pane.add(peraturan);
		peraturan.setBounds(100, 180, 200, 20);
		
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
