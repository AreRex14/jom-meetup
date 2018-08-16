import java.awt.*;
import javax.swing.*;

public class AppActivity2 extends JFrame {

	public AppActivity2() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		JButton tetapan = new JButton("Tetapan");
		pane.add(tetapan);
		JTextField cari = new JTextField("Cari...");
		pane.add(cari);
		
		pane.add(new JLabel("Langkah 1..."));
		pane.add(new JLabel("Apa tajuk sesi meetup anda?"));
		JTextField tajuk = new JTextField(30);
		pane.add(tajuk);
		JButton terus = new JButton("Seterusnya");
		pane.add(terus);
	}

}
