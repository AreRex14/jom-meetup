import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
// import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;

public class AppActivity3 extends App implements ActionListener{
	JButton terus;
	JComboBox makmalInput;
	
	private String location;
	
	public AppActivity3() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		JLabel step2 = new JLabel("Langkah 2...");
		pane.add(step2);
		step2.setBounds(130, 100, 200, 30);
		
		JLabel b1 = new JLabel("Di mana lokasi sesi anda?");
		pane.add(b1);
		b1.setBounds(150, 130, 250, 30);
		
		String makmal[] = {"mk1","mk2","mk3","mk4","mk5"};
		makmalInput = new JComboBox(makmal);
		pane.add(makmalInput);
		makmalInput.setBounds(150, 160, 50, 30);
		
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
			String makmal  = (String) makmalInput.getItemAt(makmalInput.getSelectedIndex());
		}
		 
	}
	
	// for testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppActivity3();
	}
}
