/**
 * DatosPACType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse;

public class DatosPACType  implements java.io.Serializable {
    private java.lang.Integer codigoBanco;

    private java.lang.String descripcionBanco;

    private java.lang.Integer tipoPAC;

    private java.lang.String numeroCuentaCorriente;

    private java.util.Date fechaPAC;

    private java.util.Date fechaActivacionPAC;

    private java.util.Date fechaModificacionPAC;

    private java.util.Date fechaRenunciaPAC;

    private java.lang.Double monto1;

    private java.lang.Double monto2;

    private java.lang.Integer numero1;

    private java.lang.Integer numero2;

    private java.lang.String flag1;

    private java.lang.String flag2;

    private java.lang.String string1;

    private java.lang.String string2;

    public DatosPACType() {
    }

    public DatosPACType(
           java.lang.Integer codigoBanco,
           java.lang.String descripcionBanco,
           java.lang.Integer tipoPAC,
           java.lang.String numeroCuentaCorriente,
           java.util.Date fechaPAC,
           java.util.Date fechaActivacionPAC,
           java.util.Date fechaModificacionPAC,
           java.util.Date fechaRenunciaPAC,
           java.lang.Double monto1,
           java.lang.Double monto2,
           java.lang.Integer numero1,
           java.lang.Integer numero2,
           java.lang.String flag1,
           java.lang.String flag2,
           java.lang.String string1,
           java.lang.String string2) {
           this.codigoBanco = codigoBanco;
           this.descripcionBanco = descripcionBanco;
           this.tipoPAC = tipoPAC;
           this.numeroCuentaCorriente = numeroCuentaCorriente;
           this.fechaPAC = fechaPAC;
           this.fechaActivacionPAC = fechaActivacionPAC;
           this.fechaModificacionPAC = fechaModificacionPAC;
           this.fechaRenunciaPAC = fechaRenunciaPAC;
           this.monto1 = monto1;
           this.monto2 = monto2;
           this.numero1 = numero1;
           this.numero2 = numero2;
           this.flag1 = flag1;
           this.flag2 = flag2;
           this.string1 = string1;
           this.string2 = string2;
    }


    /**
     * Gets the codigoBanco value for this DatosPACType.
     * 
     * @return codigoBanco
     */
    public java.lang.Integer getCodigoBanco() {
        return codigoBanco;
    }


    /**
     * Sets the codigoBanco value for this DatosPACType.
     * 
     * @param codigoBanco
     */
    public void setCodigoBanco(java.lang.Integer codigoBanco) {
        this.codigoBanco = codigoBanco;
    }


    /**
     * Gets the descripcionBanco value for this DatosPACType.
     * 
     * @return descripcionBanco
     */
    public java.lang.String getDescripcionBanco() {
        return descripcionBanco;
    }


    /**
     * Sets the descripcionBanco value for this DatosPACType.
     * 
     * @param descripcionBanco
     */
    public void setDescripcionBanco(java.lang.String descripcionBanco) {
        this.descripcionBanco = descripcionBanco;
    }


    /**
     * Gets the tipoPAC value for this DatosPACType.
     * 
     * @return tipoPAC
     */
    public java.lang.Integer getTipoPAC() {
        return tipoPAC;
    }


    /**
     * Sets the tipoPAC value for this DatosPACType.
     * 
     * @param tipoPAC
     */
    public void setTipoPAC(java.lang.Integer tipoPAC) {
        this.tipoPAC = tipoPAC;
    }


    /**
     * Gets the numeroCuentaCorriente value for this DatosPACType.
     * 
     * @return numeroCuentaCorriente
     */
    public java.lang.String getNumeroCuentaCorriente() {
        return numeroCuentaCorriente;
    }


    /**
     * Sets the numeroCuentaCorriente value for this DatosPACType.
     * 
     * @param numeroCuentaCorriente
     */
    public void setNumeroCuentaCorriente(java.lang.String numeroCuentaCorriente) {
        this.numeroCuentaCorriente = numeroCuentaCorriente;
    }


    /**
     * Gets the fechaPAC value for this DatosPACType.
     * 
     * @return fechaPAC
     */
    public java.util.Date getFechaPAC() {
        return fechaPAC;
    }


    /**
     * Sets the fechaPAC value for this DatosPACType.
     * 
     * @param fechaPAC
     */
    public void setFechaPAC(java.util.Date fechaPAC) {
        this.fechaPAC = fechaPAC;
    }


    /**
     * Gets the fechaActivacionPAC value for this DatosPACType.
     * 
     * @return fechaActivacionPAC
     */
    public java.util.Date getFechaActivacionPAC() {
        return fechaActivacionPAC;
    }


    /**
     * Sets the fechaActivacionPAC value for this DatosPACType.
     * 
     * @param fechaActivacionPAC
     */
    public void setFechaActivacionPAC(java.util.Date fechaActivacionPAC) {
        this.fechaActivacionPAC = fechaActivacionPAC;
    }


    /**
     * Gets the fechaModificacionPAC value for this DatosPACType.
     * 
     * @return fechaModificacionPAC
     */
    public java.util.Date getFechaModificacionPAC() {
        return fechaModificacionPAC;
    }


    /**
     * Sets the fechaModificacionPAC value for this DatosPACType.
     * 
     * @param fechaModificacionPAC
     */
    public void setFechaModificacionPAC(java.util.Date fechaModificacionPAC) {
        this.fechaModificacionPAC = fechaModificacionPAC;
    }


    /**
     * Gets the fechaRenunciaPAC value for this DatosPACType.
     * 
     * @return fechaRenunciaPAC
     */
    public java.util.Date getFechaRenunciaPAC() {
        return fechaRenunciaPAC;
    }


    /**
     * Sets the fechaRenunciaPAC value for this DatosPACType.
     * 
     * @param fechaRenunciaPAC
     */
    public void setFechaRenunciaPAC(java.util.Date fechaRenunciaPAC) {
        this.fechaRenunciaPAC = fechaRenunciaPAC;
    }


    /**
     * Gets the monto1 value for this DatosPACType.
     * 
     * @return monto1
     */
    public java.lang.Double getMonto1() {
        return monto1;
    }


    /**
     * Sets the monto1 value for this DatosPACType.
     * 
     * @param monto1
     */
    public void setMonto1(java.lang.Double monto1) {
        this.monto1 = monto1;
    }


    /**
     * Gets the monto2 value for this DatosPACType.
     * 
     * @return monto2
     */
    public java.lang.Double getMonto2() {
        return monto2;
    }


    /**
     * Sets the monto2 value for this DatosPACType.
     * 
     * @param monto2
     */
    public void setMonto2(java.lang.Double monto2) {
        this.monto2 = monto2;
    }


    /**
     * Gets the numero1 value for this DatosPACType.
     * 
     * @return numero1
     */
    public java.lang.Integer getNumero1() {
        return numero1;
    }


    /**
     * Sets the numero1 value for this DatosPACType.
     * 
     * @param numero1
     */
    public void setNumero1(java.lang.Integer numero1) {
        this.numero1 = numero1;
    }


    /**
     * Gets the numero2 value for this DatosPACType.
     * 
     * @return numero2
     */
    public java.lang.Integer getNumero2() {
        return numero2;
    }


    /**
     * Sets the numero2 value for this DatosPACType.
     * 
     * @param numero2
     */
    public void setNumero2(java.lang.Integer numero2) {
        this.numero2 = numero2;
    }


    /**
     * Gets the flag1 value for this DatosPACType.
     * 
     * @return flag1
     */
    public java.lang.String getFlag1() {
        return flag1;
    }


    /**
     * Sets the flag1 value for this DatosPACType.
     * 
     * @param flag1
     */
    public void setFlag1(java.lang.String flag1) {
        this.flag1 = flag1;
    }


    /**
     * Gets the flag2 value for this DatosPACType.
     * 
     * @return flag2
     */
    public java.lang.String getFlag2() {
        return flag2;
    }


    /**
     * Sets the flag2 value for this DatosPACType.
     * 
     * @param flag2
     */
    public void setFlag2(java.lang.String flag2) {
        this.flag2 = flag2;
    }


    /**
     * Gets the string1 value for this DatosPACType.
     * 
     * @return string1
     */
    public java.lang.String getString1() {
        return string1;
    }


    /**
     * Sets the string1 value for this DatosPACType.
     * 
     * @param string1
     */
    public void setString1(java.lang.String string1) {
        this.string1 = string1;
    }


    /**
     * Gets the string2 value for this DatosPACType.
     * 
     * @return string2
     */
    public java.lang.String getString2() {
        return string2;
    }


    /**
     * Sets the string2 value for this DatosPACType.
     * 
     * @param string2
     */
    public void setString2(java.lang.String string2) {
        this.string2 = string2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosPACType)) return false;
        DatosPACType other = (DatosPACType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoBanco==null && other.getCodigoBanco()==null) || 
             (this.codigoBanco!=null &&
              this.codigoBanco.equals(other.getCodigoBanco()))) &&
            ((this.descripcionBanco==null && other.getDescripcionBanco()==null) || 
             (this.descripcionBanco!=null &&
              this.descripcionBanco.equals(other.getDescripcionBanco()))) &&
            ((this.tipoPAC==null && other.getTipoPAC()==null) || 
             (this.tipoPAC!=null &&
              this.tipoPAC.equals(other.getTipoPAC()))) &&
            ((this.numeroCuentaCorriente==null && other.getNumeroCuentaCorriente()==null) || 
             (this.numeroCuentaCorriente!=null &&
              this.numeroCuentaCorriente.equals(other.getNumeroCuentaCorriente()))) &&
            ((this.fechaPAC==null && other.getFechaPAC()==null) || 
             (this.fechaPAC!=null &&
              this.fechaPAC.equals(other.getFechaPAC()))) &&
            ((this.fechaActivacionPAC==null && other.getFechaActivacionPAC()==null) || 
             (this.fechaActivacionPAC!=null &&
              this.fechaActivacionPAC.equals(other.getFechaActivacionPAC()))) &&
            ((this.fechaModificacionPAC==null && other.getFechaModificacionPAC()==null) || 
             (this.fechaModificacionPAC!=null &&
              this.fechaModificacionPAC.equals(other.getFechaModificacionPAC()))) &&
            ((this.fechaRenunciaPAC==null && other.getFechaRenunciaPAC()==null) || 
             (this.fechaRenunciaPAC!=null &&
              this.fechaRenunciaPAC.equals(other.getFechaRenunciaPAC()))) &&
            ((this.monto1==null && other.getMonto1()==null) || 
             (this.monto1!=null &&
              this.monto1.equals(other.getMonto1()))) &&
            ((this.monto2==null && other.getMonto2()==null) || 
             (this.monto2!=null &&
              this.monto2.equals(other.getMonto2()))) &&
            ((this.numero1==null && other.getNumero1()==null) || 
             (this.numero1!=null &&
              this.numero1.equals(other.getNumero1()))) &&
            ((this.numero2==null && other.getNumero2()==null) || 
             (this.numero2!=null &&
              this.numero2.equals(other.getNumero2()))) &&
            ((this.flag1==null && other.getFlag1()==null) || 
             (this.flag1!=null &&
              this.flag1.equals(other.getFlag1()))) &&
            ((this.flag2==null && other.getFlag2()==null) || 
             (this.flag2!=null &&
              this.flag2.equals(other.getFlag2()))) &&
            ((this.string1==null && other.getString1()==null) || 
             (this.string1!=null &&
              this.string1.equals(other.getString1()))) &&
            ((this.string2==null && other.getString2()==null) || 
             (this.string2!=null &&
              this.string2.equals(other.getString2())));
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
        if (getCodigoBanco() != null) {
            _hashCode += getCodigoBanco().hashCode();
        }
        if (getDescripcionBanco() != null) {
            _hashCode += getDescripcionBanco().hashCode();
        }
        if (getTipoPAC() != null) {
            _hashCode += getTipoPAC().hashCode();
        }
        if (getNumeroCuentaCorriente() != null) {
            _hashCode += getNumeroCuentaCorriente().hashCode();
        }
        if (getFechaPAC() != null) {
            _hashCode += getFechaPAC().hashCode();
        }
        if (getFechaActivacionPAC() != null) {
            _hashCode += getFechaActivacionPAC().hashCode();
        }
        if (getFechaModificacionPAC() != null) {
            _hashCode += getFechaModificacionPAC().hashCode();
        }
        if (getFechaRenunciaPAC() != null) {
            _hashCode += getFechaRenunciaPAC().hashCode();
        }
        if (getMonto1() != null) {
            _hashCode += getMonto1().hashCode();
        }
        if (getMonto2() != null) {
            _hashCode += getMonto2().hashCode();
        }
        if (getNumero1() != null) {
            _hashCode += getNumero1().hashCode();
        }
        if (getNumero2() != null) {
            _hashCode += getNumero2().hashCode();
        }
        if (getFlag1() != null) {
            _hashCode += getFlag1().hashCode();
        }
        if (getFlag2() != null) {
            _hashCode += getFlag2().hashCode();
        }
        if (getString1() != null) {
            _hashCode += getString1().hashCode();
        }
        if (getString2() != null) {
            _hashCode += getString2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosPACType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosPACType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "descripcionBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "tipoPAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCuentaCorriente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroCuentaCorriente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaPAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaPAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaActivacionPAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaActivacionPAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaModificacionPAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaModificacionPAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaRenunciaPAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaRenunciaPAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monto1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "monto1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monto2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "monto2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numero1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numero2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "flag1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "flag2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("string1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "string1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("string2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "string2"));
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
