import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
// import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;

public class AppActivity5 extends App implements ActionListener {
	private JTextArea penerangan, peraturan;
	private JLabel tajuk, penganjur, lokasi, tarikh;
	
	private String inputfname, inputlname, inputmail, inputpass, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules;
	
	public AppActivity5(String regEmail, String regPass, String regfname, String reglname, String regTitle, String regOrg, String regLoc, String regDate, String regDesc, String regRules) {
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
		
		JLabel h1 = new JLabel("Ini dia info meetup anda...");
		pane.add(h1);
		h1.setBounds(50, 100, 200, 30);
		
		JLabel s1 = new JLabel("Tajuk:");
		pane.add(s1);
		s1.setBounds(70, 130, 250, 30);
		
		tajuk = new JLabel("");
		pane.add(tajuk);
		tajuk.setBounds(70, 160, 250, 30);
		tajuk.setText(inputTitle);
		
		JLabel s2 = new JLabel("Penganjur:");
		pane.add(s2);
		s2.setBounds(70, 190, 250, 30);
		
		penganjur = new JLabel("");
		pane.add(penganjur);
		penganjur.setBounds(70, 210, 250, 30);
		penganjur.setText(inputOrg);
		
		JLabel s3 = new JLabel("Lokasi:");
		pane.add(s3);
		s3.setBounds(70, 240, 250, 30);
		
		lokasi = new JLabel("");
		pane.add(lokasi);
		lokasi.setBounds(70, 270, 50, 30);
		lokasi.setText(inputLoc);
	
		JLabel s5 = new JLabel("Tarikh:");
		pane.add(s5);
		s5.setBounds(70, 300, 250, 30);
		
		tarikh = new JLabel("");
		pane.add(tarikh);
		tarikh.setBounds(70, 330, 50, 30);
		tarikh.setText(inputDate);
		
		JLabel s4 = new JLabel("Info meetup:");
		pane.add(s4);
		s4.setBounds(550, 130, 250, 30);
		
		penerangan = new JTextArea(15,30);
		pane.add(penerangan); 
		penerangan.setBounds(550, 160, 350, 150);
		penerangan.setText(inputDesc);
	
		
		JLabel s6 = new JLabel("Peraturan: ");
		pane.add(s6);
		s6.setBounds(550, 310, 250, 30);
		
		peraturan = new JTextArea(15, 30);
		pane.add(peraturan);
		peraturan.setBounds(550, 340, 350, 150);
		peraturan.setText(inputRules);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();

		if (obj == tetapan) {
			this.setVisible(false);
		    new Settings(inputfname, inputlname, inputmail, inputpass, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules).setVisible(true);
		}
		else {
			this.setVisible(true);
			new AppActivity3(inputfname, inputlname, inputmail, inputpass, inputTitle, inputOrg, inputLoc, inputDate, inputDesc, inputRules).setVisible(true);
		}
		 
	}
	
	/* for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppActivity5();
	}
	*/

}
