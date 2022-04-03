package Modelo;

	// Imports //



	// Class: ModeloPrincipal //

public class ModeloPrincipal {
	
	// Attributes //
	
	public static final String MSG_ERROR_JUGADOR_VACIO = "Nombre de jugador vacio!";
	
	// Constructor //
	
	// Methods //
	
	public boolean verificarJugador (String jugador) {
		return  !jugador.equals("");
	}
	
	// Getters & Setters //

}
