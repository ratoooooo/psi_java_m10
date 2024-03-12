package ProjetosFinais_M10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import ProjetosFinais_M10.AnimaisVertebvrado.TipoAmbiente;
import ProjetosFinais_M10.AnimaisVertebvrado.TipoPele;
import ProjetosFinais_M10.AnimaisVertebvrado.TipoRespiracao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnimalGUI {

	private JFrame frame;
	private JTextField textFieldPeixe;
	private JComboBox comboBoxAmbientePeixe;
	private JComboBox comboBoxRespiracaoPeixe;
	private JComboBox comboBoxPelePeixe;

	private JComboBox comboBoxAmbienteAnfibio;
	private JComboBox comboBoxPeleAnfibio;
	private JComboBox comboBoxRespiracaoAnfibio;

	private JComboBox comboBoxRespiracaoReptil;
	private JComboBox comboBoxPeleReptil;
	private JComboBox comboBoxAmbienteReptil;
	
	private JComboBox comboBoxAmbienteAve;
	private JComboBox comboBoxPeleAve;
	private JComboBox comboBoxRespiracaoAve;
	
    private JTextField textFieldMamifero;
    private JComboBox comboBoxAmbienteMamifero;
    private JComboBox comboBoxRespiracaoMamifero;
    private JComboBox comboBoxPeleMamifero;
    
    private JComboBox comboBoxFiltroAmbiente;
    private JComboBox comboBoxFiltroRespiracao;
    private JComboBox comboBoxFiltroPele ;
	
	private Peixe peixe;
	private Anfíbio anfibio;
	private Reptil reptil;
	private Ave ave;
	private Mamifero mamifero;
	private JTextField textFieldAnfibio;
	private JTextField textFieldAve;
	private JTextField textFieldReptil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI window = new AnimalGUI();
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
	public AnimalGUI() {
		peixe = new Peixe("Tobite", 5);
		anfibio = new Anfíbio("Filho de Pescador", 4);
		reptil = new Reptil("Ovo", 7);
		ave = new Ave("Toni", 3, 6, true);
		mamifero = new Mamifero("Kevin", 5);
		initialize();
		carregarAnimais();
		carregarFiltros();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1297, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panelpPeixe = new JPanel();
		panelpPeixe.setBounds(12, 11, 261, 320);
		panelpPeixe.setBorder(new TitledBorder(null, "Peixe", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panelpPeixe);
		panelpPeixe.setLayout(null);

		JLabel lblNomePeixe = new JLabel("Nome");
		lblNomePeixe.setBounds(10, 37, 54, 24);
		panelpPeixe.add(lblNomePeixe);

		textFieldPeixe = new JTextField();
		textFieldPeixe.setBounds(74, 37, 86, 20);
		panelpPeixe.add(textFieldPeixe);
		textFieldPeixe.setColumns(10);

		JLabel lblAmbiente = new JLabel("Ambiente");
		lblAmbiente.setBounds(10, 80, 54, 24);
		panelpPeixe.add(lblAmbiente);

		JLabel lblRespirao = new JLabel("Respiração");
		lblRespirao.setBounds(10, 127, 54, 24);
		panelpPeixe.add(lblRespirao);

		JLabel lblPele = new JLabel("Pele");
		lblPele.setBounds(10, 175, 54, 24);
		panelpPeixe.add(lblPele);

		comboBoxAmbientePeixe = new JComboBox();
		comboBoxAmbientePeixe.setModel(new DefaultComboBoxModel(new String[] {"Terra", "Agua", "Ar", "TerraAgua"}));
		comboBoxAmbientePeixe.setBounds(74, 79, 86, 22);
		panelpPeixe.add(comboBoxAmbientePeixe);

		comboBoxRespiracaoPeixe = new JComboBox();
		comboBoxRespiracaoPeixe.setModel(new DefaultComboBoxModel(new String[] {"Pulmoes", "Bronquios", "Ambos"}));
		comboBoxRespiracaoPeixe.setBounds(74, 126, 86, 22);
		panelpPeixe.add(comboBoxRespiracaoPeixe);

		comboBoxPelePeixe = new JComboBox();
		comboBoxPelePeixe.setModel(new DefaultComboBoxModel(new String[] {"Liso", "Escanmada", "Pelos", "Penas"}));
		comboBoxPelePeixe.setBounds(74, 174, 86, 22);
		panelpPeixe.add(comboBoxPelePeixe);

		JLabel lblBarbatanas = new JLabel("Barbatanas");
		lblBarbatanas.setBounds(10, 226, 76, 24);
		panelpPeixe.add(lblBarbatanas);

		JSpinner spinnerBarbatanasPeixe = new JSpinner();
		spinnerBarbatanasPeixe.setBounds(74, 227, 86, 18);
		panelpPeixe.add(spinnerBarbatanasPeixe);

		JCheckBox chckbxAsasPeixe = new JCheckBox("Asas");
		chckbxAsasPeixe.setBounds(10, 263, 97, 23);
		panelpPeixe.add(chckbxAsasPeixe);

		JCheckBox chckbxBarbatanasPeixe = new JCheckBox("Barbatanas");
		chckbxBarbatanasPeixe.setSelected(true);
		chckbxBarbatanasPeixe.setBounds(122, 263, 97, 23);
		panelpPeixe.add(chckbxBarbatanasPeixe);

		JCheckBox chckbxPatasPeixe = new JCheckBox("Patas");
		chckbxPatasPeixe.setBounds(10, 289, 97, 23);
		panelpPeixe.add(chckbxPatasPeixe);

		JCheckBox chckbxTempCorpPeixe = new JCheckBox("Temp. Corp.");
		chckbxTempCorpPeixe.setBounds(122, 289, 97, 23);
		panelpPeixe.add(chckbxTempCorpPeixe);

		JPanel panelpAnfibio = new JPanel();
		panelpAnfibio.setBounds(283, 11, 261, 320);
		panelpAnfibio.setLayout(null);
		panelpAnfibio.setBorder(new TitledBorder(
		new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Anfuibio",
		TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panelpAnfibio);

		JLabel lblNomePeixe_1 = new JLabel("Nome");
		lblNomePeixe_1.setBounds(10, 37, 54, 24);
		panelpAnfibio.add(lblNomePeixe_1);

		JLabel lblAmbiente_1 = new JLabel("Ambiente");
		lblAmbiente_1.setBounds(10, 80, 54, 24);
		panelpAnfibio.add(lblAmbiente_1);

		JLabel lblRespirao_1 = new JLabel("Respiração");
		lblRespirao_1.setBounds(10, 127, 54, 24);
		panelpAnfibio.add(lblRespirao_1);

		JLabel lblPele_1 = new JLabel("Pele");
		lblPele_1.setBounds(10, 175, 54, 24);
		panelpAnfibio.add(lblPele_1);

		JLabel lblPatasAnfibio = new JLabel("Patas");
		lblPatasAnfibio.setBounds(10, 226, 76, 24);
		panelpAnfibio.add(lblPatasAnfibio);

		JCheckBox chckbxAsasAnfibio = new JCheckBox("Asas");
		chckbxAsasAnfibio.setBounds(10, 263, 97, 23);
		panelpAnfibio.add(chckbxAsasAnfibio);

		JCheckBox chckbxBarbatanasAnfibio = new JCheckBox("Barbatanas");
		chckbxBarbatanasAnfibio.setBounds(122, 263, 97, 23);
		panelpAnfibio.add(chckbxBarbatanasAnfibio);

		JCheckBox chckbxPatasAnfibio = new JCheckBox("Patas");
		chckbxPatasAnfibio.setBounds(10, 289, 97, 23);
		panelpAnfibio.add(chckbxPatasAnfibio);

		JCheckBox chckbxTempCorpAnfibio = new JCheckBox("Temp. Corp.");
		chckbxTempCorpAnfibio.setSelected(true);
		chckbxTempCorpAnfibio.setBounds(122, 289, 97, 23);
		panelpAnfibio.add(chckbxTempCorpAnfibio);

		textFieldAnfibio = new JTextField();
		textFieldAnfibio.setText("Tobite");
		textFieldAnfibio.setColumns(10);
		textFieldAnfibio.setBounds(97, 37, 86, 20);
		panelpAnfibio.add(textFieldAnfibio);

		comboBoxAmbienteAnfibio = new JComboBox();
		comboBoxAmbienteAnfibio.setModel(new DefaultComboBoxModel(new String[] {"Terra", "Agua", "Ar", "TerraAgua"}));
		comboBoxAmbienteAnfibio.setBounds(97, 79, 86, 22);
		panelpAnfibio.add(comboBoxAmbienteAnfibio);

		comboBoxPeleAnfibio = new JComboBox();
		comboBoxPeleAnfibio.setModel(new DefaultComboBoxModel(new String[] {"Liso", "Escanmada", "Pelos", "Penas"}));
		comboBoxPeleAnfibio.setBounds(97, 174, 86, 22);
		panelpAnfibio.add(comboBoxPeleAnfibio);

		comboBoxRespiracaoAnfibio = new JComboBox();
		comboBoxRespiracaoAnfibio.setModel(new DefaultComboBoxModel(new String[] {"Pulmoes", "Bronquios", "Ambos"}));
		comboBoxRespiracaoAnfibio.setBounds(97, 126, 86, 22);
		panelpAnfibio.add(comboBoxRespiracaoAnfibio);

		JSpinner spinnerBarbatanasPeixe_1 = new JSpinner();
		spinnerBarbatanasPeixe_1.setBounds(97, 227, 86, 18);
		panelpAnfibio.add(spinnerBarbatanasPeixe_1);

		JPanel panelpReptil = new JPanel();
		panelpReptil.setBounds(554, 11, 261, 320);
		panelpReptil.setLayout(null);
		panelpReptil.setBorder(new TitledBorder(
		new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Reptil",
		TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panelpReptil);

		JLabel lblNomePeixe_2 = new JLabel("Nome");
		lblNomePeixe_2.setBounds(10, 37, 54, 24);
		panelpReptil.add(lblNomePeixe_2);

		JLabel lblAmbiente_2 = new JLabel("Ambiente");
		lblAmbiente_2.setBounds(10, 80, 54, 24);
		panelpReptil.add(lblAmbiente_2);

		JLabel lblRespirao_2 = new JLabel("Respiração");
		lblRespirao_2.setBounds(10, 127, 54, 24);
		panelpReptil.add(lblRespirao_2);

		JLabel lblPele_2 = new JLabel("Pele");
		lblPele_2.setBounds(10, 175, 54, 24);
		panelpReptil.add(lblPele_2);

		JCheckBox chckbxAsasPeixe_2 = new JCheckBox("Asas");
		chckbxAsasPeixe_2.setBounds(10, 263, 97, 23);
		panelpReptil.add(chckbxAsasPeixe_2);

		JCheckBox chckbxBarbatanasPeixe_2 = new JCheckBox("Barbatanas");
		chckbxBarbatanasPeixe_2.setBounds(122, 263, 97, 23);
		panelpReptil.add(chckbxBarbatanasPeixe_2);

		JCheckBox chckbxPatasPeixe_2 = new JCheckBox("Patas");
		chckbxPatasPeixe_2.setBounds(10, 289, 97, 23);
		panelpReptil.add(chckbxPatasPeixe_2);

		textFieldReptil = new JTextField();
		textFieldReptil.setText("Tobite");
		textFieldReptil.setColumns(10);
		textFieldReptil.setBounds(99, 37, 86, 20);
		panelpReptil.add(textFieldReptil);

		comboBoxAmbienteReptil = new JComboBox();
		comboBoxAmbienteReptil.setModel(new DefaultComboBoxModel(new String[] {"Terra", "Agua", "Ar", "TerraAgua"}));
		comboBoxAmbienteReptil.setBounds(99, 79, 86, 22);
		panelpReptil.add(comboBoxAmbienteReptil);

		comboBoxPeleReptil = new JComboBox();
		comboBoxPeleReptil.setModel(new DefaultComboBoxModel(new String[] {"Liso", "Escanmada", "Pelos", "Penas"}));
		comboBoxPeleReptil.setBounds(99, 174, 86, 22);
		panelpReptil.add(comboBoxPeleReptil);

		 comboBoxRespiracaoReptil = new JComboBox();
		comboBoxRespiracaoReptil.setModel(new DefaultComboBoxModel(new String[] {"Pulmoes", "Bronquios", "Ambos"}));
		comboBoxRespiracaoReptil.setBounds(99, 126, 86, 22);
		panelpReptil.add(comboBoxRespiracaoReptil);

		JPanel panelpAve = new JPanel();
		panelpAve.setBounds(821, 11, 261, 320);
		panelpAve.setLayout(null);
		panelpAve.setBorder(new TitledBorder(
		new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ave",
		TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panelpAve);

		JLabel lblNomePeixe_3 = new JLabel("Nome");
		lblNomePeixe_3.setBounds(10, 37, 54, 24);
		panelpAve.add(lblNomePeixe_3);

		JLabel lblAmbiente_3 = new JLabel("Ambiente");
		lblAmbiente_3.setBounds(10, 80, 54, 24);
		panelpAve.add(lblAmbiente_3);

		JLabel lblRespirao_3 = new JLabel("Respiração");
		lblRespirao_3.setBounds(10, 127, 54, 24);
		panelpAve.add(lblRespirao_3);

		JLabel lblPele_3 = new JLabel("Pele");
		lblPele_3.setBounds(10, 175, 54, 24);
		panelpAve.add(lblPele_3);

		JCheckBox chckbxAsasPeixe_3 = new JCheckBox("Asas");
		chckbxAsasPeixe_3.setBounds(10, 263, 97, 23);
		panelpAve.add(chckbxAsasPeixe_3);

		JCheckBox chckbxBarbatanasPeixe_3 = new JCheckBox("Barbatanas");
		chckbxBarbatanasPeixe_3.setBounds(122, 263, 97, 23);
		panelpAve.add(chckbxBarbatanasPeixe_3);

		JCheckBox chckbxPatasPeixe_3 = new JCheckBox("Patas");
		chckbxPatasPeixe_3.setBounds(10, 289, 97, 23);
		panelpAve.add(chckbxPatasPeixe_3);

		JCheckBox chckbxTempCorpPeixe_3 = new JCheckBox("Temp. Corp.");
		chckbxTempCorpPeixe_3.setSelected(true);
		chckbxTempCorpPeixe_3.setBounds(122, 289, 97, 23);
		panelpAve.add(chckbxTempCorpPeixe_3);

		textFieldAve = new JTextField();
		textFieldAve.setText("Tobite");
		textFieldAve.setColumns(10);
		textFieldAve.setBounds(115, 37, 86, 20);
		panelpAve.add(textFieldAve);

		 comboBoxAmbienteAve = new JComboBox();
		 comboBoxAmbienteAve.setModel(new DefaultComboBoxModel(new String[] {"Terra", "Agua", "Ar", "TerraAgua"}));
		comboBoxAmbienteAve.setBounds(115, 79, 86, 22);
		panelpAve.add(comboBoxAmbienteAve);

		 comboBoxPeleAve = new JComboBox();
		 comboBoxPeleAve.setModel(new DefaultComboBoxModel(new String[] {"Liso", "Escanmada", "Pelos", "Penas"}));
		comboBoxPeleAve.setBounds(115, 174, 86, 22);
		panelpAve.add(comboBoxPeleAve);

		comboBoxRespiracaoAve = new JComboBox();
		comboBoxRespiracaoAve.setModel(new DefaultComboBoxModel(new String[] {"Pulmoes", "Bronquios", "Ambos"}));
		comboBoxRespiracaoAve.setBounds(115, 126, 86, 22);
		panelpAve.add(comboBoxRespiracaoAve);

		  JPanel panelpMamifero = new JPanel();
		  panelpMamifero.setBounds(1086, 11, 261, 320);
	        panelpMamifero.setLayout(null);
	        panelpMamifero.setBorder(new TitledBorder(
	        new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Mamífero",
	        TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
	        frame.getContentPane().add(panelpMamifero);

	        JLabel lblNomeMamifero = new JLabel("Nome");
	        lblNomeMamifero.setBounds(10, 37, 54, 24);
	        panelpMamifero.add(lblNomeMamifero);

	        textFieldMamifero = new JTextField();
	        textFieldMamifero.setColumns(10);
	        textFieldMamifero.setBounds(74, 37, 86, 20);
	        panelpMamifero.add(textFieldMamifero);

	        JLabel lblAmbiente_4 = new JLabel("Ambiente");
	        lblAmbiente_4.setBounds(10, 80, 54, 24);
	        panelpMamifero.add(lblAmbiente_4);

	        JLabel lblRespirao_4 = new JLabel("Respiração");
	        lblRespirao_4.setBounds(10, 127, 54, 24);
	        panelpMamifero.add(lblRespirao_4);

	        JLabel lblPele_4 = new JLabel("Pele");
	        lblPele_4.setBounds(10, 175, 54, 24);
	        panelpMamifero.add(lblPele_4);

	        comboBoxAmbienteMamifero = new JComboBox();
	        comboBoxAmbienteMamifero.setModel(new DefaultComboBoxModel(new String[] {"Terra", "Agua", "Ar", "TerraAgua"}));
	        comboBoxAmbienteMamifero.setBounds(74, 79, 86, 22);
	        panelpMamifero.add(comboBoxAmbienteMamifero);

	        comboBoxRespiracaoMamifero = new JComboBox();
	        comboBoxRespiracaoMamifero.setModel(new DefaultComboBoxModel(new String[] {"Pulmoes", "Bronquios", "Ambos"}));
	        comboBoxRespiracaoMamifero.setBounds(74, 126, 86, 22);
	        panelpMamifero.add(comboBoxRespiracaoMamifero);

	        comboBoxPeleMamifero = new JComboBox();
	        comboBoxPeleMamifero.setModel(new DefaultComboBoxModel(new String[] {"Liso", "Escanmada", "Pelos", "Penas"}));
	        comboBoxPeleMamifero.setBounds(74, 174, 86, 22);
	        panelpMamifero.add(comboBoxPeleMamifero);
	        
	        JCheckBox chckbxTempCorpMamifero = new JCheckBox("Temp. Corp.");
	        chckbxTempCorpMamifero.setBounds(133, 289, 97, 23);
	        panelpMamifero.add(chckbxTempCorpMamifero);
	        
	        JCheckBox chckbxBarbatanasMamifero = new JCheckBox("Barbatanas");
	        chckbxBarbatanasMamifero.setBounds(133, 263, 97, 23);
	        panelpMamifero.add(chckbxBarbatanasMamifero);
	        
	        JCheckBox chckbxAsasMamifero = new JCheckBox("Asas");
	        chckbxAsasMamifero.setBounds(21, 263, 97, 23);
	        panelpMamifero.add(chckbxAsasMamifero);
	        
	        JCheckBox chckbxPatasMamifero = new JCheckBox("Patas");
	        chckbxPatasMamifero.setBounds(21, 289, 97, 23);
	        panelpMamifero.add(chckbxPatasMamifero);
	        
	        JLabel lblPatasMamifero = new JLabel("Patas");
	        lblPatasMamifero.setBounds(10, 226, 76, 24);
	        panelpMamifero.add(lblPatasMamifero);
	        
	        JSpinner spinnerBarbatanasAve_1 = new JSpinner();
	        spinnerBarbatanasAve_1.setBounds(104, 229, 86, 18);
	        panelpMamifero.add(spinnerBarbatanasAve_1);
	        
	        JButton btnNewButtonGuardar = new JButton("Guardar");
	        btnNewButtonGuardar.setBounds(641, 342, 89, 23);
	        frame.getContentPane().add(btnNewButtonGuardar);
	        
	        JCheckBox chckbxAsasFiltro = new JCheckBox("Asas");
	        chckbxAsasFiltro.setBounds(12, 375, 97, 23);
	        frame.getContentPane().add(chckbxAsasFiltro);
	        
	        JCheckBox chckbxPatasFiltro = new JCheckBox("Patas");
	        chckbxPatasFiltro.setBounds(12, 401, 97, 23);
	        frame.getContentPane().add(chckbxPatasFiltro);
	        
	        JCheckBox chckbxBarbatanasFiltro = new JCheckBox("Barbatanas");
	        chckbxBarbatanasFiltro.setBounds(124, 375, 97, 23);
	        frame.getContentPane().add(chckbxBarbatanasFiltro);
	        
	        JCheckBox chckbxTempCorpPeixFiltro = new JCheckBox("Temp. Corp.");
	        chckbxTempCorpPeixFiltro.setBounds(124, 401, 97, 23);
	        frame.getContentPane().add(chckbxTempCorpPeixFiltro);
	        
	        JLabel lblAmbienteFiltro = new JLabel("Ambiente");
	        lblAmbienteFiltro.setBounds(283, 379, 46, 14);
	        frame.getContentPane().add(lblAmbienteFiltro);
	        
	        JLabel lblRespiracaoFiltro = new JLabel("Respiração");
	        lblRespiracaoFiltro.setBounds(283, 405, 46, 14);
	        frame.getContentPane().add(lblRespiracaoFiltro);
	        
	        JLabel lblPeleFiltro = new JLabel("Pele");
	        lblPeleFiltro.setBounds(283, 430, 46, 14);
	        frame.getContentPane().add(lblPeleFiltro);
	        
	         comboBoxFiltroAmbiente = new JComboBox();
	        comboBoxFiltroAmbiente.setModel(new DefaultComboBoxModel(new String[] {"Todos", "Terra", "Agua", "Ar", "TerraAgua"}));
	        comboBoxFiltroAmbiente.setBounds(368, 375, 80, 22);
	        frame.getContentPane().add(comboBoxFiltroAmbiente);
	        
	         comboBoxFiltroRespiracao = new JComboBox();
	        comboBoxFiltroRespiracao.setModel(new DefaultComboBoxModel(new String[] {"Todos", "Pulmoes", "Bronquios", "Ambos"}));
	        comboBoxFiltroRespiracao.setBounds(368, 401, 80, 22);
	        frame.getContentPane().add(comboBoxFiltroRespiracao);
	        
	        comboBoxFiltroPele = new JComboBox();
	        comboBoxFiltroPele.setModel(new DefaultComboBoxModel(new String[] {"Todos", "Liso", "Escanmada", "Pelos", "Penas"}));
	        comboBoxFiltroPele.setBounds(368, 426, 80, 22);
	        frame.getContentPane().add(comboBoxFiltroPele);
	        
	        JButton btnAplivcarFiltro = new JButton("Aplicar Filtro");
	        btnAplivcarFiltro.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		carregarFiltros();
	        	}
	        });
	        btnAplivcarFiltro.setBounds(67, 431, 100, 23);
	        frame.getContentPane().add(btnAplivcarFiltro);
	    }


	public void carregarAnimais() {
		carregarPeixe();
		carregarAnfibio();
		carregarReptil();
		carregarAve();
		carregarMamifero();
	}
	
	public void carregarFiltros() {
		carregarFiltroPeixe();
		carregarFiltroAnfibio();
		carregarFiltroReptil();
		carregarFiltroAve();
		carregarFiltroMamifero();
	}
	
	public void carregarPeixe() {
		textFieldPeixe.setText(peixe.getNome());

		// Ambiente
		if (peixe.getAmbiente() == TipoAmbiente.Terra) {
			comboBoxAmbientePeixe.setSelectedIndex(0);
		} else if (peixe.getAmbiente() == TipoAmbiente.Agua) {
			comboBoxAmbientePeixe.setSelectedIndex(1);
		} else if (peixe.getAmbiente() == TipoAmbiente.Ar) {
			comboBoxAmbientePeixe.setSelectedIndex(2);
		} else {
			comboBoxAmbientePeixe.setSelectedIndex(3);
		}

		// Respiração
		if (peixe.getRespiracao() == TipoRespiracao.Pulmoes) {
			comboBoxRespiracaoPeixe.setSelectedIndex(0);
		} else if (peixe.getRespiracao() == TipoRespiracao.Bronquios) {
			comboBoxRespiracaoPeixe.setSelectedIndex(1);
		} else {
			comboBoxRespiracaoPeixe.setSelectedIndex(2);
		}

		// Pele
		if (peixe.getPele() == TipoPele.Liso) {
			comboBoxPelePeixe.setSelectedIndex(0);
		} else if (peixe.getPele() == TipoPele.Escanmada) {
			comboBoxPelePeixe.setSelectedIndex(1);
		} else if (peixe.getPele() == TipoPele.pelos) {
			comboBoxPelePeixe.setSelectedIndex(2);
		} else {
			comboBoxPelePeixe.setSelectedIndex(3);
		}

	}

	public void carregarAnfibio() {
		textFieldAnfibio.setText(anfibio.getNome());

		// Ambiente
		if (anfibio.getAmbiente() == TipoAmbiente.Terra) {
			comboBoxAmbienteAnfibio.setSelectedIndex(0);
		} else if (anfibio.getAmbiente() == TipoAmbiente.Agua) {
			comboBoxAmbienteAnfibio.setSelectedIndex(1);
		} else if (anfibio.getAmbiente() == TipoAmbiente.Ar) {
			comboBoxAmbienteAnfibio.setSelectedIndex(2);
		} else {
			comboBoxAmbienteAnfibio.setSelectedIndex(3);
		}

		// Respiração
		if (anfibio.getRespiracao() == TipoRespiracao.Pulmoes) {
			comboBoxRespiracaoAnfibio.setSelectedIndex(0);
		} else if (anfibio.getRespiracao() == TipoRespiracao.Bronquios) {
			comboBoxRespiracaoAnfibio.setSelectedIndex(1);
		} else {
			comboBoxRespiracaoAnfibio.setSelectedIndex(2);
		}

		// Pele
		if (anfibio.getPele() == TipoPele.Liso) {
			comboBoxPeleAnfibio.setSelectedIndex(0);
		} else if (anfibio.getPele() == TipoPele.Escanmada) {
			comboBoxPeleAnfibio.setSelectedIndex(1);
		} else if (anfibio.getPele() == TipoPele.pelos) {
			comboBoxPeleAnfibio.setSelectedIndex(2);
		} else {
			comboBoxPeleAnfibio.setSelectedIndex(3);
		}

	}
	
	public void carregarReptil() {
		textFieldReptil.setText(reptil.getNome());

		// Ambiente
		if (reptil.getAmbiente() == TipoAmbiente.Terra) {
			comboBoxAmbienteReptil.setSelectedIndex(0);
		} else if (reptil.getAmbiente() == TipoAmbiente.Agua) {
			comboBoxAmbienteReptil.setSelectedIndex(1);
		} else if (reptil.getAmbiente() == TipoAmbiente.Ar) {
			comboBoxAmbienteReptil.setSelectedIndex(2);
		} else {
			comboBoxAmbienteReptil.setSelectedIndex(3);
		}

		// Respiração
		if (reptil.getRespiracao() == TipoRespiracao.Pulmoes) {
			comboBoxRespiracaoReptil.setSelectedIndex(0);
		} else if (reptil.getRespiracao() == TipoRespiracao.Bronquios) {
			comboBoxRespiracaoReptil.setSelectedIndex(1);
		} else {
			comboBoxRespiracaoReptil.setSelectedIndex(2);
		}

		// Pele
		if (reptil.getPele() == TipoPele.Liso) {
			comboBoxPeleReptil.setSelectedIndex(0);
		} else if (reptil.getPele() == TipoPele.Escanmada) {
			comboBoxPeleReptil.setSelectedIndex(1);
		} else if (reptil.getPele() == TipoPele.pelos) {
			comboBoxPeleReptil.setSelectedIndex(2);
		} else {
			comboBoxPeleReptil.setSelectedIndex(3);
		}

	}
	
	
	
	public void carregarAve() {
		textFieldAve.setText(ave.getNome());

		// Ambiente
		if (ave.getAmbiente() == TipoAmbiente.Terra) {
			comboBoxAmbienteAve.setSelectedIndex(0);
		} else if (ave.getAmbiente() == TipoAmbiente.Agua) {
			comboBoxAmbienteAve.setSelectedIndex(1);
		} else if (ave.getAmbiente() == TipoAmbiente.Ar) {
			comboBoxAmbienteAve.setSelectedIndex(2);
		} else {
			comboBoxAmbienteAve.setSelectedIndex(3);
		}

		// Respiração
		if (ave.getRespiracao() == TipoRespiracao.Pulmoes) {
			comboBoxRespiracaoAve.setSelectedIndex(0);
		} else if (ave.getRespiracao() == TipoRespiracao.Bronquios) {
			comboBoxRespiracaoAve.setSelectedIndex(1);
		} else {
			comboBoxRespiracaoAve.setSelectedIndex(2);
		}

		// Pele
		if (ave.getPele() == TipoPele.Liso) {
			comboBoxPeleAve.setSelectedIndex(0);
		} else if (ave.getPele() == TipoPele.Escanmada) {
			comboBoxPeleAve.setSelectedIndex(1);
		} else if (ave.getPele() == TipoPele.pelos) {
			comboBoxPeleAve.setSelectedIndex(2);
		} else {
			comboBoxPeleAve.setSelectedIndex(3);
		}

	}
	
	   public void carregarMamifero() {
		   textFieldMamifero.setText(mamifero.getNome());

			// Ambiente
			if (mamifero.getAmbiente() == TipoAmbiente.Terra) {
				comboBoxAmbienteMamifero.setSelectedIndex(0);
			} else if (anfibio.getAmbiente() == TipoAmbiente.Agua) {
				comboBoxAmbienteMamifero.setSelectedIndex(1);
			} else if (mamifero.getAmbiente() == TipoAmbiente.Ar) {
				comboBoxAmbienteMamifero.setSelectedIndex(2);
			} else {
				comboBoxAmbienteMamifero.setSelectedIndex(3);
			}

			// Respiração
			if (mamifero.getRespiracao() == TipoRespiracao.Pulmoes) {
				comboBoxRespiracaoMamifero.setSelectedIndex(0);
			} else if (mamifero.getRespiracao() == TipoRespiracao.Bronquios) {
				comboBoxRespiracaoMamifero.setSelectedIndex(1);
			} else {
				comboBoxRespiracaoMamifero.setSelectedIndex(2);
			}

			// Pele
			if (mamifero.getPele() == TipoPele.Liso) {
				comboBoxPeleMamifero.setSelectedIndex(0);
			} else if (mamifero.getPele() == TipoPele.Escanmada) {
				comboBoxPeleMamifero.setSelectedIndex(1);
			} else if (mamifero.getPele() == TipoPele.pelos) {
				comboBoxPeleMamifero.setSelectedIndex(2);
			} else {
				comboBoxPeleMamifero.setSelectedIndex(3);
			}

	    }
	   
	   
	   public void carregarFiltroPeixe() {
		    // Ambiente
		    if (comboBoxFiltroAmbiente.getSelectedIndex() != -1) {
		        String ambienteSelecionado = (String) comboBoxFiltroAmbiente.getSelectedItem();
		        if (ambienteSelecionado.equals("Todos") || ambienteSelecionado.equals(peixe.getAmbiente())) {
		            comboBoxAmbientePeixe.setBackground(Color.GREEN); 
		        } else {
		            comboBoxAmbientePeixe.setBackground(null);
		        }
		    }

		    // Respiração
		    if (comboBoxFiltroRespiracao.getSelectedIndex() != -1) {
		        String respiracaoSelecionada = (String) comboBoxFiltroRespiracao.getSelectedItem();
		        if (respiracaoSelecionada.equals("Todos") || respiracaoSelecionada.equals(peixe.getRespiracao())) {
		            comboBoxRespiracaoPeixe.setBackground(Color.GREEN); 
		        } else {
		            comboBoxRespiracaoPeixe.setBackground(null); 
		        }
		    }

		    // Pele
		    if (comboBoxFiltroPele.getSelectedIndex() != -1) {
		        String peleSelecionada = (String) comboBoxFiltroPele.getSelectedItem();
		        if (peleSelecionada.equals("Todos") || peleSelecionada.equals(peixe.getPele())) {
		            comboBoxPelePeixe.setBackground(Color.GREEN); 
		        } else {
		            comboBoxPelePeixe.setBackground(null);
		        }
		    }
		}
		
	   public void carregarFiltroAnfibio() {
		    // Ambiente
		    if (comboBoxFiltroAmbiente.getSelectedIndex() != -1) {
		        String ambienteSelecionado = (String) comboBoxFiltroAmbiente.getSelectedItem();
		        if (ambienteSelecionado.equals("Todos") || ambienteSelecionado.equals(anfibio.getAmbiente())) {
		            comboBoxAmbienteAnfibio.setBackground(Color.GREEN); 
		        } else {
		            comboBoxAmbienteAnfibio.setBackground(null);
		        }
		    }

		    // Respiração
		    if (comboBoxFiltroRespiracao.getSelectedIndex() != -1) {
		        String respiracaoSelecionada = (String) comboBoxFiltroRespiracao.getSelectedItem();
		        if (respiracaoSelecionada.equals("Todos") || respiracaoSelecionada.equals(anfibio.getRespiracao())) {
		            comboBoxRespiracaoAnfibio.setBackground(Color.GREEN); 
		        } else {
		            comboBoxRespiracaoAnfibio.setBackground(null); 
		        }
		    }

		    // Pele
		    if (comboBoxFiltroPele.getSelectedIndex() != -1) {
		        String peleSelecionada = (String) comboBoxFiltroPele.getSelectedItem();
		        if (peleSelecionada.equals("Todos") || peleSelecionada.equals(anfibio.getPele())) {
		            comboBoxPeleAnfibio.setBackground(Color.GREEN); 
		        } else {
		            comboBoxPeleAnfibio.setBackground(null);
		        }
		    }
		}
			
	   public void carregarFiltroReptil() {
		    // Ambiente
		    if (comboBoxFiltroAmbiente.getSelectedIndex() != -1) {
		        String ambienteSelecionado = (String) comboBoxFiltroAmbiente.getSelectedItem();
		        if (ambienteSelecionado.equals("Todos") || ambienteSelecionado.equals(reptil.getAmbiente())) {
		            comboBoxAmbienteReptil.setBackground(Color.GREEN); 
		        } else {
		            comboBoxAmbienteReptil.setBackground(null);
		        }
		    }

		    // Respiração
		    if (comboBoxFiltroRespiracao.getSelectedIndex() != -1) {
		        String respiracaoSelecionada = (String) comboBoxFiltroRespiracao.getSelectedItem();
		        if (respiracaoSelecionada.equals("Todos") || respiracaoSelecionada.equals(reptil.getRespiracao())) {
		            comboBoxRespiracaoReptil.setBackground(Color.GREEN); 
		        } else {
		            comboBoxRespiracaoReptil.setBackground(null); 
		        }
		    }

		    // Pele
		    if (comboBoxFiltroPele.getSelectedIndex() != -1) {
		        String peleSelecionada = (String) comboBoxFiltroPele.getSelectedItem();
		        if (peleSelecionada.equals("Todos") || peleSelecionada.equals(reptil.getPele())) {
		            comboBoxPeleReptil.setBackground(Color.GREEN); 
		        } else {
		            comboBoxPeleReptil.setBackground(null);
		        }
		    }
		}

		
	   public void carregarFiltroAve() {
		    // Ambiente
		    if (comboBoxFiltroAmbiente.getSelectedIndex() != -1) {
		        String ambienteSelecionado = (String) comboBoxFiltroAmbiente.getSelectedItem();
		        if (ambienteSelecionado.equals("Todos") || ambienteSelecionado.equals(ave.getAmbiente())) {
		            comboBoxAmbienteAve.setBackground(Color.GREEN); 
		        } else {
		            comboBoxAmbienteAve.setBackground(null);
		        }
		    }

		    // Respiração
		    if (comboBoxFiltroRespiracao.getSelectedIndex() != -1) {
		        String respiracaoSelecionada = (String) comboBoxFiltroRespiracao.getSelectedItem();
		        if (respiracaoSelecionada.equals("Todos") || respiracaoSelecionada.equals(ave.getRespiracao())) {
		            comboBoxRespiracaoAve.setBackground(Color.GREEN); 
		        } else {
		            comboBoxRespiracaoAve.setBackground(null); 
		        }
		    }

		    // Pele
		    if (comboBoxFiltroPele.getSelectedIndex() != -1) {
		        String peleSelecionada = (String) comboBoxFiltroPele.getSelectedItem();
		        if (peleSelecionada.equals("Todos") || peleSelecionada.equals(ave.getPele())) {
		            comboBoxPeleAve.setBackground(Color.GREEN); 
		        } else {
		            comboBoxPeleAve.setBackground(null);
		        }
		    }
		}

	   public void carregarFiltroMamifero() {
		    // Ambiente
		    if (comboBoxFiltroAmbiente.getSelectedIndex() != -1) {
		        String ambienteSelecionado = (String) comboBoxFiltroAmbiente.getSelectedItem();
		        if (ambienteSelecionado.equals("Todos") || ambienteSelecionado.equals(mamifero.getAmbiente())) {
		            comboBoxAmbienteMamifero.setBackground(Color.GREEN); 
		        } else {
		            comboBoxAmbienteMamifero.setBackground(null);
		        }
		    }

		    // Respiração
		    if (comboBoxFiltroRespiracao.getSelectedIndex() != -1) {
		        String respiracaoSelecionada = (String) comboBoxFiltroRespiracao.getSelectedItem();
		        if (respiracaoSelecionada.equals("Todos") || respiracaoSelecionada.equals(mamifero.getRespiracao())) {
		            comboBoxRespiracaoMamifero.setBackground(Color.GREEN); 
		        } else {
		            comboBoxRespiracaoMamifero.setBackground(null); 
		        }
		    }

		    // Pele
		    if (comboBoxFiltroPele.getSelectedIndex() != -1) {
		        String peleSelecionada = (String) comboBoxFiltroPele.getSelectedItem();
		        if (peleSelecionada.equals("Todos") || peleSelecionada.equals(mamifero.getPele())) {
		            comboBoxPeleMamifero.setBackground(Color.GREEN); 
		        } else {
		            comboBoxPeleMamifero.setBackground(null);
		        }
		    }
		}
}