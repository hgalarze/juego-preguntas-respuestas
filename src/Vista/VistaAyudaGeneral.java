package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import Controlador.ControladorAyudaGeneral;

import java.awt.SystemColor;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.border.EtchedBorder;

public class VistaAyudaGeneral extends JFrame {
	
	private JTextArea txtAyudaGeneral;
	private JButton btnSalir;
	private JButton btnSeguir;
	private ControladorAyudaGeneral controladorAyudasGeneral;
	private JButton btnAnterior;

	public VistaAyudaGeneral(ControladorAyudaGeneral controlador) {
		
		this.setTitle("Ayuda General");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBounds(100, 100, 600, 350);
		getContentPane().setLayout(null);
		this.setControladorAyudasGeneral(controlador);
		
		this.setTxtAyudaGeneral(new JTextArea());
		this.getTxtAyudaGeneral().setBackground(SystemColor.control);
		this.getTxtAyudaGeneral().setBounds(10, 11, 574, 203);
		getContentPane().add(this.getTxtAyudaGeneral());
		
		this.setBtnSalir(new JButton("Salir"));
		this.getBtnSalir().setIcon(new ImageIcon("../Trabajo Final Avanzada/img/salir.PNG"));
		this.getBtnSalir().setBounds(464, 270, 120, 41);
		getContentPane().add(this.getBtnSalir());
		
		this.getBtnSalir().addActionListener(this.getControladorAyudasGeneral());
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 259, 574, 2);
		getContentPane().add(separator);
		
		this.setBtnSeguir(new JButton("Seguir"));
		this.getBtnSeguir().setHorizontalAlignment(SwingConstants.RIGHT);
		this.getBtnSeguir().setIcon(new ImageIcon("../Trabajo Final Avanzada/img/Siguiente.png"));
		this.getBtnSeguir().setHorizontalTextPosition(SwingConstants.LEFT);
		this.getBtnSeguir().setBounds(464, 225, 120, 30);
		getContentPane().add(this.getBtnSeguir());
		
		this.getBtnSeguir().addActionListener(this.getControladorAyudasGeneral());		
		
		btnAnterior = new JButton("Volver");
		btnAnterior.setEnabled(false);
		btnAnterior.setHorizontalAlignment(SwingConstants.LEFT);
		btnAnterior.setIcon(new ImageIcon("../Trabajo Final Avanzada/img/Atras.png"));
		btnAnterior.setBounds(10, 225, 120, 30);
		getContentPane().add(btnAnterior);
		
		btnAnterior.addActionListener(this.getControladorAyudasGeneral());
		
		
		this.setResizable(false);
		this.setVisible(true);
	}


	public JTextArea getTxtAyudaGeneral() {
		return txtAyudaGeneral;
	}

	public void setTxtAyudaGeneral(JTextArea txtAyudaGeneral) {
		this.txtAyudaGeneral = txtAyudaGeneral;
		txtAyudaGeneral.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		txtAyudaGeneral.setWrapStyleWord(true);
		txtAyudaGeneral.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		txtAyudaGeneral.setLineWrap(true);
		txtAyudaGeneral.setEditable(false);
	}

	public ControladorAyudaGeneral getControladorAyudasGeneral() {
		return controladorAyudasGeneral;
	}

	public void setControladorAyudasGeneral(
			ControladorAyudaGeneral controladorAyudasGeneral) {
		this.controladorAyudasGeneral = controladorAyudasGeneral;
	}


	public JButton getBtnSeguir() {
		return btnSeguir;
	}


	public void setBtnSeguir(JButton btnSeguir) {
		this.btnSeguir = btnSeguir;
	}


	public JButton getBtnAnterior() {
		return btnAnterior;
	}


	public void setBtnAnterior(JButton btnAnterior) {
		this.btnAnterior = btnAnterior;
	}


	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}
}
