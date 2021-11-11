package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.persistence.Juego;
import co.edu.unbosque.model.persistence.Jugador;
import co.edu.unbosque.model.persistence.Partida;

public class View extends JFrame {

	// Constante generada por Eclipse
	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada; // Se declara un objeto de tipo PanelEntrada
	private PanelPartida panelPartida;
	private PanelJugador panelJugador;
	private PanelJuego panelJuego;

	public View(Controller control) {
		// Definición de los parámetros básicos de la ventana principal

		setSize(760, 450); // tamaño en ancho y alto en pixeles
		setResizable(false); // Se puede cambiar el tamaño de la ventana?
		setTitle("Título de la Ventana Principal"); // tìtulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);// qué debe hacer si cierra la ventana
		setLocationRelativeTo(null); // coloca la ventana al centro de la pantalla
		// Establece el layout (lienzo) que vamos a utilizar dentro de la ventana
		// principal.
		setLayout(new BorderLayout());
		// Se agrega al layout en la parte NORTH, el panel de entrada definido
		panelEntrada = new PanelEntrada();
		panelEntrada.setPreferredSize(new Dimension(900, 200));
		add(panelEntrada, BorderLayout.NORTH);
		panelPartida = new PanelPartida();
		add(panelPartida, BorderLayout.WEST);
		panelJugador = new PanelJugador();
		add(panelJugador, BorderLayout.EAST);
		panelJuego = new PanelJuego();
		add(panelJuego, BorderLayout.CENTER);

		panelEntrada.getButLeerReg().addActionListener(control);
		panelEntrada.getButEscribirReg().addActionListener(control);
	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelPartida getPanelPartida() {
		return panelPartida;
	}

	public void setPanelPartida(PanelPartida panelPartida) {
		this.panelPartida = panelPartida;
	}

	public PanelJugador getPanelJugador() {
		return panelJugador;
	}

	public void setPanelJugador(PanelJugador panelJugador) {
		this.panelJugador = panelJugador;
	}

	public PanelJuego getPanelJuego() {
		return panelJuego;
	}

	public void setPanelJuego(PanelJuego panelJuego) {
		this.panelJuego = panelJuego;
	}

	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarPartida(int numPar, Partida[] datos) {
		for (int i = 0; i < numPar; i++) {
			getPanelPartida().getTxtJuego().append(String.valueOf(datos[i].getJuego()) + "\n");
			getPanelPartida().getTxtTipoPartida().append(String.valueOf(datos[i].getTipoPartida()) + "\n");
			getPanelPartida().getTxtJugador1().append(String.valueOf(datos[i].getJugador1()) + "\n");
			getPanelPartida().getTxtJugador2().append(String.valueOf(datos[i].getJugador2()) + "   \n");
			getPanelPartida().getTxtPuntaje1().append(String.valueOf(datos[i].getPuntaje1()) + "   \n");
			getPanelPartida().getTxtPuntaje2().append(String.valueOf(datos[i].getPuntaje2()) + "\n");
		}
	}

	public void mostrarJugador(int numJug, Jugador[] jug) {
		for (int i = 0; i < numJug; i++) {
			getPanelJugador().getTxtNombre().append(String.valueOf(jug[i].getNombre()) + "\n");
			getPanelJugador().getTxtEdad().append(String.valueOf(jug[i].getEdad()) + "\n");
			getPanelJugador().getTxtGenero().append(String.valueOf(jug[i].getGenero()) + "   \n");
			getPanelJugador().getTxtPuntaje().append(String.valueOf(jug[i].getPuntaje()) + "\n");
		}
	}
	
	public void mostrarJuego(int numJue, Juego[] jue) {
		for (int i = 0; i < numJue; i++) {
			getPanelJuego().getTxtNombre().append(String.valueOf(jue[i].getNombre()) + "\n");
			getPanelJuego().getTxtTipo().append(String.valueOf(jue[i].getTipo()) + "\n");
		}
	}
}
