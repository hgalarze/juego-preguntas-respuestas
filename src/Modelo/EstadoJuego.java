package Modelo;

import java.util.ArrayList;

public class EstadoJuego {
	
	private Dado dado;
	private int ultimaTirada;
	private ControlMovimientoFicha controlMovimientoFicha;
	private int puntajeActual;
	private ControlRespuestaJugador controlRespuestaJugador;
	private int puntajeDeCeldasVacias;
	private int cantidadMovimiento;

	public EstadoJuego() {
		this.dado = new Dado();
		this.ultimaTirada = 0;
		this.controlMovimientoFicha = new ControlMovimientoFicha();
		this.puntajeActual = 0;
		this.puntajeDeCeldasVacias = 0;
		this.controlRespuestaJugador = new ControlRespuestaJugador();
	}

	public int tirar(){
		this.ultimaTirada = this.dado.tirar();
		return this.ultimaTirada;
	}
	
	public boolean moverFicha (int movimiento, JuegoPreguntasyRespuestas jpyr){
		return this.controlMovimientoFicha.moverFicha(movimiento, this.ultimaTirada, jpyr);
	}
	
	public boolean responder (String respuesta, JuegoPreguntasyRespuestas jpyr){
		return this.controlRespuestaJugador.responder(respuesta, (CeldaConPregunta)jpyr.getPista().getCeldaActual());
	}
	
	//public boolean SalirJuego () {}
	
	//public boolean reiniciarJuego (){}
	
	public void ayuda(){}
	
	public ArrayList<Boolean> getHabilitarMovimientos(){
		return this.controlMovimientoFicha.getHabilitarMovimiento();
	}
	
	public void HabilitarMovimientos(ArrayList<Boolean> movimientos){
		this.controlMovimientoFicha.setHabilitarMovimeinto(movimientos);
	}
	
	public Ubicacion getUbicacionFicha(JuegoPreguntasyRespuestas jpyr){
		return jpyr.getPista().getFicha().getUbicacionActual();
	}

	public int getCantidadMovimiento() {
		return cantidadMovimiento;
	}

	public void setCantidadMovimiento(int cantidadMovimiento) {
		this.cantidadMovimiento = cantidadMovimiento;
	}
	
	public int getUltimaTirada() {
		return ultimaTirada;
	}

	public void setUltimaTirada(int ultimaTirada) {
		this.ultimaTirada = ultimaTirada;
	}

	public int getPuntajeActual() {
		return puntajeActual;
	}

	public void setPuntajeActual(int puntajeActual) {
		this.puntajeActual = puntajeActual;
	}

	public int getPuntajeDeCeldasVacias() {
		return puntajeDeCeldasVacias;
	}

	public void setPuntajeDeCeldasVacias(int puntajeDeCeldasVacias) {
		this.puntajeDeCeldasVacias = puntajeDeCeldasVacias;
	}
	
	//public String RespuestaCorrecta(){}
	
	//public int PuntajeCelda(){}

}
