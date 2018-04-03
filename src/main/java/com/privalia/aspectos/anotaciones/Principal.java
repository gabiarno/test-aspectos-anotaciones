package com.privalia.aspectos.anotaciones;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		annotationContext.scan("com.privalia.aspectos.anotaciones");
		annotationContext.refresh();

		Compra cp = (Compra) annotationContext.getBean("compra");

		try {
			System.out.println("Comprando...");

			// cp.compra(false);
			cp.compra(true);
		} catch (Exception e) {
			System.out.println("Obtenemos la exception: " + e);
		}

		annotationContext.close();

	}

}
