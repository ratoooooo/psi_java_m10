package atividades_M10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SpinnerNumberModel;

public class Atividade4GUI {

	private JFrame frame;
	private Opel opel;
	private Toyota toyota;
	private JTextField textFieldModeloOpel;
	private JTextField textFieldModeloToyota;
	private JLabel lblCarro1;
	private JSpinner spinnerConsumoCarro1 ;
	private JSpinner spinnerConsumoCarro2;
	private JSpinner spinnerDistanciaCarro2;
	private JSpinner spinnerDistanciaCarro1;
	private JLabel lblCarro2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade4GUI window = new Atividade4GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Atividade4GUI() {
		opel = new Opel();
		toyota = new Toyota();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consumo Opel");
		lblNewLabel.setBounds(10, 74, 92, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblConsumoToyoyta = new JLabel("Consumo Toyoyta");
		lblConsumoToyoyta.setBounds(218, 74, 92, 30);
		frame.getContentPane().add(lblConsumoToyoyta);
		
		 spinnerConsumoCarro1 = new JSpinner();
		spinnerConsumoCarro1.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerConsumoCarro1.setBounds(112, 79, 86, 20);
		frame.getContentPane().add(spinnerConsumoCarro1);

		spinnerConsumoCarro2 = new JSpinner();
		spinnerConsumoCarro2.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerConsumoCarro2.setBounds(320, 79, 86, 20);
		frame.getContentPane().add(spinnerConsumoCarro2);
		
		JButton btnNewButton = new JButton("Caucular");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String modeloOpel = textFieldModeloOpel.getText();
				String modeloToyota = textFieldModeloToyota.getText();
				
				double consumoOpel = (double) spinnerConsumoCarro1.getValue();
				double consumoToyota = (double) spinnerConsumoCarro2.getValue();
				
				double distanciaOpel = (double) spinnerDistanciaCarro1.getValue();
				double distanciaToyota = (double) spinnerConsumoCarro2.getValue();
				
				opel.modelo(modeloOpel);
				toyota.modelo(modeloOpel);
				
				opel.consumo(distanciaOpel, consumoOpel);
				toyota.consumo(distanciaToyota, consumoToyota);
				
				lblCarro1.setText("O modelo "+ opel.modelo(modeloOpel) + " tem um consumo de " + opel.consumo(distanciaOpel, consumoOpel) );
				lblCarro2.setText("O modelo "+ toyota.modelo(modeloToyota) + " tem um consumo de " + toyota.consumo(distanciaToyota, consumoToyota) );
			}
		});
		btnNewButton.setBounds(130, 227, 156, 23);
		frame.getContentPane().add(btnNewButton);
		
		spinnerDistanciaCarro1 = new JSpinner();
		spinnerDistanciaCarro1.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerDistanciaCarro1.setBounds(112, 129, 86, 20);
		frame.getContentPane().add(spinnerDistanciaCarro1);
		
		spinnerDistanciaCarro2 = new JSpinner();
		spinnerDistanciaCarro2.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerDistanciaCarro2.setBounds(320, 129, 86, 20);
		frame.getContentPane().add(spinnerDistanciaCarro2);
		
		JLabel lblDistanciaFeitaOpel = new JLabel("Distancia Feita");
		lblDistanciaFeitaOpel.setBounds(10, 124, 92, 30);
		frame.getContentPane().add(lblDistanciaFeitaOpel);
		
		JLabel lblDistanciaFeitaToyota = new JLabel("Distancia Feita");
		lblDistanciaFeitaToyota.setBounds(218, 124, 92, 30);
		frame.getContentPane().add(lblDistanciaFeitaToyota);
		
		JLabel lblModeloCarro1 = new JLabel("Modelo");
		lblModeloCarro1.setBounds(10, 33, 92, 30);
		frame.getContentPane().add(lblModeloCarro1);
		
		JLabel lblModeloCarro2 = new JLabel("Modelo");
		lblModeloCarro2.setBounds(218, 33, 92, 30);
		frame.getContentPane().add(lblModeloCarro2);
		
		textFieldModeloOpel = new JTextField();
		textFieldModeloOpel.setBounds(112, 38, 86, 20);
		frame.getContentPane().add(textFieldModeloOpel);
		textFieldModeloOpel.setColumns(10);
		
		textFieldModeloToyota = new JTextField();
		textFieldModeloToyota.setBounds(320, 38, 86, 20);
		frame.getContentPane().add(textFieldModeloToyota);
		textFieldModeloToyota.setColumns(10);
		
		lblCarro1 = new JLabel("");
		lblCarro1.setBounds(10, 174, 380, 14);
		frame.getContentPane().add(lblCarro1);
		
		 lblCarro2 = new JLabel("");
		lblCarro2.setBounds(10, 204, 396, 14);
		frame.getContentPane().add(lblCarro2);
	}
}
