package MyApp;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RadialGradientPaint;
import java.awt.Stroke;
import java.awt.geom.Point2D;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelNaslov extends JPanel{
	public RadialGradientPaint p;
	public JLabel naslov;
	public PanelNaslov() {
		naslov = new JLabel("Java grupa");
		this.setLayout(new GridLayout());
		this.add(naslov);
	}
	
			
			
			
	public void paintComponent(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g;
		   Stroke stroke = new BasicStroke(5);
		   g2d.setStroke(stroke);
		Border border = BorderFactory.createTitledBorder("Naslov");
		p = new RadialGradientPaint(new Point2D.Double(
				getWidth() / 2.0,
				getHeight() / 2.0), getWidth() / 2.0f,
				new float[] { 0.0f, 1.0f },
				new Color[] { new Color(6, 76, 160, 127),
				new Color(0, 0, 0, 204) });
				g2d.setPaint(p);
				g2d.fillRect(0, 0, getWidth(), getHeight());
		
		
		
	}
	
		
	
	
	
	
	
	
	
}
