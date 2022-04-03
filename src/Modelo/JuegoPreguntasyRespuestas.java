package Modelo;

import java.util.ArrayList;

public class JuegoPreguntasyRespuestas {
	
	private String jugador;
	private PistaMatriz Pista;
	private EstadoJuego estadoJuego;
	//private Ayuda ayuda;
	private Animador animador;
	
	public JuegoPreguntasyRespuestas(){
		this.Pista = new PistaMatriz();
		this.estadoJuego = new EstadoJuego();
		//this.ayuda = new Ayuda();
		this.animador = new Animador();
	}
	
	public int tirar(){
		return this.estadoJuego.tirar();
	}
	
	public boolean moverFicha (int movimiento){
		return this.estadoJuego.moverFicha(movimiento, this);
	}
	
	public boolean responder (String respuesta){
		return this.getEstadoJuego().responder(respuesta, this);
	}
	
	//public boolean SalirJuego () {}
	
	//public boolean reiniciarJuego (){}
	
	public void ayuda(){}
	
	public ArrayList<Boolean> getHabilitarMovimientos(){
		return this.estadoJuego.getHabilitarMovimientos();
	}
	
	public void HabilitarMovimientos(ArrayList<Boolean> movimientos){
		this.estadoJuego.HabilitarMovimientos(movimientos);
	}
	
	public Ubicacion getUbicacionFicha(){
		return this.estadoJuego.getUbicacionFicha(this);
	}
	
	//public String RespuestaCorrecta(){}
	
	//public int PuntajeCelda(){}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public PistaMatriz getPista() {
		return Pista;
	}

	public void setPista(PistaMatriz pista) {
		Pista = pista;
	}

	public EstadoJuego getEstadoJuego() {
		return estadoJuego;
	}

	public void setEstadoJuego(EstadoJuego estadoJuego) {
		this.estadoJuego = estadoJuego;
	}

	public Animador getAnimador() {
		return animador;
	}

	public void setAnimador(Animador animador) {
		this.animador = animador;
	}
	
	
	
}
