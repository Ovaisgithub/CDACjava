class Product {
	    String productName;
	    Float price;
	    
	    Product(String productName,Float price){
	    	this.productName=productName;
		    this.price=price;
	    	
	    }
	    

	    void showProduct() {
	        System.out.println("Product Name: " + productName);
	        System.out.println("Original Price: " + price);
	    }
	

}
