package MyApp;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RadialGradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.geom.Point2D;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelZaPolja extends JPanel implements ActionListener{

	
	JTextField Ime;
	JTextField Prezime;
	JTextField Email;
	JTextField telefon;
	CheckboxGroup chGrupa;
	Checkbox m;
	Checkbox f;
	JTextField extra;
	JLabel l1,l2,l3,l4,l5;
	JButton button = new JButton("Resetuj Polja");
	JButton buttonIzmeni = new JButton("Izmeni");
	BoxLayout box=new BoxLayout(this,BoxLayout.Y_AXIS);
	

	public PanelZaPolja(){
		
		
		this.setLayout(box);
		
		
		button.addActionListener(this);
		
		Ime = new JTextField("");
		l1=new JLabel("Ime");
		l2=new JLabel("Prezime");
		l3=new JLabel("email");
		l4=new JLabel("extra");
		l5 = new JLabel("Telefon");
		Prezime= new JTextField("",3);
		Email= new JTextField("",3);
		telefon = new JTextField("",3);
		chGrupa= new  CheckboxGroup();
		m= new Checkbox("m", chGrupa,true);
		f= new Checkbox("f", chGrupa,false);
		extra= new JTextField("",3);
		this.add(l1);
		this.add(Ime);
		this.add(l2);
		this.add(Prezime);
		this.add(l3);
		this.add(Email);
		this.add(l5);
		this.add(telefon);
		this.add(m);
		this.add(f);
		this.add(l4);
		this.add(extra);
		this.add(button);
		this.add(buttonIzmeni);
		
		
		
		
	}

	
	
	
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(new GradientPaint(10, 10, Color.WHITE, 100, 150,new Color(51, 51,255)));
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		
		
		
		
		
	}

	
	
	
	
	public String isSelected(){
		String word = "";
		if(m.getState()==true){
			word = "m";
		}else if(f.getState()==true){
			word = "f";
		}
		return word;
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(button)){
			Ime.setText("");
			Prezime.setText("");
			Email.setText("");
			telefon.setText("");
			extra.setText("");
		}
		
	}
	
	
	
	
	
	
	


	
	
	
	
	
	
}
