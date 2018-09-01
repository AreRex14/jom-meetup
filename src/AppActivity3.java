import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppActivity3 extends App implements ActionListener {
	JButton meetup1, meetup2;
	
	private String inputfname, inputlname, inputmail, inputpass, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules;
	
	public AppActivity3(String regEmail, String regPass, String regfname, String reglname, String regTitle, String regOrg, String regLoc, String regDate, String regDesc, String regRules) {
		// TODO Auto-generated constructor stub
		inputfname = regfname;
		inputlname = reglname;
		inputmail  = regEmail;
		inputpass   = regPass;
		inputTitle  = regTitle;
		inputOrg    = regOrg;
		inputLoc    = regLoc;
		inputDate   = regDate;
		inputDesc   = regDesc;
		inputRules  = regRules;
		
		
		Container pane = getContentPane();
		
		JLabel h1 = new JLabel("Pilih meetup yang ingin disunting.");
		pane.add(h1);
		h1.setBounds(380, 80, 250, 30);
		
		meetup1 = new JButton("Ex meetup 1: Pengenalan kepada Java.");
		pane.add(meetup1);
		meetup1.setBounds(350, 120, 250, 30);
		meetup1.addActionListener(this);
		
		meetup2 = new JButton("Ex meetup 2: Pengenalan kepada Swing GUI.");
		pane.add(meetup2);
		meetup2.setBounds(350, 170, 250, 30);
		meetup2.addActionListener(this);
		meetup2.setText(inputTitle);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();

		if (obj == tetapan) {
			this.setVisible(false);
		    new Settings(inputfname, inputlname, inputmail, inputpass, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules).setVisible(true);
		}
		else if (obj == meetups) {
			this.setVisible(true);
		}
		else {
			this.setVisible(false);
		    new AppActivity4(inputfname, inputlname, inputmail, inputpass, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules).setVisible(true);
		}
		  
	}
	
	/* for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppActivity3();
	}
	*/
}
