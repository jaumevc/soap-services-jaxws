package com.soap.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.soap.ws.Calculadora;
import com.soap.ws.CalculadoraImplServiceLocator;

public class CalculadoraClient {

	public static void main(String[] args) {
		CalculadoraImplServiceLocator locator = new CalculadoraImplServiceLocator();
		try {
			Calculadora calc = locator.getCalculadoraImplPort();
				System.out.println("Resultat de l\'operacio de tipus 1, SUMA: "+calc.operacio(1, 2, 2));
				System.out.println("Resultat de l\'operacio de tipus 2, RESTA: "+calc.operacio(2, 2, 2));
				System.out.println("Resultat de l\'operacio de tipus 3, PRODUCTE: "+calc.operacio(3, 2, 2));
				System.out.println("Resultat de l\'operacio de tipus 4, DIVISIÓ:  "+calc.operacio(4, 2, 2));
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
