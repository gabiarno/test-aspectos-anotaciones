package com.privalia.aspectos.anotaciones;

public class Comprar implements Compra {

	@Override
	public void compra(Boolean error) throws Exception {

		if (error) {
			throw new Exception("Algo ha ido mal...");

		}
		System.out.println("Realizando compra....");

	}

}
