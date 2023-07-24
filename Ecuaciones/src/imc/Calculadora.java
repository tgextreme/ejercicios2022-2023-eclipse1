package imc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Tpeso = new JLabel("Introduzca Peso");
		Tpeso.setBounds(33, 75, 89, 26);
		contentPane.add(Tpeso);
		
		JLabel Taltura = new JLabel("Introduzca Altura");
		Taltura.setBounds(33, 112, 89, 26);
		contentPane.add(Taltura);
		
		JLabel Timc = new JLabel("Su IMC es:");
		Timc.setBounds(67, 169, 89, 26);
		contentPane.add(Timc);
		
		text1 = new JTextField();
		text1.setBounds(163, 78, 86, 20);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(163, 115, 86, 20);
		contentPane.add(text2);
		text2.setColumns(10);
		
		text3 = new JTextField();
		text3.setEditable(false);
		text3.setBounds(163, 172, 86, 20);
		contentPane.add(text3);
		text3.setColumns(10);
		
		
		String p = text1.getText();
		String a = text2.getText();
		double peso = Double.parseDouble(p);
		double alt = Double.parseDouble(a);
		double IMC = peso /(alt*alt);
		JOptionPane.showInputDialog(Tpeso);
		JOptionPane.showInputDialog(Taltura);
		JOptionPane.showMessageDialog(null, "Su IMC es: "+IMC);
	}
}