package atividades_M10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Atividade2GUI {

	private JFrame frame;
	private JTextField textFieldNomeChefe;
	private JTextField textFieldNomeEmpregado;
	private Chefe chefe;
	private Empregado empregado;
	private JSpinner spinnerCodigoChefe;
	private JSpinner spinnerCodigoEmpregado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade2GUI window = new Atividade2GUI();
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
	public Atividade2GUI() {
		empregado = new Empregado("Pedro", 750, 234);
		chefe = new Chefe("Dinis", 1000, 3);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 436, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblChefe = new JLabel("Chefe");
		lblChefe.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblChefe.setBounds(10, 11, 118, 59);
		frame.getContentPane().add(lblChefe);

		JLabel lblEmpregado = new JLabel("Empregado");
		lblEmpregado.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEmpregado.setBounds(277, 11, 233, 59);
		frame.getContentPane().add(lblEmpregado);

		JLabel lblNomeChefe = new JLabel("Nome:");
		lblNomeChefe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeChefe.setBounds(10, 70, 104, 36);
		frame.getContentPane().add(lblNomeChefe);

		JLabel lblNomeEmpregado = new JLabel("Nome:");
		lblNomeEmpregado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeEmpregado.setBounds(277, 70, 104, 36);
		frame.getContentPane().add(lblNomeEmpregado);

		JLabel lblSalarioVChefe = new JLabel("Salario:");
		lblSalarioVChefe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSalarioVChefe.setBounds(10, 130, 104, 36);
		frame.getContentPane().add(lblSalarioVChefe);

		JLabel lblSalarioEmpregado = new JLabel("Salario:");
		lblSalarioEmpregado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSalarioEmpregado.setBounds(277, 130, 104, 36);
		frame.getContentPane().add(lblSalarioEmpregado);

		JLabel lblCodioChefe = new JLabel("Codigo:");
		lblCodioChefe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCodioChefe.setBounds(10, 190, 104, 36);
		frame.getContentPane().add(lblCodioChefe);

		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCodigo.setBounds(277, 190, 104, 36);
		frame.getContentPane().add(lblCodigo);

		textFieldNomeChefe = new JTextField();
		textFieldNomeChefe.setBounds(67, 80, 86, 20);
		frame.getContentPane().add(textFieldNomeChefe);
		textFieldNomeChefe.setColumns(10);

		textFieldNomeEmpregado = new JTextField();
		textFieldNomeEmpregado.setColumns(10);
		textFieldNomeEmpregado.setBounds(332, 81, 86, 20);
		frame.getContentPane().add(textFieldNomeEmpregado);

		JSpinner spinnerSalarioChefe = new JSpinner();
		spinnerSalarioChefe.setModel(new SpinnerNumberModel(Double.valueOf(1000), null, null, Double.valueOf(1)));
		spinnerSalarioChefe.setBounds(72, 140, 81, 20);
		frame.getContentPane().add(spinnerSalarioChefe);

		JSpinner spinnerSalarioEmpreagdo = new JSpinner();
		spinnerSalarioEmpreagdo.setModel(new SpinnerNumberModel(Double.valueOf(750), null, null, Double.valueOf(1)));
		spinnerSalarioEmpreagdo.setBounds(332, 140, 81, 20);
		frame.getContentPane().add(spinnerSalarioEmpreagdo);

		spinnerCodigoEmpregado = new JSpinner();
		spinnerCodigoEmpregado.setEnabled(false);
		spinnerCodigoEmpregado.setBounds(332, 200, 81, 20);
		frame.getContentPane().add(spinnerCodigoEmpregado);

		spinnerCodigoChefe = new JSpinner();
		spinnerCodigoChefe.setEnabled(false);
		spinnerCodigoChefe.setBounds(67, 200, 81, 20);
		frame.getContentPane().add(spinnerCodigoChefe);

		JLabel lblSalarioChefeAumentado = new JLabel("Salario:");
		lblSalarioChefeAumentado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSalarioChefeAumentado.setBounds(10, 252, 104, 36);
		frame.getContentPane().add(lblSalarioChefeAumentado);

		JSpinner spinnerSalarioChefeAumentado = new JSpinner();
		spinnerSalarioChefeAumentado.setEnabled(false);
		spinnerSalarioChefeAumentado.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerSalarioChefeAumentado.setBounds(72, 262, 81, 20);
		frame.getContentPane().add(spinnerSalarioChefeAumentado);

		JLabel lblSalarioEmpregadoAumentado = new JLabel("Salario:");
		lblSalarioEmpregadoAumentado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSalarioEmpregadoAumentado.setBounds(277, 252, 104, 36);
		frame.getContentPane().add(lblSalarioEmpregadoAumentado);

		JSpinner spinnerSalarioEmpreagdoAumentado = new JSpinner();
		spinnerSalarioEmpreagdoAumentado.setEnabled(false);
		spinnerSalarioEmpreagdoAumentado.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerSalarioEmpreagdoAumentado.setBounds(332, 262, 81, 20);
		frame.getContentPane().add(spinnerSalarioEmpreagdoAumentado);

		// nomes
		textFieldNomeChefe.setText(chefe.getNome());
		textFieldNomeEmpregado.setText(empregado.getNome());

		// salario
		spinnerSalarioChefe.setValue(chefe.getSalario());
		spinnerSalarioEmpreagdo.setValue(empregado.getSalario());

		// codigo
		spinnerCodigoChefe.setValue(chefe.getCodEmpregado());
		spinnerCodigoEmpregado.setValue(empregado.getCodEmpregado());

	    JButton btnNewButton = new JButton("Atualizar Aumento ");
	    btnNewButton.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            double salarioChefe = (double) spinnerSalarioChefe.getValue();
	            chefe.setSalario(salarioChefe);

	            double salarioEmpregado = (double) spinnerSalarioEmpreagdo.getValue();
	            empregado.setSalario(salarioEmpregado);
	  
	            spinnerSalarioChefeAumentado.setValue(chefe.aumentaOrdenado(50));
	            spinnerSalarioEmpreagdoAumentado.setValue(empregado.aumentaOrdenado(50));
	        }
	    });
	    btnNewButton.setBounds(149, 293, 149, 23);
	    frame.getContentPane().add(btnNewButton);

	}
}
