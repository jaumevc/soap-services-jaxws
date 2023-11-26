package com.soap.ws;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.soap.ws.Calculadora")
public class CalculadoraImpl implements Calculadora {

	@Override
	public double operacio(int op, int valor1, int valor2) {
		double result = 0;

		switch (op) {
		case 1:
			result = valor1 + valor2;
			break;
		case 2:
			result = valor1 - valor2;
			break;
		case 3:
			result = valor1 * valor2;
			break;
		case 4:
			result = valor1 / valor2;
			break;
		default:
			break;
		}
		return result;
	}

}
