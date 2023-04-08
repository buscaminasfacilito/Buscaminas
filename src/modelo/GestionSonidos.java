package modelo;

import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class GestionSonidos {
	Clip clip;
	Clip clipEfect;
	Clip clipEffectVictoria;
	Clip clipEffectDerrota;
	private float volumen=-10.0f;
	FloatControl gainControlMusic;
	FloatControl gainEfect;
	
	public GestionSonidos(String sonidoBoton, String sonidoDerrota, String sonidoVictoria) {
		super();
		try {
	
		clipEfect=cargarSonido(sonidoBoton);
		clipEffectVictoria=cargarSonido(sonidoVictoria);
		clipEffectDerrota=cargarSonido(sonidoDerrota);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		{
			
		}
	}

	public Clip cargarSonido(String nombre) {
		Clip clipActual = null;
		try {

			AudioInputStream in = AudioSystem.getAudioInputStream(new File(nombre).getAbsoluteFile());
			clipActual = AudioSystem.getClip();
			clipActual.open(in);
			gainEfect = (FloatControl) clipActual.getControl(FloatControl.Type.MASTER_GAIN);

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

	public void reproducirMusica(String nombre) {
		try {
			AudioInputStream in = AudioSystem.getAudioInputStream(new File(nombre).getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(in);
			clip.start();
			gainControlMusic = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControlMusic.setValue(volumen);
			clip.loop(100);

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
	}

	public void cambiarVolumen(float volumenActual) {
		volumenActual = volumenActual - 80f;
		setVolumen(volumenActual);
		gainControlMusic.setValue(volumen);
		gainEfect.setValue(volumen);
	}

	public void pararMusica() {
		clip.stop();
	}

	public float getVolumen() {
		return volumen;
	}

	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}
	public void reproducirEfecto() {
		clipEfect.start();
	}
	public void reproducirEfectoVictoria() {
		clipEffectVictoria.start();
	}
	public void reproducirEfectoDerrota() {
		clipEffectDerrota.start();
	}
}
