package com.soap.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface Calculadora {
	@WebMethod
	public double operacio(int op, int valor1, int valor2);
}
