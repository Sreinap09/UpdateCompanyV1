package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelJugador extends JPanel{

	private JTextArea txtNombre;
	private JTextArea txtEdad;
	private JTextArea txtGenero;
	private JTextArea txtPuntaje;
	private JLabel labArchivo;
	
	private static final long serialVersionUID = 1L;
	
	public PanelJugador() {
		setLayout( new GridLayout(1,4) );
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Jugador");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labArchivo = new JLabel("Resultado de Jugador");
		txtNombre = new JTextArea("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
	
		txtEdad = new JTextArea("");
		txtEdad.setForeground(Color.BLACK);
		txtEdad.setBackground(Color.WHITE);
		
		txtGenero = new JTextArea("");
		txtGenero.setForeground(Color.BLACK);
		txtGenero.setBackground(Color.WHITE);
		
		txtPuntaje = new JTextArea("");
		txtPuntaje.setForeground(Color.BLACK);
		txtPuntaje.setBackground(Color.WHITE);

		add(txtNombre);
		add(txtEdad);
		add(txtGenero);
		add(txtPuntaje);
	}

	public JTextArea getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextArea txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextArea getTxtEdad() {
		return txtEdad;
	}

	public void setTxtEdad(JTextArea txtEdad) {
		this.txtEdad = txtEdad;
	}

	public JTextArea getTxtGenero() {
		return txtGenero;
	}

	public void setTxtGenero(JTextArea txtGenero) {
		this.txtGenero = txtGenero;
	}

	public JTextArea getTxtPuntaje() {
		return txtPuntaje;
	}

	public void setTxtPuntaje(JTextArea txtPuntaje) {
		this.txtPuntaje = txtPuntaje;
	}

	public JLabel getLabArchivo() {
		return labArchivo;
	}

	public void setLabArchivo(JLabel labArchivo) {
		this.labArchivo = labArchivo;
	}


	
}
