import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppActivity extends App implements ActionListener{
	JButton mula;
	JTextField carian;
	
	private String coc; // code of conducts
	
	public AppActivity() {
		Container pane = getContentPane();
		
		mula = new JButton("Mulakan meetup baru");
		pane.add(mula);
		mula.setBounds(120, 100, 250, 30);
		mula.addActionListener(this);
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
		new AppActivity();
	}

}
