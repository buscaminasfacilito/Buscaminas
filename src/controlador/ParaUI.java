package controlador;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenuItem;

import modelo.Coordenada;
import modelo.Densidad;
import modelo.Dificultad;
import modelo.GestionTablero;
import modelo.Tablero;
import modelo.TableroAleatorio;
import vista.Derrota;
import vista.UI;
import vista.Victoria;

public class ParaUI extends UI{
	
	private GestionTablero miGestion;
	private MouseListener mouseListener;
	
	public ParaUI() {
		behaviourDifficultyButtons(getDifficultyButton());
		this.miGestion = new GestionTablero(Dificultad.medio.getLongitud());
		createMouseListener();
		behaviourGameButtons();
	
	}
	
	
	private void createMouseListener() {
		this.mouseListener = new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {	}
			
			public void mousePressed(MouseEvent e) {}
			
			public void mouseExited(MouseEvent e) {
				quitHover((BotonCasilla)e.getSource());
			}
			
			public void mouseEntered(MouseEvent e) {
				setHover((BotonCasilla)e.getSource());
			}
			
			public void mouseClicked(MouseEvent e) {}
		};
	}


	public void actualizarTablero() {
		TableroAleatorio miTablero= miGestion.getMiTablero();
		
		for(int i=0;i<miTablero.getAncho();i++) {
			for(int j=0;j<miTablero.getAlto();j++) {
				Coordenada coordenadaActual = new Coordenada(i, j);
				BotonCasilla boton = getPanelMinador().getBoton(coordenadaActual);
				//SI NO ESTÁ DESVELADA, IMPRIMIR VACIO
				if(miTablero.getCasilla(coordenadaActual).isVelada()) {
					boton.setText(" ");
				}else{
					boton.removeMouseListener(this.mouseListener);
					setHover(boton);
					//SI ESTA DESVELADA Y ES BOMBA
					if(miTablero.getCasilla(coordenadaActual).isMina()) {
						boton.setText("BO");
						MostrarDerrota();
					}//SI ESTA DESVELADA Y NO ES BOMBA
					else {
						int minasAlrededor = miTablero.getCasilla(coordenadaActual).getMinasAlrededor();
						if(minasAlrededor==0) boton.setText(" ");
						else boton.setText(Integer.toString(minasAlrededor));
					}
				}
			}
		}
	}
	
	public void quitMouseListener(BotonCasilla boton) {
		boton.removeMouseListener(null);;
	}
	
	
	
	//COMPORTAMIENTO BOTON DIFICULTADES
	public void behaviourDifficultyButtons(JMenuItem myButtons[]){
		//FACIL
		myButtons[0].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getPanelMinador().crearBotonera(Dificultad.facil);
					miGestion = new GestionTablero(Dificultad.facil.getLongitud());
					behaviourGameButtons();
					//actualizar
					getPanelMinador().revalidate();
					//System.out.println("Actualizado a facil");
				}
			});
		//MEDIO
		myButtons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPanelMinador().crearBotonera(Dificultad.medio);
				miGestion = new GestionTablero(Dificultad.medio.getLongitud());
				behaviourGameButtons();
				//actualizar
				getPanelMinador().revalidate();
				//System.out.println("Actualizado a medio");
			}
		});
		//DIFICIL
		myButtons[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPanelMinador().crearBotonera(Dificultad.dificil);
				miGestion = new GestionTablero(Dificultad.dificil.getLongitud());
				behaviourGameButtons();
				//actualizar
				getPanelMinador().revalidate();
				//System.out.println("Actualizado a dificil");
			}
		});
		
	}
	
	//COMPORTAMIENTO BOTON JUEGO
	public void behaviourGameButtons() {
		BotonCasilla tableroBotones[][] = getPanelMinador().getBotones();
		
		for(int i=0;i<tableroBotones.length;i++){
			for(int j=0;j<tableroBotones[0].length;j++) {
				tableroBotones[i][j].addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						Coordenada cordenadasBoton = ((BotonCasilla)e.getSource()).getCoordenada();
						miGestion.hacerMovimiento(cordenadasBoton);
						actualizarTablero();
						
					}
				} );
				
				tableroBotones[i][j].addMouseListener(this.mouseListener);
				
			}
		}
	}
	
	public static void MostrarVictoria() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Victoria frame = new Victoria();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static void MostrarDerrota() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Derrota frame = new Derrota();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

	
	
	
	
}
