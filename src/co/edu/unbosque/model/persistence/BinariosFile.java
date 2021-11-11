package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// En esta clase se implementan los métodos básicos de lectura y escritura
// de los dos ejemplos de clase, por esta razón, van aquí.

public class BinariosFile {

	private String rutaJug = "./data/Jugadores.out";
	private String rutaJue = "./data/Juego.out";
	private String rutaPar = "./data/Partida.out";

	private Partida[] Partida;
	private Jugador[] Jugador;
	private Juego[] Juego;
	
	public BinariosFile() {
		// TODO Auto-generated constructor stub
		
		Juego = new Juego[10];
		Jugador = new Jugador[10];
		Partida = new Partida[10];
	}

	public String escribirPartida(double juego, String tipoPartida, String jugador1, String jugador2, double puntaje1, double puntaje2) {
		String mensaje = "Registro de Partida Ingresado!";
		Partida staff[] = new Partida[1];
		staff[0] = new Partida(juego, tipoPartida, jugador1, jugador2, puntaje1, puntaje2);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaPar));
			out.writeObject(staff);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public void leerPartida() {
        ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaPar));
	        Partida = (Partida[])in.readObject();
	        in.close();
	        for (int i = 0; i < Partida.length; i++) {
	            System.out.println(Partida[i].getJuego());
	            System.out.println(Partida[i].getTipoPartida());
	            System.out.println(Partida[i].getJugador1());
	            System.out.println(Partida[i].getJugador2());
	            System.out.println(Partida[i].getPuntaje1());
	            System.out.println(Partida[i].getPuntaje2());
	        }

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String escribirJugador(String Nombre1, int Edad1, String Genero1, double Puntaje1, String Nombre2, int Edad2, String Genero2, double Puntaje2) {
		String mensaje = "Registro de Jugador Ingresado!";
		Jugador staff[] = new Jugador[2];
		staff[0] = new Jugador(Nombre1, Edad1, Genero1, Puntaje1);
		staff[1] = new Jugador(Nombre2, Edad2, Genero2, Puntaje2);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaJug));
			out.writeObject(staff);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public void leerJugador() {
        ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaJug));
			Jugador= (Jugador[])in.readObject();
	        in.close();
	        for (int i = 0; i < Jugador.length; i++) {
	            System.out.println(Jugador[i].getNombre());
	            System.out.println(Jugador[i].getEdad());
	            System.out.println(Jugador[i].getGenero());
	            System.out.println(Jugador[i].getPuntaje());
	        }

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String escribirJuego(String nombre, String tipo) {
		String mensaje = "Registro de Juego Ingresado!";
		Juego staff[] = new Juego[1];
		staff[0] = new Juego(nombre, tipo);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaJue));
			out.writeObject(staff);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public void leerJuego() {
        ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaJue));
			Juego= (Juego[])in.readObject();
	        in.close();
	        for (int i = 0; i < Juego.length; i++) {
	            System.out.println(Juego[i].getNombre());
	            System.out.println(Juego[i].getTipo());
	        }

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getRutaJug() {
		return rutaJug;
	}

	public void setRutaJug(String rutaJug) {
		this.rutaJug = rutaJug;
	}

	public String getRutaJue() {
		return rutaJue;
	}

	public void setRutaJue(String rutaJue) {
		this.rutaJue = rutaJue;
	}

	public String getRutaPar() {
		return rutaPar;
	}

	public void setRutaPar(String rutaPar) {
		this.rutaPar = rutaPar;
	}

	public Partida[] getPartida() {
		return Partida;
	}

	public void setPartida(Partida[] partida) {
		Partida = partida;
	}

	public Jugador[] getJugador() {
		return Jugador;
	}

	public void setJugador(Jugador[] jugador) {
		Jugador = jugador;
	}

	public Juego[] getJuego() {
		return Juego;
	}

	public void setJuego(Juego[] juego) {
		Juego = juego;
	}


}
