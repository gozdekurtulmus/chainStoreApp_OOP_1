package chainStoreApp;

public class Transaction {
	private double purchasePrice;
	private double salePrice;
	private double numberOfSales;
	
	public Transaction(String[] identity, int month) {
		int monthCount = month*3;
		this.purchasePrice = Double.parseDouble(identity[monthCount+1]);
		this.salePrice = Double.parseDouble(identity[monthCount+2]);
		this.numberOfSales = Double.parseDouble(identity[monthCount+3]);		
	}
	
	public double getPurchasePrice() {
		return this.purchasePrice;
	}
	
	public double getSalePrice() {
		return this.salePrice;
	}
	
	public double getNumberOfSales() {
		return this.numberOfSales;
	}

	public void setPurchasePrice(double purchasePrice) { this.purchasePrice = purchasePrice; }

	public void setSalePrice(double salePrice) { this.salePrice = salePrice; }

	public void setNumberOfSales(double numberOfSales) { this.numberOfSales = numberOfSales; }
}
