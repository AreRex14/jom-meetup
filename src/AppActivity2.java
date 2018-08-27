import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class AppActivity2 extends App implements ActionListener {
	private JButton terus;
	private JTextField tajuk, penganjur, tarikh;	
	private JComboBox makmalInput;
	private JTextArea penerangan, peraturan;
	private JLabel lokasi;
	
	protected String title, organizer, location, desc, date, rules;
	
	public AppActivity2() {
		// TODO Auto-generated constructor stub
		
		Container pane = getContentPane();
		
		JLabel h1 = new JLabel("Langkah 1...");
		pane.add(h1);
		h1.setBounds(50, 100, 200, 30);
		
		JLabel s1 = new JLabel("Apa tajuk sesi meetup anda?");
		pane.add(s1);
		s1.setBounds(70, 130, 250, 30);
		
		tajuk = new JTextField(30);
		pane.add(tajuk);
		tajuk.setBounds(70, 160, 250, 30);
		
		JLabel h2 = new JLabel("Langkah 2...");
		pane.add(h2);
		h2.setBounds(50, 190, 250, 30);
		
		JLabel s2 = new JLabel("Siapakah penganjurnya?");
		pane.add(s2);
		s2.setBounds(70, 210, 250, 30);
		
		penganjur = new JTextField(30);
		pane.add(penganjur);
		penganjur.setBounds(70, 240, 250, 30);
		

		JLabel h3 = new JLabel("Langkah 3...");
		pane.add(h3);
		h3.setBounds(50, 270, 250, 30);
		
		JLabel s3 = new JLabel("Di mana lokasi yang dirancang?");
		pane.add(s3);
		s3.setBounds(70, 290, 250, 30);
		
		String makmal[] = {"mk1","mk2","mk3","mk4","mk5"};
		makmalInput = new JComboBox(makmal);
		pane.add(makmalInput);
		makmalInput.setBounds(70, 320, 50, 30);
		

		JLabel h4 = new JLabel("Langkah 4...");
		pane.add(h4);
		h4.setBounds(50, 350, 250, 30);
		
		JLabel s4 = new JLabel("Terangkan siapa patut sertai dan apa aktiviti yang dirancang?");
		pane.add(s4);
		s4.setBounds(70, 370, 350, 30);
		
		penerangan = new JTextArea(15,30);
		pane.add(penerangan); 
		penerangan.setBounds(70, 400, 350, 150);
		

		JLabel h5 = new JLabel("Langkah 5...");
		pane.add(h5);
		h5.setBounds(550, 100, 200, 30);
		
		JLabel s5 = new JLabel("Bilakah hendak dianjurkan?");
		pane.add(s5);
		s5.setBounds(550, 130, 250, 30);
		
		tarikh = new JTextField("dd/mm/yyyy", 30);
		pane.add(tarikh);
		tarikh.setBounds(550, 160, 70, 30);
		

		JLabel h6 = new JLabel("Langkah 6...");
		pane.add(h6);
		h6.setBounds(550, 190, 250, 30);
		
		JLabel s6 = new JLabel("Ada peraturan? Sila nyatakan...");
		pane.add(s6);
		s6.setBounds(550, 210, 250, 30);
		peraturan = new JTextArea(15, 30);
		pane.add(peraturan);
		peraturan.setBounds(550, 240, 350, 150);
		
		terus = new JButton("Teruskan");
		pane.add(terus);
		terus.setBounds(550, 520, 100, 30);
		terus.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();

		if (obj == terus) {
			title = tajuk.getText();
			organizer = penganjur.getText();
			location  = (String) makmalInput.getItemAt(makmalInput.getSelectedIndex());
			desc = penerangan.getText();
			
			date = tarikh.getText();
		    Date date1 = null;
			try {
				date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  
		    
		    rules = peraturan.getText();
		    
		    tajuk.setText(title);
			penganjur.setText(organizer);
			lokasi.setText(location);
			lokasi.setBounds(100, 320, 50, 30);
			penerangan.setText(desc);
			date = date + "\t"+date1;
			tarikh.setText(date);
			
			this.setVisible(false);
		    new AppActivity4().setVisible(true);
		}
		else if (obj == tetapan) {
			this.setVisible(false);
		    new Settings().setVisible(true);
		}
		else {
			this.setVisible(false);
			new AppActivity4().setVisible(true);
		}
	}
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppActivity2();
	}
}
