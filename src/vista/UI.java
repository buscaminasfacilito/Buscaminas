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
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JPanel panelSupletorio = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JPanel panelMinador = new JPanel();
		panelMinador.setBackground(new Color(128, 128, 128));
		
		JLabel lblMensaje = new JLabel("MENSAJE_VICTORIA");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panelSupletorio = new GroupLayout(panelSupletorio);
		gl_panelSupletorio.setHorizontalGroup(
			gl_panelSupletorio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSupletorio.createSequentialGroup()
					.addGroup(gl_panelSupletorio.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelSupletorio.createSequentialGroup()
							.addContainerGap()
							.addComponent(panelMinador, GroupLayout.DEFAULT_SIZE, 1518, Short.MAX_VALUE))
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1518, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panelSupletorio.createSequentialGroup()
					.addContainerGap(559, Short.MAX_VALUE)
					.addComponent(lblMensaje, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE)
					.addGap(520))
		);
		gl_panelSupletorio.setVerticalGroup(
			gl_panelSupletorio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSupletorio.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblMensaje, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelMinador, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelSupletorio.setAutoCreateContainerGaps(true);
		gl_panelSupletorio.setAutoCreateGaps(true);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("DIFICULTAD:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 31));
		panel_1.add(lblNewLabel);
		
		JComboBox MenuDicultad = new JComboBox();
		panel_1.add(MenuDicultad);
		panelSupletorio.setLayout(gl_panelSupletorio);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panelSupletorio, GroupLayout.PREFERRED_SIZE, 1538, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panelSupletorio, GroupLayout.PREFERRED_SIZE, 843, GroupLayout.PREFERRED_SIZE)
		);
		panel.setLayout(gl_panel);
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
