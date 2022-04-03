package Modelo;

public class Ubicacion {
	
	private int posicionX;
	private int posicionY;
	
	public Ubicacion () {
		this.posicionX = 0;
		this.posicionY = 0;
	}
	
	public Ubicacion (int X, int Y) {
		this.posicionX = X;
		this.posicionY = Y;
	}
	
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	
	

}
