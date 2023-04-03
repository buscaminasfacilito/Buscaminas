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
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JDesktopPane;
import java.awt.Panel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 740, 533);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(128, 128, 128));
		menuBar.setMargin(new Insets(0, 0, 0, 3));
		setJMenuBar(menuBar);
		
		JMenu mmSelectorDificultad = new JMenu("Dificultad");
		menuBar.add(mmSelectorDificultad);
		
		JMenuItem mmFacil = new JMenuItem("Facil");
		mmSelectorDificultad.add(mmFacil);
		
		JMenuItem mmMedio = new JMenuItem("Medio");
		mmSelectorDificultad.add(mmMedio);
		
		JMenuItem mnDificil = new JMenuItem("Dificil");
		mmSelectorDificultad.add(mnDificil);
		
		JButton btnBotonInicio = new JButton("Iniciar");
		btnBotonInicio.setBackground(new Color(128, 128, 128));
		btnBotonInicio.setVerticalAlignment(SwingConstants.TOP);
		btnBotonInicio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBotonInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(btnBotonInicio);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel Mensajes = new JLabel("Aqui_va_un_mensaje");
		Mensajes.setFont(new Font("Tahoma", Font.PLAIN, 29));
		Mensajes.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(Mensajes, BorderLayout.NORTH);
		
		JPanel panelMinador = new JPanel();
		panelMinador.setBackground(new Color(128, 128, 128));
		contentPane.add(panelMinador, BorderLayout.CENTER);
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
