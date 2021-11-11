package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class Partida  implements Serializable{
	
	private static final long serialVersionUID = 1L;	
	private double juego;
	private String tipoPartida;
	private String jugador1;
	private String jugador2;
	private double puntaje1;
	private double puntaje2;
	
	public Partida(double juego, String tipoPartida, String jugador1, String jugador2, double puntaje1, double puntaje2){
		this.juego = juego;
		this.tipoPartida = tipoPartida;
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.puntaje1 = puntaje1;
		this.puntaje2 = puntaje2;
	}

	public double getJuego() {
		return juego;
	}

	public void setJuego(double juego) {
		this.juego = juego;
	}

	public String getTipoPartida() {
		return tipoPartida;
	}

	public void setTipoPartida(String tipoPartida) {
		this.tipoPartida = tipoPartida;
	}

	public String getJugador1() {
		return jugador1;
	}

	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}

	public String getJugador2() {
		return jugador2;
	}

	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}

	public double getPuntaje1() {
		return puntaje1;
	}

	public void setPuntaje1(double puntaje1) {
		this.puntaje1 = puntaje1;
	}

	public double getPuntaje2() {
		return puntaje2;
	}

	public void setPuntaje2(double puntaje2) {
		this.puntaje2 = puntaje2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString() {
		return "Juego:"+this.juego+
				"\nTipoPartida:"+this.tipoPartida+
				"\nJugador 1:"+this.jugador1+
				"\nJugador 2:"+this.jugador2+
				"\nPuntaje 1:"+this.puntaje1+
				"\nPuntaje 2:"+this.puntaje2;
	}
}