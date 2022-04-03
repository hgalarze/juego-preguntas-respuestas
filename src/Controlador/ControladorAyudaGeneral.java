package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Ayuda;
import Vista.VistaAyudaGeneral;

public class ControladorAyudaGeneral implements ActionListener {
	
	private VistaAyudaGeneral vistaGeneral;
	private Ayuda modeloAyudaGeneral;
	
	public ControladorAyudaGeneral () {
		this.setVistaGeneral(new VistaAyudaGeneral(this));
		this.setModeloAyudaGeneral(new Ayuda());
		this.cargarTexto();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Salir")) this.Volver();
		if(e.getActionCommand().equals("Seguir")) this.SiguientePagina();
		if(e.getActionCommand().equals("Volver")) this.AnteriorPagina();
		
	}
	
	public void cargarTexto() {
		String texto = this.getModeloAyudaGeneral().getTextosAyudaGeneral().firstElement();
		this.getVistaGeneral().getTxtAyudaGeneral().setText(texto);
	}
	
	public void SiguientePagina () {
		if (this.getModeloAyudaGeneral().getPagina() < this.getModeloAyudaGeneral().getTextosAyudaGeneral().size()){
			String texto = this.getModeloAyudaGeneral().SiguientePagina(this.getModeloAyudaGeneral().getTextosAyudaGeneral());
			this.getVistaGeneral().getTxtAyudaGeneral().setText(texto);
			this.getVistaGeneral().getBtnAnterior().setEnabled(true);
			if (this.getModeloAyudaGeneral().getPagina() == this.getModeloAyudaGeneral().getTextosAyudaGeneral().size()){
				this.getVistaGeneral().getBtnSeguir().setEnabled(false);
			}
		}
	}
	
	public void AnteriorPagina () {
		if (this.getModeloAyudaGeneral().getPagina() > 1){
			String texto = this.getModeloAyudaGeneral().AnteriorPagina(this.getModeloAyudaGeneral().getTextosAyudaGeneral());
			this.getVistaGeneral().getTxtAyudaGeneral().setText(texto);
			this.getVistaGeneral().getBtnSeguir().setEnabled(true);
			if (this.getModeloAyudaGeneral().getPagina() == 1){
				this.getVistaGeneral().getBtnAnterior().setEnabled(false);
			}
		}
	}
	
	public void Volver () {
		this.getVistaGeneral().dispose();
	}

	public VistaAyudaGeneral getVistaGeneral() {
		return vistaGeneral;
	}

	public void setVistaGeneral(VistaAyudaGeneral vistaGeneral) {
		this.vistaGeneral = vistaGeneral;
	}

	public Ayuda getModeloAyudaGeneral() {
		return modeloAyudaGeneral;
	}

	public void setModeloAyudaGeneral(Ayuda modeloAyudaGeneral) {
		this.modeloAyudaGeneral = modeloAyudaGeneral;
	}

}
