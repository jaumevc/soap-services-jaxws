package com.soap;

import javax.xml.ws.Endpoint;

import com.soap.api.CalculadoraImpl;
//java 1.8, 11 i 17
public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1515/soap/Calculadora", new CalculadoraImpl());
	}

}
