package Modelo;

import java.util.ArrayList;

public class ControlMovimientoFicha {
	
	private ArrayList<Boolean> habilitarMovimiento;
	
	public boolean moverFicha (int movimiento, int obtuvoDado, JuegoPreguntasyRespuestas jpyr) {
		switch (obtuvoDado){
		case 2:
		case 4:
			if (movimiento == 1) {
				this.moverDerecha(jpyr);
			}
			if (movimiento == 2){
				this.moverAbajo(jpyr);
			}
			break;
		case 3:
		case 6:
			if (movimiento == 0) {
				this.moverArriba(jpyr);
			}
			if (movimiento == 3){
				this.moverIzquierda(jpyr);
			}
			break;
		default:
			if (movimiento == 0) {
				this.moverArriba(jpyr);
			}
			if (movimiento == 1){
				this.moverDerecha(jpyr);
			}
			if (movimiento == 2){
				this.moverAbajo(jpyr);
			}
			break;
		}
		return true;
	}
	
	public void moverDerecha (JuegoPreguntasyRespuestas jpyr) {
		if (jpyr.getPista().getUbicacionActual().getPosicionY() == 6){
			jpyr.getPista().getUbicacionActual().setPosicionY(0);
		}else{
			jpyr.getPista().getUbicacionActual().setPosicionY(jpyr.getPista().getUbicacionActual().getPosicionY() + 1);
		}
	}
	public void moverAbajo (JuegoPreguntasyRespuestas jpyr) {
		if (jpyr.getPista().getUbicacionActual().getPosicionX() == 6){
			jpyr.getPista().getUbicacionActual().setPosicionX(0);
		}else{
			jpyr.getPista().getUbicacionActual().setPosicionX(jpyr.getPista().getUbicacionActual().getPosicionX() + 1);
		}
	}
	public void moverArriba (JuegoPreguntasyRespuestas jpyr) {
		if (jpyr.getPista().getUbicacionActual().getPosicionX() == 0) {
			jpyr.getPista().getUbicacionActual().setPosicionX(6);
		}else{
			jpyr.getPista().getUbicacionActual().setPosicionX(jpyr.getPista().getUbicacionActual().getPosicionX() - 1);
		}
	}
	public void moverIzquierda (JuegoPreguntasyRespuestas jpyr) {
		if (jpyr.getPista().getUbicacionActual().getPosicionY() == 0){
			jpyr.getPista().getUbicacionActual().setPosicionY(6);
		}else{
			jpyr.getPista().getUbicacionActual().setPosicionY(jpyr.getPista().getUbicacionActual().getPosicionY() - 1);
		}
	}
	
	public void setHabilitarMovimeinto (ArrayList<Boolean> movimientos) {
		this.habilitarMovimiento = movimientos;
	}
	
	public ArrayList<Boolean> getHabilitarMovimiento (){
		return this.habilitarMovimiento;
	}

}
