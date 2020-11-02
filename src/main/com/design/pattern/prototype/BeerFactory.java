package com.design.pattern.prototype;

public class BeerFactory implements AbstractFactory {

	@Override
	public Product produce() {
		return new Beer();
	}
}
