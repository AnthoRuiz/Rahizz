package controllers;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.Customer;
import models.CustomerDAO;
import models.Diagnostic;
import models.DiagnosticDAO;
import models.Employe;
import models.PanelModel;
import models.Product;
import models.ProductDAO;
import views.LoginView;
import views.PanelView;
import views.ConsultStock;

public class PanelController {

	CustomerDAO customerDao = new CustomerDAO();
	PanelModel panelModel = new PanelModel();
	DiagnosticDAO diagnosticDao = new DiagnosticDAO();
	

	public void getPanel(Employe employeLogin) {
		PanelView panelView = new PanelView();
		panelView.setTitle(employeLogin.getName() + " - " +  employeLogin.getRole().toUpperCase());
		panelView.setVisible(true);
		
	}

	public void changeUser() {
		LoginView loginView = new LoginView();
		loginView.setVisible(true);
		
	}


	public boolean validateFields(Customer customer) {
		return panelModel.validateFields(customer);
	}

	public String registUser(Customer customer) {
		return customerDao.registUser(customer);
	}

	public String addDiagnostic(Diagnostic diagnostic, String customerDocument) {
		return DiagnosticDAO.addDiagnostic(diagnostic, customerDocument);
	}

	public boolean validateStockFields(Product product) {
		return panelModel.validateStockFields(product);
	}

	public String registProduct(Product product) {
		return ProductDAO.registProduct(product);
	}

	public void getConsultStock() {
		PanelView panelView = new PanelView();
		ConsultStock consultStock  = new ConsultStock(panelView, true);
		consultStock.setLocationRelativeTo(panelView);
		consultStock.setVisible(true);
		
		
	}

	public void findProduct(String text, DefaultTableModel modelTableStock, JTable tableConsStock) {
		ProductDAO.findProduct(text, modelTableStock, tableConsStock);
		
	}

	public void loadTabbleStock(DefaultTableModel modelTableStock) {
		ProductDAO.loadTabbleStock(modelTableStock);
		
	}

}
