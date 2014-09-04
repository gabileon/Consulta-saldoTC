/**
 * DatosTarjetaAutorizadorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse;

public class DatosTarjetaAutorizadorType  implements java.io.Serializable {
    private java.lang.String numeroTarjeta;

    private java.lang.Integer numeroSecuencia;

    private java.lang.Integer status;

    private java.lang.Integer status2;

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

    private java.lang.Integer disponibleFlotanteCuotasLinea2;

    private java.lang.Integer disponibleFlotanteAvancesLinea2;

    private java.lang.Integer disponibleFlotanteAvancesEnCuotasLinea1Linea2;

    private java.lang.Integer autorizacionesPendientesLinea1;

    private java.lang.Integer autorizacionesPendientesLinea2;

    private java.util.Date fechaVencimientoTarjeta;

    private java.lang.String nombreBandaMagnetica;

    private java.lang.Integer offset;

    private java.lang.String CVV2;

    private java.lang.String flagCuotaFijaTarjeta;

    private java.lang.String flagAvanceCuotasTarjeta;

    private java.lang.String flagNCuotasTarjeta;

    private java.lang.String flag3CPCTarjeta;

    private java.lang.String flagCompraNormalTarjeta;

    private java.lang.String flagAvanceEfectivoTarjeta;

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

    public DatosTarjetaAutorizadorType() {
    }

    public DatosTarjetaAutorizadorType(
           java.lang.String numeroTarjeta,
           java.lang.Integer numeroSecuencia,
           java.lang.Integer status,
           java.lang.Integer status2,
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
           java.lang.Integer disponibleFlotanteCuotasLinea2,
           java.lang.Integer disponibleFlotanteAvancesLinea2,
           java.lang.Integer disponibleFlotanteAvancesEnCuotasLinea1Linea2,
           java.lang.Integer autorizacionesPendientesLinea1,
           java.lang.Integer autorizacionesPendientesLinea2,
           java.util.Date fechaVencimientoTarjeta,
           java.lang.String nombreBandaMagnetica,
           java.lang.Integer offset,
           java.lang.String CVV2,
           java.lang.String flagCuotaFijaTarjeta,
           java.lang.String flagAvanceCuotasTarjeta,
           java.lang.String flagNCuotasTarjeta,
           java.lang.String flag3CPCTarjeta,
           java.lang.String flagCompraNormalTarjeta,
           java.lang.String flagAvanceEfectivoTarjeta,
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
           this.status = status;
           this.status2 = status2;
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
           this.disponibleFlotanteCuotasLinea2 = disponibleFlotanteCuotasLinea2;
           this.disponibleFlotanteAvancesLinea2 = disponibleFlotanteAvancesLinea2;
           this.disponibleFlotanteAvancesEnCuotasLinea1Linea2 = disponibleFlotanteAvancesEnCuotasLinea1Linea2;
           this.autorizacionesPendientesLinea1 = autorizacionesPendientesLinea1;
           this.autorizacionesPendientesLinea2 = autorizacionesPendientesLinea2;
           this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
           this.nombreBandaMagnetica = nombreBandaMagnetica;
           this.offset = offset;
           this.CVV2 = CVV2;
           this.flagCuotaFijaTarjeta = flagCuotaFijaTarjeta;
           this.flagAvanceCuotasTarjeta = flagAvanceCuotasTarjeta;
           this.flagNCuotasTarjeta = flagNCuotasTarjeta;
           this.flag3CPCTarjeta = flag3CPCTarjeta;
           this.flagCompraNormalTarjeta = flagCompraNormalTarjeta;
           this.flagAvanceEfectivoTarjeta = flagAvanceEfectivoTarjeta;
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
     * Gets the numeroTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @return numeroTarjeta
     */
    public java.lang.String getNumeroTarjeta() {
        return numeroTarjeta;
    }


    /**
     * Sets the numeroTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @param numeroTarjeta
     */
    public void setNumeroTarjeta(java.lang.String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }


    /**
     * Gets the numeroSecuencia value for this DatosTarjetaAutorizadorType.
     * 
     * @return numeroSecuencia
     */
    public java.lang.Integer getNumeroSecuencia() {
        return numeroSecuencia;
    }


    /**
     * Sets the numeroSecuencia value for this DatosTarjetaAutorizadorType.
     * 
     * @param numeroSecuencia
     */
    public void setNumeroSecuencia(java.lang.Integer numeroSecuencia) {
        this.numeroSecuencia = numeroSecuencia;
    }


    /**
     * Gets the status value for this DatosTarjetaAutorizadorType.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DatosTarjetaAutorizadorType.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the status2 value for this DatosTarjetaAutorizadorType.
     * 
     * @return status2
     */
    public java.lang.Integer getStatus2() {
        return status2;
    }


    /**
     * Sets the status2 value for this DatosTarjetaAutorizadorType.
     * 
     * @param status2
     */
    public void setStatus2(java.lang.Integer status2) {
        this.status2 = status2;
    }


    /**
     * Gets the cupoComprasNacional value for this DatosTarjetaAutorizadorType.
     * 
     * @return cupoComprasNacional
     */
    public java.lang.Integer getCupoComprasNacional() {
        return cupoComprasNacional;
    }


    /**
     * Sets the cupoComprasNacional value for this DatosTarjetaAutorizadorType.
     * 
     * @param cupoComprasNacional
     */
    public void setCupoComprasNacional(java.lang.Integer cupoComprasNacional) {
        this.cupoComprasNacional = cupoComprasNacional;
    }


    /**
     * Gets the cupoComprasInternacional value for this DatosTarjetaAutorizadorType.
     * 
     * @return cupoComprasInternacional
     */
    public java.lang.Double getCupoComprasInternacional() {
        return cupoComprasInternacional;
    }


    /**
     * Sets the cupoComprasInternacional value for this DatosTarjetaAutorizadorType.
     * 
     * @param cupoComprasInternacional
     */
    public void setCupoComprasInternacional(java.lang.Double cupoComprasInternacional) {
        this.cupoComprasInternacional = cupoComprasInternacional;
    }


    /**
     * Gets the cupoAvancesNacional value for this DatosTarjetaAutorizadorType.
     * 
     * @return cupoAvancesNacional
     */
    public java.lang.Integer getCupoAvancesNacional() {
        return cupoAvancesNacional;
    }


    /**
     * Sets the cupoAvancesNacional value for this DatosTarjetaAutorizadorType.
     * 
     * @param cupoAvancesNacional
     */
    public void setCupoAvancesNacional(java.lang.Integer cupoAvancesNacional) {
        this.cupoAvancesNacional = cupoAvancesNacional;
    }


    /**
     * Gets the cupoAvancesInternacional value for this DatosTarjetaAutorizadorType.
     * 
     * @return cupoAvancesInternacional
     */
    public java.lang.Double getCupoAvancesInternacional() {
        return cupoAvancesInternacional;
    }


    /**
     * Sets the cupoAvancesInternacional value for this DatosTarjetaAutorizadorType.
     * 
     * @param cupoAvancesInternacional
     */
    public void setCupoAvancesInternacional(java.lang.Double cupoAvancesInternacional) {
        this.cupoAvancesInternacional = cupoAvancesInternacional;
    }


    /**
     * Gets the cupoLinea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @return cupoLinea2
     */
    public java.lang.Integer getCupoLinea2() {
        return cupoLinea2;
    }


    /**
     * Sets the cupoLinea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @param cupoLinea2
     */
    public void setCupoLinea2(java.lang.Integer cupoLinea2) {
        this.cupoLinea2 = cupoLinea2;
    }


    /**
     * Gets the deudaComprasNacional value for this DatosTarjetaAutorizadorType.
     * 
     * @return deudaComprasNacional
     */
    public java.lang.Integer getDeudaComprasNacional() {
        return deudaComprasNacional;
    }


    /**
     * Sets the deudaComprasNacional value for this DatosTarjetaAutorizadorType.
     * 
     * @param deudaComprasNacional
     */
    public void setDeudaComprasNacional(java.lang.Integer deudaComprasNacional) {
        this.deudaComprasNacional = deudaComprasNacional;
    }


    /**
     * Gets the deudaComprasInternacional value for this DatosTarjetaAutorizadorType.
     * 
     * @return deudaComprasInternacional
     */
    public java.lang.Double getDeudaComprasInternacional() {
        return deudaComprasInternacional;
    }


    /**
     * Sets the deudaComprasInternacional value for this DatosTarjetaAutorizadorType.
     * 
     * @param deudaComprasInternacional
     */
    public void setDeudaComprasInternacional(java.lang.Double deudaComprasInternacional) {
        this.deudaComprasInternacional = deudaComprasInternacional;
    }


    /**
     * Gets the deudaAvancesNacional value for this DatosTarjetaAutorizadorType.
     * 
     * @return deudaAvancesNacional
     */
    public java.lang.Integer getDeudaAvancesNacional() {
        return deudaAvancesNacional;
    }


    /**
     * Sets the deudaAvancesNacional value for this DatosTarjetaAutorizadorType.
     * 
     * @param deudaAvancesNacional
     */
    public void setDeudaAvancesNacional(java.lang.Integer deudaAvancesNacional) {
        this.deudaAvancesNacional = deudaAvancesNacional;
    }


    /**
     * Gets the deudaAvancesInternacional value for this DatosTarjetaAutorizadorType.
     * 
     * @return deudaAvancesInternacional
     */
    public java.lang.Double getDeudaAvancesInternacional() {
        return deudaAvancesInternacional;
    }


    /**
     * Sets the deudaAvancesInternacional value for this DatosTarjetaAutorizadorType.
     * 
     * @param deudaAvancesInternacional
     */
    public void setDeudaAvancesInternacional(java.lang.Double deudaAvancesInternacional) {
        this.deudaAvancesInternacional = deudaAvancesInternacional;
    }


    /**
     * Gets the deudaLinea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @return deudaLinea2
     */
    public java.lang.Integer getDeudaLinea2() {
        return deudaLinea2;
    }


    /**
     * Sets the deudaLinea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @param deudaLinea2
     */
    public void setDeudaLinea2(java.lang.Integer deudaLinea2) {
        this.deudaLinea2 = deudaLinea2;
    }


    /**
     * Gets the disponibleComprasNacional value for this DatosTarjetaAutorizadorType.
     * 
     * @return disponibleComprasNacional
     */
    public java.lang.Integer getDisponibleComprasNacional() {
        return disponibleComprasNacional;
    }


    /**
     * Sets the disponibleComprasNacional value for this DatosTarjetaAutorizadorType.
     * 
     * @param disponibleComprasNacional
     */
    public void setDisponibleComprasNacional(java.lang.Integer disponibleComprasNacional) {
        this.disponibleComprasNacional = disponibleComprasNacional;
    }


    /**
     * Gets the disponibleComprasInternacional value for this DatosTarjetaAutorizadorType.
     * 
     * @return disponibleComprasInternacional
     */
    public java.lang.Double getDisponibleComprasInternacional() {
        return disponibleComprasInternacional;
    }


    /**
     * Sets the disponibleComprasInternacional value for this DatosTarjetaAutorizadorType.
     * 
     * @param disponibleComprasInternacional
     */
    public void setDisponibleComprasInternacional(java.lang.Double disponibleComprasInternacional) {
        this.disponibleComprasInternacional = disponibleComprasInternacional;
    }


    /**
     * Gets the disponibleAvancesNacional value for this DatosTarjetaAutorizadorType.
     * 
     * @return disponibleAvancesNacional
     */
    public java.lang.Integer getDisponibleAvancesNacional() {
        return disponibleAvancesNacional;
    }


    /**
     * Sets the disponibleAvancesNacional value for this DatosTarjetaAutorizadorType.
     * 
     * @param disponibleAvancesNacional
     */
    public void setDisponibleAvancesNacional(java.lang.Integer disponibleAvancesNacional) {
        this.disponibleAvancesNacional = disponibleAvancesNacional;
    }


    /**
     * Gets the disponibleAvancesInternacional value for this DatosTarjetaAutorizadorType.
     * 
     * @return disponibleAvancesInternacional
     */
    public java.lang.Double getDisponibleAvancesInternacional() {
        return disponibleAvancesInternacional;
    }


    /**
     * Sets the disponibleAvancesInternacional value for this DatosTarjetaAutorizadorType.
     * 
     * @param disponibleAvancesInternacional
     */
    public void setDisponibleAvancesInternacional(java.lang.Double disponibleAvancesInternacional) {
        this.disponibleAvancesInternacional = disponibleAvancesInternacional;
    }


    /**
     * Gets the disponibleLinea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @return disponibleLinea2
     */
    public java.lang.Integer getDisponibleLinea2() {
        return disponibleLinea2;
    }


    /**
     * Sets the disponibleLinea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @param disponibleLinea2
     */
    public void setDisponibleLinea2(java.lang.Integer disponibleLinea2) {
        this.disponibleLinea2 = disponibleLinea2;
    }


    /**
     * Gets the disponibleFlotanteCuotasLinea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @return disponibleFlotanteCuotasLinea2
     */
    public java.lang.Integer getDisponibleFlotanteCuotasLinea2() {
        return disponibleFlotanteCuotasLinea2;
    }


    /**
     * Sets the disponibleFlotanteCuotasLinea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @param disponibleFlotanteCuotasLinea2
     */
    public void setDisponibleFlotanteCuotasLinea2(java.lang.Integer disponibleFlotanteCuotasLinea2) {
        this.disponibleFlotanteCuotasLinea2 = disponibleFlotanteCuotasLinea2;
    }


    /**
     * Gets the disponibleFlotanteAvancesLinea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @return disponibleFlotanteAvancesLinea2
     */
    public java.lang.Integer getDisponibleFlotanteAvancesLinea2() {
        return disponibleFlotanteAvancesLinea2;
    }


    /**
     * Sets the disponibleFlotanteAvancesLinea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @param disponibleFlotanteAvancesLinea2
     */
    public void setDisponibleFlotanteAvancesLinea2(java.lang.Integer disponibleFlotanteAvancesLinea2) {
        this.disponibleFlotanteAvancesLinea2 = disponibleFlotanteAvancesLinea2;
    }


    /**
     * Gets the disponibleFlotanteAvancesEnCuotasLinea1Linea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @return disponibleFlotanteAvancesEnCuotasLinea1Linea2
     */
    public java.lang.Integer getDisponibleFlotanteAvancesEnCuotasLinea1Linea2() {
        return disponibleFlotanteAvancesEnCuotasLinea1Linea2;
    }


    /**
     * Sets the disponibleFlotanteAvancesEnCuotasLinea1Linea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @param disponibleFlotanteAvancesEnCuotasLinea1Linea2
     */
    public void setDisponibleFlotanteAvancesEnCuotasLinea1Linea2(java.lang.Integer disponibleFlotanteAvancesEnCuotasLinea1Linea2) {
        this.disponibleFlotanteAvancesEnCuotasLinea1Linea2 = disponibleFlotanteAvancesEnCuotasLinea1Linea2;
    }


    /**
     * Gets the autorizacionesPendientesLinea1 value for this DatosTarjetaAutorizadorType.
     * 
     * @return autorizacionesPendientesLinea1
     */
    public java.lang.Integer getAutorizacionesPendientesLinea1() {
        return autorizacionesPendientesLinea1;
    }


    /**
     * Sets the autorizacionesPendientesLinea1 value for this DatosTarjetaAutorizadorType.
     * 
     * @param autorizacionesPendientesLinea1
     */
    public void setAutorizacionesPendientesLinea1(java.lang.Integer autorizacionesPendientesLinea1) {
        this.autorizacionesPendientesLinea1 = autorizacionesPendientesLinea1;
    }


    /**
     * Gets the autorizacionesPendientesLinea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @return autorizacionesPendientesLinea2
     */
    public java.lang.Integer getAutorizacionesPendientesLinea2() {
        return autorizacionesPendientesLinea2;
    }


    /**
     * Sets the autorizacionesPendientesLinea2 value for this DatosTarjetaAutorizadorType.
     * 
     * @param autorizacionesPendientesLinea2
     */
    public void setAutorizacionesPendientesLinea2(java.lang.Integer autorizacionesPendientesLinea2) {
        this.autorizacionesPendientesLinea2 = autorizacionesPendientesLinea2;
    }


    /**
     * Gets the fechaVencimientoTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @return fechaVencimientoTarjeta
     */
    public java.util.Date getFechaVencimientoTarjeta() {
        return fechaVencimientoTarjeta;
    }


    /**
     * Sets the fechaVencimientoTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @param fechaVencimientoTarjeta
     */
    public void setFechaVencimientoTarjeta(java.util.Date fechaVencimientoTarjeta) {
        this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
    }


    /**
     * Gets the nombreBandaMagnetica value for this DatosTarjetaAutorizadorType.
     * 
     * @return nombreBandaMagnetica
     */
    public java.lang.String getNombreBandaMagnetica() {
        return nombreBandaMagnetica;
    }


    /**
     * Sets the nombreBandaMagnetica value for this DatosTarjetaAutorizadorType.
     * 
     * @param nombreBandaMagnetica
     */
    public void setNombreBandaMagnetica(java.lang.String nombreBandaMagnetica) {
        this.nombreBandaMagnetica = nombreBandaMagnetica;
    }


    /**
     * Gets the offset value for this DatosTarjetaAutorizadorType.
     * 
     * @return offset
     */
    public java.lang.Integer getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this DatosTarjetaAutorizadorType.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Integer offset) {
        this.offset = offset;
    }


    /**
     * Gets the CVV2 value for this DatosTarjetaAutorizadorType.
     * 
     * @return CVV2
     */
    public java.lang.String getCVV2() {
        return CVV2;
    }


    /**
     * Sets the CVV2 value for this DatosTarjetaAutorizadorType.
     * 
     * @param CVV2
     */
    public void setCVV2(java.lang.String CVV2) {
        this.CVV2 = CVV2;
    }


    /**
     * Gets the flagCuotaFijaTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @return flagCuotaFijaTarjeta
     */
    public java.lang.String getFlagCuotaFijaTarjeta() {
        return flagCuotaFijaTarjeta;
    }


    /**
     * Sets the flagCuotaFijaTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @param flagCuotaFijaTarjeta
     */
    public void setFlagCuotaFijaTarjeta(java.lang.String flagCuotaFijaTarjeta) {
        this.flagCuotaFijaTarjeta = flagCuotaFijaTarjeta;
    }


    /**
     * Gets the flagAvanceCuotasTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @return flagAvanceCuotasTarjeta
     */
    public java.lang.String getFlagAvanceCuotasTarjeta() {
        return flagAvanceCuotasTarjeta;
    }


    /**
     * Sets the flagAvanceCuotasTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @param flagAvanceCuotasTarjeta
     */
    public void setFlagAvanceCuotasTarjeta(java.lang.String flagAvanceCuotasTarjeta) {
        this.flagAvanceCuotasTarjeta = flagAvanceCuotasTarjeta;
    }


    /**
     * Gets the flagNCuotasTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @return flagNCuotasTarjeta
     */
    public java.lang.String getFlagNCuotasTarjeta() {
        return flagNCuotasTarjeta;
    }


    /**
     * Sets the flagNCuotasTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @param flagNCuotasTarjeta
     */
    public void setFlagNCuotasTarjeta(java.lang.String flagNCuotasTarjeta) {
        this.flagNCuotasTarjeta = flagNCuotasTarjeta;
    }


    /**
     * Gets the flag3CPCTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @return flag3CPCTarjeta
     */
    public java.lang.String getFlag3CPCTarjeta() {
        return flag3CPCTarjeta;
    }


    /**
     * Sets the flag3CPCTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @param flag3CPCTarjeta
     */
    public void setFlag3CPCTarjeta(java.lang.String flag3CPCTarjeta) {
        this.flag3CPCTarjeta = flag3CPCTarjeta;
    }


    /**
     * Gets the flagCompraNormalTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @return flagCompraNormalTarjeta
     */
    public java.lang.String getFlagCompraNormalTarjeta() {
        return flagCompraNormalTarjeta;
    }


    /**
     * Sets the flagCompraNormalTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @param flagCompraNormalTarjeta
     */
    public void setFlagCompraNormalTarjeta(java.lang.String flagCompraNormalTarjeta) {
        this.flagCompraNormalTarjeta = flagCompraNormalTarjeta;
    }


    /**
     * Gets the flagAvanceEfectivoTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @return flagAvanceEfectivoTarjeta
     */
    public java.lang.String getFlagAvanceEfectivoTarjeta() {
        return flagAvanceEfectivoTarjeta;
    }


    /**
     * Sets the flagAvanceEfectivoTarjeta value for this DatosTarjetaAutorizadorType.
     * 
     * @param flagAvanceEfectivoTarjeta
     */
    public void setFlagAvanceEfectivoTarjeta(java.lang.String flagAvanceEfectivoTarjeta) {
        this.flagAvanceEfectivoTarjeta = flagAvanceEfectivoTarjeta;
    }


    /**
     * Gets the monto1 value for this DatosTarjetaAutorizadorType.
     * 
     * @return monto1
     */
    public java.lang.Double getMonto1() {
        return monto1;
    }


    /**
     * Sets the monto1 value for this DatosTarjetaAutorizadorType.
     * 
     * @param monto1
     */
    public void setMonto1(java.lang.Double monto1) {
        this.monto1 = monto1;
    }


    /**
     * Gets the monto2 value for this DatosTarjetaAutorizadorType.
     * 
     * @return monto2
     */
    public java.lang.Double getMonto2() {
        return monto2;
    }


    /**
     * Sets the monto2 value for this DatosTarjetaAutorizadorType.
     * 
     * @param monto2
     */
    public void setMonto2(java.lang.Double monto2) {
        this.monto2 = monto2;
    }


    /**
     * Gets the monto3 value for this DatosTarjetaAutorizadorType.
     * 
     * @return monto3
     */
    public java.lang.Double getMonto3() {
        return monto3;
    }


    /**
     * Sets the monto3 value for this DatosTarjetaAutorizadorType.
     * 
     * @param monto3
     */
    public void setMonto3(java.lang.Double monto3) {
        this.monto3 = monto3;
    }


    /**
     * Gets the numero1 value for this DatosTarjetaAutorizadorType.
     * 
     * @return numero1
     */
    public java.lang.Integer getNumero1() {
        return numero1;
    }


    /**
     * Sets the numero1 value for this DatosTarjetaAutorizadorType.
     * 
     * @param numero1
     */
    public void setNumero1(java.lang.Integer numero1) {
        this.numero1 = numero1;
    }


    /**
     * Gets the numero2 value for this DatosTarjetaAutorizadorType.
     * 
     * @return numero2
     */
    public java.lang.Integer getNumero2() {
        return numero2;
    }


    /**
     * Sets the numero2 value for this DatosTarjetaAutorizadorType.
     * 
     * @param numero2
     */
    public void setNumero2(java.lang.Integer numero2) {
        this.numero2 = numero2;
    }


    /**
     * Gets the numero3 value for this DatosTarjetaAutorizadorType.
     * 
     * @return numero3
     */
    public java.lang.Integer getNumero3() {
        return numero3;
    }


    /**
     * Sets the numero3 value for this DatosTarjetaAutorizadorType.
     * 
     * @param numero3
     */
    public void setNumero3(java.lang.Integer numero3) {
        this.numero3 = numero3;
    }


    /**
     * Gets the flag1 value for this DatosTarjetaAutorizadorType.
     * 
     * @return flag1
     */
    public java.lang.String getFlag1() {
        return flag1;
    }


    /**
     * Sets the flag1 value for this DatosTarjetaAutorizadorType.
     * 
     * @param flag1
     */
    public void setFlag1(java.lang.String flag1) {
        this.flag1 = flag1;
    }


    /**
     * Gets the flag2 value for this DatosTarjetaAutorizadorType.
     * 
     * @return flag2
     */
    public java.lang.String getFlag2() {
        return flag2;
    }


    /**
     * Sets the flag2 value for this DatosTarjetaAutorizadorType.
     * 
     * @param flag2
     */
    public void setFlag2(java.lang.String flag2) {
        this.flag2 = flag2;
    }


    /**
     * Gets the flag3 value for this DatosTarjetaAutorizadorType.
     * 
     * @return flag3
     */
    public java.lang.String getFlag3() {
        return flag3;
    }


    /**
     * Sets the flag3 value for this DatosTarjetaAutorizadorType.
     * 
     * @param flag3
     */
    public void setFlag3(java.lang.String flag3) {
        this.flag3 = flag3;
    }


    /**
     * Gets the string1 value for this DatosTarjetaAutorizadorType.
     * 
     * @return string1
     */
    public java.lang.String getString1() {
        return string1;
    }


    /**
     * Sets the string1 value for this DatosTarjetaAutorizadorType.
     * 
     * @param string1
     */
    public void setString1(java.lang.String string1) {
        this.string1 = string1;
    }


    /**
     * Gets the string2 value for this DatosTarjetaAutorizadorType.
     * 
     * @return string2
     */
    public java.lang.String getString2() {
        return string2;
    }


    /**
     * Sets the string2 value for this DatosTarjetaAutorizadorType.
     * 
     * @param string2
     */
    public void setString2(java.lang.String string2) {
        this.string2 = string2;
    }


    /**
     * Gets the string3 value for this DatosTarjetaAutorizadorType.
     * 
     * @return string3
     */
    public java.lang.String getString3() {
        return string3;
    }


    /**
     * Sets the string3 value for this DatosTarjetaAutorizadorType.
     * 
     * @param string3
     */
    public void setString3(java.lang.String string3) {
        this.string3 = string3;
    }


    /**
     * Gets the filler value for this DatosTarjetaAutorizadorType.
     * 
     * @return filler
     */
    public java.lang.String getFiller() {
        return filler;
    }


    /**
     * Sets the filler value for this DatosTarjetaAutorizadorType.
     * 
     * @param filler
     */
    public void setFiller(java.lang.String filler) {
        this.filler = filler;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosTarjetaAutorizadorType)) return false;
        DatosTarjetaAutorizadorType other = (DatosTarjetaAutorizadorType) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.status2==null && other.getStatus2()==null) || 
             (this.status2!=null &&
              this.status2.equals(other.getStatus2()))) &&
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
            ((this.disponibleFlotanteCuotasLinea2==null && other.getDisponibleFlotanteCuotasLinea2()==null) || 
             (this.disponibleFlotanteCuotasLinea2!=null &&
              this.disponibleFlotanteCuotasLinea2.equals(other.getDisponibleFlotanteCuotasLinea2()))) &&
            ((this.disponibleFlotanteAvancesLinea2==null && other.getDisponibleFlotanteAvancesLinea2()==null) || 
             (this.disponibleFlotanteAvancesLinea2!=null &&
              this.disponibleFlotanteAvancesLinea2.equals(other.getDisponibleFlotanteAvancesLinea2()))) &&
            ((this.disponibleFlotanteAvancesEnCuotasLinea1Linea2==null && other.getDisponibleFlotanteAvancesEnCuotasLinea1Linea2()==null) || 
             (this.disponibleFlotanteAvancesEnCuotasLinea1Linea2!=null &&
              this.disponibleFlotanteAvancesEnCuotasLinea1Linea2.equals(other.getDisponibleFlotanteAvancesEnCuotasLinea1Linea2()))) &&
            ((this.autorizacionesPendientesLinea1==null && other.getAutorizacionesPendientesLinea1()==null) || 
             (this.autorizacionesPendientesLinea1!=null &&
              this.autorizacionesPendientesLinea1.equals(other.getAutorizacionesPendientesLinea1()))) &&
            ((this.autorizacionesPendientesLinea2==null && other.getAutorizacionesPendientesLinea2()==null) || 
             (this.autorizacionesPendientesLinea2!=null &&
              this.autorizacionesPendientesLinea2.equals(other.getAutorizacionesPendientesLinea2()))) &&
            ((this.fechaVencimientoTarjeta==null && other.getFechaVencimientoTarjeta()==null) || 
             (this.fechaVencimientoTarjeta!=null &&
              this.fechaVencimientoTarjeta.equals(other.getFechaVencimientoTarjeta()))) &&
            ((this.nombreBandaMagnetica==null && other.getNombreBandaMagnetica()==null) || 
             (this.nombreBandaMagnetica!=null &&
              this.nombreBandaMagnetica.equals(other.getNombreBandaMagnetica()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.CVV2==null && other.getCVV2()==null) || 
             (this.CVV2!=null &&
              this.CVV2.equals(other.getCVV2()))) &&
            ((this.flagCuotaFijaTarjeta==null && other.getFlagCuotaFijaTarjeta()==null) || 
             (this.flagCuotaFijaTarjeta!=null &&
              this.flagCuotaFijaTarjeta.equals(other.getFlagCuotaFijaTarjeta()))) &&
            ((this.flagAvanceCuotasTarjeta==null && other.getFlagAvanceCuotasTarjeta()==null) || 
             (this.flagAvanceCuotasTarjeta!=null &&
              this.flagAvanceCuotasTarjeta.equals(other.getFlagAvanceCuotasTarjeta()))) &&
            ((this.flagNCuotasTarjeta==null && other.getFlagNCuotasTarjeta()==null) || 
             (this.flagNCuotasTarjeta!=null &&
              this.flagNCuotasTarjeta.equals(other.getFlagNCuotasTarjeta()))) &&
            ((this.flag3CPCTarjeta==null && other.getFlag3CPCTarjeta()==null) || 
             (this.flag3CPCTarjeta!=null &&
              this.flag3CPCTarjeta.equals(other.getFlag3CPCTarjeta()))) &&
            ((this.flagCompraNormalTarjeta==null && other.getFlagCompraNormalTarjeta()==null) || 
             (this.flagCompraNormalTarjeta!=null &&
              this.flagCompraNormalTarjeta.equals(other.getFlagCompraNormalTarjeta()))) &&
            ((this.flagAvanceEfectivoTarjeta==null && other.getFlagAvanceEfectivoTarjeta()==null) || 
             (this.flagAvanceEfectivoTarjeta!=null &&
              this.flagAvanceEfectivoTarjeta.equals(other.getFlagAvanceEfectivoTarjeta()))) &&
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatus2() != null) {
            _hashCode += getStatus2().hashCode();
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
        if (getDisponibleFlotanteCuotasLinea2() != null) {
            _hashCode += getDisponibleFlotanteCuotasLinea2().hashCode();
        }
        if (getDisponibleFlotanteAvancesLinea2() != null) {
            _hashCode += getDisponibleFlotanteAvancesLinea2().hashCode();
        }
        if (getDisponibleFlotanteAvancesEnCuotasLinea1Linea2() != null) {
            _hashCode += getDisponibleFlotanteAvancesEnCuotasLinea1Linea2().hashCode();
        }
        if (getAutorizacionesPendientesLinea1() != null) {
            _hashCode += getAutorizacionesPendientesLinea1().hashCode();
        }
        if (getAutorizacionesPendientesLinea2() != null) {
            _hashCode += getAutorizacionesPendientesLinea2().hashCode();
        }
        if (getFechaVencimientoTarjeta() != null) {
            _hashCode += getFechaVencimientoTarjeta().hashCode();
        }
        if (getNombreBandaMagnetica() != null) {
            _hashCode += getNombreBandaMagnetica().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getCVV2() != null) {
            _hashCode += getCVV2().hashCode();
        }
        if (getFlagCuotaFijaTarjeta() != null) {
            _hashCode += getFlagCuotaFijaTarjeta().hashCode();
        }
        if (getFlagAvanceCuotasTarjeta() != null) {
            _hashCode += getFlagAvanceCuotasTarjeta().hashCode();
        }
        if (getFlagNCuotasTarjeta() != null) {
            _hashCode += getFlagNCuotasTarjeta().hashCode();
        }
        if (getFlag3CPCTarjeta() != null) {
            _hashCode += getFlag3CPCTarjeta().hashCode();
        }
        if (getFlagCompraNormalTarjeta() != null) {
            _hashCode += getFlagCompraNormalTarjeta().hashCode();
        }
        if (getFlagAvanceEfectivoTarjeta() != null) {
            _hashCode += getFlagAvanceEfectivoTarjeta().hashCode();
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
        new org.apache.axis.description.TypeDesc(DatosTarjetaAutorizadorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosTarjetaAutorizadorType"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "status2"));
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
        elemField.setFieldName("disponibleFlotanteCuotasLinea2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "disponibleFlotanteCuotasLinea2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibleFlotanteAvancesLinea2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "disponibleFlotanteAvancesLinea2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibleFlotanteAvancesEnCuotasLinea1Linea2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "disponibleFlotanteAvancesEnCuotasLinea1Linea2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorizacionesPendientesLinea1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "autorizacionesPendientesLinea1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorizacionesPendientesLinea2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "autorizacionesPendientesLinea2"));
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
        elemField.setFieldName("nombreBandaMagnetica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "nombreBandaMagnetica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("CVV2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "CVV2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagCuotaFijaTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "flagCuotaFijaTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagAvanceCuotasTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "flagAvanceCuotasTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagNCuotasTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "flagNCuotasTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag3CPCTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "flag3CPCTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagCompraNormalTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "flagCompraNormalTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagAvanceEfectivoTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "flagAvanceEfectivoTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
