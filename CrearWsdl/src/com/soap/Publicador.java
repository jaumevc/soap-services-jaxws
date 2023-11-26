package com.soap;

import jakarta.xml.ws.*;

import com.soap.ws.CalculadoraImpl;

public class Publicador {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1515/ws/Calculadora", new CalculadoraImpl());
	}

}
