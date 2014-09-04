/**
 * ConsultarSaldos_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos;

public class ConsultarSaldos_ServiceLocator extends org.apache.axis.client.Service implements cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldos_Service {

    public ConsultarSaldos_ServiceLocator() {
    }


    public ConsultarSaldos_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConsultarSaldos_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConsultarSaldosSOAP
    private java.lang.String ConsultarSaldosSOAP_address = "http://200.14.147.135:8011/TarjetaCreditos/CS000345_ConsultarSaldos";

    public java.lang.String getConsultarSaldosSOAPAddress() {
        return ConsultarSaldosSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConsultarSaldosSOAPWSDDServiceName = "ConsultarSaldosSOAP";

    public java.lang.String getConsultarSaldosSOAPWSDDServiceName() {
        return ConsultarSaldosSOAPWSDDServiceName;
    }

    public void setConsultarSaldosSOAPWSDDServiceName(java.lang.String name) {
        ConsultarSaldosSOAPWSDDServiceName = name;
    }

    public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldos_PortType getConsultarSaldosSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConsultarSaldosSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConsultarSaldosSOAP(endpoint);
    }

    public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldos_PortType getConsultarSaldosSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldosSOAPStub _stub = new cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldosSOAPStub(portAddress, this);
            _stub.setPortName(getConsultarSaldosSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConsultarSaldosSOAPEndpointAddress(java.lang.String address) {
        ConsultarSaldosSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldos_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldosSOAPStub _stub = new cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldosSOAPStub(new java.net.URL(ConsultarSaldosSOAP_address), this);
                _stub.setPortName(getConsultarSaldosSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ConsultarSaldosSOAP".equals(inputPortName)) {
            return getConsultarSaldosSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldos/", "ConsultarSaldos");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldos/", "ConsultarSaldosSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConsultarSaldosSOAP".equals(portName)) {
            setConsultarSaldosSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
