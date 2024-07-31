import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Toolkit;


public class Personalizar extends JFrame {

	private JPanel contentPane;
	private JTextField txtFfff_1;
	private JTextField txtFfff;
	private JTextField txtFff_1;
	private JTextField txtFff;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Personalizar frame = new Personalizar();
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
	public Personalizar() {
		setTitle("Personalizar");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Derek\\Downloads\\descarga.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("<atr\u00E1s");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Principal newframe  = new Principal();
				newframe.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(12, 217, 89, 23);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(53, 41, 108, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(195, 41, 108, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(53, 117, 108, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(195, 117, 108, 20);
		contentPane.add(comboBox_3);
		
		txtFfff_1 = new JTextField();
		txtFfff_1.setEditable(false);
		txtFfff_1.setText("Ram");
		txtFfff_1.setBounds(75, 13, 86, 20);
		contentPane.add(txtFfff_1);
		txtFfff_1.setColumns(10);
		
		txtFfff = new JTextField();
		txtFfff.setEditable(false);
		txtFfff.setText("Procesador");
		txtFfff.setColumns(10);
		txtFfff.setBounds(217, 13, 86, 20);
		contentPane.add(txtFfff);
		
		txtFff_1 = new JTextField();
		txtFff_1.setEditable(false);
		txtFff_1.setText("Placa Base");
		txtFff_1.setColumns(10);
		txtFff_1.setBounds(75, 84, 86, 20);
		contentPane.add(txtFff_1);
		
		txtFff = new JTextField();
		txtFff.setEditable(false);
		txtFff.setText("Disco Duro");
		txtFff.setColumns(10);
		txtFff.setBounds(217, 84, 86, 20);
		contentPane.add(txtFff);
	}
}
