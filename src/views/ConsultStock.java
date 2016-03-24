package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controllers.PanelController;
import models.ProductDAO;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ConsultStock extends JDialog {

	private final JPanel contentPanel = new JPanel();
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelConStock;
    private javax.swing.JTable tableConsStock;
    private javax.swing.JTextField textConStock;
	private PanelController panelController = new PanelController();
	private DefaultTableModel modelTableStock = new DefaultTableModel();
	private String[] row;

	public ConsultStock(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
        setTitle("Rahizz - Inventario");
        setSize(720,500);
        setResizable(false);
		
	}
                      
	    private void initComponents() {

	        labelConStock = new javax.swing.JLabel();
	        textConStock = new javax.swing.JTextField();
	        textConStock.addKeyListener(new java.awt.event.KeyAdapter() {
	        	public void keyReleased(KeyEvent e) {
	        		textConStockKeyRelease();       		
	        	}
	        });
	        jScrollPane1 = new javax.swing.JScrollPane();
	        tableConsStock = new javax.swing.JTable();

	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

	        labelConStock.setFont(new Font("Calibri", Font.BOLD, 18)); // NOI18N
	        labelConStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        labelConStock.setText("Buscar por Referencia");

	        textConStock.setFont(new java.awt.Font("Calibri", 0, 14));

	       tableConsStock.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
	       tableConsStock.setModel(modelTableStock);

	       modelTableStock.addColumn("Referencia");
	       modelTableStock.addColumn("Descripcion");
	       modelTableStock.addColumn("Precio de Costo");
	       modelTableStock.addColumn("Precio de Venta");
	       modelTableStock.addColumn("Fecha de Compra");
	       modelTableStock.addColumn("Cantidad");
	       
	       panelController.loadTabbleStock(modelTableStock);
	       
	       

	       jScrollPane1.setViewportView(tableConsStock);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        layout.setHorizontalGroup(
	        	layout.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addContainerGap(99, Short.MAX_VALUE)
	        			.addComponent(labelConStock, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
	        			.addGap(53)
	        			.addComponent(textConStock, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
	        			.addGap(217))
	        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
	        			.addGap(24)
	        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 669, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(21, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGap(46)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(labelConStock, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(textConStock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(36)
	        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
	        			.addContainerGap())
	        );
	        getContentPane().setLayout(layout);
	    }

	protected void textConStockKeyRelease() {
		String text = textConStock.getText();
		panelController.findProduct(text, modelTableStock, tableConsStock);
		
	}


}
