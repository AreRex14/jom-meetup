import java.awt.*;
import javax.swing.*;

public class AppActivity4 extends JFrame {

	public AppActivity4() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		JButton tetapan = new JButton("Tetapan");
		pane.add(tetapan);
		JTextField cari = new JTextField("Cari...");
		pane.add(cari);
		
		pane.add(new JLabel("Langkah 3..."));
		pane.add(new JLabel("Terangkan siapa patut sertai dan apa aktiviti yang dirancang?"));
		// add a text area for user to insert meetup long description
		JButton terus = new JButton("Seterusnya");
		pane.add(terus);
	}

}
