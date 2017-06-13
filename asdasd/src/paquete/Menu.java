package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

public class Menu {

	private JFrame frame;
	private Universidad facu;
	private JTextField Hora8, Hora9, Hora10, Hora11, Hora12, Hora13, Hora14, 
	Hora15, Hora16, Hora17, Hora18, Hora19, Hora20, Hora21;
	private JTextField Materia8,Materia9,Materia10,Materia11,Materia12,Materia13,Materia14,
	Materia15,Materia16,Materia17,Materia18,Materia19,Materia20,Materia21;
	
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
		frame.setBounds(100, 100, 600, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		facu = new Universidad("UNGS");
		
		final JComboBox<String> seleccionarOferta = new JComboBox<String>();
		seleccionarOferta.setBounds(339, 28, 200, 20);
		seleccionarOferta.addItem("Seleccionar oferta");
		seleccionarOferta.addItem("Oferta dia lunes");
		seleccionarOferta.addItem("Oferta dia martes");
		seleccionarOferta.addItem("Oferta dia miercoles");
		seleccionarOferta.addItem("Oferta-Academica");
		seleccionarOferta.addItem("Oferta Academica");
		
		frame.getContentPane().add(seleccionarOferta);
		
		
		
		final JLabel mostrarOferta = new JLabel("oferta academica *aqui*");
		mostrarOferta.setHorizontalAlignment(SwingConstants.CENTER);
		mostrarOferta.setBounds(328, 122, 268, 69);
		frame.getContentPane().add(mostrarOferta);
		
		final JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(339, 108, 200, 20);
		
		
		
		frame.getContentPane().add(comboBox);
		
		JButton organizar = new JButton("organizar");
		organizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				facu.vaciarAulas();
				
				String lala = new String();
				lala=(String) seleccionarOferta.getSelectedItem() + ".json";
				
				

				MateriasJSON oferta = new MateriasJSON();
			       

			    oferta = MateriasJSON.leerJSON(lala);
					
			    
			    facu.organizar(oferta);
			    
			    comboBox.removeAllItems();
			    
			    for(int i=0; i<facu.getCantAulas(); i++)
					comboBox.addItem("Aula " + facu.getAula(i).getNumero());
			    
			    
				
			//mostrarOferta.setText(facu.verFacultad());
			}
		});
		organizar.setBounds(384, 59, 114, 38);
		frame.getContentPane().add(organizar);
		
			
		
		JInternalFrame Aula = new JInternalFrame("Aula");
		Aula.setBounds(10, 28, 298, 437);
		frame.getContentPane().add(Aula);
		Aula.getContentPane().setLayout(null);
		
		Hora8 = new JTextField();
		Hora8.setText("08:00");
		Hora8.setBounds(10, 23, 37, 20);
		Aula.getContentPane().add(Hora8);
		Hora8.setColumns(10);
		
		Materia8 = new JTextField();
		Materia8.setHorizontalAlignment(SwingConstants.CENTER);
		Materia8.setText("--Vacio--");
		Materia8.setBounds(57, 23, 215, 20);
		Aula.getContentPane().add(Materia8);
		Materia8.setColumns(10);
		
		Hora9 = new JTextField();
		Hora9.setText("09:00");
		Hora9.setColumns(10);
		Hora9.setBounds(10, 49, 37, 20);
		Aula.getContentPane().add(Hora9);
		
		Materia9 = new JTextField();
		Materia9.setText("--Vacio--");
		Materia9.setHorizontalAlignment(SwingConstants.CENTER);
		Materia9.setColumns(10);
		Materia9.setBounds(57, 49, 215, 20);
		Aula.getContentPane().add(Materia9);
		
		Hora10 = new JTextField();
		Hora10.setText("10:00");
		Hora10.setColumns(10);
		Hora10.setBounds(10, 75, 37, 20);
		Aula.getContentPane().add(Hora10);
		
		Hora11 = new JTextField();
		Hora11.setText("11:00");
		Hora11.setColumns(10);
		Hora11.setBounds(10, 101, 37, 20);
		Aula.getContentPane().add(Hora11);
		
		Materia10 = new JTextField();
		Materia10.setText("--Vacio--");
		Materia10.setHorizontalAlignment(SwingConstants.CENTER);
		Materia10.setColumns(10);
		Materia10.setBounds(57, 101, 215, 20);
		Aula.getContentPane().add(Materia10);
		
		Materia11 = new JTextField();
		Materia11.setText("--Vacio--");
		Materia11.setHorizontalAlignment(SwingConstants.CENTER);
		Materia11.setColumns(10);
		Materia11.setBounds(57, 75, 215, 20);
		Aula.getContentPane().add(Materia11);
		
		Materia12 = new JTextField();
		Materia12.setText("--Vacio--");
		Materia12.setHorizontalAlignment(SwingConstants.CENTER);
		Materia12.setColumns(10);
		Materia12.setBounds(57, 127, 215, 20);
		Aula.getContentPane().add(Materia12);
		
		Hora12 = new JTextField();
		Hora12.setText("12:00");
		Hora12.setColumns(10);
		Hora12.setBounds(10, 127, 37, 20);
		Aula.getContentPane().add(Hora12);
		
		Hora13 = new JTextField();
		Hora13.setText("13:00");
		Hora13.setColumns(10);
		Hora13.setBounds(10, 153, 37, 20);
		Aula.getContentPane().add(Hora13);
		
		Hora14 = new JTextField();
		Hora14.setText("14:00");
		Hora14.setColumns(10);
		Hora14.setBounds(10, 179, 37, 20);
		Aula.getContentPane().add(Hora14);
		
		Hora15 = new JTextField();
		Hora15.setText("15:00");
		Hora15.setColumns(10);
		Hora15.setBounds(10, 205, 37, 20);
		Aula.getContentPane().add(Hora15);
		
		Materia13 = new JTextField();
		Materia13.setText("--Vacio--");
		Materia13.setHorizontalAlignment(SwingConstants.CENTER);
		Materia13.setColumns(10);
		Materia13.setBounds(57, 205, 215, 20);
		Aula.getContentPane().add(Materia13);
		
		Materia14 = new JTextField();
		Materia14.setText("--Vacio--");
		Materia14.setHorizontalAlignment(SwingConstants.CENTER);
		Materia14.setColumns(10);
		Materia14.setBounds(57, 179, 215, 20);
		Aula.getContentPane().add(Materia14);
		
		Materia15 = new JTextField();
		Materia15.setText("--Vacio--");
		Materia15.setHorizontalAlignment(SwingConstants.CENTER);
		Materia15.setColumns(10);
		Materia15.setBounds(57, 153, 215, 20);
		Aula.getContentPane().add(Materia15);
		
		Materia16 = new JTextField();
		Materia16.setText("--Vacio--");
		Materia16.setHorizontalAlignment(SwingConstants.CENTER);
		Materia16.setColumns(10);
		Materia16.setBounds(57, 231, 215, 20);
		Aula.getContentPane().add(Materia16);
		
		Hora16 = new JTextField();
		Hora16.setText("16:00");
		Hora16.setColumns(10);
		Hora16.setBounds(10, 231, 37, 20);
		Aula.getContentPane().add(Hora16);
		
		Hora17 = new JTextField();
		Hora17.setText("17:00");
		Hora17.setColumns(10);
		Hora17.setBounds(10, 257, 37, 20);
		Aula.getContentPane().add(Hora17);
		
		Hora18 = new JTextField();
		Hora18.setText("18:00");
		Hora18.setColumns(10);
		Hora18.setBounds(10, 283, 37, 20);
		Aula.getContentPane().add(Hora18);
		
		Hora19 = new JTextField();
		Hora19.setText("19:00");
		Hora19.setColumns(10);
		Hora19.setBounds(10, 309, 37, 20);
		Aula.getContentPane().add(Hora19);
		
		Materia17 = new JTextField();
		Materia17.setText("--Vacio--");
		Materia17.setHorizontalAlignment(SwingConstants.CENTER);
		Materia17.setColumns(10);
		Materia17.setBounds(57, 309, 215, 20);
		Aula.getContentPane().add(Materia17);
		
		Materia18 = new JTextField();
		Materia18.setText("--Vacio--");
		Materia18.setHorizontalAlignment(SwingConstants.CENTER);
		Materia18.setColumns(10);
		Materia18.setBounds(57, 283, 215, 20);
		Aula.getContentPane().add(Materia18);
		
		Materia19 = new JTextField();
		Materia19.setText("--Vacio--");
		Materia19.setHorizontalAlignment(SwingConstants.CENTER);
		Materia19.setColumns(10);
		Materia19.setBounds(57, 257, 215, 20);
		Aula.getContentPane().add(Materia19);
		
		Materia20 = new JTextField();
		Materia20.setText("--Vacio--");
		Materia20.setHorizontalAlignment(SwingConstants.CENTER);
		Materia20.setColumns(10);
		Materia20.setBounds(57, 335, 215, 20);
		Aula.getContentPane().add(Materia20);
		
		Hora20 = new JTextField();
		Hora20.setText("20:00");
		Hora20.setColumns(10);
		Hora20.setBounds(10, 335, 37, 20);
		Aula.getContentPane().add(Hora20);
		
		Hora21 = new JTextField();
		Hora21.setText("21:00");
		Hora21.setColumns(10);
		Hora21.setBounds(10, 361, 37, 20);
		Aula.getContentPane().add(Hora21);
		
		Materia21 = new JTextField();
		Materia21.setText("--Vacio--");
		Materia21.setHorizontalAlignment(SwingConstants.CENTER);
		Materia21.setColumns(10);
		Materia21.setBounds(57, 361, 215, 20);
		Aula.getContentPane().add(Materia21);
		Aula.setVisible(true);
		
		
		JButton verAula = new JButton("ver");
		verAula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			Materia8.setText(facu.getAula(comboBox.getSelectedItem()).getNombre(8));
			Materia9.setText(facu.getAula(comboBox.getSelectedItem()).getNombre(9));
			Materia10.setText(facu.getAula(comboBox.getSelectedItem()).getNombre(10));
			Materia11.setText(facu.getAula(comboBox.getSelectedItem()).getNombre(11));
			Materia12.setText(facu.getAula(comboBox.getSelectedItem()).getNombre(12));
			Materia13.setText(facu.getAula(comboBox.getSelectedItem()).getNombre(13));
			Materia14.setText(facu.getAula(comboBox.getSelectedItem()).getNombre(14));
			Materia15.setText(facu.getAula(comboBox.getSelectedItem()).getNombre(15));
			
				
				//mostrarOferta.setText(facu.getAula(comboBox.getSelectedItem()).verAula());
			}
			});
			
		verAula.setBounds(404, 189, 114, 38);
		frame.getContentPane().add(verAula);	
				
				
				
	}
}