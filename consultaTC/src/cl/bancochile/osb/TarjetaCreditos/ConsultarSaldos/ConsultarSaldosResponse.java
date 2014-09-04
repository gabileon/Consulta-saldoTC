/**
 * ConsultarSaldosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.bancochile.osb.TarjetaCreditos.ConsultarSaldos;

public class ConsultarSaldosResponse  implements java.io.Serializable {
    private cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.RespConsultarSaldosType respConsultarSaldos;

    public ConsultarSaldosResponse() {
    }

    public ConsultarSaldosResponse(
           cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.RespConsultarSaldosType respConsultarSaldos) {
           this.respConsultarSaldos = respConsultarSaldos;
    }


    /**
     * Gets the respConsultarSaldos value for this ConsultarSaldosResponse.
     * 
     * @return respConsultarSaldos
     */
    public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.RespConsultarSaldosType getRespConsultarSaldos() {
        return respConsultarSaldos;
    }


    /**
     * Sets the respConsultarSaldos value for this ConsultarSaldosResponse.
     * 
     * @param respConsultarSaldos
     */
    public void setRespConsultarSaldos(cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.RespConsultarSaldosType respConsultarSaldos) {
        this.respConsultarSaldos = respConsultarSaldos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarSaldosResponse)) return false;
        ConsultarSaldosResponse other = (ConsultarSaldosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.respConsultarSaldos==null && other.getRespConsultarSaldos()==null) || 
             (this.respConsultarSaldos!=null &&
              this.respConsultarSaldos.equals(other.getRespConsultarSaldos())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRespConsultarSaldos() != null) {
            _hashCode += getRespConsultarSaldos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarSaldosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldos/", ">ConsultarSaldosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respConsultarSaldos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respConsultarSaldos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "respConsultarSaldosType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
