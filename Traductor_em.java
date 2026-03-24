import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Traductor_em extends JFrame {
	
	String palabras[][]= {
			{"Español","Ingles","Portugues"},
			{"Casa","House","Lar"},
			{"Hola","Hello","Olá"},
			{"Adios","Goodbye","Tchau"},
			{"Arbol","Tree","Árvore"},
			{"Galleta","Cookie","Cookie"}
	};

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTraducir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traductor_em frame = new Traductor_em();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Traductor_em() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTraductor = new JLabel("TRADUCTOR");
		lblTraductor.setBounds(167, 21, 272, 40);
		lblTraductor.setFont(new Font("Baskerville Old Face", Font.PLAIN, 40));
		contentPane.add(lblTraductor);
		
		JLabel lblTraducir = new JLabel("Traducir");
		lblTraducir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTraducir.setBounds(107, 111, 75, 25);
		contentPane.add(lblTraducir);
		
		textTraducir = new JTextField();
		textTraducir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textTraducir.setBounds(192, 110, 247, 25);
		contentPane.add(textTraducir);
		textTraducir.setColumns(10);
		
		JButton btntraducir = new JButton("Traducir Español");
		btntraducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean encontrado = false;
				for(int i=1;i<6;i++) {
					if (textTraducir.getText().equalsIgnoreCase(palabras[i][0])) {
						encontrado = true;
						textTraducir.setText("");
						JOptionPane.showMessageDialog(null, "La traduccion es: \n Ingles: "+palabras[i][1]+"\n Portugues: "+palabras[i][2]);
					}
				}//FOR
				if (encontrado == false){
					textTraducir.setText("");
					JOptionPane.showMessageDialog(null, "Palabra no encontrada");
					}
				}
		});
		btntraducir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btntraducir.setBounds(229, 145, 159, 34);
		contentPane.add(btntraducir);
		
		JButton btnTraducirIngls = new JButton("Traducir Inglés");
		btnTraducirIngls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean encontrado = false;
				for(int i=1;i<6;i++) {
					if (textTraducir.getText().equalsIgnoreCase(palabras[i][1])) {
						encontrado = true;
						textTraducir.setText("");
						JOptionPane.showMessageDialog(null, "La traduccion es: \n Español: "+palabras[i][0]+"\n Portugues: "+palabras[i][2]);
					}
				}//FOR
				if (encontrado == false){
					textTraducir.setText("");
					JOptionPane.showMessageDialog(null, "Palabra no encontrada");
					}
				
			}
		});
		btnTraducirIngls.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTraducirIngls.setBounds(229, 190, 159, 34);
		contentPane.add(btnTraducirIngls);
		
		JButton btnTraducirPortugs = new JButton("Traducir Portugés");
		btnTraducirPortugs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean encontrado = false;
				for(int i=1;i<6;i++) {
					if (textTraducir.getText().equalsIgnoreCase(palabras[i][2])) {
						encontrado = true;
						textTraducir.setText("");
						JOptionPane.showMessageDialog(null, "La traduccion es: \n Español: "+palabras[i][0]+"\n Inglés: "+palabras[i][1]);
					}
				}//FOR
				if (encontrado == false){
					textTraducir.setText("");
					JOptionPane.showMessageDialog(null, "Palabra no encontrada");
					}
				
			}
		});
		btnTraducirPortugs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTraducirPortugs.setBounds(229, 235, 159, 34);
		contentPane.add(btnTraducirPortugs);

	}
}
