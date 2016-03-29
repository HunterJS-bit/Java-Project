package MyApp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Frame2 extends JFrame implements ActionListener {
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	//meni 
	
	
	public JMenuBar menubar;
	public JMenu fileMenu;
	public JMenuItem open;
	public JMenuItem save;
	public JMenuItem saveAs;
	public JMenuItem exit;
	
	//paneli
	
	PanelGdeJeTabela panelCentar = new PanelGdeJeTabela();
	PanelZaDugmice panelDonji = new PanelZaDugmice();
	PanelZaPolja panelDesno = new PanelZaPolja();
	PanelNaslov panelGore = new PanelNaslov();
	
	
	// slike i lokacije
	public String iconLocation = "Slike\\ikona.png";
	public String cursorLocation = "Slike\\imageedit_24_7867123801.png";
	public String iconOpen = "Slike\\open_icon.gif";
	public String iconSave = "Slike\\save_icon.gif";
	public String iconSaveAs = "Slike\\saveAs_icon.gif";
	public String iconExit = "Slike\\exit_icon.gif";
	
	
	
	
	
	public Frame2() {
		
		
		
		
		
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.setMaximumSize(new Dimension(WIDTH,HEIGHT));
		this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		
		//meni
		menubar = new JMenuBar();
		fileMenu = new JMenu("File");
		open = new JMenuItem("Open" , new ImageIcon(iconOpen));
		
		//osluskivaci za menije
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileFilter filter = new FileNameExtensionFilter("Text file","txt");
				JFileChooser chooser = new JFileChooser();
				chooser.setDialogTitle("Opening file");
				chooser.setFileFilter(filter);
				int status = chooser.showOpenDialog(null);
				
				if(status==JFileChooser.APPROVE_OPTION){
					JOptionPane.showMessageDialog(null, "Otvaramo fajl", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		
		
		save = new JMenuItem("Save", new ImageIcon(iconSave));
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Samo cuvam");
				
			}
		});
		
		
		saveAs = new JMenuItem("Save As",new ImageIcon(iconSaveAs));
		saveAs.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileFilter filter = new FileNameExtensionFilter("Text file","txt");
				JFileChooser chooser = new JFileChooser(new File("C:\\"));
				chooser.setDialogTitle("Saveing file");
				chooser.setFileFilter(filter);
				int status = chooser.showSaveDialog(null);
				if(status==JFileChooser.APPROVE_OPTION){
					JOptionPane.showMessageDialog(null, "Upravo smo sacuvali fajl", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		
		exit = new JMenuItem("Exit",new ImageIcon(iconExit));
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		fileMenu.add(open);
		fileMenu.add(save);
		fileMenu.add(saveAs);
		fileMenu.add(exit);
		
		menubar.add(fileMenu);
		this.setJMenuBar(menubar);
		
		//listeneri
		
		panelDonji.unosDugme.addActionListener(this);
		panelDonji.izmenaDugme.addActionListener(this);
		panelDonji.brisanjeDugme.addActionListener(this);
		panelDesno.buttonIzmeni.addActionListener(this);
		
		//nesto drugo
		ImageIcon i = new ImageIcon(iconLocation);
		Image img = i.getImage();
		this.setIconImage(img);
		this.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(cursorLocation).getImage(), new Point(0, 0), "strelica") );
		this.setTitle("Java Projekat");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.add(panelCentar,BorderLayout.CENTER);
		this.add(panelGore,BorderLayout.NORTH);
		this.add(panelDonji,BorderLayout.SOUTH);
		this.add(panelDesno,BorderLayout.EAST);
		this.setLocationRelativeTo(null);
		 
		
		this.setVisible(true);
		
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(panelDonji.unosDugme)){
			String ime = panelDesno.Ime.getText();
			String prezime = panelDesno.Prezime.getText();
			
			String email = panelDesno.Email.getText();
			String telefon = panelDesno.telefon.getText();
			String pol = panelDesno.isSelected();
			String extraInfo = panelDesno.extra.getText();
			panelCentar.addToTable(ime, prezime, email,telefon,pol, extraInfo);
			
		}else if(e.getSource().equals(panelDonji.izmenaDugme)){
			
		String [] arr = 	panelCentar.red();
			
			panelDesno.Ime.setText(arr[0]);
			panelDesno.Prezime.setText(arr[1]);
			panelDesno.Email.setText(arr[2]);
			panelDesno.telefon.setText(arr[3]);
			if(arr[4]=="m"){
				panelDesno.m.setState(true);;
			}else{
				panelDesno.f.setState(true);
			}
			panelDesno.extra.setText(arr[5]);
			
			
			
			
			
			
			
		
		
		}else if(e.getSource().equals(panelDonji.brisanjeDugme)){
			panelCentar.deleteRed();
		}else if(e.getSource().equals(panelDesno.buttonIzmeni)){
			

			
			
			
			
			
			
			
			
			String ime = panelDesno.Ime.getText();
			String prezime = panelDesno.Prezime.getText();
			
			String email = panelDesno.Email.getText();
			String telefon = panelDesno.telefon.getText();
			String pol = panelDesno.isSelected();
			String extraInfo = panelDesno.extra.getText();
			
			panelCentar.changeValueTable(ime, prezime, email, telefon, pol, extraInfo);
			
		}
		
	}


	

	
	
	
	
	
	
}
