package atividades_M10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class Atividade6GUI {

    private JFrame frame;
    private ContaPoupanca contaPoupanca;
    private ContaCorrente contaCorrente;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Atividade6GUI window = new Atividade6GUI();
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
    public Atividade6GUI() {
        contaPoupanca = new ContaPoupanca();
        contaCorrente = new ContaCorrente();
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 516, 261);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panelContaCorrente = new JPanel();
        panelContaCorrente.setBorder(new TitledBorder(null, "Conta Corrente", TitledBorder.LEADING, TitledBorder.TOP,
                null, null));
        panelContaCorrente.setBounds(10, 11, 242, 211);
        frame.getContentPane().add(panelContaCorrente);
        panelContaCorrente.setLayout(null);

        JLabel lblSaldo = new JLabel("Saldo:");
        lblSaldo.setHorizontalAlignment(SwingConstants.LEFT);
        lblSaldo.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblSaldo.setBounds(10, 23, 80, 42);
        panelContaCorrente.add(lblSaldo);

        JSpinner spinnerSaldo = new JSpinner();
        spinnerSaldo.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
        spinnerSaldo.setEnabled(false);
        spinnerSaldo.setBounds(64, 37, 96, 20);
        panelContaCorrente.add(spinnerSaldo);

        JLabel lblNewLabel = new JLabel("Inserir Saldo");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setBounds(10, 76, 125, 30);
        panelContaCorrente.add(lblNewLabel);

        JSpinner spinnerInserirSaldo = new JSpinner();
        spinnerInserirSaldo.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
        spinnerInserirSaldo.setBounds(128, 84, 80, 20);
        panelContaCorrente.add(spinnerInserirSaldo);

        JButton btnDepositar = new JButton("Depositar");
        btnDepositar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                double saldoDepositado = (double) spinnerInserirSaldo.getValue();
                contaCorrente.deposite(saldoDepositado);
                spinnerSaldo.setValue(contaCorrente.saldo);
            }
        });
        btnDepositar.setBounds(10, 117, 100, 23);
        panelContaCorrente.add(btnDepositar);

        JLabel lblRetirarSaldo = new JLabel("Retirar Saldo");
        lblRetirarSaldo.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblRetirarSaldo.setBounds(10, 151, 125, 30);
        panelContaCorrente.add(lblRetirarSaldo);

        JSpinner spinnerRetirarSaldo = new JSpinner();
        spinnerRetirarSaldo.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
        spinnerRetirarSaldo.setBounds(128, 159, 80, 20);
        panelContaCorrente.add(spinnerRetirarSaldo);

        JButton btnRetirar = new JButton("Retirar");
        btnRetirar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                double saldoRetirado = (double) spinnerRetirarSaldo.getValue();
                contaCorrente.levante(saldoRetirado);
                spinnerSaldo.setValue(contaCorrente.saldo);
                if(saldoRetirado > contaCorrente.saldo)
                {
                	JOptionPane.showMessageDialog(null, JOptionPane.ERROR_MESSAGE);			
                }
            }
        });
        btnRetirar.setBounds(10, 185, 100, 23);
        panelContaCorrente.add(btnRetirar);
        
        JPanel panelContaPoupanca = new JPanel();
        panelContaPoupanca.setLayout(null);
        panelContaPoupanca.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Conta Poupan\u00E7a", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panelContaPoupanca.setBounds(262, 11, 242, 211);
        frame.getContentPane().add(panelContaPoupanca);

        JLabel lblSaldoPoupanca = new JLabel("Saldo:");
        lblSaldoPoupanca.setHorizontalAlignment(SwingConstants.LEFT);
        lblSaldoPoupanca.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblSaldoPoupanca.setBounds(10, 23, 80, 42);
        panelContaPoupanca.add(lblSaldoPoupanca);

        JSpinner spinnerSaldoPoupanca = new JSpinner();
        spinnerSaldoPoupanca.setEnabled(false);
        spinnerSaldoPoupanca.setBounds(64, 37, 96, 20);
        panelContaPoupanca.add(spinnerSaldoPoupanca);

        JLabel lblInserirSaldoPoupanca = new JLabel("Inserir Saldo");
        lblInserirSaldoPoupanca.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblInserirSaldoPoupanca.setBounds(10, 76, 125, 30);
        panelContaPoupanca.add(lblInserirSaldoPoupanca);

        JSpinner spinnerInserirSaldoPoupanca = new JSpinner();
        spinnerInserirSaldoPoupanca.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
        spinnerInserirSaldoPoupanca.setBounds(128, 84, 80, 20);
        panelContaPoupanca.add(spinnerInserirSaldoPoupanca);

        JLabel lblRetirarSaldoPoupanca = new JLabel("Retirar Saldo");
        lblRetirarSaldoPoupanca.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblRetirarSaldoPoupanca.setBounds(10, 151, 125, 30);
        panelContaPoupanca.add(lblRetirarSaldoPoupanca);

        JSpinner spinnerRetirarSaldoPoupanca = new JSpinner();
        spinnerRetirarSaldoPoupanca.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
        spinnerRetirarSaldoPoupanca.setBounds(128, 159, 80, 20);
        panelContaPoupanca.add(spinnerRetirarSaldoPoupanca);

        JButton btnDepositarPoupanca = new JButton("Depositar");
        btnDepositarPoupanca.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double saldoDepositadoPoupanca = (double) spinnerInserirSaldoPoupanca.getValue();
                contaPoupanca.deposite(saldoDepositadoPoupanca);
                spinnerSaldoPoupanca.setValue(contaPoupanca.saldo); 
            }
        });
        btnDepositarPoupanca.setBounds(10, 117, 100, 23);
        panelContaPoupanca.add(btnDepositarPoupanca);

        JButton btnRetirarPoupanca = new JButton("Retirar");
        btnRetirarPoupanca.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double saldoRetiradoPoupanca = (double) spinnerRetirarSaldoPoupanca.getValue();
                contaPoupanca.levante(saldoRetiradoPoupanca);
                spinnerSaldoPoupanca.setValue(contaPoupanca.saldo); 
                
                if(saldoRetiradoPoupanca > contaPoupanca.saldo)
                {
                	
                }
            }
        });
        btnRetirarPoupanca.setBounds(10, 185, 100, 23);
        panelContaPoupanca.add(btnRetirarPoupanca);
    }
}
