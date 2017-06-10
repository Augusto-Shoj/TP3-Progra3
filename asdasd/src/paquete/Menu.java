package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox seleccionarOferta = new JComboBox();
		seleccionarOferta.setBounds(165, 11, 114, 20);
		frame.getContentPane().add(seleccionarOferta);
		
		final JLabel mostrarOferta = new JLabel("oferta academica *aqui*");
		mostrarOferta.setHorizontalAlignment(SwingConstants.CENTER);
		mostrarOferta.setBounds(45, 106, 356, 134);
		frame.getContentPane().add(mostrarOferta);
		
		JButton organizar = new JButton("organizar");
		organizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			mostrarOferta.setText("asdadf");
			}
		});
		organizar.setBounds(165, 57, 114, 38);
		frame.getContentPane().add(organizar);
		
	
	}
}
