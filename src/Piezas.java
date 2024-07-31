import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.Toolkit;


public class Piezas extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscadorDePiezas;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piezas frame = new Piezas();
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
	public Piezas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Derek\\Downloads\\descarga.png"));
		setTitle("Piezas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("<atr\u00E1s");
		btnNewButton.setBounds(25, 217, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Principal newframe  = new Principal();
				newframe.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		txtBuscadorDePiezas = new JTextField();
		txtBuscadorDePiezas.setEditable(false);
		txtBuscadorDePiezas.setBounds(25, 11, 130, 20);
		txtBuscadorDePiezas.setText("Buscador de Piezas");
		contentPane.add(txtBuscadorDePiezas);
		txtBuscadorDePiezas.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(25, 40, 175, 20);
		textField_1.setToolTipText("");
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setBounds(212, 39, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(25, 71, 344, 142);
		contentPane.add(tabbedPane);
	}
}
