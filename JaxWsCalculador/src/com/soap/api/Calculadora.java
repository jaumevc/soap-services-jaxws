package com.soap.api;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Calculadora {
	@WebMethod
	public double operacio(int op, int valor1, int valor2);

}
