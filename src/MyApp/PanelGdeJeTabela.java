package MyApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.util.Vector;

import javax.swing.JPanel;

public class PanelGdeJeTabela extends JPanel{

	TabelPanel table = new TabelPanel();
	RadialGradientPaint p;
	public PanelGdeJeTabela() {
		this.add(table);
	}
	
	
	
	
	
	
	public void addToTable(String a,String b,String c,String d,String e,String f){
		table.dodajUTabelu(a, b, c, d,e,f);
	}
	
	
	
	public String [] red(){
		String [] arr =table.change();
		return arr;
	}
	
	
	
	
	
	public void deleteRed(){
		table.brisiRed();
	}
	
	
	
	
	public void changeValueTable(String a,String  b,String c,String d ,String e,String f){
		table.menjajVrednosti(a, b, c, d, e, f);
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
