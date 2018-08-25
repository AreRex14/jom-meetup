import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppActivity4 extends App implements ActionListener {
	JButton terus;
	JTextArea penerangan;
	// add JLabel to view JTextArea output characters count
	
	private String desc;
	
	public AppActivity4() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
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
