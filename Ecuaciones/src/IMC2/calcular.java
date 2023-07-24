package IMC2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calcular extends JPanel {
	private JTextField text1;
	private JTextField text2;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public calcular() {
		setLayout(null);
		
		JLabel Tpeso = new JLabel("Introducir peso");
		Tpeso.setBounds(37, 28, 120, 14);
		add(Tpeso);
		
		text1 = new JTextField();
		text1.setBounds(131, 25, 86, 20);
		add(text1);
		text1.setColumns(10);
		
		JLabel Taltura = new JLabel("introducir altura");
		Taltura.setBounds(37, 85, 84, 14);
		add(Taltura);
		
		text2 = new JTextField();
		text2.setBounds(131, 82, 86, 20);
		add(text2);
		text2.setColumns(10);
		
		JLabel Timc = new JLabel("IMC");
		Timc.setBounds(37, 161, 46, 14);
		add(Timc);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(131, 158, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String p = text1.getText();
				String a = text2.getText();
				double peso = Double.parseDouble(p);
				double alt = Double.parseDouble(a);
				double IMC = peso /(alt*alt);
				JOptionPane.showInputDialog(Tpeso);
				JOptionPane.showInputDialog(Taltura);
				JOptionPane.showMessageDialog(null, "Su IMC es: "+IMC);
			}
		});
		btnNewButton.setBounds(128, 204, 89, 23);
		add(btnNewButton);
		
	}
}
