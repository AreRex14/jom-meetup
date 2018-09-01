import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppActivity extends App implements ActionListener{
	JButton mula;
	JTextField carian;
	
	private String inputfname, inputlname, inputmail, inputpass, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules;
	// private String coc; // code of conducts
	
	public AppActivity(String regEmail, String regPass, String regfname, String reglname, String regTitle, String regOrg, String regLoc, String regDate, String regDesc, String regRules) {
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
		
		mula = new JButton("Mulakan meetup baru");
		pane.add(mula);
		mula.setBounds(350, 100, 250, 30);
		mula.addActionListener(this);
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
			new AppActivity3(inputfname, inputlname, inputmail, inputpass,  inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules).setVisible(true);
		}
		else {
			this.setVisible(false);
		    new AppActivity2(inputfname, inputlname, inputmail, inputpass).setVisible(true);
		}

	}
	/* for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppActivity(inputfname, inputlname, inputmail, inputpass);
	}
	*/

}
