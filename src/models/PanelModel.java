package models;

public class PanelModel {

	public boolean validateFields(Customer customer) {
		
		boolean validateName = false;
		boolean validateDocument = false;
		boolean validateCel = false;
		
		String document = customer.getDocument();
		String name = customer.getName();
		String cel = customer.getCel();
		
		if(document != null && !document.equals("") ){
			validateDocument = true;
		}
		
		if(name != null && !name.equals("")){
			validateName = true;
		}
		
		if(cel != null && !cel.equals("")){
			validateCel = true;
		}
		
		if(validateName && validateDocument && validateCel){
			return true;
		}else{
			return false;
		}
	}

	public boolean validateStockFields(Product product) {

		boolean validateStockRef = false;
		boolean validateStockCant = false;
		boolean validateStockCostPrice = false;
		
		String ref = product.getCodRef();
		String count = String.valueOf(product.getCount()) ;
		String costPrice = product.getCostPrice();
		
		if(ref != null && !ref.equals("")){
			validateStockRef = true;
		}
		if(count != null && !ref.equals("")){
			validateStockCant =  true;
		}
		if(costPrice != null && !costPrice.equals("")){
			validateStockCostPrice = true;
		}
		
		if(validateStockRef && validateStockCant && validateStockCostPrice){
			return true;
		}else{
			return false;
		}
	}


}
