package com.design.pattern.factory;

// Factory Method Pattern allows the sub-classes to choose the type of objects to create.

//Interface for the product
interface Product {
	void display();
}

//Concrete implementation of Product
class ConcreteProduct implements Product {
	@Override
	public void display() {
		System.out.println("Inside ConcreteProduct::display() method.");
	}
}

//Factory class to create and return Product objects
class ProductFactory {
	// Factory method to create Product objects based on a parameter
	public static Product createProduct() {
		return new ConcreteProduct(); // In a real scenario, logic could be added here to determine which Product
										// subclass to instantiate
	}
}

//Main class to demonstrate the Factory Design Pattern
public class FactoryPatternExample {
	public static void main(String[] args) {
		// Use the factory to get an object of ConcreteProduct class
		Product product = ProductFactory.createProduct();

		// Call display method of ConcreteProduct
		product.display();
	}
}
