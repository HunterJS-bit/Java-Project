package MyApp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

import javax.management.modelmbean.ModelMBean;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/*
 * 
 * 
 * 	Object [][] data = { {"marko","miljkovic","123456","nekiemail@live.com","muski","nema"},
				{"jelena","kostic","00000","zenski","pol@live.com","blablabla"},
				{"boban","bobic","007","muski","Hotmail.com","blablabla bla bla bla bla"},
				{"jelena","kostic","00000","zenski","pol@live.com","blablabla"},
				{"jelena","kostic","00000","zenski","pol@live.com","blablabla"},
				{"jelena","kostic","00000","zenski","pol@live.com","blablabla"},
				{"jelena","kostic","00000","zenski","pol@live.com","blablabla"},
				{"jelena","kostic","00000","zenski","pol@live.com","blablabla"},
		};
 * 
 * 
 * 
 */








public class TabelPanel extends JPanel{

	
	JTable table = new JTable(new DefaultTableModel(null, new Object[]{"ime","prezime","email","broj telefona","pol","extra"}));
	
	
	public TabelPanel(){
		
		
		
		
		
		
		
		
		
		JScrollPane scroller = new JScrollPane(table);
		this.add(scroller);
	}
	
	
	
	
	
	public void dodajUTabelu(String arg,String arg2,String arg3,String arg4,String arg5,String arg6){
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		model.addRow(new Object[] { arg,arg2,arg3,arg4,arg5,arg6});
		
	}
	
	
	
	public String[] change(){
		int row = table.getSelectedRow();
		
		String [] data = new String[6];
		
		for(int i = 0;i<6;i++){
			data[i] = (String) table.getValueAt(row, i);
		
		}
		
	return data;
	
	}
	
	
	
	public void brisiRed(){
		int row  = table.getSelectedRow();
		((DefaultTableModel)table.getModel()).removeRow(row);
	}
	
	
	
	public void menjajVrednosti(String arg,String arg2,String arg3,String arg4,String arg5,String arg6){
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setValueAt(arg, table.getSelectedRow(), 0);
		model.setValueAt(arg2, table.getSelectedRow(), 1);
		model.setValueAt(arg3, table.getSelectedRow(), 2);
		model.setValueAt(arg4, table.getSelectedRow(), 3);
		model.setValueAt(arg5, table.getSelectedRow(), 4);
		model.setValueAt(arg6, table.getSelectedRow(), 5);
		
	}
	
	
	
}
