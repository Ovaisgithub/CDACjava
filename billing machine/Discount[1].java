public class Discount extends Product {
	    Discount(String productName, Float price) {
			super(productName, price);
		}

		float discountRate=0.10f;

	    void calculateFinalPrice (Discount d[]) {
	    	Float finalprice=0.0f;

	    	for(int i=1;i<=3;i++) {
	        finalprice=finalprice+d[i].price;
	    	}
	        
	        if ( finalprice>=3000) {
	        	 finalprice=finalprice-(finalprice*discountRate);
	            System.out.println("your Final price after 10% discount is:" +finalprice);
	        } else {
	        	
	            System.out.println("your Final price after no discount is:" +finalprice);
	        }
	    }
}
