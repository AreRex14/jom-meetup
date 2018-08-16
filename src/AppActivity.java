import java.awt.*;
import javax.swing.*;

public class AppActivity extends JFrame {
	
	public AppActivity() {
		Container pane = getContentPane();
		
		JButton tetapan = new JButton("Tetapan");
		pane.add(tetapan);
		JTextField cari = new JTextField("Cari...");
		pane.add(cari);
		
		JButton mula = new JButton("Mulakan meetup baru");
		pane.add(mula);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
