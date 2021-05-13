package chainStoreApp;

public class Item {
	private String id;
	private String name;
	private String category;
	
	public Item(String[] itemProperties) {
		this.name = itemProperties[0];
		this.id = itemProperties[1];
		this.category = itemProperties[2];
	}
	
	
	public void setID(String newID) {
		this.id = newID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCategory() {
		return this.category;
	}

	public String getId(){ return this.id; }
	
	public int getCategoryNumb() {
		return switch (category) {
			case "Beverage" -> 0;
			case "Food" -> 1;
			case "Snack" -> 2;
			case "Home" -> 3;
			case "Personal" -> 4;
			default -> -1;
		};
		
	}
}
