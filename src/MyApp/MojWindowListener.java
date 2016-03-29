package MyApp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class MojWindowListener extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowClosing(e);
		int result = JOptionPane.showConfirmDialog(null, "Da li sigurno zelite da izadjete iz programa","Confirm", 0);
		
		
		if(result == JOptionPane.OK_OPTION){
			System.exit(0);
		}else if(result == JOptionPane.NO_OPTION){
			System.out.println("jos uvek smo unutra");
		}
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowClosed(e);
		System.exit(0);
	}

	
	
	
	
	
	
	
	
	
	
}
