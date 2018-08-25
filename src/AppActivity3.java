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
		
		// try build the layout on MainFrame only, this is just for test view
		/*
		setLayout(new FlowLayout());
		setSize(500, 500);
		setLocation(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		*/
		
		// try build a separate module or component for settings and search bar
		/*
		tetapan = new JButton("Tetapan");
		pane.add(tetapan);
		// tetapan.addActionListener(arg0);
		carian = new JTextField("Cari...");
		pane.add(carian);
		cari = new JButton("Cari");
		pane.add(cari);
		// cari.addActionListener(arg0);
		*/
		
		pane.add(new JLabel("Langkah 2..."));
		pane.add(new JLabel("Di mana lokasi sesi anda?"));
		
		String makmal[] = {"mk1","mk2","mk3","mk4","mk5"};
		makmalInput = new JComboBox(makmal);
		pane.add(makmalInput);
		
		terus = new JButton("Seterusnya");
		pane.add(terus);
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
