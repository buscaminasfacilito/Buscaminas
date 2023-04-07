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

public class Victoria extends JFrame {

	private JPanel contentPane;
	public static Victoria frame = new Victoria();
	public static boolean visible = true;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Victoria() {
		setBackground(new Color(128, 255, 128));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 443, 629);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblMensajeVictoria = new JLabel("Victoria!!!!");
		lblMensajeVictoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensajeVictoria.setFont(new Font("Source Serif Pro Black", Font.PLAIN, 55));
		contentPane.add(lblMensajeVictoria);
	}

}
