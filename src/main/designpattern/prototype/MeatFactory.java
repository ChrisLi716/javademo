package designpattern.prototype;

public class MeatFactory implements AbstractFactory {
	@Override
	public Product produce() {
		return new Meat();
	}
}
