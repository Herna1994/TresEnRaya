package vista;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;

public class InterfazTresNRaya extends JFrame {

	protected JPanel contentPane;
	protected JPanel panel;
	protected JTextField textJugadorActual;
	protected JTextField textTurno;
	protected JTextField textMensaje;
	
	/**
	 * Create the frame.
	 */
	public InterfazTresNRaya() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTresEnRaya = new JLabel("TRES EN RAYA");
		lblTresEnRaya.setBounds(150, 20, 312, 14);
		contentPane.add(lblTresEnRaya);
		
		panel = new JPanel();
		panel.setBounds(40, 50, 301, 216);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btn00 = new JButton("");
		btn00.setName("00");
		panel.add(btn00);
		
		JButton btn01 = new JButton("");
		btn01.setName("01");
		panel.add(btn01);
		
		JButton btn02 = new JButton("");
		btn02.setName("02");
		panel.add(btn02);
		
		JButton btn10 = new JButton("");
		btn10.setName("10");
		panel.add(btn10);
		
		JButton btn11 = new JButton("O");
		btn11.setName("11");
		panel.add(btn11);
		
		JButton btn12 = new JButton("");
		btn12.setName("12");
		panel.add(btn12);
		
		JButton btn20 = new JButton("");
		btn20.setName("20");
		panel.add(btn20);
		
		JButton btn21 = new JButton("");
		btn21.setName("21");
		panel.add(btn21);
		
		JButton btn22 = new JButton("");
		btn22.setName("22");
		panel.add(btn22);
		
		JLabel lblJugadorActual = new JLabel("Jugador");
		lblJugadorActual.setBounds(70, 280, 93, 20);
		contentPane.add(lblJugadorActual);
		
		textJugadorActual = new JTextField();
		textJugadorActual.setEditable(false);
		textJugadorActual.setBounds(130, 280, 52, 20);
		contentPane.add(textJugadorActual);
		textJugadorActual.setColumns(10);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurno.setBounds(180, 280, 78, 20);
		contentPane.add(lblTurno);
		
		textTurno = new JTextField();
		textTurno.setEditable(false);
		textTurno.setBounds(250, 280, 52, 20);
		contentPane.add(textTurno);
		textTurno.setColumns(10);
		
		textMensaje = new JTextField();
		textMensaje.setEditable(false);
		textMensaje.setBounds(65,315,250,30);
		contentPane.add(textMensaje);
	}
}
