package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField texto1;
	private JTextField texto2;

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
		
		JLabel lblNewLabel = new JLabel("Numero");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		texto1 = new JTextField();
		texto1.setBounds(66, 8, 331, 17);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(26, 116, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		texto2 = new JTextField();
		texto2.setEditable(false);
		texto2.setBounds(111, 113, 286, 20);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String intermedio1=texto1.getText()+"";
			
				int numero = Integer.parseInt(intermedio1+"");
		        String intermedio = "";
		        String intermedioRev="";

		        for (int i = numero; numero != 1; i++) {
		            intermedio = intermedio + "" + (numero % 2);
		            numero = numero / 2;
		        }
		        intermedio=intermedio+"1";

		        for(int i=intermedio.length()-1;i>=0;i--) {
		            intermedioRev=intermedioRev+intermedio.charAt(i);
		        }

		        texto2.setText(intermedioRev);
			}
		});
		btnNewButton.setBounds(145, 62, 89, 23);
		contentPane.add(btnNewButton);
	}
}
