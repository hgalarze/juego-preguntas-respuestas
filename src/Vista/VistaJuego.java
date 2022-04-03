package Vista;

	// Imports //

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import Controlador.ControladorJuego;
import javax.swing.border.LineBorder;

	// Class: VistaJuego //

public class VistaJuego extends JFrame {
	private JLabel lblJugador;
	private JLabel lblNombrejugador;
	private JLabel lblEstilo;
	private JLabel lblExperto;
	private JLabel lblPuntaje;
	private JLabel lblNroPuntaje;
	private JButton btnDado;
	private JButton btnIzquierda;
	private JButton btnDerecha;
	private JButton btnArriba;
	private JButton btnAbajo;
	private JButton btnAyudageneral;
	private JButton btnAyudaejercicio;
	private JButton btnSalir;
	private JButton btnComenzarDeNuevo;
	private JLabel lblPregunta;
	private JSeparator separator1;
	private JSeparator separator2;
	private JSeparator separator3;
	private JSeparator separator4;
	private JTextPane txtPregunta;
	private JLabel lblRespuestas;
	private JRadioButton rdbtnRespuesta1;
	private JRadioButton rdbtnRespuesta2;
	private JRadioButton rdbtnRespuesta3;
	private ButtonGroup opcionesRespuestas;
	private JLabel lblPuntajeUltimaTirada;
	private JProgressBar progressBarJuego;
	private JLabel lblPorcentajeDelJuego;
	private ControladorJuego controladorJuego;
	private JLabel lblPorcentajeJuegoTitulo;
	private JButton btnResponder;
	private JLabel[][] tablero;
	private ImageIcon ficha;
	private JLabel lblLabel1;
	private JLabel lblLabel2;
	private JLabel lblLabel3;
	private JLabel lblLabel4;
	private JLabel lblLabel5;
	private JLabel lblLabel6;
	private JLabel lblLabel7;
	private JLabel lblLabel8;
	private JLabel lblLabel9;
	private JLabel lblLabel10;
	private JLabel lblLabel11;
	private JLabel lblLabel12;
	private JLabel lblLabel13;
	private JLabel lblLabel14;
	private JLabel lblLabel15;
	private JLabel lblLabel16;
	private JLabel lblLabel17;
	private JLabel lblLabel18;
	private JLabel lblLabel19;
	private JLabel lblLabel20;
	private JLabel lblLabel21;
	private JLabel lblLabel22;
	private JLabel lblLabel23;
	private JLabel lblLabel24;
	private JLabel lblLabel25;
	private JLabel lblLabel26;
	private JLabel lblLabel27;
	private JLabel lblLabel28;
	private JLabel lblLabel29;
	private JLabel lblLabel30;
	private JLabel lblLabel31;
	private JLabel lblLabel32;
	private JLabel lblLabel33;
	private JLabel lblLabel34;
	private JLabel lblLabel35;
	private JLabel lblLabel36;
	private JLabel lblLabel37;
	private JLabel lblLabel38;
	private JLabel lblLabel39;
	private JLabel lblLabel40;
	private JLabel lblLabel41;
	private JLabel lblLabel42;
	private JLabel lblLabel43;
	private JLabel lblLabel44;
	private JLabel lblLabel45;
	private JLabel lblLabel46;
	private JLabel lblLabel47;
	private JLabel lblLabel48;
	private JLabel lblLabel49;
	private JLabel lblPuntajeobtenido;
	
	// Constructor //

	public VistaJuego(String jugador, ControladorJuego controladorJuego) {
		
		this.setTitle("Juego de Preguntas y Respuestas");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 807, 605);
		getContentPane().setLayout(null);
		
		this.setControladorJuego(controladorJuego);
		
		this.setLblJugador(new JLabel("Jugador:"));
		this.getLblJugador().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		this.getLblJugador().setBounds(10, 11, 54, 15);
		getContentPane().add(this.getLblJugador());
		
		this.setLblNombrejugador(new JLabel(jugador));
		this.getLblNombrejugador().setForeground(new Color(0, 128, 0));
		this.getLblNombrejugador().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		this.getLblNombrejugador().setBounds(74, 12, 80, 14);
		getContentPane().add(this.getLblNombrejugador());
		
		this.setLblEstilo(new JLabel("Estilo:"));
		this.getLblEstilo().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		this.getLblEstilo().setBounds(10, 32, 37, 15);
		getContentPane().add(this.getLblEstilo());
		
		this.setLblExperto(new JLabel("Experto"));
		this.getLblExperto().setForeground(new Color(0, 128, 0));
		this.getLblExperto().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		this.getLblExperto().setBounds(57, 33, 46, 14);
		getContentPane().add(this.getLblExperto());
		
		this.setLblPuntaje(new JLabel("Puntaje Total:"));
		this.getLblPuntaje().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		this.getLblPuntaje().setBounds(542, 11, 170, 29);
		getContentPane().add(this.getLblPuntaje());
		
		this.setLblNroPuntaje(new JLabel("0"));
		this.getLblNroPuntaje().setForeground(new Color(0, 128, 0));
		this.getLblNroPuntaje().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		this.getLblNroPuntaje().setBounds(722, 11, 68, 28);
		getContentPane().add(this.getLblNroPuntaje());
		
		this.setBtnDado(new JButton(""));
		this.getBtnDado().setIcon(new ImageIcon("../Trabajo Final Avanzada/img/dado2.png"));
		this.getBtnDado().setBounds(629, 141, 62, 50);
		getContentPane().add(this.getBtnDado());
		this.getBtnDado().addActionListener(this.getControladorJuego());
		
		this.setBtnIzquierda(new JButton(""));
		this.getBtnIzquierda().setIcon(new ImageIcon("../Trabajo Final Avanzada/img/Atras.png"));
		this.getBtnIzquierda().setBounds(530, 141, 89, 50);
		getContentPane().add(this.getBtnIzquierda());
		this.getBtnIzquierda().addActionListener(this.getControladorJuego());
		
		this.setBtnDerecha(new JButton(""));
		this.getBtnDerecha().setIcon(new ImageIcon("../Trabajo Final Avanzada/img/Siguiente.png"));
		this.getBtnDerecha().setBounds(701, 141, 89, 50);
		getContentPane().add(this.getBtnDerecha());
		this.getBtnDerecha().addActionListener(this.getControladorJuego());
		
		this.setBtnArriba(new JButton(""));
		this.getBtnArriba().setIcon(new ImageIcon("../Trabajo Final Avanzada/img/arriba.png"));
		this.getBtnArriba().setBounds(629, 59, 62, 78);
		getContentPane().add(this.getBtnArriba());
		this.getBtnArriba().addActionListener(this.getControladorJuego());
		
		this.setBtnAbajo(new JButton(""));
		this.getBtnAbajo().setIcon(new ImageIcon("../Trabajo Final Avanzada/img/abajo.png"));
		this.getBtnAbajo().setBounds(629, 202, 62, 78);
		getContentPane().add(this.getBtnAbajo());
		this.getBtnAbajo().addActionListener(this.getControladorJuego());
		
		this.setBtnAyudageneral(new JButton("Ayuda general"));
		this.getBtnAyudageneral().setIcon(new ImageIcon("../Trabajo Final Avanzada/img/ayuda_gral.PNG"));
		this.getBtnAyudageneral().setBounds(570, 488, 105, 77);
		this.getBtnAyudageneral().setHorizontalTextPosition(SwingConstants.CENTER);
		this.getBtnAyudageneral().setVerticalTextPosition(SwingConstants.BOTTOM);
		getContentPane().add(this.getBtnAyudageneral());
		this.getBtnAyudageneral().addActionListener(this.getControladorJuego());
		
		this.setBtnAyudaejercicio(new JButton("Ayuda ejercicio"));
		this.getBtnAyudaejercicio().setIcon(new ImageIcon("../Trabajo Final Avanzada/img/ayuda_ejercicio.PNG"));
		this.getBtnAyudaejercicio().setBounds(455, 488, 105, 77);
		this.getBtnAyudaejercicio().setHorizontalTextPosition(SwingConstants.CENTER);
		this.getBtnAyudaejercicio().setVerticalTextPosition(SwingConstants.BOTTOM);
		getContentPane().add(this.getBtnAyudaejercicio());
		this.getBtnAyudaejercicio().addActionListener(this.getControladorJuego());
		
		this.setBtnSalir(new JButton("Salir"));
		this.getBtnSalir().setIcon(new ImageIcon("../Trabajo Final Avanzada/img/salir.PNG"));
		this.getBtnSalir().setBounds(685, 488, 105, 77);
		this.getBtnSalir().setHorizontalTextPosition(SwingConstants.CENTER);
		this.getBtnSalir().setVerticalTextPosition(SwingConstants.BOTTOM);
		getContentPane().add(this.getBtnSalir());
		this.getBtnSalir().addActionListener(this.getControladorJuego());
		
		this.setBtnComenzarDeNuevo(new JButton("Comenzar de nuevo"));
		this.getBtnComenzarDeNuevo().setIcon(new ImageIcon("../Trabajo Final Avanzada/img/volver.png"));
		this.getBtnComenzarDeNuevo().setBounds(10, 488, 129, 77);
		this.getBtnComenzarDeNuevo().setHorizontalTextPosition(SwingConstants.CENTER);
		this.getBtnComenzarDeNuevo().setVerticalTextPosition(SwingConstants.BOTTOM);
		getContentPane().add(this.getBtnComenzarDeNuevo());
		this.getBtnComenzarDeNuevo().addActionListener(this.getControladorJuego());
		
		this.setLblPregunta(new JLabel("Pregunta"));
		this.getLblPregunta().setFont(new Font("Tahoma", Font.BOLD, 14));
		this.getLblPregunta().setBounds(222, 219, 64, 17);
		getContentPane().add(this.getLblPregunta());
		
		this.setSeparator1(new JSeparator());
		this.getSeparator1().setBounds(10, 236, 491, 2);
		getContentPane().add(this.getSeparator1());
		
		this.setTxtPregunta(new JTextPane());
		this.getTxtPregunta().setText("Texto");
		this.getTxtPregunta().setBackground(SystemColor.control);
		this.getTxtPregunta().setBounds(10, 249, 491, 56);
		getContentPane().add(this.getTxtPregunta());
		
		this.setLblRespuestas(new JLabel("Respuestas"));
		this.getLblRespuestas().setFont(new Font("Tahoma", Font.BOLD, 12));
		this.getLblRespuestas().setBounds(222, 316, 70, 15);
		getContentPane().add(this.getLblRespuestas());
		
		this.setSeparator2(new JSeparator());
		this.getSeparator2().setBounds(10, 331, 491, 2);
		getContentPane().add(this.getSeparator2());
		
		this.setRdbtnRespuesta1(new JRadioButton("Respuesta 1"));
		this.getRdbtnRespuesta1().setVerticalAlignment(SwingConstants.TOP);
		this.getRdbtnRespuesta1().setBounds(10, 340, 491, 23);
		getContentPane().add(this.getRdbtnRespuesta1());
		this.getRdbtnRespuesta1().addActionListener(this.getControladorJuego());
		
		this.setRdbtnRespuesta2(new JRadioButton("Respuesta 2"));
		this.getRdbtnRespuesta2().setBounds(10, 366, 491, 23);
		getContentPane().add(this.getRdbtnRespuesta2());
		this.getRdbtnRespuesta2().addActionListener(this.getControladorJuego());
		
		this.setRdbtnRespuesta3(new JRadioButton("Respuesta 3"));
		this.getRdbtnRespuesta3().setBounds(10, 391, 491, 23);
		getContentPane().add(this.getRdbtnRespuesta3());
		this.getRdbtnRespuesta3().addActionListener(this.getControladorJuego());
		
		this.setOpcionesRespuestas(new ButtonGroup());
		this.getOpcionesRespuestas().add(this.getRdbtnRespuesta1());
		this.getOpcionesRespuestas().add(this.getRdbtnRespuesta2());
		this.getOpcionesRespuestas().add(this.getRdbtnRespuesta3());
		
		this.setLblPuntajeUltimaTirada(new JLabel("Puntaje Ultima Tirada"));
		this.getLblPuntajeUltimaTirada().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblPuntajeUltimaTirada().setForeground(new Color(0, 128, 0));
		this.getLblPuntajeUltimaTirada().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		this.getLblPuntajeUltimaTirada().setBounds(530, 291, 260, 14);
		getContentPane().add(this.getLblPuntajeUltimaTirada());
		
		this.setProgressBarJuego(new JProgressBar());
		this.getProgressBarJuego().setBounds(530, 418, 199, 23);
		getContentPane().add(this.getProgressBarJuego());
		
		this.setLblPorcentajeDelJuego(new JLabel("100%"));
		this.getLblPorcentajeDelJuego().setFont(new Font("Tahoma", Font.BOLD, 16));
		this.getLblPorcentajeDelJuego().setBounds(728, 418, 62, 23);
		getContentPane().add(this.getLblPorcentajeDelJuego());
		
		this.setSeparator3(new JSeparator());
		this.getSeparator3().setOrientation(SwingConstants.VERTICAL);
		this.getSeparator3().setBounds(519, 59, 1, 422);
		getContentPane().add(this.getSeparator3());
		
		this.setLblPorcentajeJuegoTitulo(new JLabel("Porcentaje del juego"));
		this.getLblPorcentajeJuegoTitulo().setFont(new Font("Tahoma", Font.BOLD, 12));
		this.getLblPorcentajeJuegoTitulo().setBounds(585, 391, 127, 15);
		getContentPane().add(this.getLblPorcentajeJuegoTitulo());
		
		this.setSeparator4(new JSeparator());
		this.getSeparator4().setBounds(530, 406, 259, 2);
		getContentPane().add(this.getSeparator4());
		
		this.setBtnResponder(new JButton("Responder"));
		this.getBtnResponder().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		this.getBtnResponder().setBounds(10, 421, 491, 56);
		getContentPane().add(this.getBtnResponder());
		
		this.ficha = new ImageIcon("../Trabajo Final Avanzada/img/ficha2.jpg");
		
		this.setLblLabel1(new JLabel(""));
		this.getLblLabel1().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel1().setIcon(this.ficha);
		this.getLblLabel1().setOpaque(true);
		this.getLblLabel1().setBackground(Color.WHITE);
		this.getLblLabel1().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel1().setBounds(10, 94, 72, 17);
		getContentPane().add(this.getLblLabel1());
		
		this.setLblLabel2(new JLabel(""));
		this.getLblLabel2().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel2().setOpaque(true);
		this.getLblLabel2().setBackground(Color.WHITE);
		this.getLblLabel2().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel2().setBounds(81, 94, 72, 17);
		getContentPane().add(this.getLblLabel2());
		
		this.setLblLabel3(new JLabel(""));
		this.getLblLabel3().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel3().setOpaque(true);
		this.getLblLabel3().setBackground(Color.WHITE);
		this.getLblLabel3().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel3().setBounds(152, 94, 72, 17);
		getContentPane().add(this.getLblLabel3());
		
		this.setLblLabel4(new JLabel(""));
		this.getLblLabel4().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel4().setOpaque(true);
		this.getLblLabel4().setBackground(Color.WHITE);
		this.getLblLabel4().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel4().setBounds(223, 94, 72, 17);
		getContentPane().add(this.getLblLabel4());
		
		this.setLblLabel5(new JLabel(""));
		this.getLblLabel5().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel5().setOpaque(true);
		this.getLblLabel5().setBackground(Color.WHITE);
		this.getLblLabel5().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel5().setBounds(294, 94, 72, 17);
		getContentPane().add(this.getLblLabel5());
		
		this.setLblLabel6( new JLabel(""));
		this.getLblLabel6().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel6().setOpaque(true);
		this.getLblLabel6().setBackground(Color.WHITE);
		this.getLblLabel6().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel6().setBounds(365, 94, 72, 17);
		getContentPane().add(this.getLblLabel6());
		
		this.setLblLabel7(new JLabel(""));
		this.getLblLabel7().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel7().setOpaque(true);
		this.getLblLabel7().setBackground(Color.WHITE);
		this.getLblLabel7().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel7().setBounds(436, 94, 72, 17);
		getContentPane().add(this.getLblLabel7());
		
		this.setLblLabel8(new JLabel(""));
		this.getLblLabel8().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel8().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel8().setOpaque(true);
		this.getLblLabel8().setBackground(Color.WHITE);
		this.getLblLabel8().setBounds(10, 110, 72, 17);
		getContentPane().add(this.getLblLabel8());
		
		this.setLblLabel9(new JLabel(""));
		this.getLblLabel9().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel9().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel9().setOpaque(true);
		this.getLblLabel9().setBackground(Color.WHITE);
		this.getLblLabel9().setBounds(81, 110, 72, 17);
		getContentPane().add(this.getLblLabel9());
		
		this.setLblLabel10(new JLabel(""));
		this.getLblLabel10().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel10().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel10().setOpaque(true);
		this.getLblLabel10().setBackground(Color.WHITE);
		this.getLblLabel10().setBounds(152, 110, 72, 17);
		getContentPane().add(this.getLblLabel10());
		
		this.setLblLabel11(new JLabel(""));
		this.getLblLabel11().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel11().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel11().setOpaque(true);
		this.getLblLabel11().setBackground(Color.WHITE);
		this.getLblLabel11().setBounds(223, 110, 72, 17);
		getContentPane().add(this.getLblLabel11());
		
		this.setLblLabel12(new JLabel(""));
		this.getLblLabel12().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel12().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel12().setOpaque(true);
		this.getLblLabel12().setBackground(Color.WHITE);
		this.getLblLabel12().setBounds(294, 110, 72, 17);
		getContentPane().add(this.getLblLabel12());
		
		this.setLblLabel13(new JLabel(""));
		this.getLblLabel13().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel13().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel13().setOpaque(true);
		this.getLblLabel13().setBackground(Color.WHITE);
		this.getLblLabel13().setBounds(365, 110, 72, 17);
		getContentPane().add(this.getLblLabel13());
		
		this.setLblLabel14(new JLabel(""));
		this.getLblLabel14().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel14().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel14().setOpaque(true);
		this.getLblLabel14().setBackground(Color.WHITE);
		this.getLblLabel14().setBounds(436, 110, 72, 17);
		getContentPane().add(this.getLblLabel14());
		
		this.setLblLabel15(new JLabel(""));
		this.getLblLabel15().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel15().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel15().setOpaque(true);
		this.getLblLabel15().setBackground(Color.WHITE);
		this.getLblLabel15().setBounds(10, 126, 72, 17);
		getContentPane().add(this.getLblLabel15());
		
		this.setLblLabel16(new JLabel(""));
		this.getLblLabel16().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel16().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel16().setOpaque(true);
		this.getLblLabel16().setBackground(Color.WHITE);
		this.getLblLabel16().setBounds(81, 126, 72, 17);
		getContentPane().add(this.getLblLabel16());
		
		this.setLblLabel17(new JLabel(""));
		this.getLblLabel17().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel17().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel17().setOpaque(true);
		this.getLblLabel17().setBackground(Color.WHITE);
		this.getLblLabel17().setBounds(152, 126, 72, 17);
		getContentPane().add(this.getLblLabel17());
		
		this.setLblLabel18(new JLabel(""));
		this.getLblLabel18().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel18().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel18().setOpaque(true);
		this.getLblLabel18().setBackground(Color.WHITE);
		this.getLblLabel18().setBounds(223, 126, 72, 17);
		getContentPane().add(	this.getLblLabel18());
		
		this.setLblLabel19(new JLabel(""));
		this.getLblLabel19().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel19().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel19().setOpaque(true);
		this.getLblLabel19().setBackground(Color.WHITE);
		this.getLblLabel19().setBounds(294, 126, 72, 17);
		getContentPane().add(this.getLblLabel19());
		
		this.setLblLabel20(new JLabel(""));
		this.getLblLabel20().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel20().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel20().setOpaque(true);
		this.getLblLabel20().setBackground(Color.WHITE);
		this.getLblLabel20().setBounds(365, 126, 72, 17);
		getContentPane().add(this.getLblLabel20());
		
		this.setLblLabel21(new JLabel(""));
		this.getLblLabel21().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel21().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel21().setOpaque(true);
		this.getLblLabel21().setBackground(Color.WHITE);
		this.getLblLabel21().setBounds(436, 126, 72, 17);
		getContentPane().add(this.getLblLabel21());
		
		this.setLblLabel22(new JLabel(""));
		this.getLblLabel22().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel22().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel22().setOpaque(true);
		this.getLblLabel22().setBackground(Color.WHITE);
		this.getLblLabel22().setBounds(10, 142, 72, 17);
		getContentPane().add(this.getLblLabel22());
		
		this.setLblLabel23(new JLabel(""));
		this.getLblLabel23().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel23().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel23().setOpaque(true);
		this.getLblLabel23().setBackground(Color.WHITE);
		this.getLblLabel23().setBounds(81, 142, 72, 17);
		getContentPane().add(this.getLblLabel23());
		
		this.setLblLabel24(new JLabel(""));
		this.getLblLabel24().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel24().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel24().setOpaque(true);
		this.getLblLabel24().setBackground(Color.WHITE);
		this.getLblLabel24().setBounds(152, 142, 72, 17);
		getContentPane().add(this.getLblLabel24());
		
		this.setLblLabel25(new JLabel(""));
		this.getLblLabel25().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel25().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel25().setOpaque(true);
		this.getLblLabel25().setBackground(Color.WHITE);
		this.getLblLabel25().setBounds(223, 142, 72, 17);
		getContentPane().add(this.getLblLabel25());
		
		this.setLblLabel26(new JLabel(""));
		this.getLblLabel26().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel26().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel26().setOpaque(true);
		this.getLblLabel26().setBackground(Color.WHITE);
		this.getLblLabel26().setBounds(294, 142, 72, 17);
		getContentPane().add(this.getLblLabel26());
		
		this.setLblLabel27(new JLabel(""));
		this.getLblLabel27().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel27().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel27().setOpaque(true);
		this.getLblLabel27().setBackground(Color.WHITE);
		this.getLblLabel27().setBounds(365, 142, 72, 17);
		getContentPane().add(this.getLblLabel27());
		
		this.setLblLabel28(new JLabel(""));
		this.getLblLabel28().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel28().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel28().setOpaque(true);
		this.getLblLabel28().setBackground(Color.WHITE);
		this.getLblLabel28().setBounds(436, 142, 72, 17);
		getContentPane().add(this.getLblLabel28());
		
		this.setLblLabel29(new JLabel(""));
		this.getLblLabel29().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel29().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel29().setOpaque(true);
		this.getLblLabel29().setBackground(Color.WHITE);
		this.getLblLabel29().setBounds(10, 158, 72, 17);
		getContentPane().add(this.getLblLabel29());
		
		this.setLblLabel30(new JLabel(""));
		this.getLblLabel30().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel30().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel30().setOpaque(true);
		this.getLblLabel30().setBackground(Color.WHITE);
		this.getLblLabel30().setBounds(81, 158, 72, 17);
		getContentPane().add(this.getLblLabel30());
		
		this.setLblLabel31(new JLabel(""));
		this.getLblLabel31().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel31().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel31().setOpaque(true);
		this.getLblLabel31().setBackground(Color.WHITE);
		this.getLblLabel31().setBounds(152, 158, 72, 17);
		getContentPane().add(this.getLblLabel31());
		
		this.setLblLabel32(new JLabel(""));
		this.getLblLabel32().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel32().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel32().setOpaque(true);
		this.getLblLabel32().setBackground(Color.WHITE);
		this.getLblLabel32().setBounds(223, 158, 72, 17);
		getContentPane().add(this.getLblLabel32());
		
		this.setLblLabel33(new JLabel(""));
		this.getLblLabel33().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel33().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel33().setOpaque(true);
		this.getLblLabel33().setBackground(Color.WHITE);
		this.getLblLabel33().setBounds(294, 158, 72, 17);
		getContentPane().add(this.getLblLabel33());
		
		this.setLblLabel34(new JLabel(""));
		this.getLblLabel34().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel34().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel34().setOpaque(true);
		this.getLblLabel34().setBackground(Color.WHITE);
		this.getLblLabel34().setBounds(365, 158, 72, 17);
		getContentPane().add(this.getLblLabel34());
		
		this.setLblLabel35(new JLabel(""));
		this.getLblLabel35().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel35().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel35().setOpaque(true);
		this.getLblLabel35().setBackground(Color.WHITE);
		this.getLblLabel35().setBounds(436, 158, 72, 17);
		getContentPane().add(this.getLblLabel35());
		
		this.setLblLabel36(new JLabel(""));
		this.getLblLabel36().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel36().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel36().setOpaque(true);
		this.getLblLabel36().setBackground(Color.WHITE);
		this.getLblLabel36().setBounds(10, 174, 72, 17);
		getContentPane().add(this.getLblLabel36());
		
		this.setLblLabel37(new JLabel(""));
		this.getLblLabel37().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel37().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel37().setOpaque(true);
		this.getLblLabel37().setBackground(Color.WHITE);
		this.getLblLabel37().setBounds(81, 174, 72, 17);
		getContentPane().add(this.getLblLabel37());
		
		this.setLblLabel38(new JLabel(""));
		this.getLblLabel38().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel38().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel38().setOpaque(true);
		this.getLblLabel38().setBackground(Color.WHITE);
		this.getLblLabel38().setBounds(152, 174, 72, 17);
		getContentPane().add(this.getLblLabel38());
		
		this.setLblLabel39(new JLabel(""));
		this.getLblLabel39().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel39().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel39().setOpaque(true);
		this.getLblLabel39().setBackground(Color.WHITE);
		this.getLblLabel39().setBounds(223, 174, 72, 17);
		getContentPane().add(this.getLblLabel39());
		
		this.setLblLabel40(new JLabel(""));
		this.getLblLabel40().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel40().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel40().setOpaque(true);
		this.getLblLabel40().setBackground(Color.WHITE);
		this.getLblLabel40().setBounds(294, 174, 72, 17);
		getContentPane().add(this.getLblLabel40());
		
		this.setLblLabel41(new JLabel(""));
		this.getLblLabel41().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel41().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel41().setOpaque(true);
		this.getLblLabel41().setBackground(Color.WHITE);
		this.getLblLabel41().setBounds(365, 174, 72, 17);
		getContentPane().add(this.getLblLabel41());
		
		this.setLblLabel42(new JLabel(""));
		this.getLblLabel42().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel42().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel42().setOpaque(true);
		this.getLblLabel42().setBackground(Color.WHITE);
		this.getLblLabel42().setBounds(436, 174, 72, 17);
		getContentPane().add(this.getLblLabel42());
		
		this.setLblLabel43(new JLabel(""));
		this.getLblLabel43().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel43().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel43().setOpaque(true);
		this.getLblLabel43().setBackground(Color.WHITE);
		this.getLblLabel43().setBounds(10, 190, 72, 17);
		getContentPane().add(this.getLblLabel43());
		
		this.setLblLabel44(new JLabel(""));
		this.getLblLabel44().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel44().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel44().setOpaque(true);
		this.getLblLabel44().setBackground(Color.WHITE);
		this.getLblLabel44().setBounds(81, 190, 72, 17);
		getContentPane().add(this.getLblLabel44());
		
		this.setLblLabel45(new JLabel(""));
		this.getLblLabel45().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel45().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel45().setOpaque(true);
		this.getLblLabel45().setBackground(Color.WHITE);
		this.getLblLabel45().setBounds(152, 190, 72, 17);
		getContentPane().add(this.getLblLabel45());
		
		this.setLblLabel46(new JLabel(""));
		this.getLblLabel46().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel46().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel46().setOpaque(true);
		this.getLblLabel46().setBackground(Color.WHITE);
		this.getLblLabel46().setBounds(223, 190, 72, 17);
		getContentPane().add(this.getLblLabel46());
		
		this.setLblLabel47(new JLabel(""));
		this.getLblLabel47().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel47().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel47().setOpaque(true);
		this.getLblLabel47().setBackground(Color.WHITE);
		this.getLblLabel47().setBounds(294, 190, 72, 17);
		getContentPane().add(this.getLblLabel47());
		
		this.setLblLabel48(new JLabel(""));
		this.getLblLabel48().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel48().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel48().setOpaque(true);
		this.getLblLabel48().setBackground(Color.WHITE);
		this.getLblLabel48().setBounds(365, 190, 72, 17);
		getContentPane().add(this.getLblLabel48());
		
		this.setLblLabel49(new JLabel(""));
		this.getLblLabel49().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblLabel49().setBorder(new LineBorder(new Color(0, 0, 0)));
		this.getLblLabel49().setOpaque(true);
		this.getLblLabel49().setBackground(Color.WHITE);
		this.getLblLabel49().setBounds(436, 190, 72, 17);
		getContentPane().add(this.getLblLabel49());
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 75, 491, 2);
		getContentPane().add(separator);
		
		JLabel lblTablero = new JLabel("Tablero");
		lblTablero.setHorizontalAlignment(SwingConstants.CENTER);
		lblTablero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTablero.setBounds(222, 58, 64, 17);
		getContentPane().add(lblTablero);
		this.getBtnResponder().addActionListener(this.getControladorJuego());
		
		this.tablero = new JLabel[7][7];
		this.tablero[0][0] = lblLabel1;
		this.tablero[0][1] = lblLabel2;
		this.tablero[0][2] = lblLabel3;
		this.tablero[0][3] = lblLabel4;
		this.tablero[0][4] = lblLabel5;
		this.tablero[0][5] = lblLabel6;
		this.tablero[0][6] = lblLabel7;
		this.tablero[1][0] = lblLabel8;
		this.tablero[1][1] = lblLabel9;
		this.tablero[1][2] = lblLabel10;
		this.tablero[1][3] = lblLabel11;
		this.tablero[1][4] = lblLabel12;
		this.tablero[1][5] = lblLabel13;
		this.tablero[1][6] = lblLabel14;
		this.tablero[2][0] = lblLabel15;
		this.tablero[2][1] = lblLabel16;
		this.tablero[2][2] = lblLabel17;
		this.tablero[2][3] = lblLabel18;
		this.tablero[2][4] = lblLabel19;
		this.tablero[2][5] = lblLabel20;
		this.tablero[2][6] = lblLabel21;
		this.tablero[3][0] = lblLabel22;
		this.tablero[3][1] = lblLabel23;
		this.tablero[3][2] = lblLabel24;
		this.tablero[3][3] = lblLabel25;
		this.tablero[3][4] = lblLabel26;
		this.tablero[3][5] = lblLabel27;
		this.tablero[3][6] = lblLabel28;
		this.tablero[4][0] = lblLabel29;
		this.tablero[4][1] = lblLabel30;
		this.tablero[4][2] = lblLabel31;
		this.tablero[4][3] = lblLabel32;
		this.tablero[4][4] = lblLabel33;
		this.tablero[4][5] = lblLabel34;
		this.tablero[4][6] = lblLabel35;
		this.tablero[5][0] = lblLabel36;
		this.tablero[5][1] = lblLabel37;
		this.tablero[5][2] = lblLabel38;
		this.tablero[5][3] = lblLabel39;
		this.tablero[5][4] = lblLabel40;
		this.tablero[5][5] = lblLabel41;
		this.tablero[5][6] = lblLabel42;
		this.tablero[6][0] = lblLabel43;
		this.tablero[6][1] = lblLabel44;
		this.tablero[6][2] = lblLabel45;
		this.tablero[6][3] = lblLabel46;
		this.tablero[6][4] = lblLabel47;
		this.tablero[6][5] = lblLabel48;
		this.tablero[6][6] = lblLabel49;
		
		this.setLblPuntajeobtenido(new JLabel("PuntajeObtenido"));
		this.getLblPuntajeobtenido().setForeground(new Color(0, 128, 0));
		this.getLblPuntajeobtenido().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		this.getLblPuntajeobtenido().setHorizontalAlignment(SwingConstants.CENTER);
		this.getLblPuntajeobtenido().setBounds(530, 362, 261, 18);
		getContentPane().add(this.getLblPuntajeobtenido());

		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}

	// Methods //
	
	
	
	// Getters & Setters //
	
	public ImageIcon getFicha() {
		return ficha;
	}

	public void setFicha(ImageIcon ficha) {
		this.ficha = ficha;
	}

	public JButton getBtnResponder() {
		return btnResponder;
	}

	public void setBtnResponder(JButton btnResponder) {
		this.btnResponder = btnResponder;
		btnResponder.setEnabled(false);
	}

	public JLabel[][] getTablero() {
		return tablero;
	}

	public void setTablero(JLabel[][] tablero) {
		this.tablero = tablero;
	}
	
	public JLabel getCelda(int x, int y) {
		return this.getTablero()[x][y];
	}

	public JLabel getLblJugador() {
		return lblJugador;
	}

	public void setLblJugador(JLabel lblJugador) {
		this.lblJugador = lblJugador;
	}

	public JLabel getLblNombrejugador() {
		return lblNombrejugador;
	}

	public void setLblNombrejugador(JLabel lblNombrejugador) {
		this.lblNombrejugador = lblNombrejugador;
	}

	public JLabel getLblEstilo() {
		return lblEstilo;
	}

	public void setLblEstilo(JLabel lblEstilo) {
		this.lblEstilo = lblEstilo;
	}

	public JLabel getLblExperto() {
		return lblExperto;
	}

	public void setLblExperto(JLabel lblExperto) {
		this.lblExperto = lblExperto;
	}

	public JLabel getLblPuntaje() {
		return lblPuntaje;
	}

	public void setLblPuntaje(JLabel lblPuntaje) {
		this.lblPuntaje = lblPuntaje;
	}

	public JLabel getLblNroPuntaje() {
		return lblNroPuntaje;
	}

	public void setLblNroPuntaje(JLabel lblNroPuntaje) {
		this.lblNroPuntaje = lblNroPuntaje;
	}

	public JButton getBtnDado() {
		return btnDado;
	}

	public void setBtnDado(JButton btnDado) {
		this.btnDado = btnDado;
	}

	public JButton getBtnIzquierda() {
		return btnIzquierda;
	}

	public void setBtnIzquierda(JButton btnIzquierda) {
		this.btnIzquierda = btnIzquierda;
		btnIzquierda.setEnabled(false);
	}

	public JButton getBtnDerecha() {
		return btnDerecha;
	}

	public void setBtnDerecha(JButton btnDerecha) {
		this.btnDerecha = btnDerecha;
		btnDerecha.setEnabled(false);
	}

	public JButton getBtnArriba() {
		return btnArriba;
	}

	public void setBtnArriba(JButton btnArriba) {
		this.btnArriba = btnArriba;
		btnArriba.setEnabled(false);
	}

	public JButton getBtnAbajo() {
		return btnAbajo;
	}

	public void setBtnAbajo(JButton btnAbajo) {
		this.btnAbajo = btnAbajo;
		btnAbajo.setEnabled(false);
	}

	public JButton getBtnAyudageneral() {
		return btnAyudageneral;
	}

	public void setBtnAyudageneral(JButton btnAyudageneral) {
		this.btnAyudageneral = btnAyudageneral;
	}

	public JButton getBtnAyudaejercicio() {
		return btnAyudaejercicio;
	}

	public void setBtnAyudaejercicio(JButton btnAyudaejercicio) {
		this.btnAyudaejercicio = btnAyudaejercicio;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnComenzarDeNuevo() {
		return btnComenzarDeNuevo;
	}

	public void setBtnComenzarDeNuevo(JButton btnComenzarDeNuevo) {
		this.btnComenzarDeNuevo = btnComenzarDeNuevo;
	}

	public JLabel getLblPregunta() {
		return lblPregunta;
	}

	public void setLblPregunta(JLabel lblPregunta) {
		this.lblPregunta = lblPregunta;
	}

	public JSeparator getSeparator1() {
		return separator1;
	}

	public void setSeparator1(JSeparator separator1) {
		this.separator1 = separator1;
	}

	public JSeparator getSeparator2() {
		return separator2;
	}

	public void setSeparator2(JSeparator separator2) {
		this.separator2 = separator2;
	}

	public JTextPane getTxtPregunta() {
		return txtPregunta;
	}

	public void setTxtPregunta(JTextPane txtPregunta) {
		this.txtPregunta = txtPregunta;
		txtPregunta.setEnabled(false);
		txtPregunta.setEditable(false);
	}

	public JLabel getLblRespuestas() {
		return lblRespuestas;
	}

	public void setLblRespuestas(JLabel lblRespuestas) {
		this.lblRespuestas = lblRespuestas;
	}

	public JRadioButton getRdbtnRespuesta1() {
		return rdbtnRespuesta1;
	}

	public void setRdbtnRespuesta1(JRadioButton rdbtnRespuesta1) {
		this.rdbtnRespuesta1 = rdbtnRespuesta1;
		rdbtnRespuesta1.setSelected(true);
		rdbtnRespuesta1.setEnabled(false);
	}

	public JRadioButton getRdbtnRespuesta2() {
		return rdbtnRespuesta2;
	}

	public void setRdbtnRespuesta2(JRadioButton rdbtnRespuesta2) {
		this.rdbtnRespuesta2 = rdbtnRespuesta2;
		rdbtnRespuesta2.setEnabled(false);
	}

	public JRadioButton getRdbtnRespuesta3() {
		return rdbtnRespuesta3;
	}

	public void setRdbtnRespuesta3(JRadioButton rdbtnRespuesta3) {
		this.rdbtnRespuesta3 = rdbtnRespuesta3;
		rdbtnRespuesta3.setEnabled(false);
	}

	public JLabel getLblPuntajeUltimaTirada() {
		return lblPuntajeUltimaTirada;
	}

	public void setLblPuntajeUltimaTirada(JLabel lblPuntajeUltimaTirada) {
		this.lblPuntajeUltimaTirada = lblPuntajeUltimaTirada;
	}

	public ControladorJuego getControladorJuego() {
		return controladorJuego;
	}

	public void setControladorJuego(ControladorJuego controladorJuego) {
		this.controladorJuego = controladorJuego;
	}

	public ButtonGroup getOpcionesRespuestas() {
		return opcionesRespuestas;
	}

	public void setOpcionesRespuestas(ButtonGroup opcionesRespuestas) {
		this.opcionesRespuestas = opcionesRespuestas;
	}

	public JProgressBar getProgressBarJuego() {
		return progressBarJuego;
	}

	public void setProgressBarJuego(JProgressBar progressBarJuego) {
		this.progressBarJuego = progressBarJuego;
	}

	public JLabel getLblPorcentajeDelJuego() {
		return lblPorcentajeDelJuego;
	}

	public void setLblPorcentajeDelJuego(JLabel lblPorcentajeDelJuego) {
		this.lblPorcentajeDelJuego = lblPorcentajeDelJuego;
		lblPorcentajeDelJuego.setHorizontalAlignment(SwingConstants.RIGHT);
	}

	public JSeparator getSeparator3() {
		return separator3;
	}

	public void setSeparator3(JSeparator separator3) {
		this.separator3 = separator3;
	}

	public JSeparator getSeparator4() {
		return separator4;
	}

	public void setSeparator4(JSeparator separator4) {
		this.separator4 = separator4;
	}

	public JLabel getLblPorcentajeJuegoTitulo() {
		return lblPorcentajeJuegoTitulo;
	}

	public void setLblPorcentajeJuegoTitulo(JLabel lblPorcentajeJuegoTitulo) {
		this.lblPorcentajeJuegoTitulo = lblPorcentajeJuegoTitulo;
	}

	private JLabel getLblLabel1() {
		return lblLabel1;
	}

	private void setLblLabel1(JLabel lblLabel1) {
		this.lblLabel1 = lblLabel1;
	}

	private JLabel getLblLabel2() {
		return lblLabel2;
	}

	private void setLblLabel2(JLabel lblLabel2) {
		this.lblLabel2 = lblLabel2;
	}

	private JLabel getLblLabel3() {
		return lblLabel3;
	}

	private void setLblLabel3(JLabel lblLabel3) {
		this.lblLabel3 = lblLabel3;
	}

	private JLabel getLblLabel4() {
		return lblLabel4;
	}

	private void setLblLabel4(JLabel lblLabel4) {
		this.lblLabel4 = lblLabel4;
	}

	private JLabel getLblLabel5() {
		return lblLabel5;
	}

	private void setLblLabel5(JLabel lblLabel5) {
		this.lblLabel5 = lblLabel5;
	}

	private JLabel getLblLabel6() {
		return lblLabel6;
	}

	private void setLblLabel6(JLabel lblLabel6) {
		this.lblLabel6 = lblLabel6;
	}

	private JLabel getLblLabel7() {
		return lblLabel7;
	}

	private void setLblLabel7(JLabel lblLabel7) {
		this.lblLabel7 = lblLabel7;
	}

	private JLabel getLblLabel8() {
		return lblLabel8;
	}

	private void setLblLabel8(JLabel lblLabel8) {
		this.lblLabel8 = lblLabel8;
	}

	private JLabel getLblLabel9() {
		return lblLabel9;
	}

	private void setLblLabel9(JLabel lblLabel9) {
		this.lblLabel9 = lblLabel9;
	}

	private JLabel getLblLabel10() {
		return lblLabel10;
	}

	private void setLblLabel10(JLabel lblLabel10) {
		this.lblLabel10 = lblLabel10;
	}

	private JLabel getLblLabel11() {
		return lblLabel11;
	}

	private void setLblLabel11(JLabel lblLabel11) {
		this.lblLabel11 = lblLabel11;
	}

	private JLabel getLblLabel12() {
		return lblLabel12;
	}

	private void setLblLabel12(JLabel lblLabel12) {
		this.lblLabel12 = lblLabel12;
	}

	private JLabel getLblLabel13() {
		return lblLabel13;
	}

	private void setLblLabel13(JLabel lblLabel13) {
		this.lblLabel13 = lblLabel13;
	}

	private JLabel getLblLabel14() {
		return lblLabel14;
	}

	private void setLblLabel14(JLabel lblLabel14) {
		this.lblLabel14 = lblLabel14;
	}

	private JLabel getLblLabel15() {
		return lblLabel15;
	}

	private void setLblLabel15(JLabel lblLabel15) {
		this.lblLabel15 = lblLabel15;
	}

	private JLabel getLblLabel16() {
		return lblLabel16;
	}

	private void setLblLabel16(JLabel lblLabel16) {
		this.lblLabel16 = lblLabel16;
	}

	private JLabel getLblLabel17() {
		return lblLabel17;
	}

	private void setLblLabel17(JLabel lblLabel17) {
		this.lblLabel17 = lblLabel17;
	}

	private JLabel getLblLabel18() {
		return lblLabel18;
	}

	private void setLblLabel18(JLabel lblLabel18) {
		this.lblLabel18 = lblLabel18;
	}

	private JLabel getLblLabel19() {
		return lblLabel19;
	}

	private void setLblLabel19(JLabel lblLabel19) {
		this.lblLabel19 = lblLabel19;
	}

	private JLabel getLblLabel20() {
		return lblLabel20;
	}

	private void setLblLabel20(JLabel lblLabel20) {
		this.lblLabel20 = lblLabel20;
	}

	private JLabel getLblLabel21() {
		return lblLabel21;
	}

	private void setLblLabel21(JLabel lblLabel21) {
		this.lblLabel21 = lblLabel21;
	}

	private JLabel getLblLabel22() {
		return lblLabel22;
	}

	private void setLblLabel22(JLabel lblLabel22) {
		this.lblLabel22 = lblLabel22;
	}

	private JLabel getLblLabel23() {
		return lblLabel23;
	}

	private void setLblLabel23(JLabel lblLabel23) {
		this.lblLabel23 = lblLabel23;
	}

	private JLabel getLblLabel24() {
		return lblLabel24;
	}

	private void setLblLabel24(JLabel lblLabel24) {
		this.lblLabel24 = lblLabel24;
	}

	private JLabel getLblLabel25() {
		return lblLabel25;
	}

	private void setLblLabel25(JLabel lblLabel25) {
		this.lblLabel25 = lblLabel25;
	}

	private JLabel getLblLabel26() {
		return lblLabel26;
	}

	private void setLblLabel26(JLabel lblLabel26) {
		this.lblLabel26 = lblLabel26;
	}

	private JLabel getLblLabel27() {
		return lblLabel27;
	}

	private void setLblLabel27(JLabel lblLabel27) {
		this.lblLabel27 = lblLabel27;
	}

	private JLabel getLblLabel28() {
		return lblLabel28;
	}

	private void setLblLabel28(JLabel lblLabel28) {
		this.lblLabel28 = lblLabel28;
	}

	private JLabel getLblLabel29() {
		return lblLabel29;
	}

	private void setLblLabel29(JLabel lblLabel29) {
		this.lblLabel29 = lblLabel29;
	}

	private JLabel getLblLabel30() {
		return lblLabel30;
	}

	private void setLblLabel30(JLabel lblLabel30) {
		this.lblLabel30 = lblLabel30;
	}

	private JLabel getLblLabel31() {
		return lblLabel31;
	}

	private void setLblLabel31(JLabel lblLabel31) {
		this.lblLabel31 = lblLabel31;
	}

	private JLabel getLblLabel32() {
		return lblLabel32;
	}

	private void setLblLabel32(JLabel lblLabel32) {
		this.lblLabel32 = lblLabel32;
	}

	private JLabel getLblLabel33() {
		return lblLabel33;
	}

	private void setLblLabel33(JLabel lblLabel33) {
		this.lblLabel33 = lblLabel33;
	}

	private JLabel getLblLabel34() {
		return lblLabel34;
	}

	private void setLblLabel34(JLabel lblLabel34) {
		this.lblLabel34 = lblLabel34;
	}

	private JLabel getLblLabel35() {
		return lblLabel35;
	}

	private void setLblLabel35(JLabel lblLabel35) {
		this.lblLabel35 = lblLabel35;
	}

	private JLabel getLblLabel36() {
		return lblLabel36;
	}

	private void setLblLabel36(JLabel lblLabel36) {
		this.lblLabel36 = lblLabel36;
	}

	private JLabel getLblLabel37() {
		return lblLabel37;
	}

	private void setLblLabel37(JLabel lblLabel37) {
		this.lblLabel37 = lblLabel37;
	}

	private JLabel getLblLabel38() {
		return lblLabel38;
	}

	private void setLblLabel38(JLabel lblLabel38) {
		this.lblLabel38 = lblLabel38;
	}

	private JLabel getLblLabel39() {
		return lblLabel39;
	}

	private void setLblLabel39(JLabel lblLabel39) {
		this.lblLabel39 = lblLabel39;
	}

	private JLabel getLblLabel40() {
		return lblLabel40;
	}

	private void setLblLabel40(JLabel lblLabel40) {
		this.lblLabel40 = lblLabel40;
	}

	private JLabel getLblLabel41() {
		return lblLabel41;
	}

	private void setLblLabel41(JLabel lblLabel41) {
		this.lblLabel41 = lblLabel41;
	}

	private JLabel getLblLabel42() {
		return lblLabel42;
	}

	private void setLblLabel42(JLabel lblLabel42) {
		this.lblLabel42 = lblLabel42;
	}

	private JLabel getLblLabel43() {
		return lblLabel43;
	}

	private void setLblLabel43(JLabel lblLabel43) {
		this.lblLabel43 = lblLabel43;
	}

	private JLabel getLblLabel44() {
		return lblLabel44;
	}

	private void setLblLabel44(JLabel lblLabel44) {
		this.lblLabel44 = lblLabel44;
	}

	private JLabel getLblLabel45() {
		return lblLabel45;
	}

	private void setLblLabel45(JLabel lblLabel45) {
		this.lblLabel45 = lblLabel45;
	}

	private JLabel getLblLabel46() {
		return lblLabel46;
	}

	private void setLblLabel46(JLabel lblLabel46) {
		this.lblLabel46 = lblLabel46;
	}

	private JLabel getLblLabel47() {
		return lblLabel47;
	}

	private void setLblLabel47(JLabel lblLabel47) {
		this.lblLabel47 = lblLabel47;
	}

	private JLabel getLblLabel48() {
		return lblLabel48;
	}

	private void setLblLabel48(JLabel lblLabel48) {
		this.lblLabel48 = lblLabel48;
	}

	private JLabel getLblLabel49() {
		return lblLabel49;
	}

	private void setLblLabel49(JLabel lblLabel49) {
		this.lblLabel49 = lblLabel49;
	}

	public JLabel getLblPuntajeobtenido() {
		return lblPuntajeobtenido;
	}

	public void setLblPuntajeobtenido(JLabel lblPuntajeobtenido) {
		this.lblPuntajeobtenido = lblPuntajeobtenido;
	}
}
