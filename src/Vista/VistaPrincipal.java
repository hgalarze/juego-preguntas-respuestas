package Vista;

	// Imports //

import java.awt.*;
import javax.swing.*;
import Controlador.ControladorPrincipal;

	// Class: VistaPrincipal //

public class VistaPrincipal extends JFrame {

	// Attributes //
	
	private JTextField txtJuegador;
	private JLabel lblBienvenidoAlJuego;
	private JLabel lblDe;
	private JLabel lblPreguntasYRespuestas;
	private JLabel lblJugador;
	private JButton btnComenzar;
	private JButton btnSalir;
	private ControladorPrincipal controladorprincipal;

	// Constructor //
	
	public VistaPrincipal(ControladorPrincipal controlador) {

		this.setControladorprincipal(controlador);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 316, 245);
		this.setTitle("Juego de Preguntas y Respuetas");
		this.getContentPane().setLayout(null);
		
		this.setLblBienvenidoAlJuego(new JLabel("Bienvenido al Juego"));
		this.getLblBienvenidoAlJuego().setFont(new Font("Tahoma", Font.BOLD, 18));
		this.getLblBienvenidoAlJuego().setBounds(64, 11, 180, 22);
		this.getContentPane().add(this.getLblBienvenidoAlJuego());
		
		this.setLblDe(new JLabel("De"));
		this.getLblDe().setFont(new Font("Tahoma", Font.BOLD, 18));
		this.getLblDe().setBounds(142, 44, 25, 22);
		this.getContentPane().add(this.getLblDe());
		
		this.setLblPreguntasYRespuestas(new JLabel("Preguntas y Respuestas"));
		this.getLblPreguntasYRespuestas().setFont(new Font("Tahoma", Font.BOLD, 18));
		this.getLblPreguntasYRespuestas().setBounds(46, 77, 216, 22);
		this.getContentPane().add(this.getLblPreguntasYRespuestas());
		
		this.setTxtJuegador(new JTextField());
		this.getTxtJuegador().setBounds(94, 123, 171, 20);
		this.getTxtJuegador().setColumns(10);
		this.getContentPane().add(this.getTxtJuegador());
		
		this.setLblJugador(new JLabel("Jugador:"));
		this.getLblJugador().setBounds(46, 126, 46, 14);
		this.getContentPane().add(this.getLblJugador());
		
		this.setBtnComenzar(new JButton("Comenzar"));
		this.getBtnComenzar().setIcon(new ImageIcon("../Trabajo Final Avanzada/img/Siguiente.png"));
		this.getBtnComenzar().setHorizontalTextPosition(SwingConstants.LEFT);
		this.getBtnComenzar().setBounds(182, 167, 117, 38);
		this.getContentPane().add(this.getBtnComenzar());
		this.getBtnComenzar().addActionListener(this.getControladorprincipal());
		
		this.setBtnSalir(new JButton("Salir"));
		this.getBtnSalir().setHorizontalAlignment(SwingConstants.LEFT);
		this.getBtnSalir().setIcon(new ImageIcon("../Trabajo Final Avanzada/img/salir.PNG"));
		this.getBtnSalir().setBounds(10, 167, 117, 38);
		this.getContentPane().add(this.getBtnSalir());
		this.getBtnSalir().addActionListener(this.getControladorprincipal());
		
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}

	// Getters & Setters //
	
	public JTextField getTxtJuegador() {
		return txtJuegador;
	}

	public void setTxtJuegador(JTextField txtJuegador) {
		this.txtJuegador = txtJuegador;
	}

	public JLabel getLblBienvenidoAlJuego() {
		return lblBienvenidoAlJuego;
	}

	public void setLblBienvenidoAlJuego(JLabel lblBienvenidoAlJuego) {
		this.lblBienvenidoAlJuego = lblBienvenidoAlJuego;
	}

	public JLabel getLblDe() {
		return lblDe;
	}

	public void setLblDe(JLabel lblDe) {
		this.lblDe = lblDe;
	}

	public JLabel getLblPreguntasYRespuestas() {
		return lblPreguntasYRespuestas;
	}

	public void setLblPreguntasYRespuestas(JLabel lblPreguntasYRespuestas) {
		this.lblPreguntasYRespuestas = lblPreguntasYRespuestas;
	}

	public JLabel getLblJugador() {
		return lblJugador;
	}

	public void setLblJugador(JLabel lblJugador) {
		this.lblJugador = lblJugador;
	}

	public JButton getBtnComenzar() {
		return btnComenzar;
	}

	public void setBtnComenzar(JButton btnComenzar) {
		this.btnComenzar = btnComenzar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}
	
	public ControladorPrincipal getControladorprincipal() {
		return controladorprincipal;
	}

	public void setControladorprincipal(ControladorPrincipal controladorprincipal) {
		this.controladorprincipal = controladorprincipal;
	}
	
}
