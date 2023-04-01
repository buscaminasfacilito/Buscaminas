package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

public class UI extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public UI() {
		setBackground(new Color(128, 128, 128));
		setTitle("Buscaminas\r\n");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\angel\\Downloads\\MINA.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 598);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panelJuegoPrincipal = new JPanel();
		panelJuegoPrincipal.setBackground(new Color(128, 255, 255));
		panelJuegoPrincipal.setLayout(null);
		GridBagConstraints gbc_panelJuegoPrincipal = new GridBagConstraints();
		gbc_panelJuegoPrincipal.gridwidth = 2;
		gbc_panelJuegoPrincipal.gridheight = 5;
		gbc_panelJuegoPrincipal.insets = new Insets(0, 0, 0, 5);
		gbc_panelJuegoPrincipal.fill = GridBagConstraints.BOTH;
		gbc_panelJuegoPrincipal.gridx = 0;
		gbc_panelJuegoPrincipal.gridy = 0;
		contentPane.add(panelJuegoPrincipal, gbc_panelJuegoPrincipal);
		
		JLabel lblNewLabel_1 = new JLabel("AQUI VA EL  TABLERO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(35, 190, 363, 168);
		panelJuegoPrincipal.add(lblNewLabel_1);
		
		JPanel panelinterfaz = new JPanel();
		panelinterfaz.setBackground(new Color(255, 0, 0));
		panelinterfaz.setLayout(null);
		GridBagConstraints gbc_panelinterfaz = new GridBagConstraints();
		gbc_panelinterfaz.gridheight = 5;
		gbc_panelinterfaz.insets = new Insets(0, 0, 5, 0);
		gbc_panelinterfaz.fill = GridBagConstraints.BOTH;
		gbc_panelinterfaz.gridx = 2;
		gbc_panelinterfaz.gridy = 0;
		contentPane.add(panelinterfaz, gbc_panelinterfaz);
		
		JLabel lblNewLabel = new JLabel("AQUI VA LA INTERFAZ");
		lblNewLabel.setBounds(10, 191, 363, 168);
		panelinterfaz.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		
	}
}
