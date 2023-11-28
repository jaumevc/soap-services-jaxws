package com.soap.ws;

public class CalculadoraProxy implements com.soap.ws.Calculadora {
  private String _endpoint = null;
  private com.soap.ws.Calculadora calculadora = null;
  
  public CalculadoraProxy() {
    _initCalculadoraProxy();
  }
  
  public CalculadoraProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculadoraProxy();
  }
  
  private void _initCalculadoraProxy() {
    try {
      calculadora = (new com.soap.ws.CalculadoraImplServiceLocator()).getCalculadoraImplPort();
      if (calculadora != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculadora)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculadora)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculadora != null)
      ((javax.xml.rpc.Stub)calculadora)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.soap.ws.Calculadora getCalculadora() {
    if (calculadora == null)
      _initCalculadoraProxy();
    return calculadora;
  }
  
  public double operacio(int arg0, int arg1, int arg2) throws java.rmi.RemoteException{
    if (calculadora == null)
      _initCalculadoraProxy();
    return calculadora.operacio(arg0, arg1, arg2);
  }
  
  
}