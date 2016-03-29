package MyApp;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class UcitavanjeGlavna {

	
	
	  PocetniEkran screen;

	  public UcitavanjeGlavna() {
	    
	    splashScreenInit();
	   
	    for (int i = 0; i <= 50; i++)
	    {
	    	try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      for (long j=0; j<500; ++j)
	      {
	        String poop = " " + (j + i);
	      }
	      
	      screen.setProgress("Ucitavanje " + i, i);  // progress bar with a message
	     
	    }
	    splashScreenDestruct();
	   
	  }

	  private void splashScreenDestruct() {
	    screen.setScreenVisible(false);
	  }

	  private void splashScreenInit() {
	  ImageIcon icon = new ImageIcon("Slike\\4820117.gif");
	
	    screen = new PocetniEkran(icon);
	    screen.setLocationRelativeTo(null);
	    screen.setProgressMax(100);
	    screen.setScreenVisible(true);
	  }

	 
}
