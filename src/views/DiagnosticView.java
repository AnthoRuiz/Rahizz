package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.PanelController;
import models.Customer;
import models.Diagnostic;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DiagnosticView extends JDialog implements ActionListener {

	private final JPanel panelRecord = new JPanel();
	private JTextField textStylistName;
	private JTextField textMiddleTone;
	private JTextField textWantedTone;
	private JLabel labelHairStructure;
	private JLabel labelNaturalTone;
	private JLabel labelDescTone;
	private JLabel labelWantedTone;
	private JLabel labelWhiteHair;
	private JTextPane textWhiteHair;
	private JLabel labelTecMixing;
	private JLabel labelTecApp;
	private JTextPane textTecMixing;
	private JTextPane textTecApp;
	private JLabel labelPostPaint;
	private JTextPane textPostPaint;
	private JPanel buttonPane;
	private JButton btnDiagnosticCancel;
	private JButton btnDiagnosticAdd;
	private JComboBox comboBox;
	private PanelController panelController = new PanelController();
	private String documentClient;

	public DiagnosticView(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
        initComponents();
        
        documentClient = PanelView.textRegisterDocument.getText().toString(); 
        setTitle("Rahizz - Diagnostico" + " - " + PanelView.textRegisterName.getText().toString());
        setSize(720,500);
        setLocationRelativeTo(parent);
        setResizable(false);
	}

	private void initComponents() {
		
		setBounds(100, 100, 720, 500);
		getContentPane().setLayout(new BorderLayout());
		panelRecord.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(panelRecord, BorderLayout.CENTER);
		panelRecord.setLayout(null);
		{
			JLabel labelStylistName = new JLabel("Nombre del Estilista");
			labelStylistName.setBounds(10, 43, 153, 22);
			labelStylistName.setHorizontalAlignment(SwingConstants.CENTER);
			labelStylistName.setFont(new Font("Calibri", Font.BOLD, 18));
			panelRecord.add(labelStylistName);
		}
		
		textStylistName = new JTextField();
		textStylistName.setHorizontalAlignment(SwingConstants.CENTER);
		textStylistName.setFont(new Font("Calibri", Font.PLAIN, 17));
		textStylistName.setColumns(10);
		textStylistName.setBounds(173, 38, 222, 32);
		panelRecord.add(textStylistName);
		
		labelHairStructure = new JLabel("Estructura del Cabello");
		labelHairStructure.setHorizontalAlignment(SwingConstants.CENTER);
		labelHairStructure.setFont(new Font("Calibri", Font.BOLD, 17));
		labelHairStructure.setBounds(10, 113, 163, 22);
		panelRecord.add(labelHairStructure);
		
		labelNaturalTone = new JLabel("Tono Natural");
		labelNaturalTone.setHorizontalAlignment(SwingConstants.CENTER);
		labelNaturalTone.setFont(new Font("Calibri", Font.BOLD, 20));
		labelNaturalTone.setBounds(10, 234, 153, 22);
		panelRecord.add(labelNaturalTone);
		
		labelDescTone = new JLabel("Descripcion");
		labelDescTone.setHorizontalAlignment(SwingConstants.LEFT);
		labelDescTone.setFont(new Font("Calibri", Font.BOLD, 17));
		labelDescTone.setBounds(10, 267, 87, 22);
		panelRecord.add(labelDescTone);
		
		textMiddleTone = new JTextField();
		textMiddleTone.setHorizontalAlignment(SwingConstants.CENTER);
		textMiddleTone.setFont(new Font("Calibri", Font.PLAIN, 17));
		textMiddleTone.setColumns(10);
		textMiddleTone.setBounds(107, 267, 222, 22);
		panelRecord.add(textMiddleTone);
		
		labelWantedTone = new JLabel("Tono Deseado por el Cliente");
		labelWantedTone.setHorizontalAlignment(SwingConstants.CENTER);
		labelWantedTone.setFont(new Font("Calibri", Font.BOLD, 20));
		labelWantedTone.setBounds(10, 315, 259, 22);
		panelRecord.add(labelWantedTone);
		
		textWantedTone = new JTextField();
		textWantedTone.setHorizontalAlignment(SwingConstants.CENTER);
		textWantedTone.setFont(new Font("Calibri", Font.PLAIN, 17));
		textWantedTone.setColumns(10);
		textWantedTone.setBounds(36, 348, 222, 32);
		panelRecord.add(textWantedTone);
		
		labelWhiteHair = new JLabel("Canas");
		labelWhiteHair.setHorizontalAlignment(SwingConstants.CENTER);
		labelWhiteHair.setFont(new Font("Calibri", Font.BOLD, 17));
		labelWhiteHair.setBounds(234, 113, 66, 22);
		panelRecord.add(labelWhiteHair);
		
		textWhiteHair = new JTextPane();
		textWhiteHair.setToolTipText("Frente, Nuca, Etc");
		textWhiteHair.setFont(new Font("Calibri", Font.PLAIN, 12));
		textWhiteHair.setBounds(215, 142, 144, 84);
		panelRecord.add(textWhiteHair);
		
		labelTecMixing = new JLabel("Tecnica de Mezcla");
		labelTecMixing.setHorizontalAlignment(SwingConstants.CENTER);
		labelTecMixing.setFont(new Font("Calibri", Font.BOLD, 20));
		labelTecMixing.setBounds(482, 38, 171, 22);
		panelRecord.add(labelTecMixing);
		
		labelTecApp = new JLabel("Tecnica de Aplicacion");
		labelTecApp.setHorizontalAlignment(SwingConstants.CENTER);
		labelTecApp.setFont(new Font("Calibri", Font.BOLD, 20));
		labelTecApp.setBounds(449, 181, 213, 22);
		panelRecord.add(labelTecApp);
		
		textTecMixing = new JTextPane();
		textTecMixing.setToolTipText("Define la Tecnica de Mezclado");
		textTecMixing.setFont(new Font("Calibri", Font.PLAIN, 12));
		textTecMixing.setBounds(482, 71, 180, 84);
		panelRecord.add(textTecMixing);
		
		textTecApp = new JTextPane();
		textTecApp.setToolTipText("Define la Tecnica de Aplicacion");
		textTecApp.setFont(new Font("Calibri", Font.PLAIN, 12));
		textTecApp.setBounds(482, 214, 180, 84);
		panelRecord.add(textTecApp);
		
		labelPostPaint = new JLabel("Tratamiento Post Coloracion");
		labelPostPaint.setHorizontalAlignment(SwingConstants.CENTER);
		labelPostPaint.setFont(new Font("Calibri", Font.BOLD, 20));
		labelPostPaint.setBounds(412, 315, 250, 22);
		panelRecord.add(labelPostPaint);
		
		textPostPaint = new JTextPane();
		textPostPaint.setToolTipText("Define el Tratamiento Post Coloracion");
		textPostPaint.setFont(new Font("Calibri", Font.PLAIN, 12));
		textPostPaint.setBounds(440, 348, 222, 64);
		panelRecord.add(textPostPaint);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Natural", "Grueso", "Mediano", "Ligero", "Tenido"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(44, 155, 87, 32);
		panelRecord.add(comboBox);
		{
			buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnDiagnosticCancel = new JButton("Cancel");
				buttonPane.add(btnDiagnosticCancel);
				btnDiagnosticCancel.setActionCommand("Cancel");
				btnDiagnosticCancel.addActionListener(new java.awt.event.ActionListener() {
		            
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		            	btnDiagnosticCancelActionPerformed(evt);
		                }
		            });
			}
			{
				btnDiagnosticAdd = new JButton("Aceptar");
				buttonPane.add(btnDiagnosticAdd);
				btnDiagnosticAdd.setActionCommand("OK");
				getRootPane().setDefaultButton(btnDiagnosticAdd);
				
				btnDiagnosticAdd.addActionListener(new java.awt.event.ActionListener() { 
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		            	btnDiagnosticAddActionPerformed(evt);
		                }
		            });
			}
		}
		
	}

	protected void btnDiagnosticAddActionPerformed(ActionEvent evt) {

		addDiagnostic();
		
	}
    
	private void addDiagnostic() {
		
		
		Diagnostic diagnostic = new Diagnostic();
		String returns = "";
		
		diagnostic.setStylistName(textStylistName.getText().trim());
		diagnostic.setTecMixing(textTecMixing.getText().trim());
		diagnostic.setHairStructure(comboBox.getSelectedItem().toString());
		diagnostic.setWhiteHair(textWhiteHair.getText().trim());
		diagnostic.setNaturalTone(textMiddleTone.getText().trim());
		diagnostic.setWantedTone(textWantedTone.getText().trim());
		diagnostic.setTecApp(textTecApp.getText().trim());
		diagnostic.setPostPaint(textPostPaint.getText().trim());
		
		returns = panelController.addDiagnostic(diagnostic, documentClient);
		
		if(returns.equals("ok")){
			clearDiagnostic();
			dispose();
			JOptionPane.showMessageDialog(null, "Diagnostico registrado con Exito!");
		}else{
			if (returns.equals("error")) {
				JOptionPane.showMessageDialog(null, "Diagnostico no fue registrado");
			}
		}
	}

	private void clearDiagnostic() {
		textStylistName.setText("");
		textTecMixing.setText("");
		textWantedTone.setText("");
		textMiddleTone.setText("");
		textWhiteHair.setText("");
		textTecApp.setText("");
		textPostPaint.setText("");
	}

	protected void btnDiagnosticCancelActionPerformed(ActionEvent evt) {
		dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
