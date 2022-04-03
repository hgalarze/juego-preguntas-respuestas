package Controlador;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import Modelo.Celda;
import Modelo.CeldaConPregunta;
import Modelo.CeldaSimple;
import Modelo.JuegoPreguntasyRespuestas;
import Vista.VistaAyudaGeneral;
import Vista.VistaJuego;

public class ControladorJuego implements ActionListener {

	private VistaJuego vistaJuego;
	private JuegoPreguntasyRespuestas modeloJuego;
	
	public ControladorJuego (String jugador) {
		this.setVistaJuego(new VistaJuego(jugador, this));
		this.setModeloJuego(new JuegoPreguntasyRespuestas());
		this.getModeloJuego().setJugador(jugador);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Comenzar de nuevo")) this.ComenzarDeNuevo();
		if (e.getActionCommand().equals("Salir")) this.Salir();
		if (e.getActionCommand().equals("Ayuda general")) this.AyudaGeneral();
		if (e.getActionCommand().equals("Ayuda ejercicio")) this.AyudaEjercicio();
		if (e.getSource().equals(this.getVistaJuego().getBtnDado())) this.Dado();
		if (e.getSource().equals(this.getVistaJuego().getBtnArriba())) {
			this.getModeloJuego().moverFicha(0);
			this.desplazarFicha(this.getModeloJuego().getPista().getUbicacionActual().getPosicionX(), this.getModeloJuego().getPista().getUbicacionActual().getPosicionY());
			this.cargarConsigna();
			this.ActualizarCantidadMovimiento();
		}
		if (e.getSource().equals(this.getVistaJuego().getBtnDerecha())) {
			this.getModeloJuego().moverFicha(1);
			this.desplazarFicha(this.getModeloJuego().getPista().getUbicacionActual().getPosicionX(), this.getModeloJuego().getPista().getUbicacionActual().getPosicionY());
			this.cargarConsigna();
			this.ActualizarCantidadMovimiento();
		}
		if (e.getSource().equals(this.getVistaJuego().getBtnAbajo())) {
			this.getModeloJuego().moverFicha(2);
			this.desplazarFicha(this.getModeloJuego().getPista().getUbicacionActual().getPosicionX(), this.getModeloJuego().getPista().getUbicacionActual().getPosicionY());
			this.cargarConsigna();
			this.ActualizarCantidadMovimiento();
		}
		if (e.getSource().equals(this.getVistaJuego().getBtnIzquierda())) {
			this.getModeloJuego().moverFicha(3);
			this.desplazarFicha(this.getModeloJuego().getPista().getUbicacionActual().getPosicionX(), this.getModeloJuego().getPista().getUbicacionActual().getPosicionY());
			this.cargarConsigna();
			this.ActualizarCantidadMovimiento();
		};
		if (e.getActionCommand().equals("Responder")) this.responder();
	}
	
	public void ComenzarDeNuevo() {
		this.vistaJuego.dispose();
		String jugador = this.modeloJuego.getJugador();
		this.modeloJuego = new JuegoPreguntasyRespuestas();
		this.vistaJuego = new VistaJuego(jugador, this);
	}
	
	public void desplazarFicha (int x, int y) {
		for (int fila = 0; fila < 7; fila++) {
			for (int columna = 0; columna < 7; columna++) {
				if (this.getVistaJuego().getTablero()[fila][columna].getIcon() != null){
					//System.out.println(this.getVistaJuego().getTablero()[fila][columna].getIcon().toString());
					this.getVistaJuego().getTablero()[fila][columna].setIcon(null);
					this.getVistaJuego().getTablero()[x][y].setIcon(this.getVistaJuego().getFicha());
					break;
				}
			}
		}
	}
	
	public void ActualizarCantidadMovimiento () {
		this.getModeloJuego().getEstadoJuego().setCantidadMovimiento(this.getModeloJuego().getEstadoJuego().getCantidadMovimiento() + 1);
		this.getVistaJuego().getProgressBarJuego().setValue((this.getModeloJuego().getEstadoJuego().getCantidadMovimiento() * 100) /49);
		this.getVistaJuego().getLblPorcentajeDelJuego().setText(String.valueOf((this.getModeloJuego().getEstadoJuego().getCantidadMovimiento() * 100) /49) + "%");
		if (this.getVistaJuego().getProgressBarJuego().getValue() == 100) {
			this.getModeloJuego().getAnimador().FinalizacionJuego();
			JOptionPane.showMessageDialog(this.vistaJuego, "Finalizacion del Juego", "Felicitaciones ha finalizado el juego.\nSu puntaje fue de: " + this.getModeloJuego().getEstadoJuego().getPuntajeActual(), JOptionPane.INFORMATION_MESSAGE);
			this.getVistaJuego().dispose();
			this.setModeloJuego(null);
			new ControladorPrincipal();
		}
	}
	
	public void cargarConsigna () {
		Celda c = this.getModeloJuego().getPista().getCeldaActual();
		if (c instanceof CeldaSimple) {
			CeldaSimple cs = (CeldaSimple) c;
			this.getVistaJuego().getLblPuntajeobtenido().setText("Se obtuvo " + cs.getPuntaje() + " puntos");
			this.getModeloJuego().getAnimador().animar(this.getModeloJuego().getEstadoJuego().getPuntajeActual(), cs.getPuntaje());
			this.getModeloJuego().getEstadoJuego().setPuntajeDeCeldasVacias(this.getModeloJuego().getEstadoJuego().getPuntajeDeCeldasVacias() + cs.getPuntaje());
			this.getModeloJuego().getEstadoJuego().setPuntajeActual(this.getModeloJuego().getEstadoJuego().getPuntajeActual() + cs.getPuntaje());
			this.getVistaJuego().getLblNroPuntaje().setText(String.valueOf(this.getModeloJuego().getEstadoJuego().getPuntajeActual()));
			this.getVistaJuego().getBtnDado().setEnabled(true);
		}
		if (c instanceof CeldaConPregunta) {
			CeldaConPregunta cnp = (CeldaConPregunta) c;
			this.getVistaJuego().getRdbtnRespuesta1().setEnabled(true);
			this.getVistaJuego().getRdbtnRespuesta2().setEnabled(true);
			this.getVistaJuego().getRdbtnRespuesta3().setEnabled(true);
			this.getVistaJuego().getTxtPregunta().setEnabled(true);
			this.getVistaJuego().getBtnResponder().setEnabled(true);
			this.getVistaJuego().getTxtPregunta().setText(cnp.getPregunta());
			this.getVistaJuego().getRdbtnRespuesta1().setText(cnp.getRespuesta1());
			this.getVistaJuego().getRdbtnRespuesta2().setText(cnp.getRespuesta2());
			this.getVistaJuego().getRdbtnRespuesta3().setText(cnp.getRespuesta3());
		}
		this.getVistaJuego().getBtnAbajo().setEnabled(false);
		this.getVistaJuego().getBtnArriba().setEnabled(false);
		this.getVistaJuego().getBtnDerecha().setEnabled(false);
		this.getVistaJuego().getBtnIzquierda().setEnabled(false);
	}
	
	public void responder () {
		CeldaConPregunta c = (CeldaConPregunta) this.getModeloJuego().getPista().getCeldaActual();
		
		if (this.getVistaJuego().getRdbtnRespuesta1().isSelected()){
			if (this.getModeloJuego().responder(this.getVistaJuego().getRdbtnRespuesta1().getText())) {
				this.getVistaJuego().getLblPuntajeobtenido().setText("Se obtuvo " + (12 + c.getPuntaje()) + " puntos");
				this.getModeloJuego().getAnimador().animar(this.getModeloJuego().getEstadoJuego().getPuntajeActual(), c.getPuntaje());
				this.getModeloJuego().getEstadoJuego().setPuntajeActual(this.getModeloJuego().getEstadoJuego().getPuntajeActual() + 12 + c.getPuntaje());
				this.getVistaJuego().getLblNroPuntaje().setText(String.valueOf(this.getModeloJuego().getEstadoJuego().getPuntajeActual()));
			}else {
				this.getVistaJuego().getLblPuntajeobtenido().setText("Se obtuvo " + (-3 + c.getPuntaje()) + " puntos.");
				this.getModeloJuego().getAnimador().animar(this.getModeloJuego().getEstadoJuego().getPuntajeActual(), c.getPuntaje());
				this.getModeloJuego().getEstadoJuego().setPuntajeActual(this.getModeloJuego().getEstadoJuego().getPuntajeActual() - 3);
				this.getVistaJuego().getLblNroPuntaje().setText(String.valueOf(this.getModeloJuego().getEstadoJuego().getPuntajeActual()));
			}
		}
		if (this.getVistaJuego().getRdbtnRespuesta2().isSelected()){
			if(this.getModeloJuego().responder(this.getVistaJuego().getRdbtnRespuesta2().getText())) {
				this.getVistaJuego().getLblPuntajeobtenido().setText("Se obtuvo " + (12 + c.getPuntaje()) + " puntos.");
				this.getModeloJuego().getAnimador().animar(this.getModeloJuego().getEstadoJuego().getPuntajeActual(), c.getPuntaje());
				this.getModeloJuego().getEstadoJuego().setPuntajeActual(this.getModeloJuego().getEstadoJuego().getPuntajeActual() + 12 + c.getPuntaje());
				this.getVistaJuego().getLblNroPuntaje().setText(String.valueOf(this.getModeloJuego().getEstadoJuego().getPuntajeActual()));
			}else {
				this.getVistaJuego().getLblPuntajeobtenido().setText("Se obtuvo " + (-3 + c.getPuntaje()) + " puntos.");
				this.getModeloJuego().getAnimador().animar(this.getModeloJuego().getEstadoJuego().getPuntajeActual(), c.getPuntaje());
				this.getModeloJuego().getEstadoJuego().setPuntajeActual(this.getModeloJuego().getEstadoJuego().getPuntajeActual() - 3);
				this.getVistaJuego().getLblNroPuntaje().setText(String.valueOf(this.getModeloJuego().getEstadoJuego().getPuntajeActual()));
			}
		}
		if (this.getVistaJuego().getRdbtnRespuesta3().isSelected()){
			if(this.getModeloJuego().responder(this.getVistaJuego().getRdbtnRespuesta3().getText())) {
				this.getVistaJuego().getLblPuntajeobtenido().setText("Se obtuvo " + (12 + c.getPuntaje()) + " puntos.");
				this.getModeloJuego().getAnimador().animar(this.getModeloJuego().getEstadoJuego().getPuntajeActual(), c.getPuntaje());
				this.getModeloJuego().getEstadoJuego().setPuntajeActual(this.getModeloJuego().getEstadoJuego().getPuntajeActual() + 12 + c.getPuntaje());
				this.getVistaJuego().getLblNroPuntaje().setText(String.valueOf(this.getModeloJuego().getEstadoJuego().getPuntajeActual()));
			}else {
				this.getVistaJuego().getLblPuntajeobtenido().setText("Se obtuvo " + (-3 + c.getPuntaje()) + " puntos.");
				this.getModeloJuego().getAnimador().animar(this.getModeloJuego().getEstadoJuego().getPuntajeActual(), c.getPuntaje());
				this.getModeloJuego().getEstadoJuego().setPuntajeActual(this.getModeloJuego().getEstadoJuego().getPuntajeActual() - 3);
				this.getVistaJuego().getLblNroPuntaje().setText(String.valueOf(this.getModeloJuego().getEstadoJuego().getPuntajeActual()));
			}
		}
		this.getVistaJuego().getRdbtnRespuesta1().setEnabled(false);
		this.getVistaJuego().getRdbtnRespuesta2().setEnabled(false);
		this.getVistaJuego().getRdbtnRespuesta3().setEnabled(false);
		this.getVistaJuego().getTxtPregunta().setEnabled(false);
		this.getVistaJuego().getBtnResponder().setEnabled(false);
		this.getVistaJuego().getBtnDado().setEnabled(true);
	}
	
	public void Dado () {
		this.getVistaJuego().getBtnArriba().setEnabled(false);
		this.getVistaJuego().getBtnAbajo().setEnabled(false);
		this.getVistaJuego().getBtnDerecha().setEnabled(false);
		this.getVistaJuego().getBtnIzquierda().setEnabled(false);
		int n = this.getModeloJuego().tirar();
		this.getVistaJuego().getLblPuntajeUltimaTirada().setText("Obtuvo un " + String.valueOf(n) + " al tirar el dado por ultima vez");
		switch (n){
		case 2:
		case 4:
			this.getVistaJuego().getBtnDerecha().setEnabled(true);
			this.getVistaJuego().getBtnAbajo().setEnabled(true);
			break;
		case 3:
		case 6:
			this.getVistaJuego().getBtnIzquierda().setEnabled(true);
			this.getVistaJuego().getBtnArriba().setEnabled(true);
			break;
		default:
			this.getVistaJuego().getBtnArriba().setEnabled(true);
			this.getVistaJuego().getBtnAbajo().setEnabled(true);
			this.getVistaJuego().getBtnDerecha().setEnabled(true);
			break;
		}
		this.vistaJuego.getBtnDado().setEnabled(false);
	}

	public void Salir() {
		System.exit(0);
	}
	
	public void AyudaGeneral () {
		new ControladorAyudaGeneral();
	}
	
	public void AyudaEjercicio () {
		new ControladorAyudaEjercicio();
	}
	
	public VistaJuego getVistaJuego() {
		return vistaJuego;
	}

	public void setVistaJuego(VistaJuego vistaJuego) {
		this.vistaJuego = vistaJuego;
	}

	public JuegoPreguntasyRespuestas getModeloJuego() {
		return modeloJuego;
	}

	public void setModeloJuego(JuegoPreguntasyRespuestas modeloJuego) {
		this.modeloJuego = modeloJuego;
	}
	
	

}
