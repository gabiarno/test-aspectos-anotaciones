package com.privalia.aspectos.anotaciones;

import org.springframework.stereotype.Component;

@Component(value = "compra")
public interface Compra {

	public void compra(Boolean error) throws Exception;

}
