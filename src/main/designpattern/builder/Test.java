package designpattern.builder;

public class Test {
	public static void main(String[] args) {
		Product product = new Product.Builder().id(111).name("bottle").type("middle").price(123).build();
		System.out.println(product.toString());

	}
}
