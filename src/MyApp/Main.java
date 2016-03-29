package MyApp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;



public class Main {

public static void main(String[] args) {
	UcitavanjeGlavna prikaz = new UcitavanjeGlavna();
 
	Frame2 f = new Frame2();
	MojWindowListener listener = new MojWindowListener();
	f.addWindowListener(listener);
	
	

}






}