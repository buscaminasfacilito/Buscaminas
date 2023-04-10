package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Derrota extends JFrame {

	private JPanel contentPane;
	public static Derrota frame = new Derrota();
	public static boolean visible = true;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Derrota() {
		setBackground(new Color(255, 0, 0));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 100, 100));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblMensajeVictoria = new JLabel("Derrota!!!!!");
		lblMensajeVictoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensajeVictoria.setFont(new Font("Source Serif Pro Black", Font.PLAIN, 55));
		contentPane.add(lblMensajeVictoria);
	}

}
