package modelo;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class GestionSonidos {
	public void reproduciSonido(String nombre) {
		try {
			AudioInputStream in = AudioSystem.getAudioInputStream(new File(nombre).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(in);
			clip.start();
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
	public void reproducirMusica(String nombre) {
		try {
			AudioInputStream in = AudioSystem.getAudioInputStream(new File(nombre).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(in);
			clip.start();
			clip.loop(999999999);
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
}
