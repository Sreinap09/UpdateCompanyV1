package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelPartida extends JPanel{

	private JTextArea txtJuego;
	private JTextArea txtTipoPartida;
	private JTextArea txtJugador1;
	private JTextArea txtJugador2;
	private JTextArea txtPuntaje1;
	private JTextArea txtPuntaje2;
	private JLabel labArchivo;
	
	private static final long serialVersionUID = 1L;
	
	public PanelPartida() {
		setLayout( new GridLayout(1,6) );
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Partida");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labArchivo = new JLabel("Resultado de Partida");
		txtJuego = new JTextArea("");
		txtJuego.setForeground(Color.BLACK);
		txtJuego.setBackground(Color.WHITE);
	
		txtTipoPartida = new JTextArea("");
		txtTipoPartida.setForeground(Color.BLACK);
		txtTipoPartida.setBackground(Color.WHITE);
		
		txtJugador1 = new JTextArea("");
		txtJugador1.setForeground(Color.BLACK);
		txtJugador1.setBackground(Color.WHITE);
		
		txtJugador2 = new JTextArea("");
		txtJugador2.setForeground(Color.BLACK);
		txtJugador2.setBackground(Color.WHITE);
	
		txtPuntaje1 = new JTextArea("");
		txtPuntaje1.setForeground(Color.BLACK);
		txtPuntaje1.setBackground(Color.WHITE);
		
		txtPuntaje2 = new JTextArea("");
		txtPuntaje2.setForeground(Color.BLACK);
		txtPuntaje2.setBackground(Color.WHITE);
		
		//add(labArchivo);
		//add(new JLabel(""));
		add(txtJuego);
		add(txtTipoPartida);
		add(txtJugador1);
		add(txtJugador2);
		add(txtPuntaje1);
		add(txtPuntaje2);
	}

	public JTextArea getTxtJuego() {
		return txtJuego;
	}

	public void setTxtJuego(JTextArea txtJuego) {
		this.txtJuego = txtJuego;
	}

	public JTextArea getTxtTipoPartida() {
		return txtTipoPartida;
	}

	public void setTxtTipoPartida(JTextArea txtTipoPartida) {
		this.txtTipoPartida = txtTipoPartida;
	}

	public JTextArea getTxtJugador1() {
		return txtJugador1;
	}

	public void setTxtJugador1(JTextArea txtJugador1) {
		this.txtJugador1 = txtJugador1;
	}

	public JTextArea getTxtJugador2() {
		return txtJugador2;
	}

	public void setTxtJugador2(JTextArea txtJugador2) {
		this.txtJugador2 = txtJugador2;
	}

	public JTextArea getTxtPuntaje1() {
		return txtPuntaje1;
	}

	public void setTxtPuntaje1(JTextArea txtPuntaje1) {
		this.txtPuntaje1 = txtPuntaje1;
	}

	public JTextArea getTxtPuntaje2() {
		return txtPuntaje2;
	}

	public void setTxtPuntaje2(JTextArea txtPuntaje2) {
		this.txtPuntaje2 = txtPuntaje2;
	}

	public JLabel getLabArchivo() {
		return labArchivo;
	}

	public void setLabArchivo(JLabel labArchivo) {
		this.labArchivo = labArchivo;
	}


	
}
