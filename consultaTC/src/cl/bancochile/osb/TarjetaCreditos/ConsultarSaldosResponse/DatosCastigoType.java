/**
 * DatosCastigoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse;

public class DatosCastigoType  implements java.io.Serializable {
    private java.lang.String cuentaCastigo;

    private java.lang.Integer montoCastigo;

    private java.lang.String filler;

    public DatosCastigoType() {
    }

    public DatosCastigoType(
           java.lang.String cuentaCastigo,
           java.lang.Integer montoCastigo,
           java.lang.String filler) {
           this.cuentaCastigo = cuentaCastigo;
           this.montoCastigo = montoCastigo;
           this.filler = filler;
    }


    /**
     * Gets the cuentaCastigo value for this DatosCastigoType.
     * 
     * @return cuentaCastigo
     */
    public java.lang.String getCuentaCastigo() {
        return cuentaCastigo;
    }


    /**
     * Sets the cuentaCastigo value for this DatosCastigoType.
     * 
     * @param cuentaCastigo
     */
    public void setCuentaCastigo(java.lang.String cuentaCastigo) {
        this.cuentaCastigo = cuentaCastigo;
    }


    /**
     * Gets the montoCastigo value for this DatosCastigoType.
     * 
     * @return montoCastigo
     */
    public java.lang.Integer getMontoCastigo() {
        return montoCastigo;
    }


    /**
     * Sets the montoCastigo value for this DatosCastigoType.
     * 
     * @param montoCastigo
     */
    public void setMontoCastigo(java.lang.Integer montoCastigo) {
        this.montoCastigo = montoCastigo;
    }


    /**
     * Gets the filler value for this DatosCastigoType.
     * 
     * @return filler
     */
    public java.lang.String getFiller() {
        return filler;
    }


    /**
     * Sets the filler value for this DatosCastigoType.
     * 
     * @param filler
     */
    public void setFiller(java.lang.String filler) {
        this.filler = filler;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosCastigoType)) return false;
        DatosCastigoType other = (DatosCastigoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cuentaCastigo==null && other.getCuentaCastigo()==null) || 
             (this.cuentaCastigo!=null &&
              this.cuentaCastigo.equals(other.getCuentaCastigo()))) &&
            ((this.montoCastigo==null && other.getMontoCastigo()==null) || 
             (this.montoCastigo!=null &&
              this.montoCastigo.equals(other.getMontoCastigo()))) &&
            ((this.filler==null && other.getFiller()==null) || 
             (this.filler!=null &&
              this.filler.equals(other.getFiller())));
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
        if (getCuentaCastigo() != null) {
            _hashCode += getCuentaCastigo().hashCode();
        }
        if (getMontoCastigo() != null) {
            _hashCode += getMontoCastigo().hashCode();
        }
        if (getFiller() != null) {
            _hashCode += getFiller().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosCastigoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosCastigoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaCastigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "cuentaCastigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoCastigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "montoCastigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "filler"));
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
