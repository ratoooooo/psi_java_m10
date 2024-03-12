package atividades_M10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class Atividade3GUIº {

	private JFrame frame;
	private Renault carro1;
	private Renault carro2;
	private Renault carro3;
	private JTextField textFieldModeloCarro1;
	private JTextField textFieldModeloCarro2;
	private JTextField textFieldModeloCarro3;
	
	private  JSpinner spinnerConsumoCarro3 ;
	private JSpinner spinnerConsumoCarro2;
	private JSpinner spinnerConsumoCarro1;
	
	private JSpinner spinnerAnoCarro3;
	private JSpinner spinnerAnoCarro2;
	private JSpinner spinnerAnoCarro1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade3GUIº window = new Atividade3GUIº();
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
	public Atividade3GUIº() {
		carro1 = new Renault("Renault Clio", 2024, 2.1);
		carro2 = new Renault("Volkswagen Touran", 2020, 3.5);
		carro3 = new Renault("Pegoutb 308", 2014, 2.5);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 824, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCarros = new JLabel("Carros");
		lblCarros.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarros.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCarros.setBounds(339, 11, 130, 77);
		frame.getContentPane().add(lblCarros);
		
		JLabel lblModeloCarro1 = new JLabel("Modelo:");
		lblModeloCarro1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblModeloCarro1.setBounds(28, 97, 81, 46);
		frame.getContentPane().add(lblModeloCarro1);
		
		JLabel lblAnoLancamentoCarro1 = new JLabel("Ano:");
		lblAnoLancamentoCarro1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnoLancamentoCarro1.setBounds(28, 165, 81, 46);
		frame.getContentPane().add(lblAnoLancamentoCarro1);
		
		textFieldModeloCarro1 = new JTextField();
		textFieldModeloCarro1.setEnabled(false);
		textFieldModeloCarro1.setBounds(103, 113, 81, 20);
		frame.getContentPane().add(textFieldModeloCarro1);
		textFieldModeloCarro1.setColumns(10);
		
		 spinnerAnoCarro1 = new JSpinner();
		 spinnerAnoCarro1.setEnabled(false);
		spinnerAnoCarro1.setBounds(100, 181, 81, 20);
		frame.getContentPane().add(spinnerAnoCarro1);
		
		JLabel lblModeloCarro2 = new JLabel("Modelo:");
		lblModeloCarro2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblModeloCarro2.setBounds(267, 99, 81, 46);
		frame.getContentPane().add(lblModeloCarro2);
		
		textFieldModeloCarro2 = new JTextField();
		textFieldModeloCarro2.setEnabled(false);
		textFieldModeloCarro2.setColumns(10);
		textFieldModeloCarro2.setBounds(342, 115, 81, 20);
		frame.getContentPane().add(textFieldModeloCarro2);
		
		JLabel lblAnoLancamentoCarro2 = new JLabel("Ano:");
		lblAnoLancamentoCarro2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnoLancamentoCarro2.setBounds(267, 167, 81, 46);
		frame.getContentPane().add(lblAnoLancamentoCarro2);
		
		spinnerAnoCarro2 = new JSpinner();
		spinnerAnoCarro2.setEnabled(false);
		spinnerAnoCarro2.setBounds(339, 183, 81, 20);
		frame.getContentPane().add(spinnerAnoCarro2);
		
		JLabel lblModeloCarro3 = new JLabel("Modelo:");
		lblModeloCarro3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblModeloCarro3.setBounds(509, 97, 81, 46);
		frame.getContentPane().add(lblModeloCarro3);
		
		textFieldModeloCarro3 = new JTextField();
		textFieldModeloCarro3.setEnabled(false);
		textFieldModeloCarro3.setColumns(10);
		textFieldModeloCarro3.setBounds(584, 113, 81, 20);
		frame.getContentPane().add(textFieldModeloCarro3);
		
		JLabel lblAnoLancamentoCarro3 = new JLabel("Ano:");
		lblAnoLancamentoCarro3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnoLancamentoCarro3.setBounds(509, 165, 81, 46);
		frame.getContentPane().add(lblAnoLancamentoCarro3);
		
		spinnerAnoCarro3 = new JSpinner();
		spinnerAnoCarro3.setEnabled(false);
		spinnerAnoCarro3.setBounds(581, 181, 81, 20);
		frame.getContentPane().add(spinnerAnoCarro3);
		
		JLabel lblConsumoCarro1 = new JLabel("Consumo");
		lblConsumoCarro1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConsumoCarro1.setBounds(28, 234, 81, 46);
		frame.getContentPane().add(lblConsumoCarro1);
		
		JLabel lblConsumoCarro2 = new JLabel("Consumo");
		lblConsumoCarro2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConsumoCarro2.setBounds(262, 234, 81, 46);
		frame.getContentPane().add(lblConsumoCarro2);
		
		JLabel lblConsumoCarro3 = new JLabel("Consumo");
		lblConsumoCarro3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConsumoCarro3.setBounds(509, 234, 81, 46);
		frame.getContentPane().add(lblConsumoCarro3);
		
		spinnerConsumoCarro1 = new JSpinner();
		spinnerConsumoCarro1.setEnabled(false);
		spinnerConsumoCarro1.setBounds(103, 250, 81, 20);
		frame.getContentPane().add(spinnerConsumoCarro1);
		
		spinnerConsumoCarro2 = new JSpinner();
		spinnerConsumoCarro2.setEnabled(false);
		spinnerConsumoCarro2.setBounds(342, 250, 81, 20);
		frame.getContentPane().add(spinnerConsumoCarro2);
		
		 spinnerConsumoCarro3 = new JSpinner();
		 spinnerConsumoCarro3.setEnabled(false);
		spinnerConsumoCarro3.setBounds(584, 250, 81, 20);
		frame.getContentPane().add(spinnerConsumoCarro3);
		
		//carro1
		textFieldModeloCarro1.setText(carro1.modelo);
		spinnerAnoCarro1.setValue(carro1.ano);
		spinnerConsumoCarro1.setValue(carro1.consumo);
		
		//carro2
		textFieldModeloCarro2.setText(carro2.modelo);
		spinnerAnoCarro2.setValue(carro2.ano);
		spinnerConsumoCarro2.setValue(carro2.consumo);
		
		//carro3
		textFieldModeloCarro3.setText(carro3.modelo);
		spinnerAnoCarro3.setValue(carro3.ano);
		spinnerConsumoCarro3.setValue(carro3.consumo);
		
	}
}
