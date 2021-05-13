package chainStoreApp;

public class ItemTransaction {
	private Item item;
	private Transaction[][] transaction;

	public ItemTransaction(String[] itemList) {
		this.item = new Item(itemList);
		transaction = fillInformation();
	}
	
	private Transaction[][] fillInformation(){
		FileIO readList = new FileIO();
		Transaction[][] returnArray = new Transaction[4][12];
		String storeInformation = "HW1_Transactions_Store";
		for(int i=0; i<4; i++) {
			String searchFile = storeInformation + (i+1) + ".csv";
			String[][] intoMonths = readList.readToArray(searchFile);
			for(int j=0 ; j<12; j++) {
				returnArray[i][j] = new Transaction(intoMonths[Integer.parseInt(item.getId())-1], j);
			}
		}
		return returnArray;
	}

	public void setTransaction(Transaction[][] transaction) { this.transaction = transaction; }
	public Transaction[][] getTransaction(){
		return this.transaction;
	} 
	
	public Item getItem() {
		return this.item;
	}
	public void setItem (Item item ) { this.item = item; }
	
	
}
