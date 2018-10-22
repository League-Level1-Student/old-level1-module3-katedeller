
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want to get out of the
	 * static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();
	}

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
JFrame one = new JFrame();
JLabel two;
	private void createBook() {
		// 2. make the frame visible
		one.setVisible(true);
		// 3. set the size of the frame
		one.setSize(10,10);
		// 4. find 2 images and save them to your project’s default package
		
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
	
		String illusion = "download.png";
		// 6. create a variable of type "JLabel" but don’t initialize it yet
	
		// 7. use the "loadImage..." methods below to initialize your JLabel
		two = loadImageFromComputer(illusion);
		
		// 8. add your JLabel to the frame
		one.add(two);
		// 9. call the pack() method on the frame
		one.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		one.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		JOptionPane.showMessageDialog(null, "clicked!");
		// 12. remove everything from the frame that was added earlier
		one.remove(two);
		// 13. load a new image like before (this is more than one line of code)
		String illusion2 = "images.jpg";
		two = loadImageFromComputer(illusion2);
		one.add(two);
		// 14. pack the frame
		one.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}


