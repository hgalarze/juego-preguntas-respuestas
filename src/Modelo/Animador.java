package Modelo;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animador {
	
	private static final String jugadorExpertoGana = "sounds/jugadorGana.wav";
	private static final String jugadorExpertoGanaCeldaVacias = "sounds/celdaVacia.wav";
	private static final String jugadorExpertoPierde = "sounds/jugadorPierde.wav";
	private static final String Aplausos = "sounds/Aplausos.wav";
	private Clip sonido;
	
	public Animador() {
		/*try {
			this.sonido = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}*/
	}
	
	public void animar (int puntajeTotal, int puntajeCeldaVacia) {
		if (puntajeCeldaVacia <= 0 && puntajeTotal > 0) {
			/*try {
	            
	            // Se obtiene un Clip de sonido
	            this.sonido = AudioSystem.getClip();
	            
	            // Se carga con un fichero wav
	            this.sonido.open(AudioSystem.getAudioInputStream(new File(this.jugadorExpertoGanaCeldaVacias)));
	            
	            // Comienza la reproducción
	            this.sonido.start();
	            
	            // Espera mientras se esté reproduciendo.
	            while (this.sonido.isRunning())
	                Thread.sleep(1000);
	            
	            // Se cierra el clip.
	            this.sonido.close();
	        } catch (Exception e) {
	        	System.out.println(e.getMessage());
	        }*/
			AudioFileFormat aff;
		    AudioInputStream ais;
		    File sf = new File(this.jugadorExpertoGanaCeldaVacias);
		    
		    try 
		    {  
	        aff=AudioSystem.getAudioFileFormat(sf);
	        ais=AudioSystem.getAudioInputStream(sf);
	        AudioFormat af=aff.getFormat();
	        DataLine.Info info = new DataLine.Info(Clip.class,ais.getFormat(),((int) ais.getFrameLength() * af.getFrameSize()));
	        Clip  ol = (Clip) AudioSystem.getLine(info);
	        ol.open(ais);
	        ol.loop(0);
		    }
	        catch(UnsupportedAudioFileException ee){}
	        catch(IOException ea){}
	        catch(LineUnavailableException LUE){};
		}else if (puntajeTotal > 0){
			/*try {
	            
	            // Se obtiene un Clip de sonido
	            this.sonido = AudioSystem.getClip();
	            
	            // Se carga con un fichero wav
	            this.sonido.open(AudioSystem.getAudioInputStream(new File(this.jugadorExpertoGana)));
	            
	            // Comienza la reproducción
	            this.sonido.start();
	            
	            // Espera mientras se esté reproduciendo.
	            while (this.sonido.isRunning())
	                Thread.sleep(1000);
	            
	            // Se cierra el clip.
	            this.sonido.close();
	        } catch (Exception e) {
	        	System.out.println(e.getMessage());
	        }*/
			AudioFileFormat aff;
		    AudioInputStream ais;
		    File sf = new File(this.jugadorExpertoGana);
		    
		    try 
		    {  
	        aff=AudioSystem.getAudioFileFormat(sf);
	        ais=AudioSystem.getAudioInputStream(sf);
	        AudioFormat af=aff.getFormat();
	        DataLine.Info info = new DataLine.Info(Clip.class,ais.getFormat(),((int) ais.getFrameLength() * af.getFrameSize()));
	        Clip  ol = (Clip) AudioSystem.getLine(info);
	        ol.open(ais);
	        ol.loop(0);
		    }
	        catch(UnsupportedAudioFileException ee){}
	        catch(IOException ea){}
	        catch(LineUnavailableException LUE){};
		}else {
			/*try {
	            
	            // Se obtiene un Clip de sonido
	            this.sonido = AudioSystem.getClip();
	            
	            // Se carga con un fichero wav
	            this.sonido.open(AudioSystem.getAudioInputStream(new File(this.jugadorExpertoPierde)));
	            
	            // Comienza la reproducción
	            this.sonido.start();
	            
	            // Espera mientras se esté reproduciendo.
	            while (this.sonido.isRunning())
	                Thread.sleep(1000);
	            
	            // Se cierra el clip.
	            this.sonido.close();
	        } catch (Exception e) {
	        	System.out.println(e.getMessage());
	        }*/
			AudioFileFormat aff;
		    AudioInputStream ais;
		    File sf = new File(this.jugadorExpertoPierde);
		    
		    try 
		    {  
	        aff=AudioSystem.getAudioFileFormat(sf);
	        ais=AudioSystem.getAudioInputStream(sf);
	        AudioFormat af=aff.getFormat();
	        DataLine.Info info = new DataLine.Info(Clip.class,ais.getFormat(),((int) ais.getFrameLength() * af.getFrameSize()));
	        Clip  ol = (Clip) AudioSystem.getLine(info);
	        ol.open(ais);
	        ol.loop(0);
		    }
	        catch(UnsupportedAudioFileException ee){}
	        catch(IOException ea){}
	        catch(LineUnavailableException LUE){};
		}
	}
	
	public void FinalizacionJuego() {
		AudioFileFormat aff;
	    AudioInputStream ais;
	    File sf = new File(this.Aplausos);
	    
	    try 
	    {  
        aff=AudioSystem.getAudioFileFormat(sf);
        ais=AudioSystem.getAudioInputStream(sf);
        AudioFormat af=aff.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class,ais.getFormat(),((int) ais.getFrameLength() * af.getFrameSize()));
        Clip  ol = (Clip) AudioSystem.getLine(info);
        ol.open(ais);
        ol.loop(0);
	    }
        catch(UnsupportedAudioFileException ee){}
        catch(IOException ea){}
        catch(LineUnavailableException LUE){};
	}

}
