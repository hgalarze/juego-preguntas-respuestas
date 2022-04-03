package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Controlador.ControladorAyudaEjercicio;

import java.awt.Font;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class VistaAyudaEjercicio extends JFrame {
	private ControladorAyudaEjercicio controlador;
	private JButton btnVolver;
	private JButton btnSiguiente;
	private JButton btnAnterior;
	private JLabel lblPagina;
	private JTextPane txtpnAyudaejercicio;
	private JLabel lblNro;
	private JLabel imagen;

	public VistaAyudaEjercicio( ControladorAyudaEjercicio controlador) {
		
		this.controlador = controlador;
		setTitle("Ayuda del ejercicio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 689, 500);
		getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(204, 11, 2, 387);
		getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 409, 664, 2);
		getContentPane().add(separator_1);
		
		btnVolver = new JButton("Salir");
		btnVolver.setIcon(new ImageIcon("../Trabajo Final Avanzada/img/salir.PNG"));
		btnVolver.setBounds(561, 420, 113, 41);
		getContentPane().add(btnVolver);
		btnVolver.addActionListener(this.controlador);
		
		JLabel lblFiguraNro = new JLabel("Figura Nro.:");
		lblFiguraNro.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFiguraNro.setBounds(10, 11, 96, 20);
		getContentPane().add(lblFiguraNro);
		
		lblNro = new JLabel("0");
		lblNro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNro.setBounds(112, 11, 82, 19);
		getContentPane().add(lblNro);
		
		txtpnAyudaejercicio = new JTextPane();
		txtpnAyudaejercicio.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		txtpnAyudaejercicio.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		txtpnAyudaejercicio.setEditable(false);
		txtpnAyudaejercicio.setBackground(SystemColor.control);
		txtpnAyudaejercicio.setBounds(216, 42, 458, 313);
		getContentPane().add(txtpnAyudaejercicio);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSiguiente.setIcon(new ImageIcon("../Trabajo Final Avanzada/img/Siguiente.png"));
		btnSiguiente.setHorizontalTextPosition(SwingConstants.LEFT);
		btnSiguiente.setEnabled(false);
		btnSiguiente.setBounds(555, 366, 119, 30);
		getContentPane().add(btnSiguiente);
		btnSiguiente.addActionListener(this.controlador);
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.setHorizontalAlignment(SwingConstants.LEFT);
		btnAnterior.setIcon(new ImageIcon("../Trabajo Final Avanzada/img/Atras.png"));
		btnAnterior.setEnabled(false);
		btnAnterior.setBounds(216, 365, 119, 31);
		getContentPane().add(btnAnterior);
		btnAnterior.addActionListener(this.controlador);
		
		lblPagina = new JLabel("Pagina 0 de 0");
		lblPagina.setHorizontalAlignment(SwingConstants.CENTER);
		lblPagina.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblPagina.setBounds(335, 366, 219, 30);
		getContentPane().add(lblPagina);
		
	    this.setImage(new JLabel(""));
		this.getImage().setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.getImage().setBounds(10, 42, 184, 131);
		getContentPane().add(this.getImage());
		
		
		
		this.setResizable(false);
		this.setVisible(true);
	}

	public ControladorAyudaEjercicio getControlador() {
		return controlador;
	}

	public void setControlador(ControladorAyudaEjercicio controlador) {
		this.controlador = controlador;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JButton getBtnSiguiente() {
		return btnSiguiente;
	}

	public void setBtnSiguiente(JButton btnSiguiente) {
		this.btnSiguiente = btnSiguiente;
	}

	public JButton getBtnAnterior() {
		return btnAnterior;
	}

	public void setBtnAnterior(JButton btnAnterior) {
		this.btnAnterior = btnAnterior;
	}

	public JLabel getLblPagina() {
		return lblPagina;
	}

	public void setLblPagina(JLabel lblPagina) {
		this.lblPagina = lblPagina;
	}

	public JTextPane getTxtpnAyudaejercicio() {
		return txtpnAyudaejercicio;
	}

	public void setTxtpnAyudaejercicio(JTextPane txtpnAyudaejercicio) {
		this.txtpnAyudaejercicio = txtpnAyudaejercicio;
	}

	public JLabel getImage() {
		return imagen;
	}

	public void setImage(JLabel canvas) {
		this.imagen = canvas;
		imagen.setHorizontalAlignment(SwingConstants.CENTER);
	}

	public JLabel getLblNro() {
		return lblNro;
	}

	public void setLblNro(JLabel lblNro) {
		this.lblNro = lblNro;
	}
}
