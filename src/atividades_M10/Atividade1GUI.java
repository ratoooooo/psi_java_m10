package atividades_M10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Atividade1GUI {

	private JFrame frame;
	private Aluno aluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade1GUI window = new Atividade1GUI();
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
	public Atividade1GUI() {
		aluno = new Aluno("Leo", "ESHN");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 333, 285);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEstado = new JLabel("");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEstado.setBounds(10, 95, 162, 50);
		frame.getContentPane().add(lblEstado);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dinis\\Downloads\\bfd04326b4ee897c969aed40385f1261-curso-de-esqueleto-yogui-removebg-preview.png"));
		lblNewLabel.setBounds(115, 11, 230, 239);
		frame.getContentPane().add(lblNewLabel);
		
		lblEstado.setText(aluno.nome + " " + aluno.estado());;
	}
}
