package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelJuego extends JPanel{

	private JTextArea txtNombre;
	private JTextArea txtTipo;
	private JLabel labArchivo;
	
	private static final long serialVersionUID = 1L;
	
	public PanelJuego() {
		setLayout( new GridLayout(1,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Juego");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labArchivo = new JLabel("Resultado de Juego");
		txtNombre = new JTextArea("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
	
		txtTipo = new JTextArea("");
		txtTipo.setForeground(Color.BLACK);
		txtTipo.setBackground(Color.WHITE);
		
		//add(labArchivo);
		//add(new JLabel(""));
		add(txtNombre);
		add(txtTipo);
	}

	public JTextArea getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextArea txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextArea getTxtTipo() {
		return txtTipo;
	}

	public void setTxtTipo(JTextArea txtTipo) {
		this.txtTipo = txtTipo;
	}

	public JLabel getLabArchivo() {
		return labArchivo;
	}

	public void setLabArchivo(JLabel labArchivo) {
		this.labArchivo = labArchivo;
	}


	
}
