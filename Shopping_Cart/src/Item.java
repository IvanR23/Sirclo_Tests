
public class Item {
	private String name;
	private int qty;
	
	public Item(String name, int qty){
		this.name = name;
		this.qty = qty;
	}
	
	public void addItem(int newQty){
		qty += newQty;
	}
	
	public String getName(){
		return name;
	}
	
	public int getQty(){
		return qty;
	}
}
