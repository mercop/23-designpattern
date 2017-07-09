package com.marving.dp.factory;

public class ConcreteCreator implements Creator{

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T factory(Class<T> c) {
		Product product = null;
		try {
			product = (Product)Class.forName(c.getName()).newInstance();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T) product;
	}

}
