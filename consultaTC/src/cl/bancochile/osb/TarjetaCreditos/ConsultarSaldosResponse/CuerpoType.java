/**
 * CuerpoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse;

public class CuerpoType  implements java.io.Serializable {
    private cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCuentaType datosCuenta;

    private cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosTarjetaType datosTarjeta;

    private cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosRelacionType datosRelacion;

    private cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCuentaAutorizadorOnLineType datosCuentaAutorizadorOnLine;

    private cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosTarjetaAutorizadorType datosTarjetaAutorizador;

    private cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosPACType datosPAC;

    private cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCobranzaType datosCobranza;

    private cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCastigoType datosCastigo;

    public CuerpoType() {
    }

    public CuerpoType(
           cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCuentaType datosCuenta,
           cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosTarjetaType datosTarjeta,
           cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosRelacionType datosRelacion,
           cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCuentaAutorizadorOnLineType datosCuentaAutorizadorOnLine,
           cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosTarjetaAutorizadorType datosTarjetaAutorizador,
           cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosPACType datosPAC,
           cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCobranzaType datosCobranza,
           cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCastigoType datosCastigo) {
           this.datosCuenta = datosCuenta;
           this.datosTarjeta = datosTarjeta;
           this.datosRelacion = datosRelacion;
           this.datosCuentaAutorizadorOnLine = datosCuentaAutorizadorOnLine;
           this.datosTarjetaAutorizador = datosTarjetaAutorizador;
           this.datosPAC = datosPAC;
           this.datosCobranza = datosCobranza;
           this.datosCastigo = datosCastigo;
    }


    /**
     * Gets the datosCuenta value for this CuerpoType.
     * 
     * @return datosCuenta
     */
    public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCuentaType getDatosCuenta() {
        return datosCuenta;
    }


    /**
     * Sets the datosCuenta value for this CuerpoType.
     * 
     * @param datosCuenta
     */
    public void setDatosCuenta(cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCuentaType datosCuenta) {
        this.datosCuenta = datosCuenta;
    }


    /**
     * Gets the datosTarjeta value for this CuerpoType.
     * 
     * @return datosTarjeta
     */
    public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosTarjetaType getDatosTarjeta() {
        return datosTarjeta;
    }


    /**
     * Sets the datosTarjeta value for this CuerpoType.
     * 
     * @param datosTarjeta
     */
    public void setDatosTarjeta(cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosTarjetaType datosTarjeta) {
        this.datosTarjeta = datosTarjeta;
    }


    /**
     * Gets the datosRelacion value for this CuerpoType.
     * 
     * @return datosRelacion
     */
    public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosRelacionType getDatosRelacion() {
        return datosRelacion;
    }


    /**
     * Sets the datosRelacion value for this CuerpoType.
     * 
     * @param datosRelacion
     */
    public void setDatosRelacion(cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosRelacionType datosRelacion) {
        this.datosRelacion = datosRelacion;
    }


    /**
     * Gets the datosCuentaAutorizadorOnLine value for this CuerpoType.
     * 
     * @return datosCuentaAutorizadorOnLine
     */
    public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCuentaAutorizadorOnLineType getDatosCuentaAutorizadorOnLine() {
        return datosCuentaAutorizadorOnLine;
    }


    /**
     * Sets the datosCuentaAutorizadorOnLine value for this CuerpoType.
     * 
     * @param datosCuentaAutorizadorOnLine
     */
    public void setDatosCuentaAutorizadorOnLine(cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCuentaAutorizadorOnLineType datosCuentaAutorizadorOnLine) {
        this.datosCuentaAutorizadorOnLine = datosCuentaAutorizadorOnLine;
    }


    /**
     * Gets the datosTarjetaAutorizador value for this CuerpoType.
     * 
     * @return datosTarjetaAutorizador
     */
    public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosTarjetaAutorizadorType getDatosTarjetaAutorizador() {
        return datosTarjetaAutorizador;
    }


    /**
     * Sets the datosTarjetaAutorizador value for this CuerpoType.
     * 
     * @param datosTarjetaAutorizador
     */
    public void setDatosTarjetaAutorizador(cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosTarjetaAutorizadorType datosTarjetaAutorizador) {
        this.datosTarjetaAutorizador = datosTarjetaAutorizador;
    }


    /**
     * Gets the datosPAC value for this CuerpoType.
     * 
     * @return datosPAC
     */
    public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosPACType getDatosPAC() {
        return datosPAC;
    }


    /**
     * Sets the datosPAC value for this CuerpoType.
     * 
     * @param datosPAC
     */
    public void setDatosPAC(cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosPACType datosPAC) {
        this.datosPAC = datosPAC;
    }


    /**
     * Gets the datosCobranza value for this CuerpoType.
     * 
     * @return datosCobranza
     */
    public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCobranzaType getDatosCobranza() {
        return datosCobranza;
    }


    /**
     * Sets the datosCobranza value for this CuerpoType.
     * 
     * @param datosCobranza
     */
    public void setDatosCobranza(cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCobranzaType datosCobranza) {
        this.datosCobranza = datosCobranza;
    }


    /**
     * Gets the datosCastigo value for this CuerpoType.
     * 
     * @return datosCastigo
     */
    public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCastigoType getDatosCastigo() {
        return datosCastigo;
    }


    /**
     * Sets the datosCastigo value for this CuerpoType.
     * 
     * @param datosCastigo
     */
    public void setDatosCastigo(cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.DatosCastigoType datosCastigo) {
        this.datosCastigo = datosCastigo;
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
            ((this.datosCuenta==null && other.getDatosCuenta()==null) || 
             (this.datosCuenta!=null &&
              this.datosCuenta.equals(other.getDatosCuenta()))) &&
            ((this.datosTarjeta==null && other.getDatosTarjeta()==null) || 
             (this.datosTarjeta!=null &&
              this.datosTarjeta.equals(other.getDatosTarjeta()))) &&
            ((this.datosRelacion==null && other.getDatosRelacion()==null) || 
             (this.datosRelacion!=null &&
              this.datosRelacion.equals(other.getDatosRelacion()))) &&
            ((this.datosCuentaAutorizadorOnLine==null && other.getDatosCuentaAutorizadorOnLine()==null) || 
             (this.datosCuentaAutorizadorOnLine!=null &&
              this.datosCuentaAutorizadorOnLine.equals(other.getDatosCuentaAutorizadorOnLine()))) &&
            ((this.datosTarjetaAutorizador==null && other.getDatosTarjetaAutorizador()==null) || 
             (this.datosTarjetaAutorizador!=null &&
              this.datosTarjetaAutorizador.equals(other.getDatosTarjetaAutorizador()))) &&
            ((this.datosPAC==null && other.getDatosPAC()==null) || 
             (this.datosPAC!=null &&
              this.datosPAC.equals(other.getDatosPAC()))) &&
            ((this.datosCobranza==null && other.getDatosCobranza()==null) || 
             (this.datosCobranza!=null &&
              this.datosCobranza.equals(other.getDatosCobranza()))) &&
            ((this.datosCastigo==null && other.getDatosCastigo()==null) || 
             (this.datosCastigo!=null &&
              this.datosCastigo.equals(other.getDatosCastigo())));
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
        if (getDatosCuenta() != null) {
            _hashCode += getDatosCuenta().hashCode();
        }
        if (getDatosTarjeta() != null) {
            _hashCode += getDatosTarjeta().hashCode();
        }
        if (getDatosRelacion() != null) {
            _hashCode += getDatosRelacion().hashCode();
        }
        if (getDatosCuentaAutorizadorOnLine() != null) {
            _hashCode += getDatosCuentaAutorizadorOnLine().hashCode();
        }
        if (getDatosTarjetaAutorizador() != null) {
            _hashCode += getDatosTarjetaAutorizador().hashCode();
        }
        if (getDatosPAC() != null) {
            _hashCode += getDatosPAC().hashCode();
        }
        if (getDatosCobranza() != null) {
            _hashCode += getDatosCobranza().hashCode();
        }
        if (getDatosCastigo() != null) {
            _hashCode += getDatosCastigo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CuerpoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "CuerpoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosCuentaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosTarjetaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosRelacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosRelacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosRelacionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosCuentaAutorizadorOnLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosCuentaAutorizadorOnLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosCuentaAutorizadorOnLineType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosTarjetaAutorizador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosTarjetaAutorizador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosTarjetaAutorizadorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosPAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosPAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosPACType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosCobranza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosCobranza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosCobranzaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosCastigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosCastigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosCastigoType"));
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
