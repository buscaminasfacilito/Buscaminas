package modelo;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class GestionSonidos {
	Clip musica;
	Clip sonidoBoton;
	Clip sonidoVictoria;
	Clip sonidoDerrota;
	private float volumen=-10.0f;
	
	public GestionSonidos() {
		super();
		String sonidoBotonRuta = "resources/button-19.wav";
		String sonidoDerrotaRuta = "resources/SonidoGameOVer.wav";
		String sonidoVictoriaRuta = "resources/level-win-6416.wav";
		String musicaRuta = "resources/MainThemeBusca16BITS.wav";
		
		this.musica=cargarSonido(musicaRuta);
		this.sonidoBoton=cargarSonido(sonidoBotonRuta);
		this.sonidoVictoria=cargarSonido(sonidoVictoriaRuta);
		this.sonidoDerrota=cargarSonido(sonidoDerrotaRuta);
	}

	public Clip cargarSonido(String nombre) {
		Clip clipActual = null;
		try {
			AudioInputStream in = AudioSystem.getAudioInputStream(new File(nombre));
			clipActual = AudioSystem.getClip();
			clipActual.open(in);
			FloatControl gainEfect = (FloatControl) clipActual.getControl(FloatControl.Type.MASTER_GAIN);
			gainEfect.setValue(volumen);

		} catch (UnsupportedAudioFileException e1) {
			System.out.println("Eroror al reproducir el sonido");
			e1.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Error al encotrar el archivo");
			e1.printStackTrace();
		} catch (LineUnavailableException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			return clipActual;
	}
	
	
	private FloatControl obtainGain(Clip myclip) {
		return(FloatControl) myclip.getControl(FloatControl.Type.MASTER_GAIN);
	}
	

	public void reproducirMusica() {
		musica.setMicrosecondPosition(0);
		musica.start();
		musica.loop(Clip.LOOP_CONTINUOUSLY);
	}

	public void cambiarVolumen(float volumenActual) {
		setVolumen(volumenActual);
		
		obtainGain(musica).setValue(volumen);
		obtainGain(musica).setValue(volumen);
		obtainGain(musica).setValue(volumen);
		obtainGain(musica).setValue(volumen);
		//System.out.println(volumenActual);
	}

	public void pararMusica() throws LineUnavailableException {
		musica.close();
		musica.open();
		sonidoBoton.close();
		sonidoBoton.open();
		sonidoVictoria.close();;
		sonidoDerrota.open();
	}

	public float getVolumen() {
		return volumen;
	}

	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}
	public void reproducirEfecto() {
		sonidoBoton.setMicrosecondPosition(0);
		sonidoBoton.start();
	}
	public void reproducirEfectoVictoria() {
		sonidoBoton.setMicrosecondPosition(0);
		sonidoVictoria.start();
	}
	public void reproducirEfectoDerrota() {
		sonidoDerrota.setMicrosecondPosition(0);
		sonidoDerrota.start();
	}
	
}
