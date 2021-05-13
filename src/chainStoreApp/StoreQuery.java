package chainStoreApp;

public class StoreQuery {
	private ItemTransaction[] itemTransaction ;
	
	public StoreQuery() {
		AnnualSale annualSale = new AnnualSale("HW1_Items.csv");
		itemTransaction = annualSale.getItemTransaction();
	}
	
	public String[] ProfitableItem() {
		double mostProfit = 0;
		double leastProfit = 999999999;
		double mostProfitSingleSale=0;
		double bestSelling = 0;

		String mostProfitableItem = "";
		String leastProfitableItem = "";
		String mostProfitSingleSaleItem = "";
		String bestSellingItem ="";

		for(ItemTransaction element: itemTransaction) {
			double tempProfit=0;
			double tempProfitSingleSale=0;
			double tempBestSelling = 0;
			Transaction[][] transaction = element.getTransaction();

			for(int i=0; i<4; i++) {
				for(int j=0; j<12; j++) {
					Transaction monthTrans = transaction[i][j];
					tempProfit += calculateProfit(monthTrans);
					tempProfitSingleSale = calculateProfitSingleSale(monthTrans);
					tempBestSelling += monthTrans.getNumberOfSales();
				}
			}
				
			String itemName = element.getItem().getName();
			if(tempProfit > mostProfit) {
				mostProfit = tempProfit;
				mostProfitableItem = itemName;
			}
			
			if(tempProfit < leastProfit) {
				leastProfit = tempProfit;
				leastProfitableItem = itemName;
			}
				
			if(tempProfitSingleSale > mostProfitSingleSale) {
				mostProfitSingleSale = tempProfitSingleSale;
				mostProfitSingleSaleItem = itemName;
			}
				
			if(tempBestSelling > bestSelling) {
				bestSelling = tempBestSelling;
				bestSellingItem = itemName;
			}
		}
		return new String[] {mostProfitableItem, leastProfitableItem, mostProfitSingleSaleItem, bestSellingItem};
	}
	
	
	public String[] ProfitableCategory() {
		
		double mostProfit = 0;
		double leastProfit = 999999999;
		String mostCategory = "";
		String leastCategory = "";

			for(int i=0; i<5; i++) {
				String category = "";
				double tempProfit=0;
				for (ItemTransaction element: itemTransaction) {
					Transaction[][] transaction = element.getTransaction();
					
					for(int j=0; j<4; j++) {
						for(int k=0; k<12; k++) {
							
							if(element.getItem().getCategoryNumb() == i) {
								Transaction monthTrans = transaction[j][k];
								tempProfit += calculateProfit(monthTrans);
								category = element.getItem().getCategory();
							}
						}
					}
				}

				if(tempProfit > mostProfit) {
					mostProfit = tempProfit;
					mostCategory = category;
				}

				if(tempProfit < leastProfit) {
					leastProfit = tempProfit;
					leastCategory = category;
				}
		}
		return new String[] {mostCategory, leastCategory};
	}
	
	public int[] profitableStore() {
		int[] storeList = new int[12];

		for(int j=0; j<12; j++) {
			double mostProfit = 0;
			int mostProfitStore = -1;

			for(int i=0; i<4; i++) {
				int tempProfit = 0;

				for(ItemTransaction element: itemTransaction) {
					Transaction[][] transaction = element.getTransaction();
					Transaction monthTrans = transaction[i][j];
					tempProfit += calculateProfit(monthTrans);
				}

				if(tempProfit > mostProfit) {
					mostProfit= tempProfit;
					mostProfitStore = i;		
				}
			}
			storeList[j] = mostProfitStore;		
		}
		return storeList;
	}
	
	private double calculateProfit(Transaction monthTrans) {
		return (monthTrans.getSalePrice() - monthTrans.getPurchasePrice()) * monthTrans.getNumberOfSales();
		
	}
	
	private double calculateProfitSingleSale(Transaction monthTrans) {
		return (monthTrans.getSalePrice() - monthTrans.getPurchasePrice());
	}

}
