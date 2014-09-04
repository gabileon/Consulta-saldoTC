/**
 * CuerpoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosRequest;

public class CuerpoType  implements java.io.Serializable {
    private java.lang.String numeroTarjeta;

    private int secuenciaTarjeta;

    private java.lang.String filler02;

    public CuerpoType() {
    }

    public CuerpoType(
           java.lang.String numeroTarjeta,
           int secuenciaTarjeta,
           java.lang.String filler02) {
           this.numeroTarjeta = numeroTarjeta;
           this.secuenciaTarjeta = secuenciaTarjeta;
           this.filler02 = filler02;
    }


    /**
     * Gets the numeroTarjeta value for this CuerpoType.
     * 
     * @return numeroTarjeta
     */
    public java.lang.String getNumeroTarjeta() {
        return numeroTarjeta;
    }


    /**
     * Sets the numeroTarjeta value for this CuerpoType.
     * 
     * @param numeroTarjeta
     */
    public void setNumeroTarjeta(java.lang.String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }


    /**
     * Gets the secuenciaTarjeta value for this CuerpoType.
     * 
     * @return secuenciaTarjeta
     */
    public int getSecuenciaTarjeta() {
        return secuenciaTarjeta;
    }


    /**
     * Sets the secuenciaTarjeta value for this CuerpoType.
     * 
     * @param secuenciaTarjeta
     */
    public void setSecuenciaTarjeta(int secuenciaTarjeta) {
        this.secuenciaTarjeta = secuenciaTarjeta;
    }


    /**
     * Gets the filler02 value for this CuerpoType.
     * 
     * @return filler02
     */
    public java.lang.String getFiller02() {
        return filler02;
    }


    /**
     * Sets the filler02 value for this CuerpoType.
     * 
     * @param filler02
     */
    public void setFiller02(java.lang.String filler02) {
        this.filler02 = filler02;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CuerpoType)) return false;
        CuerpoType other = (CuerpoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroTarjeta==null && other.getNumeroTarjeta()==null) || 
             (this.numeroTarjeta!=null &&
              this.numeroTarjeta.equals(other.getNumeroTarjeta()))) &&
            this.secuenciaTarjeta == other.getSecuenciaTarjeta() &&
            ((this.filler02==null && other.getFiller02()==null) || 
             (this.filler02!=null &&
              this.filler02.equals(other.getFiller02())));
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
        if (getNumeroTarjeta() != null) {
            _hashCode += getNumeroTarjeta().hashCode();
        }
        _hashCode += getSecuenciaTarjeta();
        if (getFiller02() != null) {
            _hashCode += getFiller02().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CuerpoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosRequest", "CuerpoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosRequest", "numeroTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secuenciaTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosRequest", "secuenciaTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler02");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosRequest", "filler02"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
