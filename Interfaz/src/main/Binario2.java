package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Binario2 extends JFrame {

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
					Binario2 frame = new Binario2();
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
	public Binario2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto1 = new JTextField();
		texto1.setBounds(114, 188, 160, 40);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Resultado");
		lblNewLabel.setBounds(10, 188, 65, 26);
		contentPane.add(lblNewLabel);
		
		JButton boton1 = new JButton("Calcular");
		boton1.setBounds(10, 50, 85, 21);
		contentPane.add(boton1);
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero =Integer.parseInt (texto2.getText());
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
		
		
		texto2 = new JTextField();
		texto2.setBounds(114, 41, 160, 40);
		contentPane.add(texto2);
		texto2.setColumns(10);
	}
}
