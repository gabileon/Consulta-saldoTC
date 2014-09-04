package cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos;

public class ConsultarSaldosProxy implements cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldos_PortType {
  private String _endpoint = null;
  private cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldos_PortType consultarSaldos_PortType = null;
  
  public ConsultarSaldosProxy() {
    _initConsultarSaldosProxy();
  }
  
  public ConsultarSaldosProxy(String endpoint) {
    _endpoint = endpoint;
    _initConsultarSaldosProxy();
  }
  
  private void _initConsultarSaldosProxy() {
    try {
      consultarSaldos_PortType = (new cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldos_ServiceLocator()).getConsultarSaldosSOAP();
      if (consultarSaldos_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)consultarSaldos_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)consultarSaldos_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (consultarSaldos_PortType != null)
      ((javax.xml.rpc.Stub)consultarSaldos_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldos_PortType getConsultarSaldos_PortType() {
    if (consultarSaldos_PortType == null)
      _initConsultarSaldosProxy();
    return consultarSaldos_PortType;
  }
  
  public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldosResponse consultarSaldos(cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos.ConsultarSaldosRequest parameters) throws java.rmi.RemoteException{
    if (consultarSaldos_PortType == null)
      _initConsultarSaldosProxy();
    return consultarSaldos_PortType.consultarSaldos(parameters);
  }
  
  
}