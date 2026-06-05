package student;

public class Product {
	int productId;
	String productName;
	static int  totalProducts;
	Product()
	{
		totalProducts++;
	}
	void display(Product product1,Product product2)
	{
		System.out.println("---------------------------------------");
		System.out.println("Product1 details");
		System.out.println("productId: "+product1.productId);
		System.out.println("productName: "+product1.productName);
		System.out.println("---------------------------------------");
		System.out.println("Product2 details");
		System.out.println("productId: "+product2.productId);
		System.out.println("productName: "+product2.productName);
		System.out.println("---------------------------------------");
		System.out.println("Total number of Products: "+totalProducts);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product();
		Product product2 = new Product();
		product1.productId = 123456;
		product1.productName = "Phone";
		product2.productId = 987654;
		product2.productName = "Books";
		product1.display(product1,product2);
		
	}

}
