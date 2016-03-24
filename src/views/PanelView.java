package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;

import controllers.PanelController;
import models.Customer;
import models.Diagnostic;
import models.Product;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.FlowLayout;
import com.toedter.calendar.JDayChooser;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;

public class PanelView extends JFrame implements ActionListener{

	private JPanel contentPane;
	public static JTextField textRegisterName;
	private JTextField textRegisterCell;
	private JTextField textRegisterEmail;
	private JTextField textRegisterPay;
	private JMenuBar menuBar;
	private JMenuItem menuChangeUser;
	private JMenu menuBarChangeUser;
	private JTabbedPane tabPanel;
	private JPanel tabClient;
	private JTabbedPane tabClientRegister;
	private JPanel tabRegister;
	private JLabel labelRegisterName;
	private JLabel labelRegisterDocument;
	private JLabel labelRegisterCell;
	private JLabel labelRegisterDate;
	private JCalendar calendarRegister;
	private JLabel labelRegisterGender;
	private JComboBox comboRegisterGender;
	private JLabel labelRegisterEmail;
	private JLabel labelRegisterPay;
	public static JButton btnRegisterAdd;
	private JButton btnRegisterCancel;
	private JButton btnRegistroDiagnistic;
	private JPanel tabConsult;
	private JPanel tabSell;
	private JPanel tabStock;
	private JPanel tabEmployes;
	private PanelController panelController = new PanelController();
	public static JTextField textRegisterDocument;
	private JTextField textRef;
	private JTextField textCostPrice;
	private JTextField textDescrip;
	private JTextField textSellPrice;
	private JTextField textCantidad;
	private JLabel labelRef;
	private JLabel labelCostPrice;
	private JButton btnStockCancel;
	private JButton btnStockAdd;
	private JButton btnStockConsult;
	private JCalendar calendarStock;
	public static Customer customer = new Customer();

	/**
	 * Create the frame.
	 */
	public PanelView() {
		
        initComponents();
        setTitle("Rahizz - Sistema de Ventas");
        setSize(1090,670);
        setLocationRelativeTo(null);
        setResizable(false);
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1109, 681);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuBarChangeUser = new JMenu("Opciones");
		menuBarChangeUser.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(menuBarChangeUser);
		
		menuChangeUser = new JMenuItem("Cambiar Usuario");
		menuBarChangeUser.add(menuChangeUser);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		menuChangeUser.addActionListener(this);
		
		tabPanel = new JTabbedPane(JTabbedPane.TOP);
		tabPanel.setFont(new Font("Calibri", Font.PLAIN, 17));
		tabPanel.setBounds(0, 0, 1093, 643);
		contentPane.add(tabPanel);
		
		tabClient = new JPanel();
		tabClient.setToolTipText("");
		tabPanel.addTab("CLIENTES", null, tabClient, null);
		tabClient.setLayout(null);
		
		tabClientRegister = new JTabbedPane(JTabbedPane.TOP);
		tabClientRegister.setFont(new Font("Calibri", Font.PLAIN, 15));
		tabClientRegister.setBounds(0, 0, 1088, 607);
		tabClient.add(tabClientRegister);
		
		tabRegister = new JPanel();
		tabClientRegister.addTab("Registrar", null, tabRegister, null);
		tabRegister.setLayout(null);
		
		labelRegisterName = new JLabel("Nombre Completo *\r\n");
		labelRegisterName.setFont(new Font("Calibri", Font.BOLD, 20));
		labelRegisterName.setHorizontalAlignment(SwingConstants.CENTER);
		labelRegisterName.setBounds(38, 42, 174, 32);
		tabRegister.add(labelRegisterName);
		
		textRegisterName = new JTextField();
		textRegisterName.setHorizontalAlignment(SwingConstants.CENTER);
		textRegisterName.setFont(new Font("Calibri", Font.PLAIN, 17));
		textRegisterName.setBounds(295, 42, 222, 32);
		tabRegister.add(textRegisterName);
		textRegisterName.setColumns(10);
		
		labelRegisterDocument = new JLabel("Cedula *");
		labelRegisterDocument.setHorizontalAlignment(SwingConstants.CENTER);
		labelRegisterDocument.setFont(new Font("Calibri", Font.BOLD, 20));
		labelRegisterDocument.setBounds(38, 105, 174, 32);
		tabRegister.add(labelRegisterDocument);
		
		labelRegisterCell = new JLabel("Telefono - Celular *");
		labelRegisterCell.setHorizontalAlignment(SwingConstants.CENTER);
		labelRegisterCell.setFont(new Font("Calibri", Font.BOLD, 20));
		labelRegisterCell.setBounds(38, 166, 174, 32);
		tabRegister.add(labelRegisterCell);
		
		textRegisterCell = new JTextField();
		textRegisterCell.setHorizontalAlignment(SwingConstants.CENTER);
		textRegisterCell.setFont(new Font("Calibri", Font.PLAIN, 17));
		textRegisterCell.setColumns(10);
		textRegisterCell.setBounds(295, 172, 222, 32);
		tabRegister.add(textRegisterCell);
		
		labelRegisterDate = new JLabel("Cumpleanos");
		labelRegisterDate.setHorizontalAlignment(SwingConstants.CENTER);
		labelRegisterDate.setFont(new Font("Calibri", Font.BOLD, 20));
		labelRegisterDate.setBounds(38, 257, 174, 32);
		tabRegister.add(labelRegisterDate);
		
		calendarRegister = new JCalendar();
		calendarRegister.setBounds(295, 257, 222, 146);
		tabRegister.add(calendarRegister);
		
		labelRegisterGender = new JLabel("Sexo");
		labelRegisterGender.setHorizontalAlignment(SwingConstants.CENTER);
		labelRegisterGender.setFont(new Font("Calibri", Font.BOLD, 20));
		labelRegisterGender.setBounds(38, 438, 174, 32);
		tabRegister.add(labelRegisterGender);
		
		comboRegisterGender = new JComboBox();
		comboRegisterGender.setFont(new Font("Calibri", Font.PLAIN, 16));
		comboRegisterGender.setModel(new DefaultComboBoxModel(new String[] {"MASCULINO", "FEMENINO"}));
		comboRegisterGender.setBounds(295, 438, 111, 32);
		tabRegister.add(comboRegisterGender);
		
		labelRegisterEmail = new JLabel("Correo Electronico");
		labelRegisterEmail.setHorizontalAlignment(SwingConstants.CENTER);
		labelRegisterEmail.setFont(new Font("Calibri", Font.BOLD, 20));
		labelRegisterEmail.setBounds(561, 42, 174, 32);
		tabRegister.add(labelRegisterEmail);
		
		textRegisterEmail = new JTextField();
		textRegisterEmail.setHorizontalAlignment(SwingConstants.CENTER);
		textRegisterEmail.setFont(new Font("Calibri", Font.PLAIN, 17));
		textRegisterEmail.setColumns(10);
		textRegisterEmail.setBounds(782, 42, 275, 32);
		tabRegister.add(textRegisterEmail);
		
		labelRegisterPay = new JLabel("Metodo de Pago");
		labelRegisterPay.setHorizontalAlignment(SwingConstants.CENTER);
		labelRegisterPay.setFont(new Font("Calibri", Font.BOLD, 20));
		labelRegisterPay.setBounds(561, 105, 174, 32);
		tabRegister.add(labelRegisterPay);
		
		textRegisterPay = new JTextField();
		textRegisterPay.setHorizontalAlignment(SwingConstants.CENTER);
		textRegisterPay.setFont(new Font("Calibri", Font.PLAIN, 17));
		textRegisterPay.setColumns(10);
		textRegisterPay.setBounds(782, 105, 275, 32);
		tabRegister.add(textRegisterPay);
		
		btnRegisterAdd = new JButton("Registar");
		btnRegisterAdd.setFont(new Font("Calibri", Font.BOLD, 17));
		btnRegisterAdd.setBounds(927, 487, 130, 40);
		tabRegister.add(btnRegisterAdd);
		btnRegisterAdd.addActionListener(this);
		
		btnRegisterCancel = new JButton("Cancelar");
		btnRegisterCancel.setFont(new Font("Calibri", Font.BOLD, 17));
		btnRegisterCancel.setBounds(758, 487, 130, 40);
		tabRegister.add(btnRegisterCancel);
		btnRegisterCancel.addActionListener(this);
		
		btnRegistroDiagnistic = new JButton("Diagnosticos");
		btnRegistroDiagnistic.setToolTipText("Registrar Diagnostico del Cliente");
		btnRegistroDiagnistic.setFont(new Font("Calibri", Font.BOLD, 17));
		btnRegistroDiagnistic.setBounds(626, 247, 174, 55);
		tabRegister.add(btnRegistroDiagnistic);
		
		JButton btnRegistroHistorial = new JButton("Historial");
		btnRegistroHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRegistroHistorial.setToolTipText("Registrar Historial del Cliente");
		btnRegistroHistorial.setFont(new Font("Calibri", Font.BOLD, 17));
		btnRegistroHistorial.setBounds(835, 247, 174, 55);
		tabRegister.add(btnRegistroHistorial);
		
		textRegisterDocument = new JTextField();
		textRegisterDocument.setHorizontalAlignment(SwingConstants.CENTER);
		textRegisterDocument.setFont(new Font("Calibri", Font.PLAIN, 17));
		textRegisterDocument.setColumns(10);
		textRegisterDocument.setBounds(295, 105, 222, 32);
		tabRegister.add(textRegisterDocument);
		
		btnRegistroDiagnistic.addActionListener(this);
		
		tabConsult = new JPanel();
		tabClientRegister.addTab("Consultar", null, tabConsult, null);
		
		tabSell = new JPanel();
		tabPanel.addTab("VENTAS", null, tabSell, null);
		
		tabEmployes = new JPanel();
		tabPanel.addTab("EMPLEADOS", null, tabEmployes, null);
		
		tabStock = new JPanel();
		tabPanel.addTab("INVENTARIO", null, tabStock, null);
		tabStock.setLayout(null);
		
		labelRef = new JLabel("Referencia *");
		labelRef.setHorizontalAlignment(SwingConstants.CENTER);
		labelRef.setFont(new Font("Calibri", Font.BOLD, 20));
		labelRef.setBounds(28, 32, 174, 32);
		tabStock.add(labelRef);
		
		textRef = new JTextField();
		textRef.setHorizontalAlignment(SwingConstants.CENTER);
		textRef.setFont(new Font("Calibri", Font.PLAIN, 17));
		textRef.setColumns(10);
		textRef.setBounds(285, 32, 222, 32);
		tabStock.add(textRef);
		
		labelCostPrice = new JLabel("Precio de Compra *");
		labelCostPrice.setHorizontalAlignment(SwingConstants.CENTER);
		labelCostPrice.setFont(new Font("Calibri", Font.BOLD, 20));
		labelCostPrice.setBounds(551, 32, 174, 32);
		tabStock.add(labelCostPrice);
		
		textCostPrice = new JTextField();
		textCostPrice.setHorizontalAlignment(SwingConstants.CENTER);
		textCostPrice.setFont(new Font("Calibri", Font.PLAIN, 17));
		textCostPrice.setColumns(10);
		textCostPrice.setBounds(772, 32, 222, 32);
		tabStock.add(textCostPrice);
		
		JLabel labelDescrip = new JLabel("Descripcion");
		labelDescrip.setHorizontalAlignment(SwingConstants.CENTER);
		labelDescrip.setFont(new Font("Calibri", Font.BOLD, 20));
		labelDescrip.setBounds(28, 134, 174, 32);
		tabStock.add(labelDescrip);
		
		textDescrip = new JTextField();
		textDescrip.setHorizontalAlignment(SwingConstants.CENTER);
		textDescrip.setFont(new Font("Calibri", Font.PLAIN, 17));
		textDescrip.setColumns(10);
		textDescrip.setBounds(285, 135, 222, 32);
		tabStock.add(textDescrip);
		
		JLabel labelSellPrice = new JLabel("Precio de Venta");
		labelSellPrice.setHorizontalAlignment(SwingConstants.CENTER);
		labelSellPrice.setFont(new Font("Calibri", Font.BOLD, 20));
		labelSellPrice.setBounds(551, 134, 174, 32);
		tabStock.add(labelSellPrice);
		
		textSellPrice = new JTextField();
		textSellPrice.setHorizontalAlignment(SwingConstants.CENTER);
		textSellPrice.setFont(new Font("Calibri", Font.PLAIN, 17));
		textSellPrice.setColumns(10);
		textSellPrice.setBounds(772, 135, 222, 32);
		tabStock.add(textSellPrice);
		
		JLabel labelDateAdd = new JLabel("Fecha de Ingreso");
		labelDateAdd.setHorizontalAlignment(SwingConstants.CENTER);
		labelDateAdd.setFont(new Font("Calibri", Font.BOLD, 20));
		labelDateAdd.setBounds(28, 224, 174, 32);
		tabStock.add(labelDateAdd);
		
		JLabel labelCantidad = new JLabel("Cantidad *");
		labelCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		labelCantidad.setFont(new Font("Calibri", Font.BOLD, 20));
		labelCantidad.setBounds(579, 224, 174, 32);
		tabStock.add(labelCantidad);
		
		textCantidad = new JTextField();
		textCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		textCantidad.setFont(new Font("Calibri", Font.PLAIN, 17));
		textCantidad.setColumns(10);
		textCantidad.setBounds(772, 224, 222, 32);
		tabStock.add(textCantidad);
		
		btnStockCancel = new JButton("Cancelar");
		btnStockCancel.setFont(new Font("Calibri", Font.BOLD, 17));
		btnStockCancel.setBounds(536, 484, 130, 40);
		tabStock.add(btnStockCancel);
		btnStockCancel.addActionListener(this);
		
		btnStockAdd = new JButton("Registar");
		btnStockAdd.setFont(new Font("Calibri", Font.BOLD, 17));
		btnStockAdd.setBounds(876, 484, 130, 40);
		tabStock.add(btnStockAdd);
		btnStockAdd.addActionListener(this);
		
		calendarStock = new JCalendar();
		calendarStock.setBounds(285, 224, 190, 146);
		tabStock.add(calendarStock);
		
		btnStockConsult = new JButton("Consultar");
		btnStockConsult.setFont(new Font("Calibri", Font.BOLD, 17));
		btnStockConsult.setBounds(713, 484, 130, 40);
		tabStock.add(btnStockConsult);
		btnStockConsult.addActionListener(this);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuChangeUser){
			panelController.changeUser();
			dispose();
		}else if(e.getSource() == btnRegistroDiagnistic){
			
			DiagnosticView diagnosticView = new DiagnosticView(this, isValid());
			diagnosticView.setVisible(true);
			
		}else if(e.getSource() == btnRegisterCancel){
			clearRegister();		
		}else if(e.getSource() == btnRegisterAdd){
			addUser();
			clearRegister();
		}else if(e.getSource() == btnStockConsult){
			panelController.getConsultStock();
		}else if(e.getSource() == btnStockAdd){
			addProduct();
		}else if(e.getSource() == btnStockCancel){
			clearStock();
		}
		
	}
	
	
    private void clearRegister() {
		textRegisterDocument.setText("");
		textRegisterName.setText("");
		textRegisterEmail.setText("");
		textRegisterCell.setText("");
		textRegisterPay.setText("");
		
	}

	private void clearStock() {
    	textRef.setText("");
		textCantidad.setText("");
		textCostPrice.setText("");
		textSellPrice.setText("");
		textDescrip.setText("");
		
	}

	private boolean isNumber(char c) {
        return c>='0' && c<='9';
    }

	private void addProduct() {
		Product product = new Product();
		String count = textCantidad.getText().trim();
		String returns = "";
		
		product.setCodRef(textRef.getText().trim());
		product.setDescription(textDescrip.getText().trim());
		product.setCostPrice(textCostPrice.getText().trim());
		product.setSellPrice(textSellPrice.getText().trim());
		
		if(count == null || count.equals("")){
			JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida.");
	        return;
		}
		
		for(int i=0; i<count.length(); ++i)
	    if(!isNumber( count.charAt(i)))
	    {
	        JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida.");
	        return;
	    }
		
		product.setCount(Integer.parseInt( count ));
		product.setDateAdd(calendarStock.getDayChooser().getDay() + "/" 
				+ (Integer.valueOf(calendarStock.getMonthChooser().getMonth())+1) +"/"
				+calendarStock.getYearChooser().getYear());
		
		if(panelController.validateStockFields(product)){
			returns = panelController.registProduct(product);
		}else{
			returns="mas_datos";
		}
		
		
		if(returns.equals("ok")){
			JOptionPane.showMessageDialog(null, "Producto registrado con Exito!");
		}else{
			if (returns.equals("error")) {
				JOptionPane.showMessageDialog(null, "Producto no fue registrado");
			}else{
				JOptionPane.showMessageDialog(null, "Necesitas llenar los compos OBLIGATORIOS (*)", "Advertencia",JOptionPane.WARNING_MESSAGE);
			}	
		}		
	}

	private void addUser() {
		
		String returns = "";
		
		
		customer.setDocument(textRegisterDocument.getText().trim());
		customer.setName(textRegisterName.getText().trim());
		customer.setEmail(textRegisterEmail.getText().trim());
		customer.setCel(textRegisterCell.getText().trim());
		customer.setPagoCxC(textRegisterPay.getText().trim());
		customer.setGender(String.valueOf(comboRegisterGender.getSelectedItem()));
		customer.setDate(calendarRegister.getDayChooser().getDay() + "/" 
					+ (Integer.valueOf(calendarRegister.getMonthChooser().getMonth())+1) +"/"
					+calendarRegister.getYearChooser().getYear());
		
		if(panelController.validateFields(customer)){
			returns = panelController.registUser(customer);
		}else{
			returns="mas_datos";
		}
			
		if(returns.equals("ok")){
			JOptionPane.showMessageDialog(null, "Usuario registrado con Exito!");
		}else{
			if (returns.equals("error")) {
				JOptionPane.showMessageDialog(null, "Usuario no fue registrado");
			}else{
				JOptionPane.showMessageDialog(null, "Necesitas llenar los compos OBLIGATORIOS (*)", "Advertencia",JOptionPane.WARNING_MESSAGE);
			}	
		}
	}
	
	
}
