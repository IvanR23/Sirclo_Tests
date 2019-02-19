import java.util.ArrayList;

public class Cart {
	private ArrayList<Item> shoppingCart; 
	
	public Cart(){
		shoppingCart = new ArrayList<Item>();
	}
	
	public void tambahProduk(String name, int qty){
		if(shoppingCart.size()>0)
		{
			boolean found = false;
			for(int i=0; i<shoppingCart.size(); i++){
				//If already exists
				if(shoppingCart.get(i).getName().equalsIgnoreCase(name)){
					System.out.println("Menambah jumlah produk...");
					//Add it
					found = true;
					shoppingCart.get(i).addItem(qty);
				}
			}
			
			//If the product is new
			if(!found){
				//Create a new item
				System.out.println("Menambah produk baru...");
				Item newItem = new Item(name,qty);
				shoppingCart.add(newItem);
			}
		}
		//If the cart still empty
		else
		{
			//Create a new item
			System.out.println("Menambah produk baru (0)...");
			Item newItem = new Item(name,qty);
			shoppingCart.add(newItem);
		}
	}
	
	public void hapusProduk(String name){
		for(int i=0; i<shoppingCart.size(); i++){
			if(shoppingCart.get(i).getName().equalsIgnoreCase(name)){
				shoppingCart.remove(i);
			}
		}
	}
	
	public void tampilkanCart(){
		System.out.println("Shopping Cart: ");
		for(int i=0; i<shoppingCart.size(); i++){
			System.out.print("- ");
			System.out.println(shoppingCart.get(i).getName()+" ("
					          +shoppingCart.get(i).getQty()+")");
		}
		System.out.println("");
	}
	
}
