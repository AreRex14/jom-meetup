import java.awt.*;
import javax.swing.*;

public class AppActivity5 extends JFrame {

	public AppActivity5() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		JButton tetapan = new JButton("Tetapan");
		pane.add(tetapan);
		JTextField cari = new JTextField("Cari...");
		pane.add(cari);
		
		pane.add(new JLabel("Langkah 4..."));
		pane.add(new JLabel("Apa maksud menjadi sebahagian daripada Meetup"));
		// add texts for Jom Meetup rules and values to be follow by organizer
		JButton setuju = new JButton("Setuju dan teruskan");
		pane.add(setuju);
	}

}
