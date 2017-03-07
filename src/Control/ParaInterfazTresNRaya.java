package Control;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vista.InterfazTresNRaya;


public class ParaInterfazTresNRaya extends InterfazTresNRaya {

	public ParaInterfazTresNRaya() {
		Component[] components = panel.getComponents();
		MyActionListener examinaBotonera=new MyActionListener();
		for (Component component : components) {
			JButton local=(JButton)component;
			local.addActionListener(examinaBotonera);
		}
	}	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaInterfazTresNRaya frame = new ParaInterfazTresNRaya();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
