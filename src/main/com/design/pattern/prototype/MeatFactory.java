package com.design.pattern.prototype;

public class MeatFactory implements AbstractFactory {
	@Override
	public Product produce() {
		return new Meat();
	}
}
