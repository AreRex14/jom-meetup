import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppActivity3 extends App implements ActionListener {
	JButton meetup1, meetup2;
	
	public AppActivity3() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		JLabel h1 = new JLabel("Pilih meetup yang ingin disunting.");
		pane.add(h1);
		h1.setBounds(380, 80, 250, 30);
		
		meetup1 = new JButton("Pengenalan kepada Java.");
		pane.add(meetup1);
		meetup1.setBounds(350, 120, 250, 30);
		meetup1.addActionListener(this);
		
		meetup2 = new JButton("Pengenalan kepada Swing GUI.");
		pane.add(meetup2);
		meetup2.setBounds(350, 170, 250, 30);
		meetup2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();

		if (obj == tetapan) {
			this.setVisible(false);
		    new Settings().setVisible(true);
		}
		else if (obj == meetups) {
			this.setVisible(true);
		}
		else {
			this.setVisible(false);
		    new AppActivity4().setVisible(true);
		}
		  
	}
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppActivity3();
	}

}
