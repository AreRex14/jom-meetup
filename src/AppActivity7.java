import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppActivity7 extends App{
	
	public AppActivity7() {
		// TODO Auto-generated constructor stub
		Container pane = getContentPane();
		
		JLabel h1 = new JLabel("Ini dia info meetup anda...");
		pane.add(h1);
		h1.setBounds(210, 50, 250, 25);
		
		JLabel topic = new JLabel("Topik: ");
	    pane.add(topic);
	    topic.setBounds(40, 100, 100, 20);
        JLabel topicOutput = new JLabel("");
        pane.add(topicOutput);
        topicOutput.setBounds(200, 100, 250, 30);
        
		JLabel organizer = new JLabel("Penganjur: ");
		pane.add(organizer);
		organizer.setBounds(40, 150, 100, 30);
		JLabel organizerOutput = new JLabel("");
	    pane.add(organizerOutput);
	    organizerOutput.setBounds(200, 150, 250, 30);
	    
	    JLabel location = new JLabel("Lokasi: ");
		pane.add(location);
		location.setBounds(40, 200, 200, 30);
		JLabel locationOutput = new JLabel("");
	    pane.add(locationOutput);
	    locationOutput.setBounds(200, 200, 250, 30);
	    
	    JLabel desc = new JLabel("Info meetup:");
		pane.add(desc);
		desc.setBounds(40, 250, 200, 30);
		JTextArea descOutput = new JTextArea(15, 30);
		pane.add(descOutput);
		descOutput.setBounds(200, 250, 250, 100);
		
		JLabel rules = new JLabel("Peraturan:");
		pane.add(rules);
		rules.setBounds(500, 250, 200, 30);
		JTextArea rulesOutput = new JTextArea(15, 30);
		pane.add(rulesOutput);
		rulesOutput.setBounds(600, 250, 250, 100);
	}

	// for this window testing only
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppActivity7();
	}

}
