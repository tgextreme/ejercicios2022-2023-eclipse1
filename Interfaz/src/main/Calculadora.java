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

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_2_3 = new JLabel("=");
		lblNewLabel_2_3.setBounds(31, 195, 45, 13);
		contentPane.add(lblNewLabel_2_3);

		num1 = new JTextField();
		num1.setEditable(false);
		num1.setText("4");
		num1.setBounds(50, 10, 26, 22);
		contentPane.add(num1);
		num1.setColumns(10);

		num2 = new JTextField();
		num2.setEditable(false);
		num2.setText("8");
		num2.setBounds(127, 11, 26, 22);
		contentPane.add(num2);
		num2.setColumns(10);

		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(61, 188, 242, 28);
		contentPane.add(resultado);
		resultado.setColumns(10);

		JButton buttonsuma = new JButton("+");
		buttonsuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double num12 = Double.parseDouble(num1.getText());
				double num11 = Double.parseDouble(num2.getText());
				resultado.setText((num12 + num11) + "");
			}
		});
		buttonsuma.setBounds(10, 138, 63, 21);
		contentPane.add(buttonsuma);

		JButton buttonresta = new JButton("-");
		buttonresta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double num12 = Double.parseDouble(num1.getText());
				double num11 = Double.parseDouble(num2.getText());
				resultado.setText((num12 - num11) + "");
			}
		});
		buttonresta.setBounds(83, 138, 63, 21);
		contentPane.add(buttonresta);

		JButton buttonmulti = new JButton("*");
		buttonmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double num12 = Double.parseDouble(num1.getText());
				double num11 = Double.parseDouble(num2.getText());
				resultado.setText((num12 * num11) + "");
			}
		});
		buttonmulti.setBounds(156, 138, 63, 21);
		contentPane.add(buttonmulti);

		JButton buttondivision = new JButton("/");
		buttondivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double num12 = Double.parseDouble(num1.getText());
				double num11 = Double.parseDouble(num2.getText());
				resultado.setText((num12 / num11) + "");
			}
		});
		buttondivision.setBounds(229, 138, 63, 21);
		contentPane.add(buttondivision);

		JButton buttonmetodo = new JButton("%");
		buttonmetodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double num12 = Double.parseDouble(num1.getText());
				double num11 = Double.parseDouble(num2.getText());
				resultado.setText((num12 % num11) + "");
			}
		});
		buttonmetodo.setBounds(302, 138, 85, 21);
		contentPane.add(buttonmetodo);
	}
}
