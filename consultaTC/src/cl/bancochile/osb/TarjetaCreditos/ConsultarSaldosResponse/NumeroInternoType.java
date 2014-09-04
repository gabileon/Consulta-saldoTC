/**
 * NumeroInternoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse;

public class NumeroInternoType  implements java.io.Serializable {
    private java.lang.Integer codigoOficina;

    private java.lang.Integer codigoEjecutivo;

    private java.lang.Integer usoAplicaciones;

    public NumeroInternoType() {
    }

    public NumeroInternoType(
           java.lang.Integer codigoOficina,
           java.lang.Integer codigoEjecutivo,
           java.lang.Integer usoAplicaciones) {
           this.codigoOficina = codigoOficina;
           this.codigoEjecutivo = codigoEjecutivo;
           this.usoAplicaciones = usoAplicaciones;
    }


    /**
     * Gets the codigoOficina value for this NumeroInternoType.
     * 
     * @return codigoOficina
     */
    public java.lang.Integer getCodigoOficina() {
        return codigoOficina;
    }


    /**
     * Sets the codigoOficina value for this NumeroInternoType.
     * 
     * @param codigoOficina
     */
    public void setCodigoOficina(java.lang.Integer codigoOficina) {
        this.codigoOficina = codigoOficina;
    }


    /**
     * Gets the codigoEjecutivo value for this NumeroInternoType.
     * 
     * @return codigoEjecutivo
     */
    public java.lang.Integer getCodigoEjecutivo() {
        return codigoEjecutivo;
    }


    /**
     * Sets the codigoEjecutivo value for this NumeroInternoType.
     * 
     * @param codigoEjecutivo
     */
    public void setCodigoEjecutivo(java.lang.Integer codigoEjecutivo) {
        this.codigoEjecutivo = codigoEjecutivo;
    }


    /**
     * Gets the usoAplicaciones value for this NumeroInternoType.
     * 
     * @return usoAplicaciones
     */
    public java.lang.Integer getUsoAplicaciones() {
        return usoAplicaciones;
    }


    /**
     * Sets the usoAplicaciones value for this NumeroInternoType.
     * 
     * @param usoAplicaciones
     */
    public void setUsoAplicaciones(java.lang.Integer usoAplicaciones) {
        this.usoAplicaciones = usoAplicaciones;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumeroInternoType)) return false;
        NumeroInternoType other = (NumeroInternoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoOficina==null && other.getCodigoOficina()==null) || 
             (this.codigoOficina!=null &&
              this.codigoOficina.equals(other.getCodigoOficina()))) &&
            ((this.codigoEjecutivo==null && other.getCodigoEjecutivo()==null) || 
             (this.codigoEjecutivo!=null &&
              this.codigoEjecutivo.equals(other.getCodigoEjecutivo()))) &&
            ((this.usoAplicaciones==null && other.getUsoAplicaciones()==null) || 
             (this.usoAplicaciones!=null &&
              this.usoAplicaciones.equals(other.getUsoAplicaciones())));
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
        if (getCodigoOficina() != null) {
            _hashCode += getCodigoOficina().hashCode();
        }
        if (getCodigoEjecutivo() != null) {
            _hashCode += getCodigoEjecutivo().hashCode();
        }
        if (getUsoAplicaciones() != null) {
            _hashCode += getUsoAplicaciones().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumeroInternoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroInternoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoOficina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoOficina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEjecutivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoEjecutivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usoAplicaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "usoAplicaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
