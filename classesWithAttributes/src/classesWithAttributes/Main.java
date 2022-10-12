package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(1,"Laptop","Asus Laptop",12432,5,"siyah","l1");
		//product.setName("Laptop");
		//product.setId(1);
		//product.setDescription("Asus Laptop");
		//product.setPrice(12500);
		//product.setStockAmonut(5);
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);

	}

}
