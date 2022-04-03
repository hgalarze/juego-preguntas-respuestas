package Controlador;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import Modelo.Ayuda;
import Vista.VistaAyudaEjercicio;

public class ControladorAyudaEjercicio implements ActionListener{
	
	private Ayuda modeloAyudaEjercicio;
	private VistaAyudaEjercicio vistaAyudaEjercicio;
	
	public ControladorAyudaEjercicio () {
		this.setModeloAyudaEjercicio(new Ayuda());
		this.setVistaAyudaEjercicio(new VistaAyudaEjercicio(this));
		this.CargarAyuda();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Salir")) this.vistaAyudaEjercicio.dispose();
		if (e.getActionCommand().equals("Siguiente"))  this.SiguientePagina();
		if(e.getActionCommand().equals("Anterior")) this.AnteriorPagina();
	}
	
	public void CargarAyuda () {
		String urlImagen = this.getModeloAyudaEjercicio().ImagenAsociada(this.getModeloAyudaEjercicio().getImagen());
		this.getVistaAyudaEjercicio().getImage().setIcon(new ImageIcon(urlImagen));
		this.getVistaAyudaEjercicio().getTxtpnAyudaejercicio().setText(this.getModeloAyudaEjercicio().getTextoAyudaEjercicio().firstElement());
		this.getVistaAyudaEjercicio().getLblNro().setText(String.valueOf(this.getModeloAyudaEjercicio().getPagina()));
		this.getVistaAyudaEjercicio().getLblPagina().setText("Pagina " + this.getModeloAyudaEjercicio().getPagina() + " de " + this.getModeloAyudaEjercicio().getTextoAyudaEjercicio().size());
		if (this.getModeloAyudaEjercicio().getTextoAyudaEjercicio().size() > this.getModeloAyudaEjercicio().getPagina()) {
			this.getVistaAyudaEjercicio().getBtnSiguiente().setEnabled(true);
		}
	}
	
	public void SiguientePagina () {
		if (this.getModeloAyudaEjercicio().getPagina() < this.getModeloAyudaEjercicio().getTextoAyudaEjercicio().size()){
			String texto = this.getModeloAyudaEjercicio().SiguientePagina(this.getModeloAyudaEjercicio().getTextoAyudaEjercicio());
			String urlImagen = this.getModeloAyudaEjercicio().ImagenAsociada(this.getModeloAyudaEjercicio().getImagen());
			this.getVistaAyudaEjercicio().getImage().setIcon(new ImageIcon(urlImagen));
			this.getVistaAyudaEjercicio().getTxtpnAyudaejercicio().setText(texto);
			this.getVistaAyudaEjercicio().getLblNro().setText(String.valueOf(this.getModeloAyudaEjercicio().getPagina()));
			this.getVistaAyudaEjercicio().getLblPagina().setText("Pagina " + this.getModeloAyudaEjercicio().getPagina() + " de " + this.getModeloAyudaEjercicio().getTextoAyudaEjercicio().size());
			this.getVistaAyudaEjercicio().getBtnAnterior().setEnabled(true);
			if (this.getModeloAyudaEjercicio().getPagina() == this.getModeloAyudaEjercicio().getTextoAyudaEjercicio().size()){
				this.getVistaAyudaEjercicio().getBtnSiguiente().setEnabled(false);
			}
		}
	}
	
	public void AnteriorPagina () {
		if (this.getModeloAyudaEjercicio().getPagina() > 1){
			String texto = this.getModeloAyudaEjercicio().AnteriorPagina(this.getModeloAyudaEjercicio().getTextoAyudaEjercicio());
			String urlImagen = this.getModeloAyudaEjercicio().ImagenAsociada(this.getModeloAyudaEjercicio().getImagen());
			this.getVistaAyudaEjercicio().getImage().setIcon(new ImageIcon(urlImagen));
			this.getVistaAyudaEjercicio().getTxtpnAyudaejercicio().setText(texto);
			this.getVistaAyudaEjercicio().getLblNro().setText(String.valueOf(this.getModeloAyudaEjercicio().getPagina()));
			this.getVistaAyudaEjercicio().getLblPagina().setText("Pagina " + this.getModeloAyudaEjercicio().getPagina() + " de " + this.getModeloAyudaEjercicio().getTextoAyudaEjercicio().size());
			this.getVistaAyudaEjercicio().getBtnSiguiente().setEnabled(true);
			if (this.getModeloAyudaEjercicio().getPagina() == 1){
				this.getVistaAyudaEjercicio().getBtnAnterior().setEnabled(false);
			}
		}
	}

	public Ayuda getModeloAyudaEjercicio() {
		return modeloAyudaEjercicio;
	}

	public void setModeloAyudaEjercicio(Ayuda modeloAyudaEjercicio) {
		this.modeloAyudaEjercicio = modeloAyudaEjercicio;
	}

	public VistaAyudaEjercicio getVistaAyudaEjercicio() {
		return vistaAyudaEjercicio;
	}

	public void setVistaAyudaEjercicio(VistaAyudaEjercicio vistaAyudaEjercicio) {
		this.vistaAyudaEjercicio = vistaAyudaEjercicio;
	}
	
	

}
