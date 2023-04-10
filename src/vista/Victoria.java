package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.SwingConstants;

public class Victoria extends JFrame {

	private JPanel contentPane;
	public static Victoria frame = new Victoria();
	public static boolean visible = true;

	/**
	 * Create the frame.
	 */
	public Victoria() {
		setBackground(new Color(128, 255, 128));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(150, 255, 100));
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
