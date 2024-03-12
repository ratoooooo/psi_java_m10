package atividades_M10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SpinnerNumberModel;

public class Atividade5GUI {

	private JFrame frame;
	private Circulo circulo;
	private Quadrado quadrado;
	private Triangulo triangulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade5GUI window = new Atividade5GUI();
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
	public Atividade5GUI() {
		circulo = new Circulo();
		quadrado = new Quadrado();
		triangulo = new Triangulo();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1151, 291);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelCirculo = new JPanel();
		panelCirculo.setBorder(new TitledBorder(null, "Circulo", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panelCirculo.setBounds(10, 11, 344, 221);
		frame.getContentPane().add(panelCirculo);
		panelCirculo.setLayout(null);
		
		JLabel lblRaioCirculo = new JLabel("Raio:");
		lblRaioCirculo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRaioCirculo.setBounds(10, 61, 69, 30);
		panelCirculo.add(lblRaioCirculo);
		
		JSpinner spinnerRaioCirculo = new JSpinner();
		spinnerRaioCirculo.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerRaioCirculo.setBounds(64, 62, 77, 20);
		panelCirculo.add(spinnerRaioCirculo);
		
		JLabel lblPerimetroCirculo = new JLabel("Perimetro");
		lblPerimetroCirculo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPerimetroCirculo.setBounds(10, 115, 105, 30);
		panelCirculo.add(lblPerimetroCirculo);
		
		JLabel lblAreaCirculo = new JLabel("Area:");
		lblAreaCirculo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAreaCirculo.setBounds(10, 171, 69, 30);
		panelCirculo.add(lblAreaCirculo);
		
		JSpinner spinnerPerimetroCirculo = new JSpinner();
		spinnerPerimetroCirculo.setEnabled(false);
		spinnerPerimetroCirculo.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerPerimetroCirculo.setBounds(108, 119, 77, 20);
		panelCirculo.add(spinnerPerimetroCirculo);
		
		JSpinner spinnerAreaCirculo = new JSpinner();
		spinnerAreaCirculo.setEnabled(false);
		spinnerAreaCirculo.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerAreaCirculo.setBounds(64, 175, 77, 20);
		panelCirculo.add(spinnerAreaCirculo);
		
		JPanel panelQuadrado = new JPanel();
		panelQuadrado.setLayout(null);
		panelQuadrado.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Quadrado", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelQuadrado.setBounds(350, 11, 344, 221);
		frame.getContentPane().add(panelQuadrado);
		
		JLabel lblLadoQuadrado = new JLabel("Lado:");
		lblLadoQuadrado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLadoQuadrado.setBounds(10, 61, 69, 30);
		panelQuadrado.add(lblLadoQuadrado);
		
		JSpinner spinnerLadoQuadrado = new JSpinner();
		spinnerLadoQuadrado.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerLadoQuadrado.setBounds(64, 65, 77, 20);
		panelQuadrado.add(spinnerLadoQuadrado);
		
		JLabel lblPerimetroQuadrado = new JLabel("Perimetro");
		lblPerimetroQuadrado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPerimetroQuadrado.setBounds(10, 115, 105, 30);
		panelQuadrado.add(lblPerimetroQuadrado);
		
		JLabel lblAreaQuadrado = new JLabel("Area:");
		lblAreaQuadrado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAreaQuadrado.setBounds(10, 171, 69, 30);
		panelQuadrado.add(lblAreaQuadrado);
		
		JSpinner spinnerPerimetroQuadrado = new JSpinner();
		spinnerPerimetroQuadrado.setEnabled(false);
		spinnerPerimetroQuadrado.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerPerimetroQuadrado.setBounds(108, 119, 77, 20);
		panelQuadrado.add(spinnerPerimetroQuadrado);
		
		JSpinner spinnerAreaQuadrado = new JSpinner();
		spinnerAreaQuadrado.setEnabled(false);
		spinnerAreaQuadrado.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerAreaQuadrado.setBounds(64, 175, 77, 20);
		panelQuadrado.add(spinnerAreaQuadrado);
		
		JPanel panelTriangulo = new JPanel();
		panelTriangulo.setLayout(null);
		panelTriangulo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Triangulo", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelTriangulo.setBounds(691, 11, 452, 221);
		frame.getContentPane().add(panelTriangulo);
		
		JLabel lblLado1Triangulo = new JLabel("Lado 1:");
		lblLado1Triangulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLado1Triangulo.setBounds(10, 61, 69, 30);
		panelTriangulo.add(lblLado1Triangulo);
		
		JSpinner spinnerLado1Triangulo = new JSpinner();
		spinnerLado1Triangulo.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerLado1Triangulo.setBounds(63, 65, 77, 20);
		panelTriangulo.add(spinnerLado1Triangulo);
		
		JLabel lblPerimetroTriangulo = new JLabel("Perimetro");
		lblPerimetroTriangulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPerimetroTriangulo.setBounds(217, 61, 105, 30);
		panelTriangulo.add(lblPerimetroTriangulo);
		
		JLabel lblAreaTriangulo = new JLabel("Area:");
		lblAreaTriangulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAreaTriangulo.setBounds(217, 117, 69, 30);
		panelTriangulo.add(lblAreaTriangulo);
		
		JSpinner spinnerPerimetroTriangulo = new JSpinner();
		spinnerPerimetroTriangulo.setEnabled(false);
		spinnerPerimetroTriangulo.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerPerimetroTriangulo.setBounds(315, 65, 77, 20);
		panelTriangulo.add(spinnerPerimetroTriangulo);
		
		JSpinner spinnerAreaTriangulo = new JSpinner();
		spinnerAreaTriangulo.setEnabled(false);
		spinnerAreaTriangulo.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerAreaTriangulo.setBounds(271, 121, 77, 20);
		panelTriangulo.add(spinnerAreaTriangulo);
		
		JLabel lblLado2Triangulo = new JLabel("Lado 2:");
		lblLado2Triangulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLado2Triangulo.setBounds(10, 115, 69, 30);
		panelTriangulo.add(lblLado2Triangulo);
		
		JSpinner spinnerLado2Triangulo = new JSpinner();
		spinnerLado2Triangulo.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerLado2Triangulo.setBounds(63, 119, 77, 20);
		panelTriangulo.add(spinnerLado2Triangulo);
		
		JLabel lblLado3Triangulo = new JLabel("Lado 3:");
		lblLado3Triangulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLado3Triangulo.setBounds(10, 171, 69, 30);
		panelTriangulo.add(lblLado3Triangulo);
		
		JSpinner spinnerLado3Triangulo = new JSpinner();
		spinnerLado3Triangulo.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerLado3Triangulo.setBounds(63, 175, 77, 20);
		panelTriangulo.add(spinnerLado3Triangulo);
		
		JButton btnCaucular = new JButton("Calcular");
		btnCaucular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//circulo
				double raio = (double) spinnerRaioCirculo.getValue();
				circulo.setRaio(raio);
				
				spinnerAreaCirculo.setValue(circulo.area());
				spinnerPerimetroCirculo.setValue(circulo.perimetro());
				
				//quadrado
				double ladoQuadrado = (double) spinnerLadoQuadrado.getValue();
				quadrado.setLado(ladoQuadrado);
				
				spinnerAreaQuadrado.setValue(quadrado.area());
				spinnerPerimetroQuadrado.setValue(quadrado.perimetro());
				
				//triangulo
				double lado1Triangulo = (double) spinnerLado1Triangulo.getValue();
				triangulo.setLado1(lado1Triangulo);
				double lado2Triangulo = (double) spinnerLado2Triangulo.getValue();
				triangulo.setLado2(lado2Triangulo);
				double lado3Triangulo = (double) spinnerLado3Triangulo.getValue();
				triangulo.setLado3(lado3Triangulo);
				
				spinnerAreaTriangulo.setValue(triangulo.area());
				spinnerPerimetroTriangulo.setValue(triangulo.perimetro());
				
			}
		});
		btnCaucular.setBounds(552, 229, 89, 23);
		frame.getContentPane().add(btnCaucular);
	}
}
