/**
 * DatosTarjetaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse;

public class DatosTarjetaType  implements java.io.Serializable {
    private java.lang.String numeroTarjeta;

    private java.lang.Integer numeroSecuencia;

    private java.lang.String nombreTarjetaHabiente;

    private java.lang.String nombreEmpresa;

    private java.lang.String rutdvTarjetaHabiente;

    private java.lang.Integer sexo;

    private java.lang.Integer estadoCivil;

    private java.lang.String tipoTarjeta;

    private java.lang.Integer estadoTarjeta;

    private java.util.Date fechaVencimientoTarjeta;

    private java.lang.String codigoBloqueo;

    private java.util.Date fechaBloqueo;

    private java.lang.Integer codigoAfinidad;

    private java.lang.String descripcionAfinidad;

    private java.lang.Integer codigoSocio;

    private java.lang.Integer offset;

    private java.util.Date fechaVencimientoActual;

    private java.util.Date fechaVencimientoAnterior;

    private java.lang.String flagActivacionTarjetaActual;

    private java.lang.String flagActivacionTarjetaAnterior;

    private java.lang.Integer accion;

    private java.lang.Integer tarjetasRequeridas;

    private java.util.Date fechaActivacion;

    private java.util.Date fechaApertura;

    private java.util.Date fechaModificacionTarjeta;

    private java.lang.Integer memberSince;

    private java.lang.Integer cupoComprasNacional;

    private java.lang.Double cupoComprasInternacional;

    private java.lang.Integer cupoAvancesNacional;

    private java.lang.Double cupoAvancesInternacional;

    private java.lang.Integer cupoLinea2;

    private java.lang.Integer deudaComprasNacional;

    private java.lang.Double deudaComprasInternacional;

    private java.lang.Integer deudaAvancesNacional;

    private java.lang.Double deudaAvancesInternacional;

    private java.lang.Integer deudaLinea2;

    private java.lang.Integer disponibleComprasNacional;

    private java.lang.Double disponibleComprasInternacional;

    private java.lang.Integer disponibleAvancesNacional;

    private java.lang.Double disponibleAvancesInternacional;

    private java.lang.Integer disponibleLinea2;

    private java.lang.Double monto1;

    private java.lang.Double monto2;

    private java.lang.Double monto3;

    private java.lang.Integer numero1;

    private java.lang.Integer numero2;

    private java.lang.Integer numero3;

    private java.lang.String flag1;

    private java.lang.String flag2;

    private java.lang.String flag3;

    private java.lang.String string1;

    private java.lang.String string2;

    private java.lang.String string3;

    private java.lang.String filler;

    public DatosTarjetaType() {
    }

    public DatosTarjetaType(
           java.lang.String numeroTarjeta,
           java.lang.Integer numeroSecuencia,
           java.lang.String nombreTarjetaHabiente,
           java.lang.String nombreEmpresa,
           java.lang.String rutdvTarjetaHabiente,
           java.lang.Integer sexo,
           java.lang.Integer estadoCivil,
           java.lang.String tipoTarjeta,
           java.lang.Integer estadoTarjeta,
           java.util.Date fechaVencimientoTarjeta,
           java.lang.String codigoBloqueo,
           java.util.Date fechaBloqueo,
           java.lang.Integer codigoAfinidad,
           java.lang.String descripcionAfinidad,
           java.lang.Integer codigoSocio,
           java.lang.Integer offset,
           java.util.Date fechaVencimientoActual,
           java.util.Date fechaVencimientoAnterior,
           java.lang.String flagActivacionTarjetaActual,
           java.lang.String flagActivacionTarjetaAnterior,
           java.lang.Integer accion,
           java.lang.Integer tarjetasRequeridas,
           java.util.Date fechaActivacion,
           java.util.Date fechaApertura,
           java.util.Date fechaModificacionTarjeta,
           java.lang.Integer memberSince,
           java.lang.Integer cupoComprasNacional,
           java.lang.Double cupoComprasInternacional,
           java.lang.Integer cupoAvancesNacional,
           java.lang.Double cupoAvancesInternacional,
           java.lang.Integer cupoLinea2,
           java.lang.Integer deudaComprasNacional,
           java.lang.Double deudaComprasInternacional,
           java.lang.Integer deudaAvancesNacional,
           java.lang.Double deudaAvancesInternacional,
           java.lang.Integer deudaLinea2,
           java.lang.Integer disponibleComprasNacional,
           java.lang.Double disponibleComprasInternacional,
           java.lang.Integer disponibleAvancesNacional,
           java.lang.Double disponibleAvancesInternacional,
           java.lang.Integer disponibleLinea2,
           java.lang.Double monto1,
           java.lang.Double monto2,
           java.lang.Double monto3,
           java.lang.Integer numero1,
           java.lang.Integer numero2,
           java.lang.Integer numero3,
           java.lang.String flag1,
           java.lang.String flag2,
           java.lang.String flag3,
           java.lang.String string1,
           java.lang.String string2,
           java.lang.String string3,
           java.lang.String filler) {
           this.numeroTarjeta = numeroTarjeta;
           this.numeroSecuencia = numeroSecuencia;
           this.nombreTarjetaHabiente = nombreTarjetaHabiente;
           this.nombreEmpresa = nombreEmpresa;
           this.rutdvTarjetaHabiente = rutdvTarjetaHabiente;
           this.sexo = sexo;
           this.estadoCivil = estadoCivil;
           this.tipoTarjeta = tipoTarjeta;
           this.estadoTarjeta = estadoTarjeta;
           this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
           this.codigoBloqueo = codigoBloqueo;
           this.fechaBloqueo = fechaBloqueo;
           this.codigoAfinidad = codigoAfinidad;
           this.descripcionAfinidad = descripcionAfinidad;
           this.codigoSocio = codigoSocio;
           this.offset = offset;
           this.fechaVencimientoActual = fechaVencimientoActual;
           this.fechaVencimientoAnterior = fechaVencimientoAnterior;
           this.flagActivacionTarjetaActual = flagActivacionTarjetaActual;
           this.flagActivacionTarjetaAnterior = flagActivacionTarjetaAnterior;
           this.accion = accion;
           this.tarjetasRequeridas = tarjetasRequeridas;
           this.fechaActivacion = fechaActivacion;
           this.fechaApertura = fechaApertura;
           this.fechaModificacionTarjeta = fechaModificacionTarjeta;
           this.memberSince = memberSince;
           this.cupoComprasNacional = cupoComprasNacional;
           this.cupoComprasInternacional = cupoComprasInternacional;
           this.cupoAvancesNacional = cupoAvancesNacional;
           this.cupoAvancesInternacional = cupoAvancesInternacional;
           this.cupoLinea2 = cupoLinea2;
           this.deudaComprasNacional = deudaComprasNacional;
           this.deudaComprasInternacional = deudaComprasInternacional;
           this.deudaAvancesNacional = deudaAvancesNacional;
           this.deudaAvancesInternacional = deudaAvancesInternacional;
           this.deudaLinea2 = deudaLinea2;
           this.disponibleComprasNacional = disponibleComprasNacional;
           this.disponibleComprasInternacional = disponibleComprasInternacional;
           this.disponibleAvancesNacional = disponibleAvancesNacional;
           this.disponibleAvancesInternacional = disponibleAvancesInternacional;
           this.disponibleLinea2 = disponibleLinea2;
           this.monto1 = monto1;
           this.monto2 = monto2;
           this.monto3 = monto3;
           this.numero1 = numero1;
           this.numero2 = numero2;
           this.numero3 = numero3;
           this.flag1 = flag1;
           this.flag2 = flag2;
           this.flag3 = flag3;
           this.string1 = string1;
           this.string2 = string2;
           this.string3 = string3;
           this.filler = filler;
    }


    /**
     * Gets the numeroTarjeta value for this DatosTarjetaType.
     * 
     * @return numeroTarjeta
     */
    public java.lang.String getNumeroTarjeta() {
        return numeroTarjeta;
    }


    /**
     * Sets the numeroTarjeta value for this DatosTarjetaType.
     * 
     * @param numeroTarjeta
     */
    public void setNumeroTarjeta(java.lang.String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }


    /**
     * Gets the numeroSecuencia value for this DatosTarjetaType.
     * 
     * @return numeroSecuencia
     */
    public java.lang.Integer getNumeroSecuencia() {
        return numeroSecuencia;
    }


    /**
     * Sets the numeroSecuencia value for this DatosTarjetaType.
     * 
     * @param numeroSecuencia
     */
    public void setNumeroSecuencia(java.lang.Integer numeroSecuencia) {
        this.numeroSecuencia = numeroSecuencia;
    }


    /**
     * Gets the nombreTarjetaHabiente value for this DatosTarjetaType.
     * 
     * @return nombreTarjetaHabiente
     */
    public java.lang.String getNombreTarjetaHabiente() {
        return nombreTarjetaHabiente;
    }


    /**
     * Sets the nombreTarjetaHabiente value for this DatosTarjetaType.
     * 
     * @param nombreTarjetaHabiente
     */
    public void setNombreTarjetaHabiente(java.lang.String nombreTarjetaHabiente) {
        this.nombreTarjetaHabiente = nombreTarjetaHabiente;
    }


    /**
     * Gets the nombreEmpresa value for this DatosTarjetaType.
     * 
     * @return nombreEmpresa
     */
    public java.lang.String getNombreEmpresa() {
        return nombreEmpresa;
    }


    /**
     * Sets the nombreEmpresa value for this DatosTarjetaType.
     * 
     * @param nombreEmpresa
     */
    public void setNombreEmpresa(java.lang.String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }


    /**
     * Gets the rutdvTarjetaHabiente value for this DatosTarjetaType.
     * 
     * @return rutdvTarjetaHabiente
     */
    public java.lang.String getRutdvTarjetaHabiente() {
        return rutdvTarjetaHabiente;
    }


    /**
     * Sets the rutdvTarjetaHabiente value for this DatosTarjetaType.
     * 
     * @param rutdvTarjetaHabiente
     */
    public void setRutdvTarjetaHabiente(java.lang.String rutdvTarjetaHabiente) {
        this.rutdvTarjetaHabiente = rutdvTarjetaHabiente;
    }


    /**
     * Gets the sexo value for this DatosTarjetaType.
     * 
     * @return sexo
     */
    public java.lang.Integer getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this DatosTarjetaType.
     * 
     * @param sexo
     */
    public void setSexo(java.lang.Integer sexo) {
        this.sexo = sexo;
    }


    /**
     * Gets the estadoCivil value for this DatosTarjetaType.
     * 
     * @return estadoCivil
     */
    public java.lang.Integer getEstadoCivil() {
        return estadoCivil;
    }


    /**
     * Sets the estadoCivil value for this DatosTarjetaType.
     * 
     * @param estadoCivil
     */
    public void setEstadoCivil(java.lang.Integer estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    /**
     * Gets the tipoTarjeta value for this DatosTarjetaType.
     * 
     * @return tipoTarjeta
     */
    public java.lang.String getTipoTarjeta() {
        return tipoTarjeta;
    }


    /**
     * Sets the tipoTarjeta value for this DatosTarjetaType.
     * 
     * @param tipoTarjeta
     */
    public void setTipoTarjeta(java.lang.String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }


    /**
     * Gets the estadoTarjeta value for this DatosTarjetaType.
     * 
     * @return estadoTarjeta
     */
    public java.lang.Integer getEstadoTarjeta() {
        return estadoTarjeta;
    }


    /**
     * Sets the estadoTarjeta value for this DatosTarjetaType.
     * 
     * @param estadoTarjeta
     */
    public void setEstadoTarjeta(java.lang.Integer estadoTarjeta) {
        this.estadoTarjeta = estadoTarjeta;
    }


    /**
     * Gets the fechaVencimientoTarjeta value for this DatosTarjetaType.
     * 
     * @return fechaVencimientoTarjeta
     */
    public java.util.Date getFechaVencimientoTarjeta() {
        return fechaVencimientoTarjeta;
    }


    /**
     * Sets the fechaVencimientoTarjeta value for this DatosTarjetaType.
     * 
     * @param fechaVencimientoTarjeta
     */
    public void setFechaVencimientoTarjeta(java.util.Date fechaVencimientoTarjeta) {
        this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
    }


    /**
     * Gets the codigoBloqueo value for this DatosTarjetaType.
     * 
     * @return codigoBloqueo
     */
    public java.lang.String getCodigoBloqueo() {
        return codigoBloqueo;
    }


    /**
     * Sets the codigoBloqueo value for this DatosTarjetaType.
     * 
     * @param codigoBloqueo
     */
    public void setCodigoBloqueo(java.lang.String codigoBloqueo) {
        this.codigoBloqueo = codigoBloqueo;
    }


    /**
     * Gets the fechaBloqueo value for this DatosTarjetaType.
     * 
     * @return fechaBloqueo
     */
    public java.util.Date getFechaBloqueo() {
        return fechaBloqueo;
    }


    /**
     * Sets the fechaBloqueo value for this DatosTarjetaType.
     * 
     * @param fechaBloqueo
     */
    public void setFechaBloqueo(java.util.Date fechaBloqueo) {
        this.fechaBloqueo = fechaBloqueo;
    }


    /**
     * Gets the codigoAfinidad value for this DatosTarjetaType.
     * 
     * @return codigoAfinidad
     */
    public java.lang.Integer getCodigoAfinidad() {
        return codigoAfinidad;
    }


    /**
     * Sets the codigoAfinidad value for this DatosTarjetaType.
     * 
     * @param codigoAfinidad
     */
    public void setCodigoAfinidad(java.lang.Integer codigoAfinidad) {
        this.codigoAfinidad = codigoAfinidad;
    }


    /**
     * Gets the descripcionAfinidad value for this DatosTarjetaType.
     * 
     * @return descripcionAfinidad
     */
    public java.lang.String getDescripcionAfinidad() {
        return descripcionAfinidad;
    }


    /**
     * Sets the descripcionAfinidad value for this DatosTarjetaType.
     * 
     * @param descripcionAfinidad
     */
    public void setDescripcionAfinidad(java.lang.String descripcionAfinidad) {
        this.descripcionAfinidad = descripcionAfinidad;
    }


    /**
     * Gets the codigoSocio value for this DatosTarjetaType.
     * 
     * @return codigoSocio
     */
    public java.lang.Integer getCodigoSocio() {
        return codigoSocio;
    }


    /**
     * Sets the codigoSocio value for this DatosTarjetaType.
     * 
     * @param codigoSocio
     */
    public void setCodigoSocio(java.lang.Integer codigoSocio) {
        this.codigoSocio = codigoSocio;
    }


    /**
     * Gets the offset value for this DatosTarjetaType.
     * 
     * @return offset
     */
    public java.lang.Integer getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this DatosTarjetaType.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Integer offset) {
        this.offset = offset;
    }


    /**
     * Gets the fechaVencimientoActual value for this DatosTarjetaType.
     * 
     * @return fechaVencimientoActual
     */
    public java.util.Date getFechaVencimientoActual() {
        return fechaVencimientoActual;
    }


    /**
     * Sets the fechaVencimientoActual value for this DatosTarjetaType.
     * 
     * @param fechaVencimientoActual
     */
    public void setFechaVencimientoActual(java.util.Date fechaVencimientoActual) {
        this.fechaVencimientoActual = fechaVencimientoActual;
    }


    /**
     * Gets the fechaVencimientoAnterior value for this DatosTarjetaType.
     * 
     * @return fechaVencimientoAnterior
     */
    public java.util.Date getFechaVencimientoAnterior() {
        return fechaVencimientoAnterior;
    }


    /**
     * Sets the fechaVencimientoAnterior value for this DatosTarjetaType.
     * 
     * @param fechaVencimientoAnterior
     */
    public void setFechaVencimientoAnterior(java.util.Date fechaVencimientoAnterior) {
        this.fechaVencimientoAnterior = fechaVencimientoAnterior;
    }


    /**
     * Gets the flagActivacionTarjetaActual value for this DatosTarjetaType.
     * 
     * @return flagActivacionTarjetaActual
     */
    public java.lang.String getFlagActivacionTarjetaActual() {
        return flagActivacionTarjetaActual;
    }


    /**
     * Sets the flagActivacionTarjetaActual value for this DatosTarjetaType.
     * 
     * @param flagActivacionTarjetaActual
     */
    public void setFlagActivacionTarjetaActual(java.lang.String flagActivacionTarjetaActual) {
        this.flagActivacionTarjetaActual = flagActivacionTarjetaActual;
    }


    /**
     * Gets the flagActivacionTarjetaAnterior value for this DatosTarjetaType.
     * 
     * @return flagActivacionTarjetaAnterior
     */
    public java.lang.String getFlagActivacionTarjetaAnterior() {
        return flagActivacionTarjetaAnterior;
    }


    /**
     * Sets the flagActivacionTarjetaAnterior value for this DatosTarjetaType.
     * 
     * @param flagActivacionTarjetaAnterior
     */
    public void setFlagActivacionTarjetaAnterior(java.lang.String flagActivacionTarjetaAnterior) {
        this.flagActivacionTarjetaAnterior = flagActivacionTarjetaAnterior;
    }


    /**
     * Gets the accion value for this DatosTarjetaType.
     * 
     * @return accion
     */
    public java.lang.Integer getAccion() {
        return accion;
    }


    /**
     * Sets the accion value for this DatosTarjetaType.
     * 
     * @param accion
     */
    public void setAccion(java.lang.Integer accion) {
        this.accion = accion;
    }


    /**
     * Gets the tarjetasRequeridas value for this DatosTarjetaType.
     * 
     * @return tarjetasRequeridas
     */
    public java.lang.Integer getTarjetasRequeridas() {
        return tarjetasRequeridas;
    }


    /**
     * Sets the tarjetasRequeridas value for this DatosTarjetaType.
     * 
     * @param tarjetasRequeridas
     */
    public void setTarjetasRequeridas(java.lang.Integer tarjetasRequeridas) {
        this.tarjetasRequeridas = tarjetasRequeridas;
    }


    /**
     * Gets the fechaActivacion value for this DatosTarjetaType.
     * 
     * @return fechaActivacion
     */
    public java.util.Date getFechaActivacion() {
        return fechaActivacion;
    }


    /**
     * Sets the fechaActivacion value for this DatosTarjetaType.
     * 
     * @param fechaActivacion
     */
    public void setFechaActivacion(java.util.Date fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }


    /**
     * Gets the fechaApertura value for this DatosTarjetaType.
     * 
     * @return fechaApertura
     */
    public java.util.Date getFechaApertura() {
        return fechaApertura;
    }


    /**
     * Sets the fechaApertura value for this DatosTarjetaType.
     * 
     * @param fechaApertura
     */
    public void setFechaApertura(java.util.Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }


    /**
     * Gets the fechaModificacionTarjeta value for this DatosTarjetaType.
     * 
     * @return fechaModificacionTarjeta
     */
    public java.util.Date getFechaModificacionTarjeta() {
        return fechaModificacionTarjeta;
    }


    /**
     * Sets the fechaModificacionTarjeta value for this DatosTarjetaType.
     * 
     * @param fechaModificacionTarjeta
     */
    public void setFechaModificacionTarjeta(java.util.Date fechaModificacionTarjeta) {
        this.fechaModificacionTarjeta = fechaModificacionTarjeta;
    }


    /**
     * Gets the memberSince value for this DatosTarjetaType.
     * 
     * @return memberSince
     */
    public java.lang.Integer getMemberSince() {
        return memberSince;
    }


    /**
     * Sets the memberSince value for this DatosTarjetaType.
     * 
     * @param memberSince
     */
    public void setMemberSince(java.lang.Integer memberSince) {
        this.memberSince = memberSince;
    }


    /**
     * Gets the cupoComprasNacional value for this DatosTarjetaType.
     * 
     * @return cupoComprasNacional
     */
    public java.lang.Integer getCupoComprasNacional() {
        return cupoComprasNacional;
    }


    /**
     * Sets the cupoComprasNacional value for this DatosTarjetaType.
     * 
     * @param cupoComprasNacional
     */
    public void setCupoComprasNacional(java.lang.Integer cupoComprasNacional) {
        this.cupoComprasNacional = cupoComprasNacional;
    }


    /**
     * Gets the cupoComprasInternacional value for this DatosTarjetaType.
     * 
     * @return cupoComprasInternacional
     */
    public java.lang.Double getCupoComprasInternacional() {
        return cupoComprasInternacional;
    }


    /**
     * Sets the cupoComprasInternacional value for this DatosTarjetaType.
     * 
     * @param cupoComprasInternacional
     */
    public void setCupoComprasInternacional(java.lang.Double cupoComprasInternacional) {
        this.cupoComprasInternacional = cupoComprasInternacional;
    }


    /**
     * Gets the cupoAvancesNacional value for this DatosTarjetaType.
     * 
     * @return cupoAvancesNacional
     */
    public java.lang.Integer getCupoAvancesNacional() {
        return cupoAvancesNacional;
    }


    /**
     * Sets the cupoAvancesNacional value for this DatosTarjetaType.
     * 
     * @param cupoAvancesNacional
     */
    public void setCupoAvancesNacional(java.lang.Integer cupoAvancesNacional) {
        this.cupoAvancesNacional = cupoAvancesNacional;
    }


    /**
     * Gets the cupoAvancesInternacional value for this DatosTarjetaType.
     * 
     * @return cupoAvancesInternacional
     */
    public java.lang.Double getCupoAvancesInternacional() {
        return cupoAvancesInternacional;
    }


    /**
     * Sets the cupoAvancesInternacional value for this DatosTarjetaType.
     * 
     * @param cupoAvancesInternacional
     */
    public void setCupoAvancesInternacional(java.lang.Double cupoAvancesInternacional) {
        this.cupoAvancesInternacional = cupoAvancesInternacional;
    }


    /**
     * Gets the cupoLinea2 value for this DatosTarjetaType.
     * 
     * @return cupoLinea2
     */
    public java.lang.Integer getCupoLinea2() {
        return cupoLinea2;
    }


    /**
     * Sets the cupoLinea2 value for this DatosTarjetaType.
     * 
     * @param cupoLinea2
     */
    public void setCupoLinea2(java.lang.Integer cupoLinea2) {
        this.cupoLinea2 = cupoLinea2;
    }


    /**
     * Gets the deudaComprasNacional value for this DatosTarjetaType.
     * 
     * @return deudaComprasNacional
     */
    public java.lang.Integer getDeudaComprasNacional() {
        return deudaComprasNacional;
    }


    /**
     * Sets the deudaComprasNacional value for this DatosTarjetaType.
     * 
     * @param deudaComprasNacional
     */
    public void setDeudaComprasNacional(java.lang.Integer deudaComprasNacional) {
        this.deudaComprasNacional = deudaComprasNacional;
    }


    /**
     * Gets the deudaComprasInternacional value for this DatosTarjetaType.
     * 
     * @return deudaComprasInternacional
     */
    public java.lang.Double getDeudaComprasInternacional() {
        return deudaComprasInternacional;
    }


    /**
     * Sets the deudaComprasInternacional value for this DatosTarjetaType.
     * 
     * @param deudaComprasInternacional
     */
    public void setDeudaComprasInternacional(java.lang.Double deudaComprasInternacional) {
        this.deudaComprasInternacional = deudaComprasInternacional;
    }


    /**
     * Gets the deudaAvancesNacional value for this DatosTarjetaType.
     * 
     * @return deudaAvancesNacional
     */
    public java.lang.Integer getDeudaAvancesNacional() {
        return deudaAvancesNacional;
    }


    /**
     * Sets the deudaAvancesNacional value for this DatosTarjetaType.
     * 
     * @param deudaAvancesNacional
     */
    public void setDeudaAvancesNacional(java.lang.Integer deudaAvancesNacional) {
        this.deudaAvancesNacional = deudaAvancesNacional;
    }


    /**
     * Gets the deudaAvancesInternacional value for this DatosTarjetaType.
     * 
     * @return deudaAvancesInternacional
     */
    public java.lang.Double getDeudaAvancesInternacional() {
        return deudaAvancesInternacional;
    }


    /**
     * Sets the deudaAvancesInternacional value for this DatosTarjetaType.
     * 
     * @param deudaAvancesInternacional
     */
    public void setDeudaAvancesInternacional(java.lang.Double deudaAvancesInternacional) {
        this.deudaAvancesInternacional = deudaAvancesInternacional;
    }


    /**
     * Gets the deudaLinea2 value for this DatosTarjetaType.
     * 
     * @return deudaLinea2
     */
    public java.lang.Integer getDeudaLinea2() {
        return deudaLinea2;
    }


    /**
     * Sets the deudaLinea2 value for this DatosTarjetaType.
     * 
     * @param deudaLinea2
     */
    public void setDeudaLinea2(java.lang.Integer deudaLinea2) {
        this.deudaLinea2 = deudaLinea2;
    }


    /**
     * Gets the disponibleComprasNacional value for this DatosTarjetaType.
     * 
     * @return disponibleComprasNacional
     */
    public java.lang.Integer getDisponibleComprasNacional() {
        return disponibleComprasNacional;
    }


    /**
     * Sets the disponibleComprasNacional value for this DatosTarjetaType.
     * 
     * @param disponibleComprasNacional
     */
    public void setDisponibleComprasNacional(java.lang.Integer disponibleComprasNacional) {
        this.disponibleComprasNacional = disponibleComprasNacional;
    }


    /**
     * Gets the disponibleComprasInternacional value for this DatosTarjetaType.
     * 
     * @return disponibleComprasInternacional
     */
    public java.lang.Double getDisponibleComprasInternacional() {
        return disponibleComprasInternacional;
    }


    /**
     * Sets the disponibleComprasInternacional value for this DatosTarjetaType.
     * 
     * @param disponibleComprasInternacional
     */
    public void setDisponibleComprasInternacional(java.lang.Double disponibleComprasInternacional) {
        this.disponibleComprasInternacional = disponibleComprasInternacional;
    }


    /**
     * Gets the disponibleAvancesNacional value for this DatosTarjetaType.
     * 
     * @return disponibleAvancesNacional
     */
    public java.lang.Integer getDisponibleAvancesNacional() {
        return disponibleAvancesNacional;
    }


    /**
     * Sets the disponibleAvancesNacional value for this DatosTarjetaType.
     * 
     * @param disponibleAvancesNacional
     */
    public void setDisponibleAvancesNacional(java.lang.Integer disponibleAvancesNacional) {
        this.disponibleAvancesNacional = disponibleAvancesNacional;
    }


    /**
     * Gets the disponibleAvancesInternacional value for this DatosTarjetaType.
     * 
     * @return disponibleAvancesInternacional
     */
    public java.lang.Double getDisponibleAvancesInternacional() {
        return disponibleAvancesInternacional;
    }


    /**
     * Sets the disponibleAvancesInternacional value for this DatosTarjetaType.
     * 
     * @param disponibleAvancesInternacional
     */
    public void setDisponibleAvancesInternacional(java.lang.Double disponibleAvancesInternacional) {
        this.disponibleAvancesInternacional = disponibleAvancesInternacional;
    }


    /**
     * Gets the disponibleLinea2 value for this DatosTarjetaType.
     * 
     * @return disponibleLinea2
     */
    public java.lang.Integer getDisponibleLinea2() {
        return disponibleLinea2;
    }


    /**
     * Sets the disponibleLinea2 value for this DatosTarjetaType.
     * 
     * @param disponibleLinea2
     */
    public void setDisponibleLinea2(java.lang.Integer disponibleLinea2) {
        this.disponibleLinea2 = disponibleLinea2;
    }


    /**
     * Gets the monto1 value for this DatosTarjetaType.
     * 
     * @return monto1
     */
    public java.lang.Double getMonto1() {
        return monto1;
    }


    /**
     * Sets the monto1 value for this DatosTarjetaType.
     * 
     * @param monto1
     */
    public void setMonto1(java.lang.Double monto1) {
        this.monto1 = monto1;
    }


    /**
     * Gets the monto2 value for this DatosTarjetaType.
     * 
     * @return monto2
     */
    public java.lang.Double getMonto2() {
        return monto2;
    }


    /**
     * Sets the monto2 value for this DatosTarjetaType.
     * 
     * @param monto2
     */
    public void setMonto2(java.lang.Double monto2) {
        this.monto2 = monto2;
    }


    /**
     * Gets the monto3 value for this DatosTarjetaType.
     * 
     * @return monto3
     */
    public java.lang.Double getMonto3() {
        return monto3;
    }


    /**
     * Sets the monto3 value for this DatosTarjetaType.
     * 
     * @param monto3
     */
    public void setMonto3(java.lang.Double monto3) {
        this.monto3 = monto3;
    }


    /**
     * Gets the numero1 value for this DatosTarjetaType.
     * 
     * @return numero1
     */
    public java.lang.Integer getNumero1() {
        return numero1;
    }


    /**
     * Sets the numero1 value for this DatosTarjetaType.
     * 
     * @param numero1
     */
    public void setNumero1(java.lang.Integer numero1) {
        this.numero1 = numero1;
    }


    /**
     * Gets the numero2 value for this DatosTarjetaType.
     * 
     * @return numero2
     */
    public java.lang.Integer getNumero2() {
        return numero2;
    }


    /**
     * Sets the numero2 value for this DatosTarjetaType.
     * 
     * @param numero2
     */
    public void setNumero2(java.lang.Integer numero2) {
        this.numero2 = numero2;
    }


    /**
     * Gets the numero3 value for this DatosTarjetaType.
     * 
     * @return numero3
     */
    public java.lang.Integer getNumero3() {
        return numero3;
    }


    /**
     * Sets the numero3 value for this DatosTarjetaType.
     * 
     * @param numero3
     */
    public void setNumero3(java.lang.Integer numero3) {
        this.numero3 = numero3;
    }


    /**
     * Gets the flag1 value for this DatosTarjetaType.
     * 
     * @return flag1
     */
    public java.lang.String getFlag1() {
        return flag1;
    }


    /**
     * Sets the flag1 value for this DatosTarjetaType.
     * 
     * @param flag1
     */
    public void setFlag1(java.lang.String flag1) {
        this.flag1 = flag1;
    }


    /**
     * Gets the flag2 value for this DatosTarjetaType.
     * 
     * @return flag2
     */
    public java.lang.String getFlag2() {
        return flag2;
    }


    /**
     * Sets the flag2 value for this DatosTarjetaType.
     * 
     * @param flag2
     */
    public void setFlag2(java.lang.String flag2) {
        this.flag2 = flag2;
    }


    /**
     * Gets the flag3 value for this DatosTarjetaType.
     * 
     * @return flag3
     */
    public java.lang.String getFlag3() {
        return flag3;
    }


    /**
     * Sets the flag3 value for this DatosTarjetaType.
     * 
     * @param flag3
     */
    public void setFlag3(java.lang.String flag3) {
        this.flag3 = flag3;
    }


    /**
     * Gets the string1 value for this DatosTarjetaType.
     * 
     * @return string1
     */
    public java.lang.String getString1() {
        return string1;
    }


    /**
     * Sets the string1 value for this DatosTarjetaType.
     * 
     * @param string1
     */
    public void setString1(java.lang.String string1) {
        this.string1 = string1;
    }


    /**
     * Gets the string2 value for this DatosTarjetaType.
     * 
     * @return string2
     */
    public java.lang.String getString2() {
        return string2;
    }


    /**
     * Sets the string2 value for this DatosTarjetaType.
     * 
     * @param string2
     */
    public void setString2(java.lang.String string2) {
        this.string2 = string2;
    }


    /**
     * Gets the string3 value for this DatosTarjetaType.
     * 
     * @return string3
     */
    public java.lang.String getString3() {
        return string3;
    }


    /**
     * Sets the string3 value for this DatosTarjetaType.
     * 
     * @param string3
     */
    public void setString3(java.lang.String string3) {
        this.string3 = string3;
    }


    /**
     * Gets the filler value for this DatosTarjetaType.
     * 
     * @return filler
     */
    public java.lang.String getFiller() {
        return filler;
    }


    /**
     * Sets the filler value for this DatosTarjetaType.
     * 
     * @param filler
     */
    public void setFiller(java.lang.String filler) {
        this.filler = filler;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosTarjetaType)) return false;
        DatosTarjetaType other = (DatosTarjetaType) obj;
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
            ((this.numeroSecuencia==null && other.getNumeroSecuencia()==null) || 
             (this.numeroSecuencia!=null &&
              this.numeroSecuencia.equals(other.getNumeroSecuencia()))) &&
            ((this.nombreTarjetaHabiente==null && other.getNombreTarjetaHabiente()==null) || 
             (this.nombreTarjetaHabiente!=null &&
              this.nombreTarjetaHabiente.equals(other.getNombreTarjetaHabiente()))) &&
            ((this.nombreEmpresa==null && other.getNombreEmpresa()==null) || 
             (this.nombreEmpresa!=null &&
              this.nombreEmpresa.equals(other.getNombreEmpresa()))) &&
            ((this.rutdvTarjetaHabiente==null && other.getRutdvTarjetaHabiente()==null) || 
             (this.rutdvTarjetaHabiente!=null &&
              this.rutdvTarjetaHabiente.equals(other.getRutdvTarjetaHabiente()))) &&
            ((this.sexo==null && other.getSexo()==null) || 
             (this.sexo!=null &&
              this.sexo.equals(other.getSexo()))) &&
            ((this.estadoCivil==null && other.getEstadoCivil()==null) || 
             (this.estadoCivil!=null &&
              this.estadoCivil.equals(other.getEstadoCivil()))) &&
            ((this.tipoTarjeta==null && other.getTipoTarjeta()==null) || 
             (this.tipoTarjeta!=null &&
              this.tipoTarjeta.equals(other.getTipoTarjeta()))) &&
            ((this.estadoTarjeta==null && other.getEstadoTarjeta()==null) || 
             (this.estadoTarjeta!=null &&
              this.estadoTarjeta.equals(other.getEstadoTarjeta()))) &&
            ((this.fechaVencimientoTarjeta==null && other.getFechaVencimientoTarjeta()==null) || 
             (this.fechaVencimientoTarjeta!=null &&
              this.fechaVencimientoTarjeta.equals(other.getFechaVencimientoTarjeta()))) &&
            ((this.codigoBloqueo==null && other.getCodigoBloqueo()==null) || 
             (this.codigoBloqueo!=null &&
              this.codigoBloqueo.equals(other.getCodigoBloqueo()))) &&
            ((this.fechaBloqueo==null && other.getFechaBloqueo()==null) || 
             (this.fechaBloqueo!=null &&
              this.fechaBloqueo.equals(other.getFechaBloqueo()))) &&
            ((this.codigoAfinidad==null && other.getCodigoAfinidad()==null) || 
             (this.codigoAfinidad!=null &&
              this.codigoAfinidad.equals(other.getCodigoAfinidad()))) &&
            ((this.descripcionAfinidad==null && other.getDescripcionAfinidad()==null) || 
             (this.descripcionAfinidad!=null &&
              this.descripcionAfinidad.equals(other.getDescripcionAfinidad()))) &&
            ((this.codigoSocio==null && other.getCodigoSocio()==null) || 
             (this.codigoSocio!=null &&
              this.codigoSocio.equals(other.getCodigoSocio()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.fechaVencimientoActual==null && other.getFechaVencimientoActual()==null) || 
             (this.fechaVencimientoActual!=null &&
              this.fechaVencimientoActual.equals(other.getFechaVencimientoActual()))) &&
            ((this.fechaVencimientoAnterior==null && other.getFechaVencimientoAnterior()==null) || 
             (this.fechaVencimientoAnterior!=null &&
              this.fechaVencimientoAnterior.equals(other.getFechaVencimientoAnterior()))) &&
            ((this.flagActivacionTarjetaActual==null && other.getFlagActivacionTarjetaActual()==null) || 
             (this.flagActivacionTarjetaActual!=null &&
              this.flagActivacionTarjetaActual.equals(other.getFlagActivacionTarjetaActual()))) &&
            ((this.flagActivacionTarjetaAnterior==null && other.getFlagActivacionTarjetaAnterior()==null) || 
             (this.flagActivacionTarjetaAnterior!=null &&
              this.flagActivacionTarjetaAnterior.equals(other.getFlagActivacionTarjetaAnterior()))) &&
            ((this.accion==null && other.getAccion()==null) || 
             (this.accion!=null &&
              this.accion.equals(other.getAccion()))) &&
            ((this.tarjetasRequeridas==null && other.getTarjetasRequeridas()==null) || 
             (this.tarjetasRequeridas!=null &&
              this.tarjetasRequeridas.equals(other.getTarjetasRequeridas()))) &&
            ((this.fechaActivacion==null && other.getFechaActivacion()==null) || 
             (this.fechaActivacion!=null &&
              this.fechaActivacion.equals(other.getFechaActivacion()))) &&
            ((this.fechaApertura==null && other.getFechaApertura()==null) || 
             (this.fechaApertura!=null &&
              this.fechaApertura.equals(other.getFechaApertura()))) &&
            ((this.fechaModificacionTarjeta==null && other.getFechaModificacionTarjeta()==null) || 
             (this.fechaModificacionTarjeta!=null &&
              this.fechaModificacionTarjeta.equals(other.getFechaModificacionTarjeta()))) &&
            ((this.memberSince==null && other.getMemberSince()==null) || 
             (this.memberSince!=null &&
              this.memberSince.equals(other.getMemberSince()))) &&
            ((this.cupoComprasNacional==null && other.getCupoComprasNacional()==null) || 
             (this.cupoComprasNacional!=null &&
              this.cupoComprasNacional.equals(other.getCupoComprasNacional()))) &&
            ((this.cupoComprasInternacional==null && other.getCupoComprasInternacional()==null) || 
             (this.cupoComprasInternacional!=null &&
              this.cupoComprasInternacional.equals(other.getCupoComprasInternacional()))) &&
            ((this.cupoAvancesNacional==null && other.getCupoAvancesNacional()==null) || 
             (this.cupoAvancesNacional!=null &&
              this.cupoAvancesNacional.equals(other.getCupoAvancesNacional()))) &&
            ((this.cupoAvancesInternacional==null && other.getCupoAvancesInternacional()==null) || 
             (this.cupoAvancesInternacional!=null &&
              this.cupoAvancesInternacional.equals(other.getCupoAvancesInternacional()))) &&
            ((this.cupoLinea2==null && other.getCupoLinea2()==null) || 
             (this.cupoLinea2!=null &&
              this.cupoLinea2.equals(other.getCupoLinea2()))) &&
            ((this.deudaComprasNacional==null && other.getDeudaComprasNacional()==null) || 
             (this.deudaComprasNacional!=null &&
              this.deudaComprasNacional.equals(other.getDeudaComprasNacional()))) &&
            ((this.deudaComprasInternacional==null && other.getDeudaComprasInternacional()==null) || 
             (this.deudaComprasInternacional!=null &&
              this.deudaComprasInternacional.equals(other.getDeudaComprasInternacional()))) &&
            ((this.deudaAvancesNacional==null && other.getDeudaAvancesNacional()==null) || 
             (this.deudaAvancesNacional!=null &&
              this.deudaAvancesNacional.equals(other.getDeudaAvancesNacional()))) &&
            ((this.deudaAvancesInternacional==null && other.getDeudaAvancesInternacional()==null) || 
             (this.deudaAvancesInternacional!=null &&
              this.deudaAvancesInternacional.equals(other.getDeudaAvancesInternacional()))) &&
            ((this.deudaLinea2==null && other.getDeudaLinea2()==null) || 
             (this.deudaLinea2!=null &&
              this.deudaLinea2.equals(other.getDeudaLinea2()))) &&
            ((this.disponibleComprasNacional==null && other.getDisponibleComprasNacional()==null) || 
             (this.disponibleComprasNacional!=null &&
              this.disponibleComprasNacional.equals(other.getDisponibleComprasNacional()))) &&
            ((this.disponibleComprasInternacional==null && other.getDisponibleComprasInternacional()==null) || 
             (this.disponibleComprasInternacional!=null &&
              this.disponibleComprasInternacional.equals(other.getDisponibleComprasInternacional()))) &&
            ((this.disponibleAvancesNacional==null && other.getDisponibleAvancesNacional()==null) || 
             (this.disponibleAvancesNacional!=null &&
              this.disponibleAvancesNacional.equals(other.getDisponibleAvancesNacional()))) &&
            ((this.disponibleAvancesInternacional==null && other.getDisponibleAvancesInternacional()==null) || 
             (this.disponibleAvancesInternacional!=null &&
              this.disponibleAvancesInternacional.equals(other.getDisponibleAvancesInternacional()))) &&
            ((this.disponibleLinea2==null && other.getDisponibleLinea2()==null) || 
             (this.disponibleLinea2!=null &&
              this.disponibleLinea2.equals(other.getDisponibleLinea2()))) &&
            ((this.monto1==null && other.getMonto1()==null) || 
             (this.monto1!=null &&
              this.monto1.equals(other.getMonto1()))) &&
            ((this.monto2==null && other.getMonto2()==null) || 
             (this.monto2!=null &&
              this.monto2.equals(other.getMonto2()))) &&
            ((this.monto3==null && other.getMonto3()==null) || 
             (this.monto3!=null &&
              this.monto3.equals(other.getMonto3()))) &&
            ((this.numero1==null && other.getNumero1()==null) || 
             (this.numero1!=null &&
              this.numero1.equals(other.getNumero1()))) &&
            ((this.numero2==null && other.getNumero2()==null) || 
             (this.numero2!=null &&
              this.numero2.equals(other.getNumero2()))) &&
            ((this.numero3==null && other.getNumero3()==null) || 
             (this.numero3!=null &&
              this.numero3.equals(other.getNumero3()))) &&
            ((this.flag1==null && other.getFlag1()==null) || 
             (this.flag1!=null &&
              this.flag1.equals(other.getFlag1()))) &&
            ((this.flag2==null && other.getFlag2()==null) || 
             (this.flag2!=null &&
              this.flag2.equals(other.getFlag2()))) &&
            ((this.flag3==null && other.getFlag3()==null) || 
             (this.flag3!=null &&
              this.flag3.equals(other.getFlag3()))) &&
            ((this.string1==null && other.getString1()==null) || 
             (this.string1!=null &&
              this.string1.equals(other.getString1()))) &&
            ((this.string2==null && other.getString2()==null) || 
             (this.string2!=null &&
              this.string2.equals(other.getString2()))) &&
            ((this.string3==null && other.getString3()==null) || 
             (this.string3!=null &&
              this.string3.equals(other.getString3()))) &&
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
        if (getNumeroTarjeta() != null) {
            _hashCode += getNumeroTarjeta().hashCode();
        }
        if (getNumeroSecuencia() != null) {
            _hashCode += getNumeroSecuencia().hashCode();
        }
        if (getNombreTarjetaHabiente() != null) {
            _hashCode += getNombreTarjetaHabiente().hashCode();
        }
        if (getNombreEmpresa() != null) {
            _hashCode += getNombreEmpresa().hashCode();
        }
        if (getRutdvTarjetaHabiente() != null) {
            _hashCode += getRutdvTarjetaHabiente().hashCode();
        }
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        if (getEstadoCivil() != null) {
            _hashCode += getEstadoCivil().hashCode();
        }
        if (getTipoTarjeta() != null) {
            _hashCode += getTipoTarjeta().hashCode();
        }
        if (getEstadoTarjeta() != null) {
            _hashCode += getEstadoTarjeta().hashCode();
        }
        if (getFechaVencimientoTarjeta() != null) {
            _hashCode += getFechaVencimientoTarjeta().hashCode();
        }
        if (getCodigoBloqueo() != null) {
            _hashCode += getCodigoBloqueo().hashCode();
        }
        if (getFechaBloqueo() != null) {
            _hashCode += getFechaBloqueo().hashCode();
        }
        if (getCodigoAfinidad() != null) {
            _hashCode += getCodigoAfinidad().hashCode();
        }
        if (getDescripcionAfinidad() != null) {
            _hashCode += getDescripcionAfinidad().hashCode();
        }
        if (getCodigoSocio() != null) {
            _hashCode += getCodigoSocio().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getFechaVencimientoActual() != null) {
            _hashCode += getFechaVencimientoActual().hashCode();
        }
        if (getFechaVencimientoAnterior() != null) {
            _hashCode += getFechaVencimientoAnterior().hashCode();
        }
        if (getFlagActivacionTarjetaActual() != null) {
            _hashCode += getFlagActivacionTarjetaActual().hashCode();
        }
        if (getFlagActivacionTarjetaAnterior() != null) {
            _hashCode += getFlagActivacionTarjetaAnterior().hashCode();
        }
        if (getAccion() != null) {
            _hashCode += getAccion().hashCode();
        }
        if (getTarjetasRequeridas() != null) {
            _hashCode += getTarjetasRequeridas().hashCode();
        }
        if (getFechaActivacion() != null) {
            _hashCode += getFechaActivacion().hashCode();
        }
        if (getFechaApertura() != null) {
            _hashCode += getFechaApertura().hashCode();
        }
        if (getFechaModificacionTarjeta() != null) {
            _hashCode += getFechaModificacionTarjeta().hashCode();
        }
        if (getMemberSince() != null) {
            _hashCode += getMemberSince().hashCode();
        }
        if (getCupoComprasNacional() != null) {
            _hashCode += getCupoComprasNacional().hashCode();
        }
        if (getCupoComprasInternacional() != null) {
            _hashCode += getCupoComprasInternacional().hashCode();
        }
        if (getCupoAvancesNacional() != null) {
            _hashCode += getCupoAvancesNacional().hashCode();
        }
        if (getCupoAvancesInternacional() != null) {
            _hashCode += getCupoAvancesInternacional().hashCode();
        }
        if (getCupoLinea2() != null) {
            _hashCode += getCupoLinea2().hashCode();
        }
        if (getDeudaComprasNacional() != null) {
            _hashCode += getDeudaComprasNacional().hashCode();
        }
        if (getDeudaComprasInternacional() != null) {
            _hashCode += getDeudaComprasInternacional().hashCode();
        }
        if (getDeudaAvancesNacional() != null) {
            _hashCode += getDeudaAvancesNacional().hashCode();
        }
        if (getDeudaAvancesInternacional() != null) {
            _hashCode += getDeudaAvancesInternacional().hashCode();
        }
        if (getDeudaLinea2() != null) {
            _hashCode += getDeudaLinea2().hashCode();
        }
        if (getDisponibleComprasNacional() != null) {
            _hashCode += getDisponibleComprasNacional().hashCode();
        }
        if (getDisponibleComprasInternacional() != null) {
            _hashCode += getDisponibleComprasInternacional().hashCode();
        }
        if (getDisponibleAvancesNacional() != null) {
            _hashCode += getDisponibleAvancesNacional().hashCode();
        }
        if (getDisponibleAvancesInternacional() != null) {
            _hashCode += getDisponibleAvancesInternacional().hashCode();
        }
        if (getDisponibleLinea2() != null) {
            _hashCode += getDisponibleLinea2().hashCode();
        }
        if (getMonto1() != null) {
            _hashCode += getMonto1().hashCode();
        }
        if (getMonto2() != null) {
            _hashCode += getMonto2().hashCode();
        }
        if (getMonto3() != null) {
            _hashCode += getMonto3().hashCode();
        }
        if (getNumero1() != null) {
            _hashCode += getNumero1().hashCode();
        }
        if (getNumero2() != null) {
            _hashCode += getNumero2().hashCode();
        }
        if (getNumero3() != null) {
            _hashCode += getNumero3().hashCode();
        }
        if (getFlag1() != null) {
            _hashCode += getFlag1().hashCode();
        }
        if (getFlag2() != null) {
            _hashCode += getFlag2().hashCode();
        }
        if (getFlag3() != null) {
            _hashCode += getFlag3().hashCode();
        }
        if (getString1() != null) {
            _hashCode += getString1().hashCode();
        }
        if (getString2() != null) {
            _hashCode += getString2().hashCode();
        }
        if (getString3() != null) {
            _hashCode += getString3().hashCode();
        }
        if (getFiller() != null) {
            _hashCode += getFiller().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosTarjetaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosTarjetaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSecuencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroSecuencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreTarjetaHabiente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "nombreTarjetaHabiente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "nombreEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutdvTarjetaHabiente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "rutdvTarjetaHabiente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "sexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoCivil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "estadoCivil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "tipoTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "estadoTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVencimientoTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaVencimientoTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoBloqueo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoBloqueo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaBloqueo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaBloqueo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAfinidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoAfinidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionAfinidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "descripcionAfinidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoSocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVencimientoActual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaVencimientoActual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVencimientoAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaVencimientoAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagActivacionTarjetaActual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "flagActivacionTarjetaActual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagActivacionTarjetaAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "flagActivacionTarjetaAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "accion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjetasRequeridas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "tarjetasRequeridas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaActivacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaActivacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaApertura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaApertura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaModificacionTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaModificacionTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberSince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "memberSince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cupoComprasNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "cupoComprasNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cupoComprasInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "cupoComprasInternacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cupoAvancesNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "cupoAvancesNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cupoAvancesInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "cupoAvancesInternacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cupoLinea2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "cupoLinea2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deudaComprasNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "deudaComprasNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deudaComprasInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "deudaComprasInternacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deudaAvancesNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "deudaAvancesNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deudaAvancesInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "deudaAvancesInternacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deudaLinea2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "deudaLinea2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibleComprasNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "disponibleComprasNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibleComprasInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "disponibleComprasInternacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibleAvancesNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "disponibleAvancesNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibleAvancesInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "disponibleAvancesInternacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibleLinea2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "disponibleLinea2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("monto3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "monto3"));
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
        elemField.setFieldName("numero3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numero3"));
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
        elemField.setFieldName("flag3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "flag3"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("string3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "string3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
