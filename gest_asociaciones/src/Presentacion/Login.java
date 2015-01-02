package Presentacion;

import java.awt.EventQueue;

import Dominio.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Toolkit;

import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.DefaultComboBoxModel;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.SystemColor;
import java.io.File;
import java.io.IOException;


public class Login {

	private JFrame frmLogin;
	private final JLabel lblLogo = new JLabel("");
	private final JLabel lblUser = new JLabel("Usuario:");
	private final JLabel lblPass = new JLabel("Contraseña:");
	private final JTextField txtUser = new JTextField();
	private final JPanel panel = new JPanel();
	private final JPasswordField passwordField = new JPasswordField();
	private final JButton btnEntrar = new JButton("Entrar");
	private final JLabel lblGrupoPracticas = new JLabel("G01.03 Fagobytes Corporation ©");
	

	private final JLabel label = new JLabel("");
	private final JLabel label_1 = new JLabel("");
	
	public static int numeroArray;
	public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	public static ArrayList<Miembro> miembros = new ArrayList<Miembro>();
	
	
	
	public JFrame getFrmLogin() {
		return frmLogin;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Connection connection=null;
	GestorUsuario gest_user=null;

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public Login() throws Exception {
		initialize();
		//connection=Persistencia.AgenteDB.conectar();
		gest_user=new GestorUsuario();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setResizable(false);
		frmLogin.getContentPane().setBackground(SystemColor.inactiveCaption);
		frmLogin.setTitle("ASOBU - Fagobytes Corporation");
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Recursos/favicon.png")));
		frmLogin.setBounds(400, 200, 474, 294);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		
		{
			panel.setBackground(Color.WHITE);
			panel.setBounds(0, 0, 503, 240);
			frmLogin.getContentPane().add(panel);
		}
		panel.setLayout(null);
		{
			lblLogo.setBounds(63, 35, 309, 68);
			panel.add(lblLogo);
			lblLogo.setIcon(new ImageIcon(Login.class.getResource("/Recursos/Logo.png")));
		}
		lblUser.setFont(new Font("Verdana", Font.BOLD, 12));
		lblUser.setBounds(104, 129, 73, 14);
		panel.add(lblUser);
		lblPass.setEnabled(false);
		lblPass.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPass.setBounds(104, 169, 89, 14);
		panel.add(lblPass);
		txtUser.addActionListener(new TxtUserActionListener());
		txtUser.setBounds(193, 127, 126, 20);
		panel.add(txtUser);
		txtUser.setColumns(10);
		passwordField.addActionListener(new MiEntrarActionListener());
		passwordField.setEnabled(false);
		passwordField.setBounds(193, 167, 126, 20);
		
		panel.add(passwordField);
		{
			btnEntrar.addActionListener(new MiEntrarActionListener());
			btnEntrar.setEnabled(false);
			btnEntrar.setBounds(350, 166, 89, 23);
			panel.add(btnEntrar);
		}
		{
			label.setIcon(new ImageIcon(Login.class.getResource("/Recursos/user.png")));
			label.setBounds(73, 116, 31, 31);
			panel.add(label);
		}
		{
			label_1.setIcon(new ImageIcon(Login.class.getResource("/Recursos/pass.png")));
			label_1.setBounds(73, 158, 31, 29);
			panel.add(label_1);
		}
		{
			lblGrupoPracticas.setForeground(Color.GRAY);
			lblGrupoPracticas.setBounds(273, 242, 195, 23);
			frmLogin.getContentPane().add(lblGrupoPracticas);
		}
	}
	
	public JFrame getFrame() {
		return frmLogin;
	}

	public void setFrame(JFrame frame) {
		this.frmLogin = frame;
	}
	
	private class TxtUserActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			lblPass.setEnabled(true);
			passwordField.setEnabled(true);
			lblUser.setEnabled(false);
			txtUser.setEnabled(false);
			btnEntrar.setEnabled(true);
			
		}
	}
	private class MiEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String name_user=txtUser.getText();
			String pass=passwordField.getText();
			boolean autenticado=false;
			
			try{
				autenticado=gest_user.autenticar(name_user, pass);
				
				if(autenticado){
					JOptionPane.showMessageDialog(null, "Usuario y contrase�a correcto");
					new Index().getFrame().setVisible(true);
					frmLogin.setVisible(false);				
				}
				else{
					JOptionPane.showMessageDialog(null, "Usuario y contrase�a no correcto");
				}
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
		}
	}
	
	
}
