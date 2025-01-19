import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

public class MenuDemo extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu mnufile,mnuedit;
	JMenuItem minew,miopen,misave;
	
	//Constructor
	MenuDemo(){
		mb = new JMenuBar();
		mnufile = new JMenu("File");
		mnuedit = new JMenu("Edit");
		minew = new JMenuItem("New");
		minew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		miopen = new JMenuItem("Open");
		miopen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		misave = new JMenuItem("Save");
		misave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		
		mnufile.add(minew);
		mnufile.add(miopen);
		mnufile.add(misave);
		
		mb.add(mnufile);
		mb.add(mnuedit);
		
		//register Components
		minew.addActionListener(this);
		miopen.addActionListener(this);
		misave.addActionListener(this);
		
		setSize(400,300);
		setVisible(true);
		setTitle("My Menu Application");
		getContentPane().setLayout(new FlowLayout());
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		new MenuDemo();
	}
	
	public void actionPerformed(ActionEvent e) {  
		if(e.getSource()==minew) {
			System.out.println("You have clicked on new menu item"); 
		   }	
		else if(e.getSource()==misave) {   
			//System.out.println("You have selected save option");
//			JOptionPane.showMessageDialog(this,"You are selected save");
			JOptionPane.showConfirmDialog(this, "Confirm");
		}else{
			System.out.println("You have selected Open Option");
		}
	}  
}
