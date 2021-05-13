package chainStoreApp;

public class AnnualSale {

	private ItemTransaction[] itemTransaction;
	
	public AnnualSale(String givenFile) {
		itemTransaction = new ItemTransaction[32];
		fillItemTransaction(givenFile);
	}

	private void fillItemTransaction(String givenFile) {
		FileIO read = new FileIO();
		String[][] itemList = read.readToArray(givenFile);
		for(int i=0; i< itemTransaction.length; i++) {
			this.itemTransaction[i] = new ItemTransaction(itemList[i]);
		}
	}
	
	public ItemTransaction[] getItemTransaction() {	return this.itemTransaction;}
	
	public void setItemTransaction(ItemTransaction[] itemTransaction) {this.itemTransaction = itemTransaction; }
}
