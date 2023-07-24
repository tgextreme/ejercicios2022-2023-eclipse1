package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textNum1;
	private JTextField textNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Numero 1");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 5, 5);
		contentPane.add(tabbedPane);

		JLabel lblNewLabel_1 = new JLabel("Numero 2");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel_1);

		textNum1 = new JTextField();
		textNum1.setBounds(66, 8, 86, 20);
		contentPane.add(textNum1);
		textNum1.setColumns(10);

		textNum2 = new JTextField();
		textNum2.setBounds(66, 33, 86, 20);
		contentPane.add(textNum2);
		textNum2.setColumns(10);

		JButton btnNewButton = new JButton("Calcular");
		
		btnNewButton.setBounds(10, 189, 89, 23);
		contentPane.add(btnNewButton);

		JLabel lblSolucion = new JLabel("Solucion: ");
		lblSolucion.setBounds(10, 158, 414, 14);
		contentPane.add(lblSolucion);
		
		JRadioButton sumaRadio = new JRadioButton("Suma");
		sumaRadio.setBounds(10, 71, 109, 23);
		contentPane.add(sumaRadio);
		
		JRadioButton restaRadio = new JRadioButton("Resta");
		restaRadio.setBounds(10, 97, 109, 23);
		contentPane.add(restaRadio);
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(restaRadio);
		grupo.add(sumaRadio);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(textNum1.getText());
					double num2 = Double.parseDouble(textNum2.getText());
					String resultado="Solucion: ";
					if(sumaRadio.isSelected()) {
						resultado=resultado+"la suma es "+(num1+num2);
						
						
					}else if(restaRadio.isSelected()) {
						resultado=resultado+"la resta es "+(num1-num2);
					}
					lblSolucion.setText(resultado);
					
				} catch (Exception ex) {
System.out.println("error"+ex.getMessage());
				}
			}
		});
	}
}
