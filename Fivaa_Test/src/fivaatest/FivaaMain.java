package fivaatest;
import java.util.Scanner;

public class FivaaMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("fivaa(5):");
		fivaa(5);
		System.out.println("");
		System.out.println("Input an integer: ");
		fivaa(input.nextInt());
		input.close();
	}
	
	public static void fivaa(int x){
		int loop = x;
		for(int i=0; i<loop; i++){
			//Printing the first 2 numbers
			for(int j=0; j<2; j++){
				System.out.print(x-1);
			}
			//Printing the rest
			for(int k=0; k<loop-i; k++){
				System.out.print(x+1);
			}
			System.out.println("");
			//Decrement the input
			x--;
		}
	}

}
