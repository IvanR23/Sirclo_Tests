import java.util.Scanner;

public class ShoppingMain {

	public static void Menu(){
		Cart keranjang = new Cart();
		Scanner input = new Scanner(System.in);
		int option = 0;
		
		while(option != 4)
		{
			System.out.println("Pilihan:");
			System.out.println("1 -> Tambah Produk");
			System.out.println("2 -> Hapus Produk");
			System.out.println("3 -> Tampilkan Cart");
			System.out.println("4 -> Exit");
			System.out.println("Ketik antara 1 - 4: ");
			option = input.nextInt();
			
			if(option == 1){
				System.out.println("Tambah Produk---------");
				System.out.println("Tulis nama produk:");
				input.nextLine();
				String name = input.nextLine();
				System.out.println("Tulis jumlah produk:");
				int qty = input.nextInt();
				input.nextLine();
				keranjang.tambahProduk(name, qty);
			}
			else if(option == 2){
				System.out.println("Hapus Produk----------");
				System.out.println("Tulis nama produk:");
				input.nextLine();
				String name = input.nextLine();
				keranjang.hapusProduk(name);
			}
			else if (option == 3){
				System.out.println("Tampilkan Cart--------");
				keranjang.tampilkanCart();
			}
			else if (option == 4){
				System.out.println("Terima Kasih :)");
			}
			else{
				System.out.println("Mohon input antara 1 to 4");
			}
		}
		input.close();
	}
	
	public static void main(String[] args) {
		Menu();
	}

}
