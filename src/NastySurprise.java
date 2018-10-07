import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NastySurprise {
public static void main(String[] args) {
	NastySurprise nasty = new NastySurprise();
}
	public NastySurprise() {
	
		// TODO Auto-generated constructor stubddfg
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
	frame.add(panel);
JButton trick = new JButton();
		JButton treat = new JButton();
		panel.add(trick);
		panel.add(treat);
		frame.pack();
	}

}
