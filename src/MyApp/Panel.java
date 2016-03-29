package MyApp;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Image i = new ImageIcon("C:\\Users\\Marko\\Desktop\\lala.jpg").getImage();
		g.drawImage(i, 0, 0, null);
	}

	
	
	
	
	
	
	
	
	
}
