package vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import controlador.BotonCasilla;
import controlador.Botonera;
import modelo.Dificultad;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JMenuItem;
import javax.swing.JSlider;



public class UI extends JFrame {
	
	private JMenuItem mmFacil;
	private JMenuItem mmMedio;
	private JMenuItem mnDificil;
	private Botonera panelMinador;
	private JPanel contentPane;
	private JLabel lblVolumen;
	private JSlider slider;

	public UI() {
		setBackground(new Color(128, 128, 128));
		setTitle("Buscaminas\r\n");
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources/MINA.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(128, 128, 128));
		menuBar.setMargin(new Insets(0, 0, 0, 3));
		setJMenuBar(menuBar);
		
		JMenu mmSelectorDificultad = new JMenu("Dificultad");
		mmSelectorDificultad.setBackground(new Color(128, 128, 128));
		menuBar.add(mmSelectorDificultad);
		
		this.mmFacil = new JMenuItem("Facil");
		
		mmSelectorDificultad.add(mmFacil);
		
		this.mmMedio = new JMenuItem("Medio");
		mmSelectorDificultad.add(mmMedio);
		
		this.mnDificil = new JMenuItem("Dificil");
		mmSelectorDificultad.add(mnDificil);
		
		lblVolumen = new JLabel("Volumen");
		menuBar.add(lblVolumen);
		
		slider = new JSlider(-80,6);
		slider.setValue(-10);
		slider.setForeground(new Color(128, 128, 128));
		slider.setBackground(new Color(128,128,128));
		menuBar.add(slider);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel Mensajes = new JLabel(" ");
		Mensajes.setFont(new Font("Tahoma", Font.PLAIN, 29));
		Mensajes.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(Mensajes, BorderLayout.NORTH);
		
		panelMinador = new Botonera(Dificultad.medio);
		
		panelMinador.setBackground(new Color(128, 128, 128));
		contentPane.add(panelMinador, BorderLayout.CENTER);
		
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		
	}

	public JMenuItem[] getDifficultyButton() {
		return new JMenuItem[]{mmFacil,mmMedio,mnDificil};
	}

	public Botonera getPanelMinador() {
		return panelMinador;
	}

	public JPanel getContentPane() {
		return contentPane;
	}
	
	public void setHover(BotonCasilla boton) {
		panelMinador.setHover(boton);
	}
	
	public void quitHover(BotonCasilla boton) {
		panelMinador.quitHover(boton);
	}
	
	public JSlider getSlider() {
		return slider;
	}
	
	public void setSlider(JSlider slider) {
		this.slider = slider;
	}
	
	
	
	
	
	
	
	
	
}
