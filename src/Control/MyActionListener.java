package Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {

	int posicionActualX,posicionActualY;
	@Override
	public void actionPerformed(ActionEvent e) {
		reconoceBoton(e.getSource());
	}

	private void reconoceBoton(Object source) {
			JButton boton=(JButton)source;
			posicionActualX=Integer.valueOf(Character.toString(boton.getName().charAt(0)));
			posicionActualY=Integer.valueOf(Character.toString(boton.getName().charAt(1)));
			System.out.println("la posicion actual es "+posicionActualX+":"+posicionActualY);
	}

	public int getPosicionActualX() {
		return posicionActualX;
	}

	public int getPosicionActualY() {
		return posicionActualY;
	}

}
