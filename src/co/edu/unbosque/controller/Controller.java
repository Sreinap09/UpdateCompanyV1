package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Binarios;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	//Atributos que vienen del Modelo (mundo) 
	private Binarios bd;
	
	//Atributos que vienen de Vista - GUI
	private View gui;
	
	public Controller() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		bd = new Binarios();
		//se Modifica contructor de InterfazGUI para que reciba como parámetro la instancia de Controlador
		gui = new View(this);
		gui.setVisible(true); //hacer visible la ventana principal
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		String resultado;
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR_REG)) {
			
			gui.escribirMensaje(bd.getBf().escribirPartida(Double.parseDouble(gui.getPanelEntrada().getTxtJuego().getSelectedItem().toString()), gui.getPanelEntrada().getTxtTipo().getText(), gui.getPanelEntrada().getNombreJ1().getText(), gui.getPanelEntrada().getNombreJ2().getText(), Double.parseDouble(gui.getPanelEntrada().getPuntajeJ1().getText()), Double.parseDouble(gui.getPanelEntrada().getPuntajeJ2().getText())));
			gui.escribirMensaje(bd.getBf().escribirJugador(gui.getPanelEntrada().getNombreJ1().getText(), Integer.parseInt(gui.getPanelEntrada().getEdadJ1().getText()), gui.getPanelEntrada().getGeneroJ1().getSelectedItem().toString(),Double.parseDouble(gui.getPanelEntrada().getPuntajeJ1().getText()),
															gui.getPanelEntrada().getNombreJ2().getText(), Integer.parseInt(gui.getPanelEntrada().getEdadJ2().getText()), gui.getPanelEntrada().getGeneroJ2().getSelectedItem().toString(),Double.parseDouble(gui.getPanelEntrada().getPuntajeJ2().getText())));
			gui.escribirMensaje(bd.getBf().escribirJuego(gui.getPanelEntrada().getTxtNJuego().getSelectedItem().toString(), gui.getPanelEntrada().getTxtTipo().getText()));
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER_REG)) {
			bd.getBf().leerPartida();
			bd.getBf().leerJugador();
			bd.getBf().leerJuego();
			gui.mostrarPartida(1, bd.getBf().getPartida());
			gui.mostrarJugador(2, bd.getBf().getJugador());
			gui.mostrarJuego(1, bd.getBf().getJuego());
		}
	}
}
