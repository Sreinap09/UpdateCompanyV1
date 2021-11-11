package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel juego;
	private JComboBox<String> txtJuego;
	private JLabel nJuego;
	private JComboBox<String> txtNJuego;
	private JLabel tipo;
	private JTextField txtTipo;
	private JLabel Jug1;
	private JLabel Jug2;
	private JLabel Nombre;
	private JLabel Genero;
	private JLabel Edad;
	private JLabel Puntaje;
	private JTextField nombreJ1;
	private JTextField nombreJ2;
	private JComboBox<String> generoJ1;
	private JComboBox<String> generoJ2;
	private JTextField edadJ1;
	private JTextField edadJ2;
	private JTextField PuntajeJ1;
	private JTextField PuntajeJ2;
	private JButton butLeerReg;
	private JButton butEscribirReg;
	public static final String ESCRIBIR_REG = "EscribirReg";
	public static final String LEER_REG = "LeerReg";
	
	public PanelEntrada() {
		
		setLayout(null);

		juego = new JLabel ("Juego: ");
		juego.setFont(new Font("Arial",Font.BOLD,13));
		juego.setForeground(Color.BLACK);
		juego.setBounds(30, 30, 70, 20);
		
		txtJuego = new JComboBox<String>();
		txtJuego.setBounds(75,30,40,20);
		txtJuego.addItem("1");
		txtJuego.addItem("2");
		txtJuego.addItem("3");
		txtJuego.addItem("4");
		txtJuego.addItem("5");
		txtJuego.addItem("6");
		
		nJuego = new JLabel ("Nombre juego: ");
		nJuego.setFont(new Font("Arial",Font.BOLD,13));
		nJuego.setForeground(Color.BLACK);
		nJuego.setBounds(30, 70, 100, 20);
		
		txtNJuego = new JComboBox<String>();
		txtNJuego.setBounds(30,90,100,20);
		txtNJuego.addItem("Ajedrez");
		txtNJuego.addItem("Poker");
		
		tipo= new JLabel ("Tipo de juego: ");
		tipo.setFont(new Font("Arial",Font.BOLD,13));
		tipo.setForeground(Color.BLACK);
		tipo.setBounds(30, 130, 100, 20);
		
		txtTipo = new JTextField();
		txtTipo.setBounds(30,150,100,20);
		
		Jug1 = new JLabel ("Jugador 1");
		Jug1.setFont(new Font("Arial",Font.BOLD,13));
		Jug1.setForeground(Color.BLACK);
		Jug1.setBounds(250,70,100,20);
		
		Jug2 = new JLabel ("Jugador 2");
		Jug2.setFont(new Font("Arial",Font.BOLD,13));
		Jug2.setForeground(Color.BLACK);
		Jug2.setBounds(250,110,100,20);
		
		Nombre = new JLabel ("Nombre");
		Nombre.setFont(new Font("Arial",Font.BOLD,13));
		Nombre.setForeground(Color.BLACK);
		Nombre.setBounds(360,30,100,20);
		
		nombreJ1 = new JTextField();
		nombreJ1.setBounds(350,70,80,20);
		
		nombreJ2 = new JTextField();
		nombreJ2.setBounds(350,110,80,20);
		
		Genero = new JLabel ("Genero");
		Genero.setFont(new Font("Arial",Font.BOLD,13));
		Genero.setForeground(Color.BLACK);
		Genero.setBounds(470,30,100,20);

		generoJ1 = new JComboBox<String>();
		generoJ1.setBounds(460,70,90,20);
		generoJ1.addItem("");
		generoJ1.addItem("Masculino");
		generoJ1.addItem("Femenino");
		generoJ1.addItem("Otro");
		
		generoJ2 = new JComboBox<String>();
		generoJ2.setBounds(460,110,90,20);
		generoJ2.addItem("");
		generoJ2.addItem("Masculino");
		generoJ2.addItem("Femenino");
		generoJ2.addItem("Otro");
		
		Edad= new JLabel ("Edad");
		Edad.setFont(new Font("Arial",Font.BOLD,13));
		Edad.setForeground(Color.BLACK);
		Edad.setBounds(585,30,100,20);

		edadJ1 = new JTextField();
		edadJ1.setBounds(580,70,50,20);

		edadJ2 = new JTextField();
		edadJ2.setBounds(580,110,50,20);
		
		Puntaje= new JLabel ("Puntaje");
		Puntaje.setFont(new Font("Arial",Font.BOLD,13));
		Puntaje.setForeground(Color.BLACK);
		Puntaje.setBounds(650,30,100,20);

		PuntajeJ1 = new JTextField();
		PuntajeJ1.setBounds(650,70,50,20);

		PuntajeJ2 = new JTextField();
		PuntajeJ2.setBounds(650,110,50,20);
		
		butEscribirReg = new JButton("Escribir Registros");
		butEscribirReg.setBounds(430, 150, 150, 40);
		butEscribirReg.setActionCommand(ESCRIBIR_REG);
		
		butLeerReg = new JButton("Leer Registros");
		butLeerReg.setBounds(600, 150, 120, 40);
		butLeerReg.setActionCommand(LEER_REG);

		add(juego);
		add(txtJuego);
		add(nJuego);
		add(txtNJuego);
		add(tipo);
		add(txtTipo);
		add(Jug1);
		add(Jug2);
		add(Nombre);
		add(nombreJ1);
		add(nombreJ2);
		add(Genero);
		add(generoJ1);
		add(generoJ2);
		add(Edad);
		add(edadJ1);
		add(edadJ2);
		add(Puntaje);
		add(PuntajeJ1);
		add(PuntajeJ2);
		add(butLeerReg);
		add(butEscribirReg);
	}

	public JLabel getJuego() {
		return juego;
	}

	public void setJuego(JLabel juego) {
		this.juego = juego;
	}

	public JComboBox<String> getTxtJuego() {
		return txtJuego;
	}

	public void setTxtJuego(JComboBox<String> txtJuego) {
		this.txtJuego = txtJuego;
	}

	public JLabel getnJuego() {
		return nJuego;
	}

	public void setnJuego(JLabel nJuego) {
		this.nJuego = nJuego;
	}

	public JLabel getTipo() {
		return tipo;
	}

	public JLabel getJug1() {
		return Jug1;
	}

	public void setJug1(JLabel jug1) {
		Jug1 = jug1;
	}

	public JLabel getJug2() {
		return Jug2;
	}

	public void setJug2(JLabel jug2) {
		Jug2 = jug2;
	}

	public JTextField getNombreJ1() {
		return nombreJ1;
	}

	public void setNombreJ1(JTextField nombreJ1) {
		this.nombreJ1 = nombreJ1;
	}

	public JTextField getNombreJ2() {
		return nombreJ2;
	}

	public void setNombreJ2(JTextField nombreJ2) {
		this.nombreJ2 = nombreJ2;
	}

	public JComboBox<String> getGeneroJ1() {
		return generoJ1;
	}

	public void setGeneroJ1(JComboBox<String> generoJ1) {
		this.generoJ1 = generoJ1;
	}

	public JComboBox<String> getGeneroJ2() {
		return generoJ2;
	}

	public void setGeneroJ2(JComboBox<String> generoJ2) {
		this.generoJ2 = generoJ2;
	}

	public JTextField getEdadJ1() {
		return edadJ1;
	}

	public void setEdadJ1(JTextField edadJ1) {
		this.edadJ1 = edadJ1;
	}

	public JTextField getEdadJ2() {
		return edadJ2;
	}

	public void setEdadJ2(JTextField edadJ2) {
		this.edadJ2 = edadJ2;
	}

	public JTextField getPuntajeJ1() {
		return PuntajeJ1;
	}

	public void setPuntajeJ1(JTextField puntajeJ1) {
		PuntajeJ1 = puntajeJ1;
	}

	public JTextField getPuntajeJ2() {
		return PuntajeJ2;
	}

	public void setPuntajeJ2(JTextField puntajeJ2) {
		PuntajeJ2 = puntajeJ2;
	}

	public void setTipo(JLabel tipo) {
		this.tipo = tipo;
	}

	public JTextField getTxtTipo() {
		return txtTipo;
	}

	public void setTxtTipo(JTextField txtTipo) {
		this.txtTipo = txtTipo;
	}

	public JComboBox<String> getTxtNJuego() {
		return txtNJuego;
	}

	public void setTxtNJuego(JComboBox<String> txtNJuego) {
		this.txtNJuego = txtNJuego;
	}

	public JButton getButLeerReg() {
		return butLeerReg;
	}

	public void setButLeerReg(JButton butLeerReg) {
		this.butLeerReg = butLeerReg;
	}

	public JButton getButEscribirReg() {
		return butEscribirReg;
	}
	
	
	public void setButEscribirReg(JButton butEscribirReg) {
		this.butEscribirReg = butEscribirReg;
	}

	public static String getEscribirReg() {
		return ESCRIBIR_REG;
	}

	public static String getLeerReg() {
		return LEER_REG;
	}
	
	
	
}
