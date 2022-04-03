package Modelo;

import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import jakarta.*; // .xml.soap.Node;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class PistaMatriz {
	
	private int cantidadFila;
	private int cantidadColumnas;
	private Celda[][] celdas;
	private Ubicacion ubicacionActual;
	//private ControlMovimientoFicha controlmovimientoFicha;
	private Ficha ficha;
	
	public PistaMatriz () {
		this.cantidadColumnas = 7;
		this.cantidadFila = 7;
		this.celdas = new Celda[this.cantidadFila][this.cantidadColumnas];
		this.llenarMatriz();
		this.ubicacionActual = new Ubicacion();
		this.ficha = new Ficha();
	}
	
	private void llenarMatriz(){
		
		Random random = new Random();		
		
		NodeList nodos;
		org.w3c.dom.Node nodo;
		int nodo1 = 1, randompregunta = 0;
		String pregunta;
		String respuesta1;
		String respuesta2;
		String respuesta3;
		int idcorrecta;
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance ( );
		Document doc = null;
		
		try
		{
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(new File("XML/datos.xml"));
			
			nodos = doc.getChildNodes();
			
			nodo = nodos.item(0); // Datos
			
			for (int fila = 0; fila < this.cantidadFila; fila++) {
				
				for (int columna = 0; columna < this.cantidadColumnas; columna++) {
					
					int r = random.nextInt(2);
					switch(r){
					
					case 0:
						randompregunta = random.nextInt(48) + 1;
						nodo1 = randompregunta * 2 - 1 ;
						idcorrecta = Integer.valueOf(nodo.getChildNodes().item(nodo1).getChildNodes().item(1).getTextContent());
						pregunta = nodo.getChildNodes().item(nodo1).getChildNodes().item(3).getTextContent();
						respuesta1 = nodo.getChildNodes().item(nodo1).getChildNodes().item(5).getChildNodes().item(1).getTextContent();
						respuesta2 = nodo.getChildNodes().item(nodo1).getChildNodes().item(5).getChildNodes().item(3).getTextContent();
						respuesta3 = nodo.getChildNodes().item(nodo1).getChildNodes().item(5).getChildNodes().item(5).getTextContent();
						this.celdas[fila][columna]=new CeldaConPregunta(pregunta, respuesta1, respuesta2, respuesta3, idcorrecta,fila,columna);
						break;
					case 1:
						this.celdas[fila][columna]=new CeldaSimple(fila,columna);
						break;
					}
				}
				
			}
			
		}
		catch (Exception e){}		
		
	}
	
	
	public int getCantidadFila() {
		return cantidadFila;
	}
	public void setCantidadFila(int cantidadFila) {
		this.cantidadFila = cantidadFila;
	}
	public int getCantidadColumnas() {
		return cantidadColumnas;
	}
	public void setCantidadColumnas(int cantidadColumnas) {
		this.cantidadColumnas = cantidadColumnas;
	}
	public Celda[][] getCeldas() {
		return celdas;
	}
	public void setCeldas(Celda[][] celdas) {
		this.celdas = celdas;
	}
	public Ubicacion getUbicacionActual() {
		return ubicacionActual;
	}
	public void setUbicacionActual(Ubicacion ubicacionActual) {
		this.ubicacionActual = ubicacionActual;
	}
	/*public ControlMovimientoFicha getControlmovimientoFicha() {
		return controlmovimientoFicha;
	}
	public void setControlmovimientoFicha(
			ControlMovimientoFicha controlmovimientoFicha) {
		this.controlmovimientoFicha = controlmovimientoFicha;
	}*/
	public Ficha getFicha() {
		return ficha;
	}
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
	
	public Celda getCeldaActual () {
		return this.celdas[this.getUbicacionActual().getPosicionX()][this.getUbicacionActual().getPosicionY()];
	}
}
