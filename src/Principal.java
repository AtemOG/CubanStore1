import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.DropMode;


public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtCubanstore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Derek\\Downloads\\descarga.png"));
		setTitle("Cuban Store");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Empleados");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Hacemos esto con el objetivo de crear la pantalla 
				Empleados newframe = new Empleados();
				// hacer visible la variable 
				newframe.setVisible(true);
				dispose();// simplemente con el dispose solucionas las multiples pantallas. 
			}
		});
		btnNewButton.setBounds(12, 114, 111, 47);
		contentPane.add(btnNewButton);
		
		JButton btnPersonalizacion = new JButton("Piezas");
		btnPersonalizacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Piezas newframe  = new Piezas();
				
				newframe.setVisible(true);
				dispose();
				
			}
		});
		btnPersonalizacion.setBounds(294, 114, 111, 47);
		contentPane.add(btnPersonalizacion);
		
		JButton btnPiezas = new JButton("Personalizar");
		btnPiezas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Personalizar newframe = new Personalizar();
				
				newframe.setVisible(true);
				dispose();
			}
		});
		btnPiezas.setBounds(157, 114, 111, 47);
		contentPane.add(btnPiezas);
		
		txtCubanstore = new JTextField();
		txtCubanstore.setBounds(145, 13, 137, 75);
		contentPane.add(txtCubanstore);
		txtCubanstore.setToolTipText("");
		txtCubanstore.setEditable(false);
		txtCubanstore.setBackground(Color.WHITE);
		txtCubanstore.setFont(new Font("MV Boli", Font.PLAIN, 13));
		txtCubanstore.setForeground(Color.BLACK);
		txtCubanstore.setHorizontalAlignment(SwingConstants.CENTER);
		txtCubanstore.setText("CubanStore");
		txtCubanstore.setColumns(10);
	}
}
