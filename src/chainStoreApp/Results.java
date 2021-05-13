package chainStoreApp;

public class Results {

	public Results() {}
	
	public void printResults() {
		
		StoreQuery storeQuery = new StoreQuery();

		String[] profitableItems =  storeQuery.ProfitableItem();
		String[] profitableCategories = storeQuery.ProfitableCategory();

		System.out.println("Most profitable item for the whole year: " + profitableItems[0]);
		System.out.println("Most profitable category for the whole year: " + profitableCategories[0]);
		System.out.println("Least profitable item for the whole year: " + profitableItems[1]);
		System.out.println("Least profitable category for the whole year: " + profitableCategories[1]);
		System.out.println("Most profitable item for a single sale: " + profitableItems[2]);
		System.out.println("Best-selling item for the whole year: " + profitableItems[3] + "\n");

		printStoreEachMont(storeQuery.profitableStore());
	}
	
	public void printStoreEachMont(int[] storeList) {
		for(int i=0 ; i<storeList.length; i++) {			
			System.out.println("Most profitable store at month "+ (i+1) + ": " + (storeList[i]+1));	
		}	
	}
	
}
