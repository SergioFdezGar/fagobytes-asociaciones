package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

import java.awt.Dimension;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

import javax.swing.JList;
import javax.swing.border.LineBorder;













































import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JMenuItem;

import java.awt.Font;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.SoftBevelBorder;

import java.awt.SystemColor;

import javax.swing.JTextArea;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
































import Dominio.*;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;





public class Index {

	private JFrame frmIndex;
	private JMenuBar menuBar;
	private JPanel panelMenu;
	private JPanel panelIndex;
	private JButton btnCerrarSesion;
	private JLabel lblConectado;
	private JLabel lblLogotipo;
	private JMenu mnArchivo;
	private JMenu mnAyuda;
	private JButton btnAtras;
	private JButton btnHome;
	private JPanel panelAtras;
	private JPanel panelHome;
	private JLabel lblUsuariosIndex;
	private JPanel panelBuscarUsuario;
	private JButton btnCrearUsuario;
	private JButton btnModificarUsuario;
	private JButton btnEliminarUsuario;
	private JButton btnVerUsuario;
	private JPanel panelBuscarMiembro;
	private JButton btnCrearMiembro;
	private JButton btnModificarMiembro;
	private JButton btnEliminarMiembro;
	private JButton btnVerMiembro;
	private JPanel panelMiembro;
	private JScrollPane spFotoMiembro;
	private JLabel lblNombreMiembro;
	private JTextField txtNombreMiembro;
	private JLabel lblApellidosMiembro1;
	private JTextField txtApellidosMiembro1;
	private JLabel lblApellidosMiembro2;
	private JTextField txtApellidosMiembro2;
	private JLabel lblDNIMiembro;
	private JLabel lblFechaNacimientoMiembro;
	private JLabel lblSexoMiembro;
	private JComboBox cbSexoMiembro;
	private JLabel lblDireccionMiembro;
	private JComboBox cbDireccionMiembro;
	private JTextField txtDireccionMiembro;
	private JLabel lblNumeroMiembro;
	private JTextField txtNumeroMiembro;
	private JLabel lblEscaleraMiembro;
	private JLabel lblPisoPuertaMiembro;
	private JTextField txtPisoMiembro;
	private JTextField txtPuertaMiembro;
	private JLabel lblCodigoPostalMiembro;
	private JTextField txtCodigoPostalMiembro;
	private JLabel lblLocalidadMiembro;
	private JTextField txtLocalidadMiembro;
	private JLabel lblProvinciaMiembro;
	private JTextField txtProvinciaMiembro;
	private JLabel lblPaisMiembro;
	private JTextField txtPaisMiembro;
	private JLabel lblTelefonoMiembro;
	private JFormattedTextField txtTelefonoMiembro;
	private JLabel lblCorreoElectronicoMiembro;
	private JTextField txtCorreoElectronicoMiembro;
	private JPanel panelUsuario;
	private JScrollPane spFotoUsuario;
	private JPanel panelContenedor;
	private JLabel lblMiembrosIndex;
	private JButton btnUsuario;
	private JMenuItem mntmCerrarSesion;
	private JMenuItem mntmSalir;
	private JMenuItem mntmManualUsuario;
	private JMenuItem mntmAyuda;
	private JMenu mnIrA;
	private JMenuItem mntmIrAInicio;
	private JMenuItem mntmIrAParticipantes;
	private JMenuItem mntmIrAUsuarios;
	private JMenuItem mntmIrAPerfil;
	
	
	private JPanel panelAnterior;
	private JPanel panelActual = panelIndex;
	private JScrollPane spMiembro;
	private JList listMiembro;
	private JScrollPane spUsuario;
	private JList listUsuario;
	private JPanel panelDatosMiembro;
	private JButton btnGuardarMiembroMiembro;
	private JButton btnModificarMiembroMiembro;
	private JButton btnEliminarMiembroMiembro;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblTituloBuscarMiembro;
	private JLabel lblTituloBuscarUsuario;
	private JPanel panelDatosUsuario;
	private JLabel lblFotoUsuario;
	private JMenuItem mntmAcercaDe;
	private JLabel lblFotoMiembro;
	private JButton btnGuardarUsuarioUsuario;
	private JButton btnEliminarUsuarioUsuario;
	private JButton btnModificarUsuarioUsuario;
	
	private DefaultListModel modeloListaMiembro;
	private DefaultListModel modeloListaUsuario;
	private JLabel lblUsuarioUsuario;
	private JLabel lblContrasenaUsuario;
	private JTextField txtUsuarioUsuario;
	private JFormattedTextField frmtdtxtfldContrasena;
	
	static Connection connection=null;
	private JFormattedTextField fTxtFechaNacimiento;
	private JFormattedTextField fTxtDNIMiembro;
	private JLabel lblRol;
	private JComboBox cbRol;
	private JTextField txtEscaleraMiembro;
	private GestorMiembros gestMiembros= new GestorMiembros();
	private GestorUsuario gestUsuarios= new GestorUsuario();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index window = new Index();
					window.frmIndex.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public Index() throws Exception {
		initialize();
		connection=Persistencia.AgenteDB.conectar();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws Exception 
	 */
	private void initialize() throws Exception {
		GestorFormularios gest_fomularios= new GestorFormularios();
		frmIndex = new JFrame();
		frmIndex.setIconImage(Toolkit.getDefaultToolkit().getImage(Index.class.getResource("/Recursos/FavIcon.png")));
		frmIndex.setBounds(100, 100, 1243, 706);
		frmIndex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			menuBar = new JMenuBar();
			frmIndex.setJMenuBar(menuBar);
			{
				mnArchivo = new JMenu("Archivo");
				menuBar.add(mnArchivo);
				{
					mntmCerrarSesion = new JMenuItem("Cerrar sesi�n");
					mntmCerrarSesion.setIcon(new ImageIcon(Index.class.getResource("/Recursos/cerrarSesion.png")));
					mntmCerrarSesion.addActionListener(new MntmCerrarSesionActionListener());
					mnArchivo.add(mntmCerrarSesion);
				}
				{
					mntmSalir = new JMenuItem("Salir");
					mntmSalir.setIcon(new ImageIcon(Index.class.getResource("/Recursos/salir.png")));
					mntmSalir.addActionListener(new MntmSalirActionListener());
					mntmSalir.setMnemonic('S');
					mntmSalir.setFont(new Font("Segoe UI", Font.PLAIN, 12));
					mnArchivo.add(mntmSalir);
				}
			}
			{
				mnIrA = new JMenu("Ir a...");
				menuBar.add(mnIrA);
				{
					mntmIrAInicio = new JMenuItem("Inicio");
					mntmIrAInicio.setIcon(new ImageIcon(Index.class.getResource("/Recursos/home-26.png")));
					mntmIrAInicio.addActionListener(new MiIndexActionListener());
					mnIrA.add(mntmIrAInicio);
				}
				{
					mntmIrAParticipantes = new JMenuItem("Participantes");
					mntmIrAParticipantes.setIcon(new ImageIcon(Index.class.getResource("/Recursos/participante.png")));
					mntmIrAParticipantes.addActionListener(new MiMiembroActionListener());
					mnIrA.add(mntmIrAParticipantes);
				}
				{
					mntmIrAUsuarios = new JMenuItem("Usuarios");
					mntmIrAUsuarios.setIcon(new ImageIcon(Index.class.getResource("/Recursos/admin.png")));
					mntmIrAUsuarios.addActionListener(new MiUsuarioActionListener());
					mnIrA.add(mntmIrAUsuarios);
				}
				{
					mntmIrAPerfil = new JMenuItem("Perfil");
					mntmIrAPerfil.setIcon(new ImageIcon(Index.class.getResource("/Recursos/admin.png")));
					mntmIrAPerfil.addActionListener(new MiAdminActionListener());
					mntmIrAPerfil.setActionCommand("Perfil");
					mnIrA.add(mntmIrAPerfil);
				}
			}
			{
				mnAyuda = new JMenu("Ayuda");
				menuBar.add(mnAyuda);
				{
					mntmManualUsuario = new JMenuItem("Manual de Usuario");
					mntmManualUsuario.setIcon(new ImageIcon(Index.class.getResource("/Recursos/manual.png")));
					mntmManualUsuario.addActionListener(new MntmManualUsuarioActionListener());
					mnAyuda.add(mntmManualUsuario);
				}
				{
					mntmAyuda = new JMenuItem("Ayuda");
					mntmAyuda.setIcon(new ImageIcon(Index.class.getResource("/Recursos/ayuda.png")));
					mntmAyuda.addActionListener(new MntmAcercaDeActionListener());
					mnAyuda.add(mntmAyuda);
					mntmAyuda.setMnemonic('A');
				}
				{
					mntmAcercaDe = new JMenuItem("Acerca de...");
					mntmAcercaDe.setIcon(new ImageIcon(Index.class.getResource("/Recursos/acercade.png")));
					mnAyuda.add(mntmAcercaDe);
				}
			}
		}
		frmIndex.getContentPane().setLayout(new BorderLayout(0, 0));
		{
			panelContenedor = new JPanel();
			frmIndex.getContentPane().add(panelContenedor);
			panelContenedor.setLayout(new CardLayout(0, 0));
			{
				panelIndex = new JPanel();
				panelIndex.setName("Index");
				panelIndex.setBackground(new Color(176, 224, 230));
				panelContenedor.add(panelIndex, "Index");
				{
					lblUsuariosIndex = new JLabel("");
					lblUsuariosIndex.setBounds(725, 205, 400, 250);
					{
						lblMiembrosIndex = new JLabel("");
						lblMiembrosIndex.setBounds(95, 205, 400, 250);
						panelIndex.setLayout(null);
						panelIndex.add(lblMiembrosIndex);
					}
					panelIndex.add(lblUsuariosIndex);
				}
				
				JLabel lblMenu = new JLabel("");
				lblMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
				lblMenu.setIcon(new ImageIcon(Index.class.getResource("/Recursos/logoIndex.png")));
				lblMenu.setBounds(295, 22, 636, 182);
				panelIndex.add(lblMenu);
				
				JButton btnMiembros = new JButton("Miembros");
				btnMiembros.addActionListener(new MiMiembroActionListener());
				btnMiembros.setBounds(155, 466, 283, 65);
				panelIndex.add(btnMiembros);
				
				JButton btnUsuarios = new JButton("Usuarios");
				btnUsuarios.addActionListener(new MiUsuarioActionListener());
				btnUsuarios.setBounds(783, 466, 283, 65);
				panelIndex.add(btnUsuarios);
			}
			{
				panelBuscarMiembro = new JPanel();
				panelBuscarMiembro.setBackground(new Color(176, 224, 230));
				panelBuscarMiembro.setName("BuscarMiembro");
				panelContenedor.add(panelBuscarMiembro, "BuscarMiembro");
				GridBagLayout gbl_panelBuscarMiembro = new GridBagLayout();
				gbl_panelBuscarMiembro.columnWidths = new int[]{75, 449, 122, 0, 0, 0, 0};
				gbl_panelBuscarMiembro.rowHeights = new int[]{0, 69, -33, 62, 83, 86, 0, 0, 0};
				gbl_panelBuscarMiembro.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
				gbl_panelBuscarMiembro.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
				panelBuscarMiembro.setLayout(gbl_panelBuscarMiembro);
				{
					{
						btnCrearMiembro = new JButton("");
						btnCrearMiembro.setIcon(new ImageIcon(Index.class.getResource("/Recursos/crear.png")));
						btnCrearMiembro.addActionListener(new BtnCrearMiembroActionListener());
						btnCrearMiembro.setFont(new Font("Tahoma", Font.PLAIN, 16));
						btnCrearMiembro.setMaximumSize(new Dimension(200, 50));
						btnCrearMiembro.setMinimumSize(new Dimension(200, 50));
						btnCrearMiembro.setAlignmentX(Component.CENTER_ALIGNMENT);
						{
							lblTituloBuscarMiembro = new JLabel("");
							lblTituloBuscarMiembro.setIcon(new ImageIcon(Index.class.getResource("/Recursos/letraparticipantes.png")));
							lblTituloBuscarMiembro.setAlignmentX(Component.CENTER_ALIGNMENT);
							GridBagConstraints gbc_lblTituloBuscarMiembro = new GridBagConstraints();
							gbc_lblTituloBuscarMiembro.gridwidth = 2;
							gbc_lblTituloBuscarMiembro.insets = new Insets(0, 0, 5, 5);
							gbc_lblTituloBuscarMiembro.gridx = 1;
							gbc_lblTituloBuscarMiembro.gridy = 1;
							panelBuscarMiembro.add(lblTituloBuscarMiembro, gbc_lblTituloBuscarMiembro);
						}
						{
							spMiembro = new JScrollPane();
							GridBagConstraints gbc_spMiembro = new GridBagConstraints();
							gbc_spMiembro.gridwidth = 2;
							gbc_spMiembro.gridheight = 4;
							gbc_spMiembro.insets = new Insets(0, 0, 5, 5);
							gbc_spMiembro.fill = GridBagConstraints.BOTH;
							gbc_spMiembro.gridx = 1;
							gbc_spMiembro.gridy = 3;
							panelBuscarMiembro.add(spMiembro, gbc_spMiembro);
							{
								listMiembro = new JList();								
								modeloListaMiembro = new DefaultListModel();
								listMiembro.setModel(modeloListaMiembro);
								listMiembro.setSelectedIndex(0);
								listMiembro.setCellRenderer(new MiembroCellRenderer());
								spMiembro.setViewportView(listMiembro);
							}
						}
						GridBagConstraints gbc_btnCrearMiembro = new GridBagConstraints();
						gbc_btnCrearMiembro.insets = new Insets(0, 0, 5, 5);
						gbc_btnCrearMiembro.gridx = 4;
						gbc_btnCrearMiembro.gridy = 3;
						panelBuscarMiembro.add(btnCrearMiembro, gbc_btnCrearMiembro);
					}
				}
				{
					btnModificarMiembro = new JButton("");
					btnModificarMiembro.setIcon(new ImageIcon(Index.class.getResource("/Recursos/modificar.png")));
					btnModificarMiembro.addActionListener(new BtnModificarMiembroActionListener());
					btnModificarMiembro.setFont(new Font("Tahoma", Font.PLAIN, 16));
					btnModificarMiembro.setMinimumSize(new Dimension(200, 50));
					btnModificarMiembro.setMaximumSize(new Dimension(200, 50));
					btnModificarMiembro.setAlignmentX(Component.CENTER_ALIGNMENT);
					GridBagConstraints gbc_btnModificarMiembro = new GridBagConstraints();
					gbc_btnModificarMiembro.insets = new Insets(0, 0, 5, 5);
					gbc_btnModificarMiembro.gridx = 4;
					gbc_btnModificarMiembro.gridy = 4;
					panelBuscarMiembro.add(btnModificarMiembro, gbc_btnModificarMiembro);
				}
				{
					btnEliminarMiembro = new JButton("");
					btnEliminarMiembro.setIcon(new ImageIcon(Index.class.getResource("/Recursos/eliminar.png")));
					btnEliminarMiembro.addActionListener(new BtnEliminarMiembroActionListener());
					btnEliminarMiembro.setFont(new Font("Tahoma", Font.PLAIN, 16));
					btnEliminarMiembro.setMaximumSize(new Dimension(200, 50));
					btnEliminarMiembro.setMinimumSize(new Dimension(200, 50));
					btnEliminarMiembro.setAlignmentX(Component.CENTER_ALIGNMENT);
					GridBagConstraints gbc_btnEliminarMiembro = new GridBagConstraints();
					gbc_btnEliminarMiembro.insets = new Insets(0, 0, 5, 5);
					gbc_btnEliminarMiembro.gridx = 4;
					gbc_btnEliminarMiembro.gridy = 5;
					panelBuscarMiembro.add(btnEliminarMiembro, gbc_btnEliminarMiembro);
				}
				btnVerMiembro = new JButton("");
				btnVerMiembro.setIcon(new ImageIcon(Index.class.getResource("/Recursos/ver.png")));
				btnVerMiembro.addActionListener(new BtnVerMiembroActionListener());
				btnVerMiembro.setFont(new Font("Tahoma", Font.PLAIN, 16));
				btnVerMiembro.setMinimumSize(new Dimension(200, 50));
				btnVerMiembro.setMaximumSize(new Dimension(200, 50));
				btnVerMiembro.setAlignmentX(Component.CENTER_ALIGNMENT);
				GridBagConstraints gbc_btnVerMiembro = new GridBagConstraints();
				gbc_btnVerMiembro.insets = new Insets(0, 0, 5, 5);
				gbc_btnVerMiembro.gridx = 4;
				gbc_btnVerMiembro.gridy = 6;
				panelBuscarMiembro.add(btnVerMiembro, gbc_btnVerMiembro);
			}
			panelBuscarUsuario = new JPanel();
			panelBuscarUsuario.setName("BuscarUsuario");
			panelBuscarUsuario.setBackground(new Color(176, 224, 230));
			panelContenedor.add(panelBuscarUsuario, "BuscarUsuario");
			GridBagLayout gbl_panelBuscarUsuario = new GridBagLayout();
			gbl_panelBuscarUsuario.columnWidths = new int[]{75, 449, 122, 0, 0, 0, 0};
			gbl_panelBuscarUsuario.rowHeights = new int[]{0, 69, -33, 62, 0, 83, 86, 0, 0};
			gbl_panelBuscarUsuario.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
			gbl_panelBuscarUsuario.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			panelBuscarUsuario.setLayout(gbl_panelBuscarUsuario);
			{
				lblTituloBuscarUsuario = new JLabel("");
				lblTituloBuscarUsuario.setIcon(new ImageIcon(Index.class.getResource("/Recursos/letracompeticiones.png")));
				GridBagConstraints gbc_lblTituloBuscarUsuario = new GridBagConstraints();
				gbc_lblTituloBuscarUsuario.gridwidth = 2;
				gbc_lblTituloBuscarUsuario.insets = new Insets(0, 0, 5, 5);
				gbc_lblTituloBuscarUsuario.gridx = 1;
				gbc_lblTituloBuscarUsuario.gridy = 1;
				panelBuscarUsuario.add(lblTituloBuscarUsuario, gbc_lblTituloBuscarUsuario);
			}
			{
				spUsuario = new JScrollPane();
				GridBagConstraints gbc_spUsuario = new GridBagConstraints();
				gbc_spUsuario.gridwidth = 2;
				gbc_spUsuario.gridheight = 4;
				gbc_spUsuario.insets = new Insets(0, 0, 5, 5);
				gbc_spUsuario.fill = GridBagConstraints.BOTH;
				gbc_spUsuario.gridx = 1;
				gbc_spUsuario.gridy = 3;
				panelBuscarUsuario.add(spUsuario, gbc_spUsuario);
				{
					listUsuario = new JList();
					modeloListaUsuario = new DefaultListModel();
					listUsuario.setModel(modeloListaUsuario);
					listUsuario.setSelectedIndex(0);
					listUsuario.setCellRenderer(new UsuarioCellRenderer());
					spUsuario.setViewportView(listUsuario);
				}
			}
			{
				btnCrearUsuario = new JButton("");
				btnCrearUsuario.setAlignmentX(Component.CENTER_ALIGNMENT);
				btnCrearUsuario.setIcon(new ImageIcon(Index.class.getResource("/Recursos/crear.png")));
				btnCrearUsuario.addActionListener(new BtnCrearUsuarioActionListener());
				btnCrearUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
				btnCrearUsuario.setMaximumSize(new Dimension(200, 50));
				btnCrearUsuario.setMinimumSize(new Dimension(200, 50));
				GridBagConstraints gbc_btnCrearUsuario = new GridBagConstraints();
				gbc_btnCrearUsuario.insets = new Insets(0, 0, 5, 5);
				gbc_btnCrearUsuario.gridx = 4;
				gbc_btnCrearUsuario.gridy = 3;
				panelBuscarUsuario.add(btnCrearUsuario, gbc_btnCrearUsuario);
			}
			{
				btnModificarUsuario = new JButton("");
				btnModificarUsuario.setAlignmentX(Component.CENTER_ALIGNMENT);
				btnModificarUsuario.setIcon(new ImageIcon(Index.class.getResource("/Recursos/modificar.png")));
				btnModificarUsuario.addActionListener(new BtnModificarUsuarioActionListener());
				btnModificarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
				btnModificarUsuario.setMaximumSize(new Dimension(200, 50));
				btnModificarUsuario.setMinimumSize(new Dimension(200, 50));
				GridBagConstraints gbc_btnModificarUsuario = new GridBagConstraints();
				gbc_btnModificarUsuario.insets = new Insets(0, 0, 5, 5);
				gbc_btnModificarUsuario.gridx = 4;
				gbc_btnModificarUsuario.gridy = 4;
				panelBuscarUsuario.add(btnModificarUsuario, gbc_btnModificarUsuario);
			}
			btnEliminarUsuario = new JButton("");
			btnEliminarUsuario.setAlignmentX(Component.CENTER_ALIGNMENT);
			btnEliminarUsuario.setIcon(new ImageIcon(Index.class.getResource("/Recursos/eliminar.png")));
			btnEliminarUsuario.addActionListener(new BtnEliminarUsuarioActionListener());
			btnEliminarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnEliminarUsuario.setMinimumSize(new Dimension(200, 50));
			btnEliminarUsuario.setMaximumSize(new Dimension(200, 50));
			GridBagConstraints gbc_btnEliminarUsuario = new GridBagConstraints();
			gbc_btnEliminarUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_btnEliminarUsuario.gridx = 4;
			gbc_btnEliminarUsuario.gridy = 5;
			panelBuscarUsuario.add(btnEliminarUsuario, gbc_btnEliminarUsuario);
			btnVerUsuario = new JButton("");
			btnVerUsuario.setAlignmentX(Component.CENTER_ALIGNMENT);
			btnVerUsuario.setIcon(new ImageIcon(Index.class.getResource("/Recursos/ver.png")));
			btnVerUsuario.addActionListener(new BtnVerUsuarioActionListener());
			btnVerUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnVerUsuario.setMaximumSize(new Dimension(200, 50));
			btnVerUsuario.setMinimumSize(new Dimension(200, 50));
			GridBagConstraints gbc_btnVerUsuario = new GridBagConstraints();
			gbc_btnVerUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_btnVerUsuario.gridx = 4;
			gbc_btnVerUsuario.gridy = 6;
			panelBuscarUsuario.add(btnVerUsuario, gbc_btnVerUsuario);
			{
				panelMiembro = new JPanel();
				panelMiembro.setName("Miembro");
				panelMiembro.setBackground(new Color(176, 224, 230));
				panelContenedor.add(panelMiembro, "Miembro");
				GridBagLayout gbl_panelMiembro = new GridBagLayout();
				gbl_panelMiembro.columnWidths = new int[]{0, 107, 122, 123, 0, 0, 104, 32, 63, 0, 0, 0, 0};
				gbl_panelMiembro.rowHeights = new int[]{0, 16, 0, 0, 0, 0, 0, 0, 0, 0, 61, 0, 0, 0, 0, 0, 34, 0};
				gbl_panelMiembro.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_panelMiembro.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				panelMiembro.setLayout(gbl_panelMiembro);
				{
					panelDatosMiembro = new JPanel();
					panelDatosMiembro.setBorder(new TitledBorder(null, "Participante", TitledBorder.CENTER, TitledBorder.TOP, null, null));
					panelDatosMiembro.setBackground(SystemColor.control);
					GridBagConstraints gbc_panelDatosMiembro = new GridBagConstraints();
					gbc_panelDatosMiembro.gridwidth = 6;
					gbc_panelDatosMiembro.gridheight = 15;
					gbc_panelDatosMiembro.insets = new Insets(0, 0, 5, 5);
					gbc_panelDatosMiembro.fill = GridBagConstraints.BOTH;
					gbc_panelDatosMiembro.gridx = 1;
					gbc_panelDatosMiembro.gridy = 1;
					panelMiembro.add(panelDatosMiembro, gbc_panelDatosMiembro);
					GridBagLayout gbl_panelDatosMiembro = new GridBagLayout();
					gbl_panelDatosMiembro.columnWidths = new int[]{0, 115, 109, 104, 0, 0, 85, 0, 57, 0, 0};
					gbl_panelDatosMiembro.rowHeights = new int[]{0, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 53, 24, 0, 0, 0};
					gbl_panelDatosMiembro.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
					gbl_panelDatosMiembro.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
					panelDatosMiembro.setLayout(gbl_panelDatosMiembro);
					{
						spFotoMiembro = new JScrollPane();
						GridBagConstraints gbc_spFotoMiembro = new GridBagConstraints();
						gbc_spFotoMiembro.gridheight = 5;
						gbc_spFotoMiembro.fill = GridBagConstraints.BOTH;
						gbc_spFotoMiembro.insets = new Insets(0, 0, 5, 5);
						gbc_spFotoMiembro.gridx = 1;
						gbc_spFotoMiembro.gridy = 1;
						panelDatosMiembro.add(spFotoMiembro, gbc_spFotoMiembro);
						{
							lblFotoMiembro = new JLabel("");
							lblFotoMiembro.setHorizontalAlignment(SwingConstants.CENTER);
							lblFotoMiembro.setIcon(new ImageIcon(Index.class.getResource("/Recursos/av1.png")));
							spFotoMiembro.setViewportView(lblFotoMiembro);
						}
					}
					{
						lblNombreMiembro = new JLabel("Nombre:");
						GridBagConstraints gbc_lblNombreMiembro = new GridBagConstraints();
						gbc_lblNombreMiembro.anchor = GridBagConstraints.EAST;
						gbc_lblNombreMiembro.insets = new Insets(0, 0, 5, 5);
						gbc_lblNombreMiembro.gridx = 2;
						gbc_lblNombreMiembro.gridy = 1;
						panelDatosMiembro.add(lblNombreMiembro, gbc_lblNombreMiembro);
					}
					{
						txtNombreMiembro = new JTextField();
						GridBagConstraints gbc_txtNombreMiembro = new GridBagConstraints();
						gbc_txtNombreMiembro.gridwidth = 2;
						gbc_txtNombreMiembro.fill = GridBagConstraints.HORIZONTAL;
						gbc_txtNombreMiembro.insets = new Insets(0, 0, 5, 5);
						gbc_txtNombreMiembro.gridx = 3;
						gbc_txtNombreMiembro.gridy = 1;
						panelDatosMiembro.add(txtNombreMiembro, gbc_txtNombreMiembro);
					}
					
					{
						lblDNIMiembro = new JLabel("DNI:");
						GridBagConstraints gbc_lblDNIMiembro = new GridBagConstraints();
						gbc_lblDNIMiembro.anchor = GridBagConstraints.EAST;
						gbc_lblDNIMiembro.insets = new Insets(0, 0, 5, 5);
						gbc_lblDNIMiembro.gridx = 5;
						gbc_lblDNIMiembro.gridy = 1;
						panelDatosMiembro.add(lblDNIMiembro, gbc_lblDNIMiembro);
					}
					{
						fTxtDNIMiembro = new JFormattedTextField();
						GridBagConstraints gbc_fTxtDNIMiembro = new GridBagConstraints();
						gbc_fTxtDNIMiembro.insets = new Insets(0, 0, 5, 5);
						gbc_fTxtDNIMiembro.fill = GridBagConstraints.HORIZONTAL;
						gbc_fTxtDNIMiembro.gridx = 6;
						gbc_fTxtDNIMiembro.gridy = 1;
						panelDatosMiembro.add(fTxtDNIMiembro, gbc_fTxtDNIMiembro);
					}
					{
						lblApellidosMiembro1 = new JLabel("Apellido 1:");
						GridBagConstraints gbc_lblApellidosMiembro1 = new GridBagConstraints();
						gbc_lblApellidosMiembro1.anchor = GridBagConstraints.EAST;
						gbc_lblApellidosMiembro1.insets = new Insets(0, 0, 5, 5);
						gbc_lblApellidosMiembro1.gridx = 2;
						gbc_lblApellidosMiembro1.gridy = 2;
						panelDatosMiembro.add(lblApellidosMiembro1, gbc_lblApellidosMiembro1);
					}
					{
						txtApellidosMiembro1 = new JTextField();
						GridBagConstraints gbc_txtApellidosMiembro1 = new GridBagConstraints();
						gbc_txtApellidosMiembro1.gridwidth = 4;
						gbc_txtApellidosMiembro1.fill = GridBagConstraints.HORIZONTAL;
						gbc_txtApellidosMiembro1.insets = new Insets(0, 0, 5, 5);
						gbc_txtApellidosMiembro1.gridx = 3;
						gbc_txtApellidosMiembro1.gridy = 2;
						panelDatosMiembro.add(txtApellidosMiembro1, gbc_txtApellidosMiembro1);
					}
					{
						lblApellidosMiembro2 = new JLabel("Apellido 2:");
						GridBagConstraints gbc_lblApellidosMiembro2 = new GridBagConstraints();
						gbc_lblApellidosMiembro2.anchor = GridBagConstraints.EAST;
						gbc_lblApellidosMiembro2.insets = new Insets(0, 0, 5, 5);
						gbc_lblApellidosMiembro2.gridx = 2;
						gbc_lblApellidosMiembro2.gridy = 3;
						panelDatosMiembro.add(lblApellidosMiembro2, gbc_lblApellidosMiembro2);
					}
					{
						txtApellidosMiembro2 = new JTextField();
						GridBagConstraints gbc_txtApellidosMiembro2 = new GridBagConstraints();
						gbc_txtApellidosMiembro2.gridwidth = 4;
						gbc_txtApellidosMiembro2.fill = GridBagConstraints.HORIZONTAL;
						gbc_txtApellidosMiembro2.insets = new Insets(0, 0, 5, 5);
						gbc_txtApellidosMiembro2.gridx = 3;
						gbc_txtApellidosMiembro2.gridy = 3;
						panelDatosMiembro.add(txtApellidosMiembro2, gbc_txtApellidosMiembro2);
					}
					{
						lblFechaNacimientoMiembro = new JLabel("Fecha de nacimiento:");
						GridBagConstraints gbc_lblFechaNacimientoMiembro = new GridBagConstraints();
						gbc_lblFechaNacimientoMiembro.anchor = GridBagConstraints.EAST;
						gbc_lblFechaNacimientoMiembro.insets = new Insets(0, 0, 5, 5);
						gbc_lblFechaNacimientoMiembro.gridx = 2;
						gbc_lblFechaNacimientoMiembro.gridy = 4;
						panelDatosMiembro.add(lblFechaNacimientoMiembro, gbc_lblFechaNacimientoMiembro);
					}
					{
						DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
						fTxtFechaNacimiento = new JFormattedTextField(format);
						GridBagConstraints gbc_fTxtFechaNacimiento = new GridBagConstraints();
						gbc_fTxtFechaNacimiento.insets = new Insets(0, 0, 5, 5);
						gbc_fTxtFechaNacimiento.fill = GridBagConstraints.HORIZONTAL;
						gbc_fTxtFechaNacimiento.gridx = 3;
						gbc_fTxtFechaNacimiento.gridy = 4;
						panelDatosMiembro.add(fTxtFechaNacimiento, gbc_fTxtFechaNacimiento);
					}
					{
						lblRol = new JLabel("Rol:");
						GridBagConstraints gbc_lblRol = new GridBagConstraints();
						gbc_lblRol.anchor = GridBagConstraints.EAST;
						gbc_lblRol.insets = new Insets(0, 0, 5, 5);
						gbc_lblRol.gridx = 5;
						gbc_lblRol.gridy = 4;
						panelDatosMiembro.add(lblRol, gbc_lblRol);
					}
					{
						cbRol = new JComboBox();
						try{
							cbRol.setModel(new DefaultComboBoxModel(gest_fomularios.getRoles()));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						GridBagConstraints gbc_cbRol = new GridBagConstraints();
						gbc_cbRol.insets = new Insets(0, 0, 5, 5);
						gbc_cbRol.fill = GridBagConstraints.HORIZONTAL;
						gbc_cbRol.gridx = 6;
						gbc_cbRol.gridy = 4;
						panelDatosMiembro.add(cbRol, gbc_cbRol);
					}

					{
						lblDireccionMiembro = new JLabel("Direcci\u00F3n:");
						GridBagConstraints gbc_lblDireccionMiembro = new GridBagConstraints();
						gbc_lblDireccionMiembro.anchor = GridBagConstraints.EAST;
						gbc_lblDireccionMiembro.insets = new Insets(0, 0, 5, 5);
						gbc_lblDireccionMiembro.gridx = 1;
						gbc_lblDireccionMiembro.gridy = 6;
						panelDatosMiembro.add(lblDireccionMiembro, gbc_lblDireccionMiembro);
					}
					{
						cbDireccionMiembro = new JComboBox();
						//Se rellena con una consulta SQL
						try {
							cbDireccionMiembro.setModel(new DefaultComboBoxModel(gest_fomularios.getTipoVia()));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						//cbDireccionMiembro.setModel(new DefaultComboBoxModel(new String[] {}));
						GridBagConstraints gbc_cbDireccionMiembro = new GridBagConstraints();
						gbc_cbDireccionMiembro.fill = GridBagConstraints.HORIZONTAL;
						gbc_cbDireccionMiembro.insets = new Insets(0, 0, 5, 5);
						gbc_cbDireccionMiembro.gridx = 2;
						gbc_cbDireccionMiembro.gridy = 6;
						panelDatosMiembro.add(cbDireccionMiembro, gbc_cbDireccionMiembro);
					}
					{
						txtDireccionMiembro = new JTextField();
						GridBagConstraints gbc_txtDireccionMiembro = new GridBagConstraints();
						gbc_txtDireccionMiembro.gridwidth = 6;
						gbc_txtDireccionMiembro.fill = GridBagConstraints.HORIZONTAL;
						gbc_txtDireccionMiembro.insets = new Insets(0, 0, 5, 5);
						gbc_txtDireccionMiembro.gridx = 3;
						gbc_txtDireccionMiembro.gridy = 6;
						panelDatosMiembro.add(txtDireccionMiembro, gbc_txtDireccionMiembro);
					}
					{
						btnGuardarMiembroMiembro = new JButton("Guardar");
						btnGuardarMiembroMiembro.addActionListener(new BtnGuardarMiembroMiembroActionListener());
											{
												lblNumeroMiembro = new JLabel("Numero:");
												GridBagConstraints gbc_lblNumeroMiembro = new GridBagConstraints();
												gbc_lblNumeroMiembro.anchor = GridBagConstraints.EAST;
												gbc_lblNumeroMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_lblNumeroMiembro.gridx = 1;
												gbc_lblNumeroMiembro.gridy = 7;
												panelDatosMiembro.add(lblNumeroMiembro, gbc_lblNumeroMiembro);
											}
											{
												txtNumeroMiembro = new JTextField();
												GridBagConstraints gbc_txtNumeroMiembro = new GridBagConstraints();
												gbc_txtNumeroMiembro.fill = GridBagConstraints.HORIZONTAL;
												gbc_txtNumeroMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_txtNumeroMiembro.gridx = 2;
												gbc_txtNumeroMiembro.gridy = 7;
												panelDatosMiembro.add(txtNumeroMiembro, gbc_txtNumeroMiembro);
											}
											{
												lblEscaleraMiembro = new JLabel("Escalera:");
												GridBagConstraints gbc_lblEscaleraMiembro = new GridBagConstraints();
												gbc_lblEscaleraMiembro.anchor = GridBagConstraints.EAST;
												gbc_lblEscaleraMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_lblEscaleraMiembro.gridx = 3;
												gbc_lblEscaleraMiembro.gridy = 7;
												panelDatosMiembro.add(lblEscaleraMiembro, gbc_lblEscaleraMiembro);
											}
											{
												txtEscaleraMiembro = new JTextField();
												GridBagConstraints gbc_txtEscaleraMiembro = new GridBagConstraints();
												gbc_txtEscaleraMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_txtEscaleraMiembro.fill = GridBagConstraints.HORIZONTAL;
												gbc_txtEscaleraMiembro.gridx = 4;
												gbc_txtEscaleraMiembro.gridy = 7;
												panelDatosMiembro.add(txtEscaleraMiembro, gbc_txtEscaleraMiembro);
												txtEscaleraMiembro.setColumns(10);
											}
											{
												lblPisoPuertaMiembro = new JLabel("Piso / Puerta:");
												GridBagConstraints gbc_lblPisoPuertaMiembro = new GridBagConstraints();
												gbc_lblPisoPuertaMiembro.anchor = GridBagConstraints.EAST;
												gbc_lblPisoPuertaMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_lblPisoPuertaMiembro.gridx = 5;
												gbc_lblPisoPuertaMiembro.gridy = 7;
												panelDatosMiembro.add(lblPisoPuertaMiembro, gbc_lblPisoPuertaMiembro);
											}
											{
												txtPisoMiembro = new JTextField();
												GridBagConstraints gbc_txtPisoMiembro = new GridBagConstraints();
												gbc_txtPisoMiembro.fill = GridBagConstraints.HORIZONTAL;
												gbc_txtPisoMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_txtPisoMiembro.gridx = 6;
												gbc_txtPisoMiembro.gridy = 7;
												panelDatosMiembro.add(txtPisoMiembro, gbc_txtPisoMiembro);
											}
											{
												txtPuertaMiembro = new JTextField();
												GridBagConstraints gbc_txtPuertaMiembro = new GridBagConstraints();
												gbc_txtPuertaMiembro.gridwidth = 2;
												gbc_txtPuertaMiembro.fill = GridBagConstraints.HORIZONTAL;
												gbc_txtPuertaMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_txtPuertaMiembro.gridx = 7;
												gbc_txtPuertaMiembro.gridy = 7;
												panelDatosMiembro.add(txtPuertaMiembro, gbc_txtPuertaMiembro);
											}
											{
												lblCodigoPostalMiembro = new JLabel("Codigo Postal:");
												GridBagConstraints gbc_lblCodigoPostalMiembro = new GridBagConstraints();
												gbc_lblCodigoPostalMiembro.anchor = GridBagConstraints.EAST;
												gbc_lblCodigoPostalMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_lblCodigoPostalMiembro.gridx = 1;
												gbc_lblCodigoPostalMiembro.gridy = 8;
												panelDatosMiembro.add(lblCodigoPostalMiembro, gbc_lblCodigoPostalMiembro);
											}
											{
												txtCodigoPostalMiembro = new JTextField();
												GridBagConstraints gbc_txtCodigoPostalMiembro = new GridBagConstraints();
												gbc_txtCodigoPostalMiembro.fill = GridBagConstraints.HORIZONTAL;
												gbc_txtCodigoPostalMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_txtCodigoPostalMiembro.gridx = 2;
												gbc_txtCodigoPostalMiembro.gridy = 8;
												panelDatosMiembro.add(txtCodigoPostalMiembro, gbc_txtCodigoPostalMiembro);
											}
											{
												lblProvinciaMiembro = new JLabel("Provincia:");
												GridBagConstraints gbc_lblProvinciaMiembro = new GridBagConstraints();
												gbc_lblProvinciaMiembro.anchor = GridBagConstraints.EAST;
												gbc_lblProvinciaMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_lblProvinciaMiembro.gridx = 3;
												gbc_lblProvinciaMiembro.gridy = 8;
												panelDatosMiembro.add(lblProvinciaMiembro, gbc_lblProvinciaMiembro);
											}
											{
												txtProvinciaMiembro = new JTextField();
												GridBagConstraints gbc_txtProvinciaMiembro = new GridBagConstraints();
												gbc_txtProvinciaMiembro.gridwidth = 5;
												gbc_txtProvinciaMiembro.fill = GridBagConstraints.HORIZONTAL;
												gbc_txtProvinciaMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_txtProvinciaMiembro.gridx = 4;
												gbc_txtProvinciaMiembro.gridy = 8;
												panelDatosMiembro.add(txtProvinciaMiembro, gbc_txtProvinciaMiembro);
											}
											
																{
																	lblTelefonoMiembro = new JLabel("Tel�fono:");
																	GridBagConstraints gbc_lblTelefonoMiembro = new GridBagConstraints();
																	gbc_lblTelefonoMiembro.anchor = GridBagConstraints.EAST;
																	gbc_lblTelefonoMiembro.insets = new Insets(0, 0, 5, 5);
																	gbc_lblTelefonoMiembro.gridx = 1;
																	gbc_lblTelefonoMiembro.gridy = 9;
																	panelDatosMiembro.add(lblTelefonoMiembro, gbc_lblTelefonoMiembro);
																}
											{
												txtTelefonoMiembro = new JFormattedTextField();
												GridBagConstraints gbc_txtTelefonoMiembro = new GridBagConstraints();
												gbc_txtTelefonoMiembro.fill = GridBagConstraints.HORIZONTAL;
												gbc_txtTelefonoMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_txtTelefonoMiembro.gridx = 2;
												gbc_txtTelefonoMiembro.gridy = 9;
												panelDatosMiembro.add(txtTelefonoMiembro, gbc_txtTelefonoMiembro);
											}
											{
												lblLocalidadMiembro = new JLabel("Localidad:");
												GridBagConstraints gbc_lblLocalidadMiembro = new GridBagConstraints();
												gbc_lblLocalidadMiembro.anchor = GridBagConstraints.EAST;
												gbc_lblLocalidadMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_lblLocalidadMiembro.gridx = 3;
												gbc_lblLocalidadMiembro.gridy = 9;
												panelDatosMiembro.add(lblLocalidadMiembro, gbc_lblLocalidadMiembro);
											}
											{
												txtLocalidadMiembro = new JTextField();
												GridBagConstraints gbc_txtLocalidadMiembro = new GridBagConstraints();
												gbc_txtLocalidadMiembro.gridwidth = 5;
												gbc_txtLocalidadMiembro.fill = GridBagConstraints.HORIZONTAL;
												gbc_txtLocalidadMiembro.insets = new Insets(0, 0, 5, 5);
												gbc_txtLocalidadMiembro.gridx = 4;
												gbc_txtLocalidadMiembro.gridy = 9;
												panelDatosMiembro.add(txtLocalidadMiembro, gbc_txtLocalidadMiembro);
											}
						{
							lblCorreoElectronicoMiembro = new JLabel("E-mail:");
							GridBagConstraints gbc_lblCorreoElectronicoMiembro = new GridBagConstraints();
							gbc_lblCorreoElectronicoMiembro.anchor = GridBagConstraints.EAST;
							gbc_lblCorreoElectronicoMiembro.insets = new Insets(0, 0, 5, 5);
							gbc_lblCorreoElectronicoMiembro.gridx = 1;
							gbc_lblCorreoElectronicoMiembro.gridy = 10;
							panelDatosMiembro.add(lblCorreoElectronicoMiembro, gbc_lblCorreoElectronicoMiembro);
						}
						{
							txtCorreoElectronicoMiembro = new JTextField();
							GridBagConstraints gbc_txtCorreoElectronicoMiembro = new GridBagConstraints();
							gbc_txtCorreoElectronicoMiembro.gridwidth = 7;
							gbc_txtCorreoElectronicoMiembro.fill = GridBagConstraints.HORIZONTAL;
							gbc_txtCorreoElectronicoMiembro.insets = new Insets(0, 0, 5, 5);
							gbc_txtCorreoElectronicoMiembro.gridx = 2;
							gbc_txtCorreoElectronicoMiembro.gridy = 10;
							panelDatosMiembro.add(txtCorreoElectronicoMiembro, gbc_txtCorreoElectronicoMiembro);
						}
						btnGuardarMiembroMiembro.setFont(new Font("Tahoma", Font.PLAIN, 13));
						GridBagConstraints gbc_btnGuardarMiembroMiembro = new GridBagConstraints();
						gbc_btnGuardarMiembroMiembro.insets = new Insets(0, 0, 5, 5);
						gbc_btnGuardarMiembroMiembro.gridx = 1;
						gbc_btnGuardarMiembroMiembro.gridy = 16;
						panelDatosMiembro.add(btnGuardarMiembroMiembro, gbc_btnGuardarMiembroMiembro);
					}
					{
						btnModificarMiembroMiembro = new JButton("Modificar");
						btnModificarMiembroMiembro.addActionListener(new BtnModificarMiembroMiembroActionListener());
						btnModificarMiembroMiembro.setFont(new Font("Tahoma", Font.PLAIN, 13));
						GridBagConstraints gbc_btnModificarMiembroMiembro = new GridBagConstraints();
						gbc_btnModificarMiembroMiembro.insets = new Insets(0, 0, 5, 5);
						gbc_btnModificarMiembroMiembro.gridx = 2;
						gbc_btnModificarMiembroMiembro.gridy = 16;
						panelDatosMiembro.add(btnModificarMiembroMiembro, gbc_btnModificarMiembroMiembro);
					}
					{
						btnEliminarMiembroMiembro = new JButton("Eliminar");
						btnEliminarMiembroMiembro.addActionListener(new BtnEliminarMiembroMiembroActionListener());
						btnEliminarMiembroMiembro.setFont(new Font("Tahoma", Font.PLAIN, 13));
						GridBagConstraints gbc_btnEliminarMiembroMiembro = new GridBagConstraints();
						gbc_btnEliminarMiembroMiembro.insets = new Insets(0, 0, 5, 5);
						gbc_btnEliminarMiembroMiembro.gridx = 3;
						gbc_btnEliminarMiembroMiembro.gridy = 16;
						panelDatosMiembro.add(btnEliminarMiembroMiembro, gbc_btnEliminarMiembroMiembro);
					}
				}
			}
			{
				panelUsuario = new JPanel();
				panelUsuario.setName("Usuario");
				panelUsuario.setBackground(new Color(176, 224, 230));
				panelContenedor.add(panelUsuario, "Usuario");
				GridBagLayout gbl_panelUsuario = new GridBagLayout();
				gbl_panelUsuario.columnWidths = new int[]{0, 331, 0, 361, 0, 0};
				gbl_panelUsuario.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
				gbl_panelUsuario.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_panelUsuario.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				panelUsuario.setLayout(gbl_panelUsuario);
				{
					panelDatosUsuario = new JPanel();
					GridBagConstraints gbc_panelDatosUsuario = new GridBagConstraints();
					gbc_panelDatosUsuario.gridwidth = 3;
					gbc_panelDatosUsuario.insets = new Insets(0, 0, 5, 5);
					gbc_panelDatosUsuario.fill = GridBagConstraints.BOTH;
					gbc_panelDatosUsuario.gridx = 1;
					gbc_panelDatosUsuario.gridy = 1;
					panelUsuario.add(panelDatosUsuario, gbc_panelDatosUsuario);
					GridBagLayout gbl_panelDatosUsuario = new GridBagLayout();
					gbl_panelDatosUsuario.columnWidths = new int[]{0, 46, 0, 0, 84, 0, 0, 60, 38, 0, 54, 0, 0};
					gbl_panelDatosUsuario.rowHeights = new int[]{0, 34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
					gbl_panelDatosUsuario.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
					gbl_panelDatosUsuario.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
					panelDatosUsuario.setLayout(gbl_panelDatosUsuario);
					{
						spFotoUsuario = new JScrollPane();
						GridBagConstraints gbc_spFotoUsuario = new GridBagConstraints();
						gbc_spFotoUsuario.gridheight = 3;
						gbc_spFotoUsuario.insets = new Insets(0, 0, 5, 5);
						gbc_spFotoUsuario.fill = GridBagConstraints.BOTH;
						gbc_spFotoUsuario.gridx = 1;
						gbc_spFotoUsuario.gridy = 1;
						panelDatosUsuario.add(spFotoUsuario, gbc_spFotoUsuario);
						{
							lblFotoUsuario = new JLabel("");
							lblFotoUsuario.setIcon(new ImageIcon(Index.class.getResource("/Recursos/av2.png")));
							spFotoUsuario.setViewportView(lblFotoUsuario);
						}
					}
					{
						btnGuardarUsuarioUsuario = new JButton("Guardar Admin");
						btnGuardarUsuarioUsuario.addActionListener(new BtnGuardarUsuarioUsuarioActionListener());
						{
							lblUsuarioUsuario = new JLabel("Usuario:");
							GridBagConstraints gbc_lblUsuarioUsuario = new GridBagConstraints();
							gbc_lblUsuarioUsuario.anchor = GridBagConstraints.EAST;
							gbc_lblUsuarioUsuario.insets = new Insets(0, 0, 5, 5);
							gbc_lblUsuarioUsuario.gridx = 3;
							gbc_lblUsuarioUsuario.gridy = 3;
							panelDatosUsuario.add(lblUsuarioUsuario, gbc_lblUsuarioUsuario);
						}
						{
							txtUsuarioUsuario = new JTextField();
							GridBagConstraints gbc_txtUsuarioUsuario = new GridBagConstraints();
							gbc_txtUsuarioUsuario.insets = new Insets(0, 0, 5, 5);
							gbc_txtUsuarioUsuario.fill = GridBagConstraints.HORIZONTAL;
							gbc_txtUsuarioUsuario.gridx = 4;
							gbc_txtUsuarioUsuario.gridy = 3;
							panelDatosUsuario.add(txtUsuarioUsuario, gbc_txtUsuarioUsuario);
							txtUsuarioUsuario.setColumns(10);
						}
						{
							lblContrasenaUsuario = new JLabel("Contraseña:");
							GridBagConstraints gbc_lblContrasenaUsuario = new GridBagConstraints();
							gbc_lblContrasenaUsuario.anchor = GridBagConstraints.EAST;
							gbc_lblContrasenaUsuario.insets = new Insets(0, 0, 5, 5);
							gbc_lblContrasenaUsuario.gridx = 3;
							gbc_lblContrasenaUsuario.gridy = 4;
							panelDatosUsuario.add(lblContrasenaUsuario, gbc_lblContrasenaUsuario);
						}
						{
							frmtdtxtfldContrasena = new JFormattedTextField();
							GridBagConstraints gbc_frmtdtxtfldContrasena = new GridBagConstraints();
							gbc_frmtdtxtfldContrasena.insets = new Insets(0, 0, 5, 5);
							gbc_frmtdtxtfldContrasena.fill = GridBagConstraints.HORIZONTAL;
							gbc_frmtdtxtfldContrasena.gridx = 4;
							gbc_frmtdtxtfldContrasena.gridy = 4;
							panelDatosUsuario.add(frmtdtxtfldContrasena, gbc_frmtdtxtfldContrasena);
						}
						GridBagConstraints gbc_btnGuardarUsuarioUsuario = new GridBagConstraints();
						gbc_btnGuardarUsuarioUsuario.insets = new Insets(0, 0, 0, 5);
						gbc_btnGuardarUsuarioUsuario.gridx = 1;
						gbc_btnGuardarUsuarioUsuario.gridy = 15;
						panelDatosUsuario.add(btnGuardarUsuarioUsuario, gbc_btnGuardarUsuarioUsuario);
					}
					{
						btnEliminarUsuarioUsuario = new JButton("Eliminar Admin");
						btnEliminarUsuarioUsuario.addActionListener(new BtnEliminarUsuarioUsuarioActionListener());
						GridBagConstraints gbc_btnEliminarUsuarioUsuario = new GridBagConstraints();
						gbc_btnEliminarUsuarioUsuario.insets = new Insets(0, 0, 0, 5);
						gbc_btnEliminarUsuarioUsuario.gridx = 3;
						gbc_btnEliminarUsuarioUsuario.gridy = 15;
						panelDatosUsuario.add(btnEliminarUsuarioUsuario, gbc_btnEliminarUsuarioUsuario);
					}
					{
						btnModificarUsuarioUsuario = new JButton("Modificar Admin");
						btnModificarUsuarioUsuario.addActionListener(new BtnModificarUsuarioUsuarioActionListener());
						GridBagConstraints gbc_btnModificarUsuarioUsuario = new GridBagConstraints();
						gbc_btnModificarUsuarioUsuario.insets = new Insets(0, 0, 0, 5);
						gbc_btnModificarUsuarioUsuario.gridx = 6;
						gbc_btnModificarUsuarioUsuario.gridy = 15;
						panelDatosUsuario.add(btnModificarUsuarioUsuario, gbc_btnModificarUsuarioUsuario);
					}
				}
			}
			{
				{
					{
					}
				}
			}
		}
		{
			panelMenu = new JPanel();
			panelMenu.setBackground(SystemColor.menu);
			panelMenu.setBorder(UIManager.getBorder("DesktopIcon.border"));
			frmIndex.getContentPane().add(panelMenu, BorderLayout.NORTH);
			GridBagLayout gbl_panelMenu = new GridBagLayout();
			gbl_panelMenu.columnWidths = new int[]{0, 0, 525, 70, 105, 109, 0};
			gbl_panelMenu.rowHeights = new int[]{0, 0};
			gbl_panelMenu.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panelMenu.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panelMenu.setLayout(gbl_panelMenu);
			{
				panelAtras = new JPanel();
				GridBagConstraints gbc_panelAtras = new GridBagConstraints();
				gbc_panelAtras.fill = GridBagConstraints.BOTH;
				gbc_panelAtras.insets = new Insets(0, 0, 0, 5);
				gbc_panelAtras.gridx = 0;
				gbc_panelAtras.gridy = 0;
				panelMenu.add(panelAtras, gbc_panelAtras);
				GridBagLayout gbl_panelAtras = new GridBagLayout();
				gbl_panelAtras.columnWidths = new int[]{0, 0};
				gbl_panelAtras.rowHeights = new int[]{0, 0};
				gbl_panelAtras.columnWeights = new double[]{0.0, Double.MIN_VALUE};
				gbl_panelAtras.rowWeights = new double[]{0.0, Double.MIN_VALUE};
				panelAtras.setLayout(gbl_panelAtras);
				{
					btnAtras = new JButton("");
					btnAtras.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						}
					});
					btnAtras.addMouseListener(new BtnAtrasMouseListener());
					btnAtras.setAlignmentX(Component.CENTER_ALIGNMENT);
					GridBagConstraints gbc_btnAtras = new GridBagConstraints();
					gbc_btnAtras.gridx = 0;
					gbc_btnAtras.gridy = 0;
					panelAtras.add(btnAtras, gbc_btnAtras);
					btnAtras.setHorizontalTextPosition(SwingConstants.CENTER);
					btnAtras.setIcon(new ImageIcon(Index.class.getResource("/Recursos/left_circular-26.png")));
				}
			}
			{
				panelHome = new JPanel();
				GridBagConstraints gbc_panelHome = new GridBagConstraints();
				gbc_panelHome.fill = GridBagConstraints.BOTH;
				gbc_panelHome.insets = new Insets(0, 0, 0, 5);
				gbc_panelHome.gridx = 1;
				gbc_panelHome.gridy = 0;
				panelMenu.add(panelHome, gbc_panelHome);
				GridBagLayout gbl_panelHome = new GridBagLayout();
				gbl_panelHome.columnWidths = new int[]{0, 0};
				gbl_panelHome.rowHeights = new int[]{0, 0};
				gbl_panelHome.columnWeights = new double[]{0.0, Double.MIN_VALUE};
				gbl_panelHome.rowWeights = new double[]{0.0, Double.MIN_VALUE};
				panelHome.setLayout(gbl_panelHome);
				{
					btnHome = new JButton("");
					btnHome.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
						}
					});
					btnHome.addActionListener(new MiIndexActionListener());
					GridBagConstraints gbc_btnHome = new GridBagConstraints();
					gbc_btnHome.gridx = 0;
					gbc_btnHome.gridy = 0;
					panelHome.add(btnHome, gbc_btnHome);
					btnHome.setIcon(new ImageIcon(Index.class.getResource("/Recursos/home-26.png")));
				}
			}
			{
				lblLogotipo = new JLabel("");
				GridBagConstraints gbc_lblLogotipo = new GridBagConstraints();
				gbc_lblLogotipo.insets = new Insets(0, 0, 0, 5);
				gbc_lblLogotipo.gridx = 2;
				gbc_lblLogotipo.gridy = 0;
				panelMenu.add(lblLogotipo, gbc_lblLogotipo);
			}
			{
				{
					lblConectado = new JLabel("Conectado:");
					lblConectado.setAlignmentX(Component.RIGHT_ALIGNMENT);
					GridBagConstraints gbc_lblConectado = new GridBagConstraints();
					gbc_lblConectado.fill = GridBagConstraints.VERTICAL;
					gbc_lblConectado.insets = new Insets(0, 0, 0, 5);
					gbc_lblConectado.gridx = 3;
					gbc_lblConectado.gridy = 0;
					panelMenu.add(lblConectado, gbc_lblConectado);
				}
				{
					btnUsuario = new JButton("");
					btnUsuario.setBorder(null);
					btnUsuario.addActionListener(new MiAdminActionListener());
					GridBagConstraints gbc_btnUsuario = new GridBagConstraints();
					gbc_btnUsuario.fill = GridBagConstraints.BOTH;
					gbc_btnUsuario.insets = new Insets(0, 0, 0, 5);
					gbc_btnUsuario.gridx = 4;
					gbc_btnUsuario.gridy = 0;
					panelMenu.add(btnUsuario, gbc_btnUsuario);
				}
			}
			btnCerrarSesion = new JButton("Cerrar Sesión");
			btnCerrarSesion.addMouseListener(new BtnCerrarSesionMouseListener());
			btnCerrarSesion.setAlignmentX(Component.RIGHT_ALIGNMENT);
			GridBagConstraints gbc_btnCerrarSesion = new GridBagConstraints();
			gbc_btnCerrarSesion.gridx = 5;
			gbc_btnCerrarSesion.gridy = 0;
			panelMenu.add(btnCerrarSesion, gbc_btnCerrarSesion);
		}
		
	}

	public JPanel getPanelContenedor() {
		return panelContenedor;
	}
	
	public JFrame getFrame() {
		return frmIndex;
	}

	public void setFrame(JFrame frame) {
		this.frmIndex = frame;
	}
	
	//PANEL MENU
	
	private class BtnAtrasMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			
		}
	}
		
	private class BtnCerrarSesionMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				new Login().getFrame().setVisible(true);
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, e1);
			}
			frmIndex.setVisible(false);
		}
	}
		
	//PANEL INDEX
	
	//PANEL BUSCAR MIEMBROS
	
	private class BtnCrearMiembroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(getPanelContenedor().getLayout());
			cl.show(getPanelContenedor(), "Miembro");
			limpiarMiembro();
			editarMiembro(true);
			btnEliminarMiembroMiembro.setEnabled(false);
			btnModificarMiembroMiembro.setEnabled(false);
			btnGuardarMiembroMiembro.setEnabled(true);
		}
	}
	
	private class BtnModificarMiembroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (listMiembro.getSelectedIndex()==-1){
				JOptionPane.showMessageDialog(frmIndex,"Error al seleccionar al miembro", "Error", JOptionPane.INFORMATION_MESSAGE);
			} else{
				CardLayout cl = (CardLayout)(getPanelContenedor().getLayout());
				cl.show(getPanelContenedor(), "Miembro");
				limpiarMiembro();
				mostrarMiembro(listMiembro.getSelectedIndex());
				editarMiembro(true);
				btnGuardarMiembroMiembro.setEnabled(true);
				btnModificarMiembroMiembro.setEnabled(false);
				btnEliminarMiembroMiembro.setEnabled(false);
			}
		}
	}
	
	private class BtnEliminarMiembroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (listMiembro.getSelectedIndex()==-1){
				JOptionPane.showMessageDialog(frmIndex,"Error al seleccionar al miembro", "Error", JOptionPane.INFORMATION_MESSAGE);
			}else{
				int n = JOptionPane.showConfirmDialog(frmIndex, "¿Confirma la operación?", "Confirmar", JOptionPane.YES_NO_OPTION);
				if (n==0){
					eliminarMiembro(listMiembro.getSelectedIndex());
					modeloListaMiembro.removeAllElements();
					actualizarMiembros();
				}
			}
		}
	}
	
	private class BtnVerMiembroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (listMiembro.getSelectedIndex()==-1){
				JOptionPane.showMessageDialog(frmIndex,"Error al seleccionar al miembro", "Error", JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-2$
			} else{
				CardLayout cl = (CardLayout)(getPanelContenedor().getLayout());
				cl.show(getPanelContenedor(), "Miembro");
				limpiarMiembro();
				mostrarMiembro(listMiembro.getSelectedIndex());
				editarMiembro(true);
				btnGuardarMiembroMiembro.setEnabled(false);
				btnModificarMiembroMiembro.setEnabled(true);
				btnEliminarMiembroMiembro.setEnabled(true);
				editarMiembro(false);
			}
		}
	}
	
	
	//PANEL BUSCAR USUARIOS
	
	private class BtnCrearUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(getPanelContenedor().getLayout());
			cl.show(getPanelContenedor(), "Usuario");
			limpiarUsuario();
			editarUsuario(true);
			btnEliminarUsuarioUsuario.setEnabled(false);
			btnModificarUsuarioUsuario.setEnabled(false);
			btnGuardarUsuarioUsuario.setEnabled(true);

		}
	}
	private class BtnModificarUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (listUsuario.getSelectedIndex()==-1){
				JOptionPane.showMessageDialog(frmIndex,"Error al seleccionar al usuario", "Error", JOptionPane.INFORMATION_MESSAGE);
			} else{
				CardLayout cl = (CardLayout)(getPanelContenedor().getLayout());
				cl.show(getPanelContenedor(), "Usuario");
				limpiarUsuario();
				mostrarUsuario(listUsuario.getSelectedIndex());
				editarUsuario(true);
				btnGuardarUsuarioUsuario.setEnabled(true);
				btnModificarUsuarioUsuario.setEnabled(false);
				btnEliminarUsuarioUsuario.setEnabled(false);
			}
		}
	}
	private class BtnEliminarUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (listUsuario.getSelectedIndex()==-1){
				JOptionPane.showMessageDialog(frmIndex,"Error al seleccionar al usuario", "Error", JOptionPane.INFORMATION_MESSAGE);
			}else{
				int n = JOptionPane.showConfirmDialog(frmIndex, "¿Confirma la operación?", "Confirmar", JOptionPane.YES_NO_OPTION);
				if (n==0){
					System.out.println(listUsuario.getSelectedIndex());
					eliminarUsuario(listUsuario.getSelectedIndex());
					modeloListaUsuario.removeAllElements();
					actualizarUsuarios();
				}
			}
		}
	}
	private class BtnVerUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (listUsuario.getSelectedIndex()==-1){
				JOptionPane.showMessageDialog(frmIndex,"Error al seleccionar al usuario", "Error", JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-2$
			} else{
				CardLayout cl = (CardLayout)(getPanelContenedor().getLayout());
				cl.show(getPanelContenedor(), "Usuario");
				limpiarUsuario();
				mostrarUsuario(listUsuario.getSelectedIndex());
				editarUsuario(true);
				btnGuardarUsuarioUsuario.setEnabled(false);
				btnModificarUsuarioUsuario.setEnabled(true);
				btnEliminarUsuarioUsuario.setEnabled(true);
				editarUsuario(false);
			}
		}
	}
	
	//PANEL MIEMBRO
	
	private class BtnGuardarMiembroMiembroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			guardarMiembro(fTxtDNIMiembro.getText());
			btnGuardarMiembroMiembro.setEnabled(false);
			btnModificarMiembroMiembro.setEnabled(true);
			btnEliminarMiembroMiembro.setEnabled(true);
			JOptionPane.showMessageDialog(frmIndex,"Los datos se han guardado","Información", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
	private class BtnModificarMiembroMiembroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			editarMiembro(true);
			btnGuardarMiembroMiembro.setEnabled(true);
			btnModificarMiembroMiembro.setEnabled(false);
			btnEliminarMiembroMiembro.setEnabled(false);
		}
	}
	private class BtnEliminarMiembroMiembroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int n = JOptionPane.showConfirmDialog(frmIndex, "¿Confirma la operación?", "Confirmar", JOptionPane.YES_NO_OPTION);
			if(n==0){
				CardLayout cl = (CardLayout)(getPanelContenedor().getLayout());
				cl.show(getPanelContenedor(), "Home");
				eliminarMiembro(txtNombreMiembro.getText());	
				editarMiembro(false);
				limpiarMiembro();
				JOptionPane.showMessageDialog(frmIndex, "La operación se ha completado", "Información", JOptionPane.INFORMATION_MESSAGE);
			}	
			
		}
	}
	
	//PANEL USUARIO
	
	private class BtnGuardarUsuarioUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			guardarUsuario();
			btnGuardarUsuarioUsuario.setEnabled(false);
			btnModificarUsuarioUsuario.setEnabled(true);
			btnEliminarUsuarioUsuario.setEnabled(true);
			JOptionPane.showMessageDialog(frmIndex,"Los datos se han guardado","Información", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private class BtnModificarUsuarioUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			editarUsuario(true);
			btnGuardarUsuarioUsuario.setEnabled(true);
			btnModificarUsuarioUsuario.setEnabled(false);
			btnEliminarUsuarioUsuario.setEnabled(false);
		}
	}
	
	private class BtnEliminarUsuarioUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int n = JOptionPane.showConfirmDialog(frmIndex, "¿Confirma la operación?", "Confirmar", JOptionPane.YES_NO_OPTION);
			if(n==0){
				CardLayout cl = (CardLayout)(getPanelContenedor().getLayout());
				cl.show(getPanelContenedor(), "Home");
				eliminarUsuario(txtUsuarioUsuario.getText());	
				editarUsuario(false);
				limpiarUsuario();
				JOptionPane.showMessageDialog(frmIndex, "La operación se ha completado", "Información", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	
	
	
	//MENU BAR
	
	private class MntmCerrarSesionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				new Login().getFrame().setVisible(true);
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, e1);;
			}
			frmIndex.setVisible(false);
		}
	}
	private class MntmSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frmIndex, "Saliendo");
			System.exit(0);
		}
	}
	
	private class MntmManualUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class MntmAcercaDeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}

	//MIS OYENTES
		
	//Inicio
	private class MiIndexActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			CardLayout cl = (CardLayout)(getPanelContenedor().getLayout());
			cl.show(getPanelContenedor(), "Index");
		}
	}
	
	private class MiMiembroActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(getPanelContenedor().getLayout());
			cl.show(getPanelContenedor(), "BuscarMiembro");
			modeloListaMiembro.removeAllElements();
			actualizarMiembros();
		}
	}
	
	private class MiUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(getPanelContenedor().getLayout());
			cl.show(getPanelContenedor(), "BuscarUsuario");
			modeloListaUsuario.removeAllElements();
			actualizarUsuarios();
		}
	}
	
	private class MiAdminActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(getPanelContenedor().getLayout());
			cl.show(getPanelContenedor(), "Admin");
		}
	}
	
	
	
	
	
	//METODOS
	
	public void actualizarMiembros(){
		try{
			String sql ="select * from Asociacion ";
			PreparedStatement pst = connection.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
				modeloListaMiembro.addElement(rs.getString("dni")+ " " +rs.getString("nombre")+ " " +rs.getString("apellido1")+ " " +rs.getString("apellido2"));
			listMiembro.setModel(modeloListaMiembro);
			rs.close();
			pst.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	public void actualizarUsuarios(){
		try{
			String sql ="select * from Usuario ";
			PreparedStatement pst = connection.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
				modeloListaUsuario.addElement(rs.getString("nombre"));
			listUsuario.setModel(modeloListaUsuario);
			rs.close();
			pst.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	public void mostrarMiembro(int index){
		try{
			txtNombreMiembro.setText(gestMiembros.getMiembro(index).getNombre());
			txtApellidosMiembro1.setText(gestMiembros.getMiembro(index).getApellidos1());
			txtApellidosMiembro2.setText(gestMiembros.getMiembro(index).getApellidos2());
			fTxtDNIMiembro.setText(gestMiembros.getMiembro(index).getDni());
			fTxtFechaNacimiento.setText(gestMiembros.getMiembro(index).getFechaNacimiento());
			cbRol.setSelectedItem(gestMiembros.getMiembro(index).getRol());
			cbDireccionMiembro.setSelectedItem(gestMiembros.getMiembro(index).getTipoVia());
			txtDireccionMiembro.setText(gestMiembros.getMiembro(index).getDireccion());
			txtNumeroMiembro.setText(Integer.toString(gestMiembros.getMiembro(index).getnCalle()));
			txtEscaleraMiembro.setText(gestMiembros.getMiembro(index).getEscalera());
			txtPisoMiembro.setText(Integer.toString(gestMiembros.getMiembro(index).getPiso()));
			txtPuertaMiembro.setText(gestMiembros.getMiembro(index).getPuerta());
			txtCodigoPostalMiembro.setText(Integer.toString(gestMiembros.getMiembro(index).getCodigoPostal()));
			txtProvinciaMiembro.setText(gestMiembros.getMiembro(index).getProvincia());
			txtTelefonoMiembro.setText(gestMiembros.getMiembro(index).getTelefono());
			txtLocalidadMiembro.setText(gestMiembros.getMiembro(index).getLocalidad());
			txtCorreoElectronicoMiembro.setText(gestMiembros.getMiembro(index).getCorreoElectronico());
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	public void editarMiembro (boolean editable){
		txtNombreMiembro.setEditable(editable);
		txtApellidosMiembro1.setEditable(editable);
		txtApellidosMiembro2.setEditable(editable);
		fTxtDNIMiembro.setEditable(editable);
		fTxtFechaNacimiento.setEditable(editable);
		cbRol.setEditable(false);
		cbRol.setEditable(editable);
		cbDireccionMiembro.setEditable(false);
		cbDireccionMiembro.setEditable(editable);
		txtDireccionMiembro.setEditable(editable);
		txtNumeroMiembro.setEditable(editable);
		txtEscaleraMiembro.setEditable(editable);
		txtPisoMiembro.setEditable(editable);
		txtPuertaMiembro.setEditable(editable);
		txtCodigoPostalMiembro.setEditable(editable);
		txtProvinciaMiembro.setEditable(editable);
		txtTelefonoMiembro.setEditable(editable);
		txtLocalidadMiembro.setEditable(editable);
		txtCorreoElectronicoMiembro.setEditable(editable);
	}
	
	public void limpiarMiembro(){
		txtNombreMiembro.setText(" ");
		txtApellidosMiembro1.setText(" ");
		txtApellidosMiembro2.setText(" ");
		fTxtDNIMiembro.setText(" ");
		fTxtFechaNacimiento.setText(" ");
		txtDireccionMiembro.setText(" ");
		txtNumeroMiembro.setText(" ");
		txtEscaleraMiembro.setText(" ");
		txtPisoMiembro.setText(" ");
		txtPuertaMiembro.setText(" ");
		txtCodigoPostalMiembro.setText(" ");
		txtProvinciaMiembro.setText(" ");
		txtTelefonoMiembro.setText(" ");
		txtLocalidadMiembro.setText(" ");
		txtCorreoElectronicoMiembro.setText(" ");
	}
	
	
	/*public void guardarMiembro(String index){
		Miembro miembro = null;
		try{
			try{
//				String nombre = txtNombreMiembro.getText();
//				String apellido1 = txtApellidosMiembro1.getText();
//				String apellido2 = txtApellidosMiembro2.getText();
//				String dni = fTxtDNIMiembro.getText();
//				String fecha = fTxtFechaNacimiento.getText();
//				String rol = cbRol.getSelectedItem().toString();
//				String tipoVia = cbDireccionMiembro.getSelectedItem().toString();
//				String direccion = txtDireccionMiembro.getText();
//				int nCalle = Integer.parseInt(txtNumeroMiembro.getText());
//				String escalera = txtEscaleraMiembro.getText();
//				int piso = Integer.parseInt(txtPisoMiembro.getText());
//				String puerta = txtPuertaMiembro.getText();
//				int codigoPostal = Integer.parseInt(txtCodigoPostalMiembro.getText());
//				String provincia = txtProvinciaMiembro.getText();
//				String telefono = txtTelefonoMiembro.getText();
//				String localidad = txtLocalidadMiembro.getText();
//				String correoElectronico = txtCorreoElectronicoMiembro.getText();
//				
				
				//
				String nombre = "Sergio";
				String apellido1 = "G�mez";
				String apellido2 = "Jaramillo";
				String dni = "04669851-K";
				String fecha = "1985/09/04";
				String rol = "usuario";
				String tipoVia = "Calle";
				String direccion = "Lirio";
				int nCalle = 122;
				String escalera = "B";
				int piso = 3;
				String puerta = "F";
				int codigoPostal = 13002;
				String provincia = "Ciudad Real";
				String telefono = "685941258";
				String localidad = "Ciudad Real";
				String correoElectronico = "sergio@gmail.com";
				//
				miembro = new Miembro(dni, nombre,apellido1, apellido2, fecha, tipoVia, direccion, nCalle, escalera, piso, puerta, codigoPostal, provincia, localidad, telefono, correoElectronico, rol);
				
				gestMiembros.agregar(miembro);
				JOptionPane.showMessageDialog(null, "Guardado Correctamente");
			}catch(Exception e){
				for(int i=0; i<gestMiembros.numMiembros(); i++){
					if(gestMiembros.getMiembro(i).getDni()== index)
						gestMiembros.modificar(gestMiembros.getMiembro(i), miembro);
				}
				JOptionPane.showMessageDialog(null, "Guardado Correctamente");
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			
		}
	}*/
	
	public void guardarMiembro(String index){
		Miembro miembro = null;
		try{
			try{
				String sql ="Insert into Asociacion (dni,nombre,apellido1,apellido2,nacimiento,tipo_via,direccion,numero,escalera,piso,puerta,cod_postal,provincia,localidad,tlfn,email) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";  
				PreparedStatement pst = connection.prepareStatement(sql);
				pst.setString(1,fTxtDNIMiembro.getText() );
				pst.setString(2,txtNombreMiembro.getText());
				pst.setString(3,txtApellidosMiembro1.getText() );
				pst.setString(4,txtApellidosMiembro2.getText() );
				pst.setString(5,fTxtFechaNacimiento.getText() );
				pst.setString(6,cbDireccionMiembro.getSelectedItem().toString() );
				pst.setString(7,txtDireccionMiembro.getText() );
				pst.setLong(8,Integer.parseInt(txtNumeroMiembro.getText()));
				pst.setString(9,txtEscaleraMiembro.getText() );
				pst.setLong(10,Integer.parseInt(txtPisoMiembro.getText()));
				pst.setString(11,txtPuertaMiembro.getText() );
				pst.setLong(12,Integer.parseInt(txtCodigoPostalMiembro.getText()));
				pst.setString(13,txtProvinciaMiembro.getText() );
				pst.setString(14,txtLocalidadMiembro.getText() );
				pst.setString(15,txtTelefonoMiembro.getText() );
				pst.setString(16,txtCorreoElectronicoMiembro.getText() );
				
				pst.execute();
				pst.close();
				JOptionPane.showMessageDialog(null, "Guardado Correctamente");
				

			}catch(Exception e){
				String nombre = txtNombreMiembro.getText();
				String apellido1 = txtApellidosMiembro1.getText();
				String apellido2 = txtApellidosMiembro2.getText();
				String dni = fTxtDNIMiembro.getText();
				String fecha = fTxtFechaNacimiento.getText();
				String rol = cbRol.getSelectedItem().toString();
				String tipoVia = cbDireccionMiembro.getSelectedItem().toString();
				String direccion = txtDireccionMiembro.getText();
				int nCalle = Integer.parseInt(txtNumeroMiembro.getText());
				String escalera = txtEscaleraMiembro.getText();
				int piso = Integer.parseInt(txtPisoMiembro.getText());
				String puerta = txtPuertaMiembro.getText();
				int codigoPostal = Integer.parseInt(txtCodigoPostalMiembro.getText());
				String provincia = txtProvinciaMiembro.getText();
				String telefono = txtTelefonoMiembro.getText();
				String localidad = txtLocalidadMiembro.getText();
				String correoElectronico = txtCorreoElectronicoMiembro.getText();
				
				
				
				String sql="update Asociacion set nombre='"+nombre+"' ,apellido1 ='"+apellido1+"',apellido2 ='"+apellido2+"',dni ='"+dni+"',nacimiento='"+fecha+"',tipo_via='"+fecha+"',direccion='"+fecha+"',numero='"+nCalle+"',escalera='"+escalera+"',piso='"+piso+"',puerta='"+puerta+"',cod_postal='"+codigoPostal+"',provincia='"+provincia+"',localidad='"+localidad+"',tlfn='"+telefono+"',email='"+correoElectronico+"' where dni='"+dni+"' ";
				PreparedStatement pst = connection.prepareStatement(sql);
				pst.execute();
				pst.close();
			JOptionPane.showMessageDialog(null, "Guardado Correctamente");
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			
		}
	}
	

	public void eliminarMiembro(int index){  //SI FUNCIONA pero no actualiza
		String miembro = (String) listMiembro.getModel().getElementAt(index);
		String[] texto=miembro.split(" ");
		String dni = texto[0];
		try{
			String sql ="delete from Usuario where dni='"+dni+"' ";
        	PreparedStatement pst = connection.prepareStatement(sql);
        	pst.execute();
			pst.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public void eliminarMiembro(String dni){
		try{
			String sql ="delete from Usuario where dni='"+dni+"' ";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.execute();
			pst.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	
	
	public void mostrarUsuario(int index){
		try{
			txtUsuarioUsuario.setText(gestUsuarios.getUsuario(index).getUsuario());
			frmtdtxtfldContrasena.setText(gestUsuarios.getUsuario(index).getPassword());
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	public void guardarUsuario(){
		try{
			try{
				String sql ="Insert into Usuario (nombre,password) values (?,?)";  
				PreparedStatement pst = connection.prepareStatement(sql);
				pst.setString(1, txtUsuarioUsuario.getText());
				pst.setString(2, frmtdtxtfldContrasena.getText());
				
				pst.execute();
				pst.close();
				JOptionPane.showMessageDialog(null, "Guardado Correctamente");
			}catch(Exception e){
				String user = txtUsuarioUsuario.getText();
				String password = frmtdtxtfldContrasena.getText();
				String sql="update Usuario set nombre='"+user+"' ,password ='"+password+"'where nombre='"+user+"' ";
				PreparedStatement pst = connection.prepareStatement(sql);
				pst.execute();
				pst.close();
				JOptionPane.showMessageDialog(null, "Guardado Correctamente");
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			
		}
	}
	
	
	public void editarUsuario (boolean editable){
		txtUsuarioUsuario.setEditable(editable);
		frmtdtxtfldContrasena.setEditable(editable);
	}
	
	public void limpiarUsuario(){
		txtUsuarioUsuario.setText(" ");
		frmtdtxtfldContrasena.setText(" ");
	}
	
	public void eliminarUsuario(int index){  //SI FUNCIONA pero no actualiza
		String usuario = (String) listUsuario.getModel().getElementAt(index);
		String[] texto=usuario.split(" ");
		String nombre = texto[0];
		try{
			String sql ="delete from Usuario where nombre='"+nombre+"' ";
        	PreparedStatement pst = connection.prepareStatement(sql);
        	pst.execute();
			pst.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public void eliminarUsuario(String nombre){
		try{
			String sql ="delete from Usuario where nombre='"+nombre+"' ";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.execute();
			pst.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	
		
	
}