import java.util.Scanner;

public class Product {
    int productId;
    String productName;
    float price;
    int quantity;

    Product(int productId, String productName, float price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void totalBill(Product[] p, int n) {
        float grandTotal = 0.0f;

        for (int i = 0; i < n; i++) {
            float total = p[i].price * p[i].quantity;
            System.out.println("Total for product " + p[i].productName + " is: " + total);
            grandTotal += total;
        }

        System.out.println("Grand Total: " + grandTotal);
    }

    public static void main(String[] args) {
        Product[] p = new Product[50];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of products:");
        int n = sc.nextInt();

        System.out.println("Enter details of products (ID Name Price Quantity):");
        for (int i = 0; i < n; i++) {
            p[i] = new Product(sc.nextInt(), sc.next(), sc.nextFloat(), sc.nextInt());
        }

        totalBill(p, n);

        sc.close();
    }
}