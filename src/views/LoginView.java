package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.LoginController;
import controllers.PanelController;
import models.Employe;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPasswordField fieldLoginPass;
	private JButton btnLogin;
	private JLabel labelLoginPass;
	private JLabel labelLoginDocument;
	private JLabel labelTittleLogin;
	private JTextField textLoginDocument;
	private LoginController loginController = new LoginController();
	private PanelController panelController = new PanelController();

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public LoginView() {
		
		initComponents();
		    
		setTitle("Iniciar");
		setSize(360,600);
		setLocationRelativeTo(null);
		setResizable(false);
		
	}

	private void initComponents() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnLogin = new JButton("Ingresar");
		btnLogin.setFont(new Font("Calibri", Font.PLAIN, 17));
		btnLogin.setBounds(235, 507, 96, 37);
		contentPane.add(btnLogin);
		btnLogin.addActionListener(this);
		
		labelLoginDocument = new JLabel("Cedula");
		labelLoginDocument.setHorizontalAlignment(SwingConstants.CENTER);
		labelLoginDocument.setFont(new Font("Calibri", Font.BOLD, 17));
		labelLoginDocument.setBounds(31, 377, 89, 25);
		contentPane.add(labelLoginDocument);
		
		labelLoginPass = new JLabel("Contrasena");
		labelLoginPass.setHorizontalAlignment(SwingConstants.CENTER);
		labelLoginPass.setFont(new Font("Calibri", Font.BOLD, 17));
		labelLoginPass.setBounds(31, 413, 107, 25);
		contentPane.add(labelLoginPass);
		
		fieldLoginPass = new JPasswordField();
		fieldLoginPass.setBounds(174, 416, 138, 28);
		contentPane.add(fieldLoginPass);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\anthony\\workspace\\Rahizz\\src\\img\\ojojpg.jpg"));
		lblNewLabel.setBounds(5, 41, 342, 287);
		contentPane.add(lblNewLabel);
		
		labelTittleLogin = new JLabel("Iniciar al Sistema");
		labelTittleLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelTittleLogin.setHorizontalAlignment(SwingConstants.CENTER);
		labelTittleLogin.setBounds(103, 11, 129, 14);
		contentPane.add(labelTittleLogin);
		
		textLoginDocument = new JTextField();
		textLoginDocument.setBounds(174, 376, 138, 26);
		contentPane.add(textLoginDocument);
		textLoginDocument.setColumns(10);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLogin){
			Employe employeLogin = new Employe();
			String document = textLoginDocument.getText();
			String pass = String.valueOf(fieldLoginPass.getPassword());
			employeLogin = loginController.login(pass, document);
			
			if(employeLogin == null){
				JOptionPane.showMessageDialog(null, "Usuario o Contrasena Incorrectos", "Error",JOptionPane.ERROR_MESSAGE);	
			}else{
				panelController.getPanel(employeLogin);
				dispose();
			}
		}
		
	}
	
}
