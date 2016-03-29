package MyApp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class PanelZaDugmice extends JPanel{

	
	JButton unosDugme, brisanjeDugme , izmenaDugme;
	
	FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 30, 30);
	Font f1 = new Font("Bold", Font.BOLD, 15);
	RadialGradientPaint p;
	public PanelZaDugmice(){
		
		this.setLayout(fl);
		this.setBackground(Color.red);
		
		unosDugme = new JButton("Unos");
		brisanjeDugme = new JButton("Brisanje");
		izmenaDugme = new JButton("Izmena");
		
		unosDugme.setFont(f1);
		brisanjeDugme.setFont(f1);
		izmenaDugme.setFont(f1);
		
		add(unosDugme);
		add(brisanjeDugme);
		add(izmenaDugme);
		
		
	}


	
	public void paintComponent(Graphics g){
		
		
		
		Graphics2D g2d = (Graphics2D) g;
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