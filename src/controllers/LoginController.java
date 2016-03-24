package controllers;


import models.Employe;
import models.EmployeDAO;
import views.LoginView;

public class LoginController {

	
	EmployeDAO employeLogin = new EmployeDAO();
	
	
	public void startSystem(){
		LoginView loginView = new LoginView();
		loginView.setVisible(true);
	}

	public Employe login(String pass, String document) {
		
		return (employeLogin.roleLogin(pass, document));
		
	}
	
}