/**
 * RespConsultarSaldosType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse;

public class RespConsultarSaldosType  implements java.io.Serializable {
    private cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.CuerpoType cuerpo;

    public RespConsultarSaldosType() {
    }

    public RespConsultarSaldosType(
           cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.CuerpoType cuerpo) {
           this.cuerpo = cuerpo;
    }


    /**
     * Gets the cuerpo value for this RespConsultarSaldosType.
     * 
     * @return cuerpo
     */
    public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.CuerpoType getCuerpo() {
        return cuerpo;
    }


    /**
     * Sets the cuerpo value for this RespConsultarSaldosType.
     * 
     * @param cuerpo
     */
    public void setCuerpo(cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.CuerpoType cuerpo) {
        this.cuerpo = cuerpo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespConsultarSaldosType)) return false;
        RespConsultarSaldosType other = (RespConsultarSaldosType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cuerpo==null && other.getCuerpo()==null) || 
             (this.cuerpo!=null &&
              this.cuerpo.equals(other.getCuerpo())));
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
        if (getCuerpo() != null) {
            _hashCode += getCuerpo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespConsultarSaldosType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "respConsultarSaldosType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuerpo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "Cuerpo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "CuerpoType"));
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
