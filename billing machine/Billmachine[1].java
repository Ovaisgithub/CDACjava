import java.util.Scanner;

public class Billmachine {
	
	
	
	
	public static void main(String[] args) {
		int i=0;
		Scanner sc=new Scanner(System.in);
		Discount[] d=new Discount[15];
		
		for(i=1;i<=3;i++) {
		System.out.println("enter product name and price:");
		d[i]=new Discount(sc.next(),sc.nextFloat());
		d[i].showProduct();
		}
		d[1].calculateFinalPrice(d);
		
		sc.close();
	}
}
