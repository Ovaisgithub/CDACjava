package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Library {
	int id;
	String title;
	String author;
	double price;
	int quantity;
	
	
	void create(Connection con,Scanner sc) throws SQLException {
		System.out.println("enter book details:Title,Author,Price,Quantity"); 
		String title = sc.nextLine();
		String author = sc.nextLine();
		double price = sc.nextDouble();
		sc.nextLine(); 
		int quantity = sc.nextInt();
		sc.nextLine(); 

		
		String q="insert into books(title,author,price,quantity) values(?,?,?,?);";
		
		PreparedStatement pmt=con.prepareStatement(q);
        pmt.setString(1, title);
        pmt.setString(2, author);
        pmt.setDouble(3, price);
        pmt.setInt(4, quantity);
        
        int nor=pmt.executeUpdate();
        System.out.println(nor +" book Details Inserted");
        
	}
	
	
	void display(Connection con) throws SQLException {
		
        
		String q="SELECT * FROM books ORDER BY id ASC";
        PreparedStatement selectStmt = con.prepareStatement(q);
        ResultSet rs = selectStmt.executeQuery();
        System.out.println("ID\tTITLE\tAUTHOR\tPRICE\tQUANTITY");
        while(rs.next()) {
        	
       	 System.out.println(rs.getInt(1) +"\t"+ rs.getString(2)+"\t"+ rs.getString(3)+"\t"+ rs.getDouble(4)+"\t"+ rs.getInt(5));
        }
        rs.close();
	}
	
	void displayone(Connection con,Scanner sc) throws SQLException {
			System.out.println("enter book id to display");
			int ch=sc.nextInt();	        
			String q = "SELECT * FROM books WHERE id = ? ORDER BY id ASC";
	        PreparedStatement selectStmt = con.prepareStatement(q);
	        selectStmt.setInt(1, ch);
	        ResultSet rs = selectStmt.executeQuery();
	        System.out.println("ID\tTITLE\tAUTHOR\tPRICE\tQUANTITY");
	        while(rs.next()) {
	        	
	       	 System.out.println(rs.getInt(1) +"\t"+ rs.getString(2)+"\t"+ rs.getString(3)+"\t"+ rs.getDouble(4)+"\t"+ rs.getInt(5));
	        }
	        rs.close();
		}
	
	void update(Connection con,Scanner sc) throws SQLException {
		System.out.println("Enter the book id to update:");
		int ch=sc.nextInt();
		sc.nextLine();
		if(ch>0) {
			System.out.println("enter book details:Title,Author,Price,Quantity"); 
			String title = sc.nextLine();
			String author = sc.nextLine();
			double price = sc.nextDouble();
			sc.nextLine(); 
			int quantity = sc.nextInt();
			sc.nextLine(); 
			String q="UPDATE books SET title = ?, author = ?, price = ?, quantity = ? WHERE id = ?;";
			PreparedStatement pmt=con.prepareStatement(q);
	        
	        pmt.setString(1, title);
	        pmt.setString(2, author);
	        pmt.setDouble(3, price);
	        pmt.setInt(4, quantity);
	        pmt.setInt(5, ch);
	        
	        int nor=pmt.executeUpdate();
	        System.out.println(nor +" book Details updated");
		}
		else {
			System.out.println("wrong book id");
		 }
	}
		void delete(Connection con,Scanner sc) throws SQLException {
			System.out.println("Enter the book id to delete:");
			int ch=sc.nextInt();
			sc.nextLine();
			if(ch>0) {
				String q="DELETE FROM books WHERE id = ?;";
				PreparedStatement pmt=con.prepareStatement(q);
				pmt.setInt(1, ch);
				int nor=pmt.executeUpdate();
				System.out.println(nor +" book id "+ch+" deleted");
				}
			else {
				System.out.println("id not found");
			}
			
	}
		void checkAvailability(Connection con,Scanner sc) throws SQLException {
			System.out.println("enter the book id and required quantity");
			int bid=sc.nextInt();
			int req=sc.nextInt();
			
			String q="SELECT title, quantity FROM books WHERE id = ?";
			PreparedStatement pmt=con.prepareStatement(q);
			pmt.setInt(1,bid);
			ResultSet rs=pmt.executeQuery();
			
			if(rs.next()) {
			 String title=rs.getString("title");
			 int quantity=rs.getInt("quantity");
			 	if(req<=quantity) {
				 System.out.println("book "+title+" has "+quantity+" copies available\n book issued successfully");
				 quantity-=req;
			 	}
			 	else if(quantity<=0){
			 		System.out.println("book "+title+" has 0 copies copies available");
			 	}
			 	else {
					 System.out.println("book "+title+" has less copies than demanded"); 
				 }
			 }
			else {
				System.out.println("book with id "+bid+" not found");
			}
			
		}
	
	

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db","root","12345");
         System.out.println("got connection");
         
         Library lib = new Library();
         
         while (true) {
             System.out.println("\n Library Menu:");
             System.out.println("1. Add New Book");
             System.out.println("2. Display All Books");
             System.out.println("3. Display Book by ID");
             System.out.println("4. Update Book");
             System.out.println("5. Delete Book");
             System.out.println("6. Check Availability");
             System.out.println("7. Exit");
             System.out.print("Enter your choice: ");
             int choice = sc.nextInt();

             switch (choice) {
                 case 1: lib.create(con, sc); break;
                 case 2: lib.display(con); break;
                 case 3: lib.displayone(con, sc); break;
                 case 4: lib.update(con, sc); break;
                 case 5: lib.delete(con, sc); break;
                 case 6: lib.checkAvailability(con, sc); break;
                 case 7:
                     con.close();
                     System.out.println("Exiting... ");
                     return;
                 default:
                     System.out.println(" Invalid choice. Please try again.");
             }
         }


	}	
}