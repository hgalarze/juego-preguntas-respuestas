package Controlador;

	// Imports //

import java.awt.event.*;
import javax.swing.*;
import Modelo.ModeloPrincipal;
import Vista.VistaPrincipal;

	// Class: ControladorPrincipal //

public class ControladorPrincipal implements ActionListener {
	
	// Attributes //
	
	private VistaPrincipal vistaPrincipal;
	private ModeloPrincipal modeloPrincipal;
	
	// Constructor //
	
	public ControladorPrincipal () {
		this.setVistaPrincipal(new VistaPrincipal(this));
		this.setModeloPrincipal(new ModeloPrincipal());
	}

	// Methods //
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Salir")) this.Salir();
		if (e.getActionCommand().equals("Comenzar")) this.Comenzar();
		
	}
	
	public void Salir () {
		System.exit(0);
	}
	
	public void Comenzar () {
		if (this.getModeloPrincipal().verificarJugador(this.getVistaPrincipal().getTxtJuegador().getText())){
			this.getVistaPrincipal().dispose();
			new ControladorJuego(this.getVistaPrincipal().getTxtJuegador().getText());
		}else {
			new JOptionPane().showMessageDialog(this.getVistaPrincipal(), this.getModeloPrincipal().MSG_ERROR_JUGADOR_VACIO, "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	// Getters & Setters //
	
	public VistaPrincipal getVistaPrincipal() {
		return vistaPrincipal;
	}

	public void setVistaPrincipal(VistaPrincipal vistaPrincipal) {
		this.vistaPrincipal = vistaPrincipal;
	}

	public ModeloPrincipal getModeloPrincipal() {
		return modeloPrincipal;
	}

	public void setModeloPrincipal(ModeloPrincipal modeloPrincipal) {
		this.modeloPrincipal = modeloPrincipal;
	}

}
