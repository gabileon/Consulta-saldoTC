/**
 * DatosCuentaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse;

public class DatosCuentaType  implements java.io.Serializable {
    private java.lang.Integer organizacion;

    private java.lang.String numeroCuenta;

    private java.lang.Integer logo;

    private java.lang.String descripcionLogo;

    private java.lang.String modelo;

    private java.lang.String tipoCuenta;

    private java.lang.String relacionCuenta;

    private java.lang.String coberturaCuenta;

    private java.lang.String apellidoPaternoTitular;

    private java.lang.String apellidoMaternoTitular;

    private java.lang.String nombresTitular;

    private java.lang.String direccionParticular;

    private java.lang.String ciudadParticular;

    private java.lang.String comunaParticular;

    private java.lang.Integer regionParticular;

    private java.lang.Integer telefonoParticular;

    private java.lang.String direccionEnvioEstadoCuenta;

    private java.lang.String ciudadEnvioEstadoCuenta;

    private java.lang.String comunaEnvioEstadoCuenta;

    private java.lang.Integer regionEnvioEstadoCuenta;

    private java.lang.Integer telefonoEnvioEstadoCuenta;

    private java.lang.String codigoPostalEnvioEstadoCuenta;

    private java.lang.String direccionLaboral;

    private java.lang.String ciudadLaboral;

    private java.lang.String comunaLaboral;

    private java.lang.Integer regionLaboral;

    private java.lang.Integer telefonoLaboral;

    private java.lang.String direccionEmail;

    private java.lang.String rutdvCliente;

    private java.lang.String numeroCliente;

    private java.lang.String numeroRelacion;

    private cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.NumeroInternoType numeroInterno;

    private java.lang.String numeroCuentaCorriente;

    private java.lang.Integer campana;

    private java.lang.String numeroInterno2;

    private java.lang.Integer sucursal;

    private java.lang.String cuentaTraspasoSaldos;

    private java.lang.Integer cantidadAdicionales;

    private java.lang.Integer codigoAutorizacionCC;

    private java.lang.Integer codigoVIP;

    private java.lang.Integer codigoMensajeMoraPagoMinimo;

    private java.lang.Integer codigoMovimiento;

    private java.lang.Integer porcentajePagoMinimo;

    private java.lang.Integer estadoCanales;

    private java.util.Date fechaDatos;

    private java.util.Date fechaApertura;

    private java.util.Date fechaModificacion;

    private java.util.Date fechaActivacionTarjeta;

    private java.util.Date fechaActivacionRenovacion;

    private java.util.Date fechaBloqueo1;

    private java.util.Date fechaBloqueo2;

    private java.util.Date fechaUltimoPagoPesos;

    private java.util.Date fechaUltimoPagoDolar;

    private java.util.Date fechaUltimaFacturacion;

    private java.util.Date fechaVencimientoPago;

    private java.util.Date fechaNacimientoTitular;

    private java.lang.String codigoBloqueo1;

    private java.lang.String codigoBloqueo2;

    private java.lang.Integer codigoBloqueoNumerico;

    private java.lang.Integer codigoMora;

    private java.lang.Integer codigoCarteraVencida;

    private java.lang.Integer codigoCobranza;

    private java.lang.Integer formaPago;

    private java.lang.Integer cicloFacturacion;

    private java.lang.Integer codigoFV;

    private java.lang.Integer codigoEmpresa;

    private java.lang.Integer codigoEnvioEstadoCuenta;

    private java.lang.String rebajaCobroAdministracion;

    private java.lang.Integer numeroMorasPeriodo;

    private java.lang.Integer numeroExcesosPeriodo;

    private java.lang.Integer numeroBloqueosXMoras;

    private java.lang.Integer numeroBloqueosXExcesos;

    private java.lang.Integer codigoAval;

    private java.lang.Integer codigoPromocion;

    private java.lang.Integer indicadorTarjetaOperador;

    private java.lang.Integer indicadorPIN;

    private java.lang.Integer indicadorCobroComision;

    private java.lang.Double porcentajeExcesoComprasNacionales;

    private java.lang.Double porcentajeExcesoComprasInternacionales;

    private java.lang.Integer medioEnvioEECCFisico;

    private java.lang.Integer tipoDireccionFisica;

    private java.lang.Integer tipoPago;

    private java.lang.Double porcentajePagoFijo;

    private java.lang.Integer montoPagoFijo;

    private java.lang.Integer codigoEmbozado;

    private java.lang.String lineaLimites;

    private java.lang.Integer PCTPesos;

    private java.lang.Integer PCTDolar;

    private java.lang.String indicador3CPC;

    private java.lang.String indicadorExceso;

    private java.lang.Integer cupoNacional;

    private java.lang.Double cupoInternacional;

    private java.lang.Integer cupoLinea2;

    private java.lang.Integer cupoVirtualNacional;

    private java.lang.Double cupoVirtualInternacional;

    private java.lang.Integer deudaNacional;

    private java.lang.Double deudaInternacional;

    private java.lang.Integer deudaLinea2;

    private java.lang.Integer deudaMoraNacional;

    private java.lang.Double deudaMoraInternacional;

    private java.lang.Integer deudaNacionalFacturada;

    private java.lang.Double deudaInternacionalFacturada;

    private java.lang.Integer disponibleNacional;

    private java.lang.Double disponibleInternacional;

    private java.lang.Integer disponibleLinea2;

    private java.lang.Integer saldoCreditoCuotaCapital;

    private java.lang.Integer disponibleAvances;

    private java.lang.Double disponibleAvancesDolar;

    private java.lang.Integer mora1A30Dias;

    private java.lang.Integer mora31A60Dias;

    private java.lang.Integer mora61A90Dias;

    private java.lang.Integer mora91A120Dias;

    private java.lang.Integer mora121A150Dias;

    private java.lang.Integer mora151A180Dias;

    private java.lang.Integer mora181A210Dias;

    private java.lang.Integer mora210A999Dias;

    private java.lang.Integer recargoCobranza1A30Dias;

    private java.lang.Integer recargoCobranza31A60Dias;

    private java.lang.Integer recargoCobranza61A90Dias;

    private java.lang.Integer recargoCobranza91A120Dias;

    private java.lang.Integer recargoCobranza121A150Dias;

    private java.lang.Integer recargoCobranza151A180Dias;

    private java.lang.Integer recargoCobranza181A210Dias;

    private java.lang.Integer recargoCobranza210A999Dias;

    private java.lang.Integer pagoMinimo;

    private java.lang.Integer saldoColocacionNacional;

    private java.lang.Double saldoColocacionInternacional;

    private java.lang.Double tasaInteresRotativo;

    private java.lang.Double tasaInteresCuotas2A4;

    private java.lang.Double tasaInteresCuotas5A24;

    private java.lang.Integer interesXCobrarOperador;

    private java.lang.Integer interesXCobrarCorrientes;

    private java.lang.Integer interesXCobrarPenales;

    private java.lang.Integer interesDevengadosOperador;

    private java.lang.Integer interesDevengadosCorrientes;

    private java.lang.Integer interesDevengadosPenales;

    private java.lang.Integer interesPercibidosOperador;

    private java.lang.Integer interesPercibidosCorrientes;

    private java.lang.Integer interesPercibidosPenales;

    private java.lang.Double deudaTotal;

    private java.lang.Integer colocacionMes;

    private java.lang.Integer montoCompraMes;

    private java.lang.Integer montoAvanceMes;

    private java.lang.Integer montoUltimoPagoPesos;

    private java.lang.Double montoUltimoPagoDolar;

    private java.lang.Integer montoCobroAdministracion;

    private java.lang.Integer consumoPesos;

    private java.lang.Double consumoDolar;

    private java.lang.Integer pagosPesosCiclo;

    private java.lang.Double pagosDolarCiclo;

    private java.lang.Integer creditosPesosCiclo;

    private java.lang.Double creditosDolarCiclo;

    private java.lang.Integer debitosPesosCiclo;

    private java.lang.Double debitosDolarCiclo;

    private java.lang.Integer creditosMemoPesosCiclo;

    private java.lang.Double creditosMemoDolarCiclo;

    private java.lang.Integer debitosMemoPesosCiclo;

    private java.lang.Double debitosMemoDolarCiclo;

    private java.lang.Double utilidadesXCobrarMonedaExtranjera;

    private java.lang.Double pagosXAplicarMonedaExtranjera;

    private java.lang.Integer utilidadesXCobrarMonedaNacional;

    private java.lang.Double tasaInteresAvanceCtaCorta;

    private java.lang.Double tasaInteresAvanceCtaLarga;

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

    public DatosCuentaType() {
    }

    public DatosCuentaType(
           java.lang.Integer organizacion,
           java.lang.String numeroCuenta,
           java.lang.Integer logo,
           java.lang.String descripcionLogo,
           java.lang.String modelo,
           java.lang.String tipoCuenta,
           java.lang.String relacionCuenta,
           java.lang.String coberturaCuenta,
           java.lang.String apellidoPaternoTitular,
           java.lang.String apellidoMaternoTitular,
           java.lang.String nombresTitular,
           java.lang.String direccionParticular,
           java.lang.String ciudadParticular,
           java.lang.String comunaParticular,
           java.lang.Integer regionParticular,
           java.lang.Integer telefonoParticular,
           java.lang.String direccionEnvioEstadoCuenta,
           java.lang.String ciudadEnvioEstadoCuenta,
           java.lang.String comunaEnvioEstadoCuenta,
           java.lang.Integer regionEnvioEstadoCuenta,
           java.lang.Integer telefonoEnvioEstadoCuenta,
           java.lang.String codigoPostalEnvioEstadoCuenta,
           java.lang.String direccionLaboral,
           java.lang.String ciudadLaboral,
           java.lang.String comunaLaboral,
           java.lang.Integer regionLaboral,
           java.lang.Integer telefonoLaboral,
           java.lang.String direccionEmail,
           java.lang.String rutdvCliente,
           java.lang.String numeroCliente,
           java.lang.String numeroRelacion,
           cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.NumeroInternoType numeroInterno,
           java.lang.String numeroCuentaCorriente,
           java.lang.Integer campana,
           java.lang.String numeroInterno2,
           java.lang.Integer sucursal,
           java.lang.String cuentaTraspasoSaldos,
           java.lang.Integer cantidadAdicionales,
           java.lang.Integer codigoAutorizacionCC,
           java.lang.Integer codigoVIP,
           java.lang.Integer codigoMensajeMoraPagoMinimo,
           java.lang.Integer codigoMovimiento,
           java.lang.Integer porcentajePagoMinimo,
           java.lang.Integer estadoCanales,
           java.util.Date fechaDatos,
           java.util.Date fechaApertura,
           java.util.Date fechaModificacion,
           java.util.Date fechaActivacionTarjeta,
           java.util.Date fechaActivacionRenovacion,
           java.util.Date fechaBloqueo1,
           java.util.Date fechaBloqueo2,
           java.util.Date fechaUltimoPagoPesos,
           java.util.Date fechaUltimoPagoDolar,
           java.util.Date fechaUltimaFacturacion,
           java.util.Date fechaVencimientoPago,
           java.util.Date fechaNacimientoTitular,
           java.lang.String codigoBloqueo1,
           java.lang.String codigoBloqueo2,
           java.lang.Integer codigoBloqueoNumerico,
           java.lang.Integer codigoMora,
           java.lang.Integer codigoCarteraVencida,
           java.lang.Integer codigoCobranza,
           java.lang.Integer formaPago,
           java.lang.Integer cicloFacturacion,
           java.lang.Integer codigoFV,
           java.lang.Integer codigoEmpresa,
           java.lang.Integer codigoEnvioEstadoCuenta,
           java.lang.String rebajaCobroAdministracion,
           java.lang.Integer numeroMorasPeriodo,
           java.lang.Integer numeroExcesosPeriodo,
           java.lang.Integer numeroBloqueosXMoras,
           java.lang.Integer numeroBloqueosXExcesos,
           java.lang.Integer codigoAval,
           java.lang.Integer codigoPromocion,
           java.lang.Integer indicadorTarjetaOperador,
           java.lang.Integer indicadorPIN,
           java.lang.Integer indicadorCobroComision,
           java.lang.Double porcentajeExcesoComprasNacionales,
           java.lang.Double porcentajeExcesoComprasInternacionales,
           java.lang.Integer medioEnvioEECCFisico,
           java.lang.Integer tipoDireccionFisica,
           java.lang.Integer tipoPago,
           java.lang.Double porcentajePagoFijo,
           java.lang.Integer montoPagoFijo,
           java.lang.Integer codigoEmbozado,
           java.lang.String lineaLimites,
           java.lang.Integer PCTPesos,
           java.lang.Integer PCTDolar,
           java.lang.String indicador3CPC,
           java.lang.String indicadorExceso,
           java.lang.Integer cupoNacional,
           java.lang.Double cupoInternacional,
           java.lang.Integer cupoLinea2,
           java.lang.Integer cupoVirtualNacional,
           java.lang.Double cupoVirtualInternacional,
           java.lang.Integer deudaNacional,
           java.lang.Double deudaInternacional,
           java.lang.Integer deudaLinea2,
           java.lang.Integer deudaMoraNacional,
           java.lang.Double deudaMoraInternacional,
           java.lang.Integer deudaNacionalFacturada,
           java.lang.Double deudaInternacionalFacturada,
           java.lang.Integer disponibleNacional,
           java.lang.Double disponibleInternacional,
           java.lang.Integer disponibleLinea2,
           java.lang.Integer saldoCreditoCuotaCapital,
           java.lang.Integer disponibleAvances,
           java.lang.Double disponibleAvancesDolar,
           java.lang.Integer mora1A30Dias,
           java.lang.Integer mora31A60Dias,
           java.lang.Integer mora61A90Dias,
           java.lang.Integer mora91A120Dias,
           java.lang.Integer mora121A150Dias,
           java.lang.Integer mora151A180Dias,
           java.lang.Integer mora181A210Dias,
           java.lang.Integer mora210A999Dias,
           java.lang.Integer recargoCobranza1A30Dias,
           java.lang.Integer recargoCobranza31A60Dias,
           java.lang.Integer recargoCobranza61A90Dias,
           java.lang.Integer recargoCobranza91A120Dias,
           java.lang.Integer recargoCobranza121A150Dias,
           java.lang.Integer recargoCobranza151A180Dias,
           java.lang.Integer recargoCobranza181A210Dias,
           java.lang.Integer recargoCobranza210A999Dias,
           java.lang.Integer pagoMinimo,
           java.lang.Integer saldoColocacionNacional,
           java.lang.Double saldoColocacionInternacional,
           java.lang.Double tasaInteresRotativo,
           java.lang.Double tasaInteresCuotas2A4,
           java.lang.Double tasaInteresCuotas5A24,
           java.lang.Integer interesXCobrarOperador,
           java.lang.Integer interesXCobrarCorrientes,
           java.lang.Integer interesXCobrarPenales,
           java.lang.Integer interesDevengadosOperador,
           java.lang.Integer interesDevengadosCorrientes,
           java.lang.Integer interesDevengadosPenales,
           java.lang.Integer interesPercibidosOperador,
           java.lang.Integer interesPercibidosCorrientes,
           java.lang.Integer interesPercibidosPenales,
           java.lang.Double deudaTotal,
           java.lang.Integer colocacionMes,
           java.lang.Integer montoCompraMes,
           java.lang.Integer montoAvanceMes,
           java.lang.Integer montoUltimoPagoPesos,
           java.lang.Double montoUltimoPagoDolar,
           java.lang.Integer montoCobroAdministracion,
           java.lang.Integer consumoPesos,
           java.lang.Double consumoDolar,
           java.lang.Integer pagosPesosCiclo,
           java.lang.Double pagosDolarCiclo,
           java.lang.Integer creditosPesosCiclo,
           java.lang.Double creditosDolarCiclo,
           java.lang.Integer debitosPesosCiclo,
           java.lang.Double debitosDolarCiclo,
           java.lang.Integer creditosMemoPesosCiclo,
           java.lang.Double creditosMemoDolarCiclo,
           java.lang.Integer debitosMemoPesosCiclo,
           java.lang.Double debitosMemoDolarCiclo,
           java.lang.Double utilidadesXCobrarMonedaExtranjera,
           java.lang.Double pagosXAplicarMonedaExtranjera,
           java.lang.Integer utilidadesXCobrarMonedaNacional,
           java.lang.Double tasaInteresAvanceCtaCorta,
           java.lang.Double tasaInteresAvanceCtaLarga,
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
           this.organizacion = organizacion;
           this.numeroCuenta = numeroCuenta;
           this.logo = logo;
           this.descripcionLogo = descripcionLogo;
           this.modelo = modelo;
           this.tipoCuenta = tipoCuenta;
           this.relacionCuenta = relacionCuenta;
           this.coberturaCuenta = coberturaCuenta;
           this.apellidoPaternoTitular = apellidoPaternoTitular;
           this.apellidoMaternoTitular = apellidoMaternoTitular;
           this.nombresTitular = nombresTitular;
           this.direccionParticular = direccionParticular;
           this.ciudadParticular = ciudadParticular;
           this.comunaParticular = comunaParticular;
           this.regionParticular = regionParticular;
           this.telefonoParticular = telefonoParticular;
           this.direccionEnvioEstadoCuenta = direccionEnvioEstadoCuenta;
           this.ciudadEnvioEstadoCuenta = ciudadEnvioEstadoCuenta;
           this.comunaEnvioEstadoCuenta = comunaEnvioEstadoCuenta;
           this.regionEnvioEstadoCuenta = regionEnvioEstadoCuenta;
           this.telefonoEnvioEstadoCuenta = telefonoEnvioEstadoCuenta;
           this.codigoPostalEnvioEstadoCuenta = codigoPostalEnvioEstadoCuenta;
           this.direccionLaboral = direccionLaboral;
           this.ciudadLaboral = ciudadLaboral;
           this.comunaLaboral = comunaLaboral;
           this.regionLaboral = regionLaboral;
           this.telefonoLaboral = telefonoLaboral;
           this.direccionEmail = direccionEmail;
           this.rutdvCliente = rutdvCliente;
           this.numeroCliente = numeroCliente;
           this.numeroRelacion = numeroRelacion;
           this.numeroInterno = numeroInterno;
           this.numeroCuentaCorriente = numeroCuentaCorriente;
           this.campana = campana;
           this.numeroInterno2 = numeroInterno2;
           this.sucursal = sucursal;
           this.cuentaTraspasoSaldos = cuentaTraspasoSaldos;
           this.cantidadAdicionales = cantidadAdicionales;
           this.codigoAutorizacionCC = codigoAutorizacionCC;
           this.codigoVIP = codigoVIP;
           this.codigoMensajeMoraPagoMinimo = codigoMensajeMoraPagoMinimo;
           this.codigoMovimiento = codigoMovimiento;
           this.porcentajePagoMinimo = porcentajePagoMinimo;
           this.estadoCanales = estadoCanales;
           this.fechaDatos = fechaDatos;
           this.fechaApertura = fechaApertura;
           this.fechaModificacion = fechaModificacion;
           this.fechaActivacionTarjeta = fechaActivacionTarjeta;
           this.fechaActivacionRenovacion = fechaActivacionRenovacion;
           this.fechaBloqueo1 = fechaBloqueo1;
           this.fechaBloqueo2 = fechaBloqueo2;
           this.fechaUltimoPagoPesos = fechaUltimoPagoPesos;
           this.fechaUltimoPagoDolar = fechaUltimoPagoDolar;
           this.fechaUltimaFacturacion = fechaUltimaFacturacion;
           this.fechaVencimientoPago = fechaVencimientoPago;
           this.fechaNacimientoTitular = fechaNacimientoTitular;
           this.codigoBloqueo1 = codigoBloqueo1;
           this.codigoBloqueo2 = codigoBloqueo2;
           this.codigoBloqueoNumerico = codigoBloqueoNumerico;
           this.codigoMora = codigoMora;
           this.codigoCarteraVencida = codigoCarteraVencida;
           this.codigoCobranza = codigoCobranza;
           this.formaPago = formaPago;
           this.cicloFacturacion = cicloFacturacion;
           this.codigoFV = codigoFV;
           this.codigoEmpresa = codigoEmpresa;
           this.codigoEnvioEstadoCuenta = codigoEnvioEstadoCuenta;
           this.rebajaCobroAdministracion = rebajaCobroAdministracion;
           this.numeroMorasPeriodo = numeroMorasPeriodo;
           this.numeroExcesosPeriodo = numeroExcesosPeriodo;
           this.numeroBloqueosXMoras = numeroBloqueosXMoras;
           this.numeroBloqueosXExcesos = numeroBloqueosXExcesos;
           this.codigoAval = codigoAval;
           this.codigoPromocion = codigoPromocion;
           this.indicadorTarjetaOperador = indicadorTarjetaOperador;
           this.indicadorPIN = indicadorPIN;
           this.indicadorCobroComision = indicadorCobroComision;
           this.porcentajeExcesoComprasNacionales = porcentajeExcesoComprasNacionales;
           this.porcentajeExcesoComprasInternacionales = porcentajeExcesoComprasInternacionales;
           this.medioEnvioEECCFisico = medioEnvioEECCFisico;
           this.tipoDireccionFisica = tipoDireccionFisica;
           this.tipoPago = tipoPago;
           this.porcentajePagoFijo = porcentajePagoFijo;
           this.montoPagoFijo = montoPagoFijo;
           this.codigoEmbozado = codigoEmbozado;
           this.lineaLimites = lineaLimites;
           this.PCTPesos = PCTPesos;
           this.PCTDolar = PCTDolar;
           this.indicador3CPC = indicador3CPC;
           this.indicadorExceso = indicadorExceso;
           this.cupoNacional = cupoNacional;
           this.cupoInternacional = cupoInternacional;
           this.cupoLinea2 = cupoLinea2;
           this.cupoVirtualNacional = cupoVirtualNacional;
           this.cupoVirtualInternacional = cupoVirtualInternacional;
           this.deudaNacional = deudaNacional;
           this.deudaInternacional = deudaInternacional;
           this.deudaLinea2 = deudaLinea2;
           this.deudaMoraNacional = deudaMoraNacional;
           this.deudaMoraInternacional = deudaMoraInternacional;
           this.deudaNacionalFacturada = deudaNacionalFacturada;
           this.deudaInternacionalFacturada = deudaInternacionalFacturada;
           this.disponibleNacional = disponibleNacional;
           this.disponibleInternacional = disponibleInternacional;
           this.disponibleLinea2 = disponibleLinea2;
           this.saldoCreditoCuotaCapital = saldoCreditoCuotaCapital;
           this.disponibleAvances = disponibleAvances;
           this.disponibleAvancesDolar = disponibleAvancesDolar;
           this.mora1A30Dias = mora1A30Dias;
           this.mora31A60Dias = mora31A60Dias;
           this.mora61A90Dias = mora61A90Dias;
           this.mora91A120Dias = mora91A120Dias;
           this.mora121A150Dias = mora121A150Dias;
           this.mora151A180Dias = mora151A180Dias;
           this.mora181A210Dias = mora181A210Dias;
           this.mora210A999Dias = mora210A999Dias;
           this.recargoCobranza1A30Dias = recargoCobranza1A30Dias;
           this.recargoCobranza31A60Dias = recargoCobranza31A60Dias;
           this.recargoCobranza61A90Dias = recargoCobranza61A90Dias;
           this.recargoCobranza91A120Dias = recargoCobranza91A120Dias;
           this.recargoCobranza121A150Dias = recargoCobranza121A150Dias;
           this.recargoCobranza151A180Dias = recargoCobranza151A180Dias;
           this.recargoCobranza181A210Dias = recargoCobranza181A210Dias;
           this.recargoCobranza210A999Dias = recargoCobranza210A999Dias;
           this.pagoMinimo = pagoMinimo;
           this.saldoColocacionNacional = saldoColocacionNacional;
           this.saldoColocacionInternacional = saldoColocacionInternacional;
           this.tasaInteresRotativo = tasaInteresRotativo;
           this.tasaInteresCuotas2A4 = tasaInteresCuotas2A4;
           this.tasaInteresCuotas5A24 = tasaInteresCuotas5A24;
           this.interesXCobrarOperador = interesXCobrarOperador;
           this.interesXCobrarCorrientes = interesXCobrarCorrientes;
           this.interesXCobrarPenales = interesXCobrarPenales;
           this.interesDevengadosOperador = interesDevengadosOperador;
           this.interesDevengadosCorrientes = interesDevengadosCorrientes;
           this.interesDevengadosPenales = interesDevengadosPenales;
           this.interesPercibidosOperador = interesPercibidosOperador;
           this.interesPercibidosCorrientes = interesPercibidosCorrientes;
           this.interesPercibidosPenales = interesPercibidosPenales;
           this.deudaTotal = deudaTotal;
           this.colocacionMes = colocacionMes;
           this.montoCompraMes = montoCompraMes;
           this.montoAvanceMes = montoAvanceMes;
           this.montoUltimoPagoPesos = montoUltimoPagoPesos;
           this.montoUltimoPagoDolar = montoUltimoPagoDolar;
           this.montoCobroAdministracion = montoCobroAdministracion;
           this.consumoPesos = consumoPesos;
           this.consumoDolar = consumoDolar;
           this.pagosPesosCiclo = pagosPesosCiclo;
           this.pagosDolarCiclo = pagosDolarCiclo;
           this.creditosPesosCiclo = creditosPesosCiclo;
           this.creditosDolarCiclo = creditosDolarCiclo;
           this.debitosPesosCiclo = debitosPesosCiclo;
           this.debitosDolarCiclo = debitosDolarCiclo;
           this.creditosMemoPesosCiclo = creditosMemoPesosCiclo;
           this.creditosMemoDolarCiclo = creditosMemoDolarCiclo;
           this.debitosMemoPesosCiclo = debitosMemoPesosCiclo;
           this.debitosMemoDolarCiclo = debitosMemoDolarCiclo;
           this.utilidadesXCobrarMonedaExtranjera = utilidadesXCobrarMonedaExtranjera;
           this.pagosXAplicarMonedaExtranjera = pagosXAplicarMonedaExtranjera;
           this.utilidadesXCobrarMonedaNacional = utilidadesXCobrarMonedaNacional;
           this.tasaInteresAvanceCtaCorta = tasaInteresAvanceCtaCorta;
           this.tasaInteresAvanceCtaLarga = tasaInteresAvanceCtaLarga;
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
     * Gets the organizacion value for this DatosCuentaType.
     * 
     * @return organizacion
     */
    public java.lang.Integer getOrganizacion() {
        return organizacion;
    }


    /**
     * Sets the organizacion value for this DatosCuentaType.
     * 
     * @param organizacion
     */
    public void setOrganizacion(java.lang.Integer organizacion) {
        this.organizacion = organizacion;
    }


    /**
     * Gets the numeroCuenta value for this DatosCuentaType.
     * 
     * @return numeroCuenta
     */
    public java.lang.String getNumeroCuenta() {
        return numeroCuenta;
    }


    /**
     * Sets the numeroCuenta value for this DatosCuentaType.
     * 
     * @param numeroCuenta
     */
    public void setNumeroCuenta(java.lang.String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    /**
     * Gets the logo value for this DatosCuentaType.
     * 
     * @return logo
     */
    public java.lang.Integer getLogo() {
        return logo;
    }


    /**
     * Sets the logo value for this DatosCuentaType.
     * 
     * @param logo
     */
    public void setLogo(java.lang.Integer logo) {
        this.logo = logo;
    }


    /**
     * Gets the descripcionLogo value for this DatosCuentaType.
     * 
     * @return descripcionLogo
     */
    public java.lang.String getDescripcionLogo() {
        return descripcionLogo;
    }


    /**
     * Sets the descripcionLogo value for this DatosCuentaType.
     * 
     * @param descripcionLogo
     */
    public void setDescripcionLogo(java.lang.String descripcionLogo) {
        this.descripcionLogo = descripcionLogo;
    }


    /**
     * Gets the modelo value for this DatosCuentaType.
     * 
     * @return modelo
     */
    public java.lang.String getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this DatosCuentaType.
     * 
     * @param modelo
     */
    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }


    /**
     * Gets the tipoCuenta value for this DatosCuentaType.
     * 
     * @return tipoCuenta
     */
    public java.lang.String getTipoCuenta() {
        return tipoCuenta;
    }


    /**
     * Sets the tipoCuenta value for this DatosCuentaType.
     * 
     * @param tipoCuenta
     */
    public void setTipoCuenta(java.lang.String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }


    /**
     * Gets the relacionCuenta value for this DatosCuentaType.
     * 
     * @return relacionCuenta
     */
    public java.lang.String getRelacionCuenta() {
        return relacionCuenta;
    }


    /**
     * Sets the relacionCuenta value for this DatosCuentaType.
     * 
     * @param relacionCuenta
     */
    public void setRelacionCuenta(java.lang.String relacionCuenta) {
        this.relacionCuenta = relacionCuenta;
    }


    /**
     * Gets the coberturaCuenta value for this DatosCuentaType.
     * 
     * @return coberturaCuenta
     */
    public java.lang.String getCoberturaCuenta() {
        return coberturaCuenta;
    }


    /**
     * Sets the coberturaCuenta value for this DatosCuentaType.
     * 
     * @param coberturaCuenta
     */
    public void setCoberturaCuenta(java.lang.String coberturaCuenta) {
        this.coberturaCuenta = coberturaCuenta;
    }


    /**
     * Gets the apellidoPaternoTitular value for this DatosCuentaType.
     * 
     * @return apellidoPaternoTitular
     */
    public java.lang.String getApellidoPaternoTitular() {
        return apellidoPaternoTitular;
    }


    /**
     * Sets the apellidoPaternoTitular value for this DatosCuentaType.
     * 
     * @param apellidoPaternoTitular
     */
    public void setApellidoPaternoTitular(java.lang.String apellidoPaternoTitular) {
        this.apellidoPaternoTitular = apellidoPaternoTitular;
    }


    /**
     * Gets the apellidoMaternoTitular value for this DatosCuentaType.
     * 
     * @return apellidoMaternoTitular
     */
    public java.lang.String getApellidoMaternoTitular() {
        return apellidoMaternoTitular;
    }


    /**
     * Sets the apellidoMaternoTitular value for this DatosCuentaType.
     * 
     * @param apellidoMaternoTitular
     */
    public void setApellidoMaternoTitular(java.lang.String apellidoMaternoTitular) {
        this.apellidoMaternoTitular = apellidoMaternoTitular;
    }


    /**
     * Gets the nombresTitular value for this DatosCuentaType.
     * 
     * @return nombresTitular
     */
    public java.lang.String getNombresTitular() {
        return nombresTitular;
    }


    /**
     * Sets the nombresTitular value for this DatosCuentaType.
     * 
     * @param nombresTitular
     */
    public void setNombresTitular(java.lang.String nombresTitular) {
        this.nombresTitular = nombresTitular;
    }


    /**
     * Gets the direccionParticular value for this DatosCuentaType.
     * 
     * @return direccionParticular
     */
    public java.lang.String getDireccionParticular() {
        return direccionParticular;
    }


    /**
     * Sets the direccionParticular value for this DatosCuentaType.
     * 
     * @param direccionParticular
     */
    public void setDireccionParticular(java.lang.String direccionParticular) {
        this.direccionParticular = direccionParticular;
    }


    /**
     * Gets the ciudadParticular value for this DatosCuentaType.
     * 
     * @return ciudadParticular
     */
    public java.lang.String getCiudadParticular() {
        return ciudadParticular;
    }


    /**
     * Sets the ciudadParticular value for this DatosCuentaType.
     * 
     * @param ciudadParticular
     */
    public void setCiudadParticular(java.lang.String ciudadParticular) {
        this.ciudadParticular = ciudadParticular;
    }


    /**
     * Gets the comunaParticular value for this DatosCuentaType.
     * 
     * @return comunaParticular
     */
    public java.lang.String getComunaParticular() {
        return comunaParticular;
    }


    /**
     * Sets the comunaParticular value for this DatosCuentaType.
     * 
     * @param comunaParticular
     */
    public void setComunaParticular(java.lang.String comunaParticular) {
        this.comunaParticular = comunaParticular;
    }


    /**
     * Gets the regionParticular value for this DatosCuentaType.
     * 
     * @return regionParticular
     */
    public java.lang.Integer getRegionParticular() {
        return regionParticular;
    }


    /**
     * Sets the regionParticular value for this DatosCuentaType.
     * 
     * @param regionParticular
     */
    public void setRegionParticular(java.lang.Integer regionParticular) {
        this.regionParticular = regionParticular;
    }


    /**
     * Gets the telefonoParticular value for this DatosCuentaType.
     * 
     * @return telefonoParticular
     */
    public java.lang.Integer getTelefonoParticular() {
        return telefonoParticular;
    }


    /**
     * Sets the telefonoParticular value for this DatosCuentaType.
     * 
     * @param telefonoParticular
     */
    public void setTelefonoParticular(java.lang.Integer telefonoParticular) {
        this.telefonoParticular = telefonoParticular;
    }


    /**
     * Gets the direccionEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @return direccionEnvioEstadoCuenta
     */
    public java.lang.String getDireccionEnvioEstadoCuenta() {
        return direccionEnvioEstadoCuenta;
    }


    /**
     * Sets the direccionEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @param direccionEnvioEstadoCuenta
     */
    public void setDireccionEnvioEstadoCuenta(java.lang.String direccionEnvioEstadoCuenta) {
        this.direccionEnvioEstadoCuenta = direccionEnvioEstadoCuenta;
    }


    /**
     * Gets the ciudadEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @return ciudadEnvioEstadoCuenta
     */
    public java.lang.String getCiudadEnvioEstadoCuenta() {
        return ciudadEnvioEstadoCuenta;
    }


    /**
     * Sets the ciudadEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @param ciudadEnvioEstadoCuenta
     */
    public void setCiudadEnvioEstadoCuenta(java.lang.String ciudadEnvioEstadoCuenta) {
        this.ciudadEnvioEstadoCuenta = ciudadEnvioEstadoCuenta;
    }


    /**
     * Gets the comunaEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @return comunaEnvioEstadoCuenta
     */
    public java.lang.String getComunaEnvioEstadoCuenta() {
        return comunaEnvioEstadoCuenta;
    }


    /**
     * Sets the comunaEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @param comunaEnvioEstadoCuenta
     */
    public void setComunaEnvioEstadoCuenta(java.lang.String comunaEnvioEstadoCuenta) {
        this.comunaEnvioEstadoCuenta = comunaEnvioEstadoCuenta;
    }


    /**
     * Gets the regionEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @return regionEnvioEstadoCuenta
     */
    public java.lang.Integer getRegionEnvioEstadoCuenta() {
        return regionEnvioEstadoCuenta;
    }


    /**
     * Sets the regionEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @param regionEnvioEstadoCuenta
     */
    public void setRegionEnvioEstadoCuenta(java.lang.Integer regionEnvioEstadoCuenta) {
        this.regionEnvioEstadoCuenta = regionEnvioEstadoCuenta;
    }


    /**
     * Gets the telefonoEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @return telefonoEnvioEstadoCuenta
     */
    public java.lang.Integer getTelefonoEnvioEstadoCuenta() {
        return telefonoEnvioEstadoCuenta;
    }


    /**
     * Sets the telefonoEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @param telefonoEnvioEstadoCuenta
     */
    public void setTelefonoEnvioEstadoCuenta(java.lang.Integer telefonoEnvioEstadoCuenta) {
        this.telefonoEnvioEstadoCuenta = telefonoEnvioEstadoCuenta;
    }


    /**
     * Gets the codigoPostalEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @return codigoPostalEnvioEstadoCuenta
     */
    public java.lang.String getCodigoPostalEnvioEstadoCuenta() {
        return codigoPostalEnvioEstadoCuenta;
    }


    /**
     * Sets the codigoPostalEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @param codigoPostalEnvioEstadoCuenta
     */
    public void setCodigoPostalEnvioEstadoCuenta(java.lang.String codigoPostalEnvioEstadoCuenta) {
        this.codigoPostalEnvioEstadoCuenta = codigoPostalEnvioEstadoCuenta;
    }


    /**
     * Gets the direccionLaboral value for this DatosCuentaType.
     * 
     * @return direccionLaboral
     */
    public java.lang.String getDireccionLaboral() {
        return direccionLaboral;
    }


    /**
     * Sets the direccionLaboral value for this DatosCuentaType.
     * 
     * @param direccionLaboral
     */
    public void setDireccionLaboral(java.lang.String direccionLaboral) {
        this.direccionLaboral = direccionLaboral;
    }


    /**
     * Gets the ciudadLaboral value for this DatosCuentaType.
     * 
     * @return ciudadLaboral
     */
    public java.lang.String getCiudadLaboral() {
        return ciudadLaboral;
    }


    /**
     * Sets the ciudadLaboral value for this DatosCuentaType.
     * 
     * @param ciudadLaboral
     */
    public void setCiudadLaboral(java.lang.String ciudadLaboral) {
        this.ciudadLaboral = ciudadLaboral;
    }


    /**
     * Gets the comunaLaboral value for this DatosCuentaType.
     * 
     * @return comunaLaboral
     */
    public java.lang.String getComunaLaboral() {
        return comunaLaboral;
    }


    /**
     * Sets the comunaLaboral value for this DatosCuentaType.
     * 
     * @param comunaLaboral
     */
    public void setComunaLaboral(java.lang.String comunaLaboral) {
        this.comunaLaboral = comunaLaboral;
    }


    /**
     * Gets the regionLaboral value for this DatosCuentaType.
     * 
     * @return regionLaboral
     */
    public java.lang.Integer getRegionLaboral() {
        return regionLaboral;
    }


    /**
     * Sets the regionLaboral value for this DatosCuentaType.
     * 
     * @param regionLaboral
     */
    public void setRegionLaboral(java.lang.Integer regionLaboral) {
        this.regionLaboral = regionLaboral;
    }


    /**
     * Gets the telefonoLaboral value for this DatosCuentaType.
     * 
     * @return telefonoLaboral
     */
    public java.lang.Integer getTelefonoLaboral() {
        return telefonoLaboral;
    }


    /**
     * Sets the telefonoLaboral value for this DatosCuentaType.
     * 
     * @param telefonoLaboral
     */
    public void setTelefonoLaboral(java.lang.Integer telefonoLaboral) {
        this.telefonoLaboral = telefonoLaboral;
    }


    /**
     * Gets the direccionEmail value for this DatosCuentaType.
     * 
     * @return direccionEmail
     */
    public java.lang.String getDireccionEmail() {
        return direccionEmail;
    }


    /**
     * Sets the direccionEmail value for this DatosCuentaType.
     * 
     * @param direccionEmail
     */
    public void setDireccionEmail(java.lang.String direccionEmail) {
        this.direccionEmail = direccionEmail;
    }


    /**
     * Gets the rutdvCliente value for this DatosCuentaType.
     * 
     * @return rutdvCliente
     */
    public java.lang.String getRutdvCliente() {
        return rutdvCliente;
    }


    /**
     * Sets the rutdvCliente value for this DatosCuentaType.
     * 
     * @param rutdvCliente
     */
    public void setRutdvCliente(java.lang.String rutdvCliente) {
        this.rutdvCliente = rutdvCliente;
    }


    /**
     * Gets the numeroCliente value for this DatosCuentaType.
     * 
     * @return numeroCliente
     */
    public java.lang.String getNumeroCliente() {
        return numeroCliente;
    }


    /**
     * Sets the numeroCliente value for this DatosCuentaType.
     * 
     * @param numeroCliente
     */
    public void setNumeroCliente(java.lang.String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }


    /**
     * Gets the numeroRelacion value for this DatosCuentaType.
     * 
     * @return numeroRelacion
     */
    public java.lang.String getNumeroRelacion() {
        return numeroRelacion;
    }


    /**
     * Sets the numeroRelacion value for this DatosCuentaType.
     * 
     * @param numeroRelacion
     */
    public void setNumeroRelacion(java.lang.String numeroRelacion) {
        this.numeroRelacion = numeroRelacion;
    }


    /**
     * Gets the numeroInterno value for this DatosCuentaType.
     * 
     * @return numeroInterno
     */
    public cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.NumeroInternoType getNumeroInterno() {
        return numeroInterno;
    }


    /**
     * Sets the numeroInterno value for this DatosCuentaType.
     * 
     * @param numeroInterno
     */
    public void setNumeroInterno(cl.bancochile.osb.TarjetaCreditos.ConsultarSaldosResponse.NumeroInternoType numeroInterno) {
        this.numeroInterno = numeroInterno;
    }


    /**
     * Gets the numeroCuentaCorriente value for this DatosCuentaType.
     * 
     * @return numeroCuentaCorriente
     */
    public java.lang.String getNumeroCuentaCorriente() {
        return numeroCuentaCorriente;
    }


    /**
     * Sets the numeroCuentaCorriente value for this DatosCuentaType.
     * 
     * @param numeroCuentaCorriente
     */
    public void setNumeroCuentaCorriente(java.lang.String numeroCuentaCorriente) {
        this.numeroCuentaCorriente = numeroCuentaCorriente;
    }


    /**
     * Gets the campana value for this DatosCuentaType.
     * 
     * @return campana
     */
    public java.lang.Integer getCampana() {
        return campana;
    }


    /**
     * Sets the campana value for this DatosCuentaType.
     * 
     * @param campana
     */
    public void setCampana(java.lang.Integer campana) {
        this.campana = campana;
    }


    /**
     * Gets the numeroInterno2 value for this DatosCuentaType.
     * 
     * @return numeroInterno2
     */
    public java.lang.String getNumeroInterno2() {
        return numeroInterno2;
    }


    /**
     * Sets the numeroInterno2 value for this DatosCuentaType.
     * 
     * @param numeroInterno2
     */
    public void setNumeroInterno2(java.lang.String numeroInterno2) {
        this.numeroInterno2 = numeroInterno2;
    }


    /**
     * Gets the sucursal value for this DatosCuentaType.
     * 
     * @return sucursal
     */
    public java.lang.Integer getSucursal() {
        return sucursal;
    }


    /**
     * Sets the sucursal value for this DatosCuentaType.
     * 
     * @param sucursal
     */
    public void setSucursal(java.lang.Integer sucursal) {
        this.sucursal = sucursal;
    }


    /**
     * Gets the cuentaTraspasoSaldos value for this DatosCuentaType.
     * 
     * @return cuentaTraspasoSaldos
     */
    public java.lang.String getCuentaTraspasoSaldos() {
        return cuentaTraspasoSaldos;
    }


    /**
     * Sets the cuentaTraspasoSaldos value for this DatosCuentaType.
     * 
     * @param cuentaTraspasoSaldos
     */
    public void setCuentaTraspasoSaldos(java.lang.String cuentaTraspasoSaldos) {
        this.cuentaTraspasoSaldos = cuentaTraspasoSaldos;
    }


    /**
     * Gets the cantidadAdicionales value for this DatosCuentaType.
     * 
     * @return cantidadAdicionales
     */
    public java.lang.Integer getCantidadAdicionales() {
        return cantidadAdicionales;
    }


    /**
     * Sets the cantidadAdicionales value for this DatosCuentaType.
     * 
     * @param cantidadAdicionales
     */
    public void setCantidadAdicionales(java.lang.Integer cantidadAdicionales) {
        this.cantidadAdicionales = cantidadAdicionales;
    }


    /**
     * Gets the codigoAutorizacionCC value for this DatosCuentaType.
     * 
     * @return codigoAutorizacionCC
     */
    public java.lang.Integer getCodigoAutorizacionCC() {
        return codigoAutorizacionCC;
    }


    /**
     * Sets the codigoAutorizacionCC value for this DatosCuentaType.
     * 
     * @param codigoAutorizacionCC
     */
    public void setCodigoAutorizacionCC(java.lang.Integer codigoAutorizacionCC) {
        this.codigoAutorizacionCC = codigoAutorizacionCC;
    }


    /**
     * Gets the codigoVIP value for this DatosCuentaType.
     * 
     * @return codigoVIP
     */
    public java.lang.Integer getCodigoVIP() {
        return codigoVIP;
    }


    /**
     * Sets the codigoVIP value for this DatosCuentaType.
     * 
     * @param codigoVIP
     */
    public void setCodigoVIP(java.lang.Integer codigoVIP) {
        this.codigoVIP = codigoVIP;
    }


    /**
     * Gets the codigoMensajeMoraPagoMinimo value for this DatosCuentaType.
     * 
     * @return codigoMensajeMoraPagoMinimo
     */
    public java.lang.Integer getCodigoMensajeMoraPagoMinimo() {
        return codigoMensajeMoraPagoMinimo;
    }


    /**
     * Sets the codigoMensajeMoraPagoMinimo value for this DatosCuentaType.
     * 
     * @param codigoMensajeMoraPagoMinimo
     */
    public void setCodigoMensajeMoraPagoMinimo(java.lang.Integer codigoMensajeMoraPagoMinimo) {
        this.codigoMensajeMoraPagoMinimo = codigoMensajeMoraPagoMinimo;
    }


    /**
     * Gets the codigoMovimiento value for this DatosCuentaType.
     * 
     * @return codigoMovimiento
     */
    public java.lang.Integer getCodigoMovimiento() {
        return codigoMovimiento;
    }


    /**
     * Sets the codigoMovimiento value for this DatosCuentaType.
     * 
     * @param codigoMovimiento
     */
    public void setCodigoMovimiento(java.lang.Integer codigoMovimiento) {
        this.codigoMovimiento = codigoMovimiento;
    }


    /**
     * Gets the porcentajePagoMinimo value for this DatosCuentaType.
     * 
     * @return porcentajePagoMinimo
     */
    public java.lang.Integer getPorcentajePagoMinimo() {
        return porcentajePagoMinimo;
    }


    /**
     * Sets the porcentajePagoMinimo value for this DatosCuentaType.
     * 
     * @param porcentajePagoMinimo
     */
    public void setPorcentajePagoMinimo(java.lang.Integer porcentajePagoMinimo) {
        this.porcentajePagoMinimo = porcentajePagoMinimo;
    }


    /**
     * Gets the estadoCanales value for this DatosCuentaType.
     * 
     * @return estadoCanales
     */
    public java.lang.Integer getEstadoCanales() {
        return estadoCanales;
    }


    /**
     * Sets the estadoCanales value for this DatosCuentaType.
     * 
     * @param estadoCanales
     */
    public void setEstadoCanales(java.lang.Integer estadoCanales) {
        this.estadoCanales = estadoCanales;
    }


    /**
     * Gets the fechaDatos value for this DatosCuentaType.
     * 
     * @return fechaDatos
     */
    public java.util.Date getFechaDatos() {
        return fechaDatos;
    }


    /**
     * Sets the fechaDatos value for this DatosCuentaType.
     * 
     * @param fechaDatos
     */
    public void setFechaDatos(java.util.Date fechaDatos) {
        this.fechaDatos = fechaDatos;
    }


    /**
     * Gets the fechaApertura value for this DatosCuentaType.
     * 
     * @return fechaApertura
     */
    public java.util.Date getFechaApertura() {
        return fechaApertura;
    }


    /**
     * Sets the fechaApertura value for this DatosCuentaType.
     * 
     * @param fechaApertura
     */
    public void setFechaApertura(java.util.Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }


    /**
     * Gets the fechaModificacion value for this DatosCuentaType.
     * 
     * @return fechaModificacion
     */
    public java.util.Date getFechaModificacion() {
        return fechaModificacion;
    }


    /**
     * Sets the fechaModificacion value for this DatosCuentaType.
     * 
     * @param fechaModificacion
     */
    public void setFechaModificacion(java.util.Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }


    /**
     * Gets the fechaActivacionTarjeta value for this DatosCuentaType.
     * 
     * @return fechaActivacionTarjeta
     */
    public java.util.Date getFechaActivacionTarjeta() {
        return fechaActivacionTarjeta;
    }


    /**
     * Sets the fechaActivacionTarjeta value for this DatosCuentaType.
     * 
     * @param fechaActivacionTarjeta
     */
    public void setFechaActivacionTarjeta(java.util.Date fechaActivacionTarjeta) {
        this.fechaActivacionTarjeta = fechaActivacionTarjeta;
    }


    /**
     * Gets the fechaActivacionRenovacion value for this DatosCuentaType.
     * 
     * @return fechaActivacionRenovacion
     */
    public java.util.Date getFechaActivacionRenovacion() {
        return fechaActivacionRenovacion;
    }


    /**
     * Sets the fechaActivacionRenovacion value for this DatosCuentaType.
     * 
     * @param fechaActivacionRenovacion
     */
    public void setFechaActivacionRenovacion(java.util.Date fechaActivacionRenovacion) {
        this.fechaActivacionRenovacion = fechaActivacionRenovacion;
    }


    /**
     * Gets the fechaBloqueo1 value for this DatosCuentaType.
     * 
     * @return fechaBloqueo1
     */
    public java.util.Date getFechaBloqueo1() {
        return fechaBloqueo1;
    }


    /**
     * Sets the fechaBloqueo1 value for this DatosCuentaType.
     * 
     * @param fechaBloqueo1
     */
    public void setFechaBloqueo1(java.util.Date fechaBloqueo1) {
        this.fechaBloqueo1 = fechaBloqueo1;
    }


    /**
     * Gets the fechaBloqueo2 value for this DatosCuentaType.
     * 
     * @return fechaBloqueo2
     */
    public java.util.Date getFechaBloqueo2() {
        return fechaBloqueo2;
    }


    /**
     * Sets the fechaBloqueo2 value for this DatosCuentaType.
     * 
     * @param fechaBloqueo2
     */
    public void setFechaBloqueo2(java.util.Date fechaBloqueo2) {
        this.fechaBloqueo2 = fechaBloqueo2;
    }


    /**
     * Gets the fechaUltimoPagoPesos value for this DatosCuentaType.
     * 
     * @return fechaUltimoPagoPesos
     */
    public java.util.Date getFechaUltimoPagoPesos() {
        return fechaUltimoPagoPesos;
    }


    /**
     * Sets the fechaUltimoPagoPesos value for this DatosCuentaType.
     * 
     * @param fechaUltimoPagoPesos
     */
    public void setFechaUltimoPagoPesos(java.util.Date fechaUltimoPagoPesos) {
        this.fechaUltimoPagoPesos = fechaUltimoPagoPesos;
    }


    /**
     * Gets the fechaUltimoPagoDolar value for this DatosCuentaType.
     * 
     * @return fechaUltimoPagoDolar
     */
    public java.util.Date getFechaUltimoPagoDolar() {
        return fechaUltimoPagoDolar;
    }


    /**
     * Sets the fechaUltimoPagoDolar value for this DatosCuentaType.
     * 
     * @param fechaUltimoPagoDolar
     */
    public void setFechaUltimoPagoDolar(java.util.Date fechaUltimoPagoDolar) {
        this.fechaUltimoPagoDolar = fechaUltimoPagoDolar;
    }


    /**
     * Gets the fechaUltimaFacturacion value for this DatosCuentaType.
     * 
     * @return fechaUltimaFacturacion
     */
    public java.util.Date getFechaUltimaFacturacion() {
        return fechaUltimaFacturacion;
    }


    /**
     * Sets the fechaUltimaFacturacion value for this DatosCuentaType.
     * 
     * @param fechaUltimaFacturacion
     */
    public void setFechaUltimaFacturacion(java.util.Date fechaUltimaFacturacion) {
        this.fechaUltimaFacturacion = fechaUltimaFacturacion;
    }


    /**
     * Gets the fechaVencimientoPago value for this DatosCuentaType.
     * 
     * @return fechaVencimientoPago
     */
    public java.util.Date getFechaVencimientoPago() {
        return fechaVencimientoPago;
    }


    /**
     * Sets the fechaVencimientoPago value for this DatosCuentaType.
     * 
     * @param fechaVencimientoPago
     */
    public void setFechaVencimientoPago(java.util.Date fechaVencimientoPago) {
        this.fechaVencimientoPago = fechaVencimientoPago;
    }


    /**
     * Gets the fechaNacimientoTitular value for this DatosCuentaType.
     * 
     * @return fechaNacimientoTitular
     */
    public java.util.Date getFechaNacimientoTitular() {
        return fechaNacimientoTitular;
    }


    /**
     * Sets the fechaNacimientoTitular value for this DatosCuentaType.
     * 
     * @param fechaNacimientoTitular
     */
    public void setFechaNacimientoTitular(java.util.Date fechaNacimientoTitular) {
        this.fechaNacimientoTitular = fechaNacimientoTitular;
    }


    /**
     * Gets the codigoBloqueo1 value for this DatosCuentaType.
     * 
     * @return codigoBloqueo1
     */
    public java.lang.String getCodigoBloqueo1() {
        return codigoBloqueo1;
    }


    /**
     * Sets the codigoBloqueo1 value for this DatosCuentaType.
     * 
     * @param codigoBloqueo1
     */
    public void setCodigoBloqueo1(java.lang.String codigoBloqueo1) {
        this.codigoBloqueo1 = codigoBloqueo1;
    }


    /**
     * Gets the codigoBloqueo2 value for this DatosCuentaType.
     * 
     * @return codigoBloqueo2
     */
    public java.lang.String getCodigoBloqueo2() {
        return codigoBloqueo2;
    }


    /**
     * Sets the codigoBloqueo2 value for this DatosCuentaType.
     * 
     * @param codigoBloqueo2
     */
    public void setCodigoBloqueo2(java.lang.String codigoBloqueo2) {
        this.codigoBloqueo2 = codigoBloqueo2;
    }


    /**
     * Gets the codigoBloqueoNumerico value for this DatosCuentaType.
     * 
     * @return codigoBloqueoNumerico
     */
    public java.lang.Integer getCodigoBloqueoNumerico() {
        return codigoBloqueoNumerico;
    }


    /**
     * Sets the codigoBloqueoNumerico value for this DatosCuentaType.
     * 
     * @param codigoBloqueoNumerico
     */
    public void setCodigoBloqueoNumerico(java.lang.Integer codigoBloqueoNumerico) {
        this.codigoBloqueoNumerico = codigoBloqueoNumerico;
    }


    /**
     * Gets the codigoMora value for this DatosCuentaType.
     * 
     * @return codigoMora
     */
    public java.lang.Integer getCodigoMora() {
        return codigoMora;
    }


    /**
     * Sets the codigoMora value for this DatosCuentaType.
     * 
     * @param codigoMora
     */
    public void setCodigoMora(java.lang.Integer codigoMora) {
        this.codigoMora = codigoMora;
    }


    /**
     * Gets the codigoCarteraVencida value for this DatosCuentaType.
     * 
     * @return codigoCarteraVencida
     */
    public java.lang.Integer getCodigoCarteraVencida() {
        return codigoCarteraVencida;
    }


    /**
     * Sets the codigoCarteraVencida value for this DatosCuentaType.
     * 
     * @param codigoCarteraVencida
     */
    public void setCodigoCarteraVencida(java.lang.Integer codigoCarteraVencida) {
        this.codigoCarteraVencida = codigoCarteraVencida;
    }


    /**
     * Gets the codigoCobranza value for this DatosCuentaType.
     * 
     * @return codigoCobranza
     */
    public java.lang.Integer getCodigoCobranza() {
        return codigoCobranza;
    }


    /**
     * Sets the codigoCobranza value for this DatosCuentaType.
     * 
     * @param codigoCobranza
     */
    public void setCodigoCobranza(java.lang.Integer codigoCobranza) {
        this.codigoCobranza = codigoCobranza;
    }


    /**
     * Gets the formaPago value for this DatosCuentaType.
     * 
     * @return formaPago
     */
    public java.lang.Integer getFormaPago() {
        return formaPago;
    }


    /**
     * Sets the formaPago value for this DatosCuentaType.
     * 
     * @param formaPago
     */
    public void setFormaPago(java.lang.Integer formaPago) {
        this.formaPago = formaPago;
    }


    /**
     * Gets the cicloFacturacion value for this DatosCuentaType.
     * 
     * @return cicloFacturacion
     */
    public java.lang.Integer getCicloFacturacion() {
        return cicloFacturacion;
    }


    /**
     * Sets the cicloFacturacion value for this DatosCuentaType.
     * 
     * @param cicloFacturacion
     */
    public void setCicloFacturacion(java.lang.Integer cicloFacturacion) {
        this.cicloFacturacion = cicloFacturacion;
    }


    /**
     * Gets the codigoFV value for this DatosCuentaType.
     * 
     * @return codigoFV
     */
    public java.lang.Integer getCodigoFV() {
        return codigoFV;
    }


    /**
     * Sets the codigoFV value for this DatosCuentaType.
     * 
     * @param codigoFV
     */
    public void setCodigoFV(java.lang.Integer codigoFV) {
        this.codigoFV = codigoFV;
    }


    /**
     * Gets the codigoEmpresa value for this DatosCuentaType.
     * 
     * @return codigoEmpresa
     */
    public java.lang.Integer getCodigoEmpresa() {
        return codigoEmpresa;
    }


    /**
     * Sets the codigoEmpresa value for this DatosCuentaType.
     * 
     * @param codigoEmpresa
     */
    public void setCodigoEmpresa(java.lang.Integer codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }


    /**
     * Gets the codigoEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @return codigoEnvioEstadoCuenta
     */
    public java.lang.Integer getCodigoEnvioEstadoCuenta() {
        return codigoEnvioEstadoCuenta;
    }


    /**
     * Sets the codigoEnvioEstadoCuenta value for this DatosCuentaType.
     * 
     * @param codigoEnvioEstadoCuenta
     */
    public void setCodigoEnvioEstadoCuenta(java.lang.Integer codigoEnvioEstadoCuenta) {
        this.codigoEnvioEstadoCuenta = codigoEnvioEstadoCuenta;
    }


    /**
     * Gets the rebajaCobroAdministracion value for this DatosCuentaType.
     * 
     * @return rebajaCobroAdministracion
     */
    public java.lang.String getRebajaCobroAdministracion() {
        return rebajaCobroAdministracion;
    }


    /**
     * Sets the rebajaCobroAdministracion value for this DatosCuentaType.
     * 
     * @param rebajaCobroAdministracion
     */
    public void setRebajaCobroAdministracion(java.lang.String rebajaCobroAdministracion) {
        this.rebajaCobroAdministracion = rebajaCobroAdministracion;
    }


    /**
     * Gets the numeroMorasPeriodo value for this DatosCuentaType.
     * 
     * @return numeroMorasPeriodo
     */
    public java.lang.Integer getNumeroMorasPeriodo() {
        return numeroMorasPeriodo;
    }


    /**
     * Sets the numeroMorasPeriodo value for this DatosCuentaType.
     * 
     * @param numeroMorasPeriodo
     */
    public void setNumeroMorasPeriodo(java.lang.Integer numeroMorasPeriodo) {
        this.numeroMorasPeriodo = numeroMorasPeriodo;
    }


    /**
     * Gets the numeroExcesosPeriodo value for this DatosCuentaType.
     * 
     * @return numeroExcesosPeriodo
     */
    public java.lang.Integer getNumeroExcesosPeriodo() {
        return numeroExcesosPeriodo;
    }


    /**
     * Sets the numeroExcesosPeriodo value for this DatosCuentaType.
     * 
     * @param numeroExcesosPeriodo
     */
    public void setNumeroExcesosPeriodo(java.lang.Integer numeroExcesosPeriodo) {
        this.numeroExcesosPeriodo = numeroExcesosPeriodo;
    }


    /**
     * Gets the numeroBloqueosXMoras value for this DatosCuentaType.
     * 
     * @return numeroBloqueosXMoras
     */
    public java.lang.Integer getNumeroBloqueosXMoras() {
        return numeroBloqueosXMoras;
    }


    /**
     * Sets the numeroBloqueosXMoras value for this DatosCuentaType.
     * 
     * @param numeroBloqueosXMoras
     */
    public void setNumeroBloqueosXMoras(java.lang.Integer numeroBloqueosXMoras) {
        this.numeroBloqueosXMoras = numeroBloqueosXMoras;
    }


    /**
     * Gets the numeroBloqueosXExcesos value for this DatosCuentaType.
     * 
     * @return numeroBloqueosXExcesos
     */
    public java.lang.Integer getNumeroBloqueosXExcesos() {
        return numeroBloqueosXExcesos;
    }


    /**
     * Sets the numeroBloqueosXExcesos value for this DatosCuentaType.
     * 
     * @param numeroBloqueosXExcesos
     */
    public void setNumeroBloqueosXExcesos(java.lang.Integer numeroBloqueosXExcesos) {
        this.numeroBloqueosXExcesos = numeroBloqueosXExcesos;
    }


    /**
     * Gets the codigoAval value for this DatosCuentaType.
     * 
     * @return codigoAval
     */
    public java.lang.Integer getCodigoAval() {
        return codigoAval;
    }


    /**
     * Sets the codigoAval value for this DatosCuentaType.
     * 
     * @param codigoAval
     */
    public void setCodigoAval(java.lang.Integer codigoAval) {
        this.codigoAval = codigoAval;
    }


    /**
     * Gets the codigoPromocion value for this DatosCuentaType.
     * 
     * @return codigoPromocion
     */
    public java.lang.Integer getCodigoPromocion() {
        return codigoPromocion;
    }


    /**
     * Sets the codigoPromocion value for this DatosCuentaType.
     * 
     * @param codigoPromocion
     */
    public void setCodigoPromocion(java.lang.Integer codigoPromocion) {
        this.codigoPromocion = codigoPromocion;
    }


    /**
     * Gets the indicadorTarjetaOperador value for this DatosCuentaType.
     * 
     * @return indicadorTarjetaOperador
     */
    public java.lang.Integer getIndicadorTarjetaOperador() {
        return indicadorTarjetaOperador;
    }


    /**
     * Sets the indicadorTarjetaOperador value for this DatosCuentaType.
     * 
     * @param indicadorTarjetaOperador
     */
    public void setIndicadorTarjetaOperador(java.lang.Integer indicadorTarjetaOperador) {
        this.indicadorTarjetaOperador = indicadorTarjetaOperador;
    }


    /**
     * Gets the indicadorPIN value for this DatosCuentaType.
     * 
     * @return indicadorPIN
     */
    public java.lang.Integer getIndicadorPIN() {
        return indicadorPIN;
    }


    /**
     * Sets the indicadorPIN value for this DatosCuentaType.
     * 
     * @param indicadorPIN
     */
    public void setIndicadorPIN(java.lang.Integer indicadorPIN) {
        this.indicadorPIN = indicadorPIN;
    }


    /**
     * Gets the indicadorCobroComision value for this DatosCuentaType.
     * 
     * @return indicadorCobroComision
     */
    public java.lang.Integer getIndicadorCobroComision() {
        return indicadorCobroComision;
    }


    /**
     * Sets the indicadorCobroComision value for this DatosCuentaType.
     * 
     * @param indicadorCobroComision
     */
    public void setIndicadorCobroComision(java.lang.Integer indicadorCobroComision) {
        this.indicadorCobroComision = indicadorCobroComision;
    }


    /**
     * Gets the porcentajeExcesoComprasNacionales value for this DatosCuentaType.
     * 
     * @return porcentajeExcesoComprasNacionales
     */
    public java.lang.Double getPorcentajeExcesoComprasNacionales() {
        return porcentajeExcesoComprasNacionales;
    }


    /**
     * Sets the porcentajeExcesoComprasNacionales value for this DatosCuentaType.
     * 
     * @param porcentajeExcesoComprasNacionales
     */
    public void setPorcentajeExcesoComprasNacionales(java.lang.Double porcentajeExcesoComprasNacionales) {
        this.porcentajeExcesoComprasNacionales = porcentajeExcesoComprasNacionales;
    }


    /**
     * Gets the porcentajeExcesoComprasInternacionales value for this DatosCuentaType.
     * 
     * @return porcentajeExcesoComprasInternacionales
     */
    public java.lang.Double getPorcentajeExcesoComprasInternacionales() {
        return porcentajeExcesoComprasInternacionales;
    }


    /**
     * Sets the porcentajeExcesoComprasInternacionales value for this DatosCuentaType.
     * 
     * @param porcentajeExcesoComprasInternacionales
     */
    public void setPorcentajeExcesoComprasInternacionales(java.lang.Double porcentajeExcesoComprasInternacionales) {
        this.porcentajeExcesoComprasInternacionales = porcentajeExcesoComprasInternacionales;
    }


    /**
     * Gets the medioEnvioEECCFisico value for this DatosCuentaType.
     * 
     * @return medioEnvioEECCFisico
     */
    public java.lang.Integer getMedioEnvioEECCFisico() {
        return medioEnvioEECCFisico;
    }


    /**
     * Sets the medioEnvioEECCFisico value for this DatosCuentaType.
     * 
     * @param medioEnvioEECCFisico
     */
    public void setMedioEnvioEECCFisico(java.lang.Integer medioEnvioEECCFisico) {
        this.medioEnvioEECCFisico = medioEnvioEECCFisico;
    }


    /**
     * Gets the tipoDireccionFisica value for this DatosCuentaType.
     * 
     * @return tipoDireccionFisica
     */
    public java.lang.Integer getTipoDireccionFisica() {
        return tipoDireccionFisica;
    }


    /**
     * Sets the tipoDireccionFisica value for this DatosCuentaType.
     * 
     * @param tipoDireccionFisica
     */
    public void setTipoDireccionFisica(java.lang.Integer tipoDireccionFisica) {
        this.tipoDireccionFisica = tipoDireccionFisica;
    }


    /**
     * Gets the tipoPago value for this DatosCuentaType.
     * 
     * @return tipoPago
     */
    public java.lang.Integer getTipoPago() {
        return tipoPago;
    }


    /**
     * Sets the tipoPago value for this DatosCuentaType.
     * 
     * @param tipoPago
     */
    public void setTipoPago(java.lang.Integer tipoPago) {
        this.tipoPago = tipoPago;
    }


    /**
     * Gets the porcentajePagoFijo value for this DatosCuentaType.
     * 
     * @return porcentajePagoFijo
     */
    public java.lang.Double getPorcentajePagoFijo() {
        return porcentajePagoFijo;
    }


    /**
     * Sets the porcentajePagoFijo value for this DatosCuentaType.
     * 
     * @param porcentajePagoFijo
     */
    public void setPorcentajePagoFijo(java.lang.Double porcentajePagoFijo) {
        this.porcentajePagoFijo = porcentajePagoFijo;
    }


    /**
     * Gets the montoPagoFijo value for this DatosCuentaType.
     * 
     * @return montoPagoFijo
     */
    public java.lang.Integer getMontoPagoFijo() {
        return montoPagoFijo;
    }


    /**
     * Sets the montoPagoFijo value for this DatosCuentaType.
     * 
     * @param montoPagoFijo
     */
    public void setMontoPagoFijo(java.lang.Integer montoPagoFijo) {
        this.montoPagoFijo = montoPagoFijo;
    }


    /**
     * Gets the codigoEmbozado value for this DatosCuentaType.
     * 
     * @return codigoEmbozado
     */
    public java.lang.Integer getCodigoEmbozado() {
        return codigoEmbozado;
    }


    /**
     * Sets the codigoEmbozado value for this DatosCuentaType.
     * 
     * @param codigoEmbozado
     */
    public void setCodigoEmbozado(java.lang.Integer codigoEmbozado) {
        this.codigoEmbozado = codigoEmbozado;
    }


    /**
     * Gets the lineaLimites value for this DatosCuentaType.
     * 
     * @return lineaLimites
     */
    public java.lang.String getLineaLimites() {
        return lineaLimites;
    }


    /**
     * Sets the lineaLimites value for this DatosCuentaType.
     * 
     * @param lineaLimites
     */
    public void setLineaLimites(java.lang.String lineaLimites) {
        this.lineaLimites = lineaLimites;
    }


    /**
     * Gets the PCTPesos value for this DatosCuentaType.
     * 
     * @return PCTPesos
     */
    public java.lang.Integer getPCTPesos() {
        return PCTPesos;
    }


    /**
     * Sets the PCTPesos value for this DatosCuentaType.
     * 
     * @param PCTPesos
     */
    public void setPCTPesos(java.lang.Integer PCTPesos) {
        this.PCTPesos = PCTPesos;
    }


    /**
     * Gets the PCTDolar value for this DatosCuentaType.
     * 
     * @return PCTDolar
     */
    public java.lang.Integer getPCTDolar() {
        return PCTDolar;
    }


    /**
     * Sets the PCTDolar value for this DatosCuentaType.
     * 
     * @param PCTDolar
     */
    public void setPCTDolar(java.lang.Integer PCTDolar) {
        this.PCTDolar = PCTDolar;
    }


    /**
     * Gets the indicador3CPC value for this DatosCuentaType.
     * 
     * @return indicador3CPC
     */
    public java.lang.String getIndicador3CPC() {
        return indicador3CPC;
    }


    /**
     * Sets the indicador3CPC value for this DatosCuentaType.
     * 
     * @param indicador3CPC
     */
    public void setIndicador3CPC(java.lang.String indicador3CPC) {
        this.indicador3CPC = indicador3CPC;
    }


    /**
     * Gets the indicadorExceso value for this DatosCuentaType.
     * 
     * @return indicadorExceso
     */
    public java.lang.String getIndicadorExceso() {
        return indicadorExceso;
    }


    /**
     * Sets the indicadorExceso value for this DatosCuentaType.
     * 
     * @param indicadorExceso
     */
    public void setIndicadorExceso(java.lang.String indicadorExceso) {
        this.indicadorExceso = indicadorExceso;
    }


    /**
     * Gets the cupoNacional value for this DatosCuentaType.
     * 
     * @return cupoNacional
     */
    public java.lang.Integer getCupoNacional() {
        return cupoNacional;
    }


    /**
     * Sets the cupoNacional value for this DatosCuentaType.
     * 
     * @param cupoNacional
     */
    public void setCupoNacional(java.lang.Integer cupoNacional) {
        this.cupoNacional = cupoNacional;
    }


    /**
     * Gets the cupoInternacional value for this DatosCuentaType.
     * 
     * @return cupoInternacional
     */
    public java.lang.Double getCupoInternacional() {
        return cupoInternacional;
    }


    /**
     * Sets the cupoInternacional value for this DatosCuentaType.
     * 
     * @param cupoInternacional
     */
    public void setCupoInternacional(java.lang.Double cupoInternacional) {
        this.cupoInternacional = cupoInternacional;
    }


    /**
     * Gets the cupoLinea2 value for this DatosCuentaType.
     * 
     * @return cupoLinea2
     */
    public java.lang.Integer getCupoLinea2() {
        return cupoLinea2;
    }


    /**
     * Sets the cupoLinea2 value for this DatosCuentaType.
     * 
     * @param cupoLinea2
     */
    public void setCupoLinea2(java.lang.Integer cupoLinea2) {
        this.cupoLinea2 = cupoLinea2;
    }


    /**
     * Gets the cupoVirtualNacional value for this DatosCuentaType.
     * 
     * @return cupoVirtualNacional
     */
    public java.lang.Integer getCupoVirtualNacional() {
        return cupoVirtualNacional;
    }


    /**
     * Sets the cupoVirtualNacional value for this DatosCuentaType.
     * 
     * @param cupoVirtualNacional
     */
    public void setCupoVirtualNacional(java.lang.Integer cupoVirtualNacional) {
        this.cupoVirtualNacional = cupoVirtualNacional;
    }


    /**
     * Gets the cupoVirtualInternacional value for this DatosCuentaType.
     * 
     * @return cupoVirtualInternacional
     */
    public java.lang.Double getCupoVirtualInternacional() {
        return cupoVirtualInternacional;
    }


    /**
     * Sets the cupoVirtualInternacional value for this DatosCuentaType.
     * 
     * @param cupoVirtualInternacional
     */
    public void setCupoVirtualInternacional(java.lang.Double cupoVirtualInternacional) {
        this.cupoVirtualInternacional = cupoVirtualInternacional;
    }


    /**
     * Gets the deudaNacional value for this DatosCuentaType.
     * 
     * @return deudaNacional
     */
    public java.lang.Integer getDeudaNacional() {
        return deudaNacional;
    }


    /**
     * Sets the deudaNacional value for this DatosCuentaType.
     * 
     * @param deudaNacional
     */
    public void setDeudaNacional(java.lang.Integer deudaNacional) {
        this.deudaNacional = deudaNacional;
    }


    /**
     * Gets the deudaInternacional value for this DatosCuentaType.
     * 
     * @return deudaInternacional
     */
    public java.lang.Double getDeudaInternacional() {
        return deudaInternacional;
    }


    /**
     * Sets the deudaInternacional value for this DatosCuentaType.
     * 
     * @param deudaInternacional
     */
    public void setDeudaInternacional(java.lang.Double deudaInternacional) {
        this.deudaInternacional = deudaInternacional;
    }


    /**
     * Gets the deudaLinea2 value for this DatosCuentaType.
     * 
     * @return deudaLinea2
     */
    public java.lang.Integer getDeudaLinea2() {
        return deudaLinea2;
    }


    /**
     * Sets the deudaLinea2 value for this DatosCuentaType.
     * 
     * @param deudaLinea2
     */
    public void setDeudaLinea2(java.lang.Integer deudaLinea2) {
        this.deudaLinea2 = deudaLinea2;
    }


    /**
     * Gets the deudaMoraNacional value for this DatosCuentaType.
     * 
     * @return deudaMoraNacional
     */
    public java.lang.Integer getDeudaMoraNacional() {
        return deudaMoraNacional;
    }


    /**
     * Sets the deudaMoraNacional value for this DatosCuentaType.
     * 
     * @param deudaMoraNacional
     */
    public void setDeudaMoraNacional(java.lang.Integer deudaMoraNacional) {
        this.deudaMoraNacional = deudaMoraNacional;
    }


    /**
     * Gets the deudaMoraInternacional value for this DatosCuentaType.
     * 
     * @return deudaMoraInternacional
     */
    public java.lang.Double getDeudaMoraInternacional() {
        return deudaMoraInternacional;
    }


    /**
     * Sets the deudaMoraInternacional value for this DatosCuentaType.
     * 
     * @param deudaMoraInternacional
     */
    public void setDeudaMoraInternacional(java.lang.Double deudaMoraInternacional) {
        this.deudaMoraInternacional = deudaMoraInternacional;
    }


    /**
     * Gets the deudaNacionalFacturada value for this DatosCuentaType.
     * 
     * @return deudaNacionalFacturada
     */
    public java.lang.Integer getDeudaNacionalFacturada() {
        return deudaNacionalFacturada;
    }


    /**
     * Sets the deudaNacionalFacturada value for this DatosCuentaType.
     * 
     * @param deudaNacionalFacturada
     */
    public void setDeudaNacionalFacturada(java.lang.Integer deudaNacionalFacturada) {
        this.deudaNacionalFacturada = deudaNacionalFacturada;
    }


    /**
     * Gets the deudaInternacionalFacturada value for this DatosCuentaType.
     * 
     * @return deudaInternacionalFacturada
     */
    public java.lang.Double getDeudaInternacionalFacturada() {
        return deudaInternacionalFacturada;
    }


    /**
     * Sets the deudaInternacionalFacturada value for this DatosCuentaType.
     * 
     * @param deudaInternacionalFacturada
     */
    public void setDeudaInternacionalFacturada(java.lang.Double deudaInternacionalFacturada) {
        this.deudaInternacionalFacturada = deudaInternacionalFacturada;
    }


    /**
     * Gets the disponibleNacional value for this DatosCuentaType.
     * 
     * @return disponibleNacional
     */
    public java.lang.Integer getDisponibleNacional() {
        return disponibleNacional;
    }


    /**
     * Sets the disponibleNacional value for this DatosCuentaType.
     * 
     * @param disponibleNacional
     */
    public void setDisponibleNacional(java.lang.Integer disponibleNacional) {
        this.disponibleNacional = disponibleNacional;
    }


    /**
     * Gets the disponibleInternacional value for this DatosCuentaType.
     * 
     * @return disponibleInternacional
     */
    public java.lang.Double getDisponibleInternacional() {
        return disponibleInternacional;
    }


    /**
     * Sets the disponibleInternacional value for this DatosCuentaType.
     * 
     * @param disponibleInternacional
     */
    public void setDisponibleInternacional(java.lang.Double disponibleInternacional) {
        this.disponibleInternacional = disponibleInternacional;
    }


    /**
     * Gets the disponibleLinea2 value for this DatosCuentaType.
     * 
     * @return disponibleLinea2
     */
    public java.lang.Integer getDisponibleLinea2() {
        return disponibleLinea2;
    }


    /**
     * Sets the disponibleLinea2 value for this DatosCuentaType.
     * 
     * @param disponibleLinea2
     */
    public void setDisponibleLinea2(java.lang.Integer disponibleLinea2) {
        this.disponibleLinea2 = disponibleLinea2;
    }


    /**
     * Gets the saldoCreditoCuotaCapital value for this DatosCuentaType.
     * 
     * @return saldoCreditoCuotaCapital
     */
    public java.lang.Integer getSaldoCreditoCuotaCapital() {
        return saldoCreditoCuotaCapital;
    }


    /**
     * Sets the saldoCreditoCuotaCapital value for this DatosCuentaType.
     * 
     * @param saldoCreditoCuotaCapital
     */
    public void setSaldoCreditoCuotaCapital(java.lang.Integer saldoCreditoCuotaCapital) {
        this.saldoCreditoCuotaCapital = saldoCreditoCuotaCapital;
    }


    /**
     * Gets the disponibleAvances value for this DatosCuentaType.
     * 
     * @return disponibleAvances
     */
    public java.lang.Integer getDisponibleAvances() {
        return disponibleAvances;
    }


    /**
     * Sets the disponibleAvances value for this DatosCuentaType.
     * 
     * @param disponibleAvances
     */
    public void setDisponibleAvances(java.lang.Integer disponibleAvances) {
        this.disponibleAvances = disponibleAvances;
    }


    /**
     * Gets the disponibleAvancesDolar value for this DatosCuentaType.
     * 
     * @return disponibleAvancesDolar
     */
    public java.lang.Double getDisponibleAvancesDolar() {
        return disponibleAvancesDolar;
    }


    /**
     * Sets the disponibleAvancesDolar value for this DatosCuentaType.
     * 
     * @param disponibleAvancesDolar
     */
    public void setDisponibleAvancesDolar(java.lang.Double disponibleAvancesDolar) {
        this.disponibleAvancesDolar = disponibleAvancesDolar;
    }


    /**
     * Gets the mora1A30Dias value for this DatosCuentaType.
     * 
     * @return mora1A30Dias
     */
    public java.lang.Integer getMora1A30Dias() {
        return mora1A30Dias;
    }


    /**
     * Sets the mora1A30Dias value for this DatosCuentaType.
     * 
     * @param mora1A30Dias
     */
    public void setMora1A30Dias(java.lang.Integer mora1A30Dias) {
        this.mora1A30Dias = mora1A30Dias;
    }


    /**
     * Gets the mora31A60Dias value for this DatosCuentaType.
     * 
     * @return mora31A60Dias
     */
    public java.lang.Integer getMora31A60Dias() {
        return mora31A60Dias;
    }


    /**
     * Sets the mora31A60Dias value for this DatosCuentaType.
     * 
     * @param mora31A60Dias
     */
    public void setMora31A60Dias(java.lang.Integer mora31A60Dias) {
        this.mora31A60Dias = mora31A60Dias;
    }


    /**
     * Gets the mora61A90Dias value for this DatosCuentaType.
     * 
     * @return mora61A90Dias
     */
    public java.lang.Integer getMora61A90Dias() {
        return mora61A90Dias;
    }


    /**
     * Sets the mora61A90Dias value for this DatosCuentaType.
     * 
     * @param mora61A90Dias
     */
    public void setMora61A90Dias(java.lang.Integer mora61A90Dias) {
        this.mora61A90Dias = mora61A90Dias;
    }


    /**
     * Gets the mora91A120Dias value for this DatosCuentaType.
     * 
     * @return mora91A120Dias
     */
    public java.lang.Integer getMora91A120Dias() {
        return mora91A120Dias;
    }


    /**
     * Sets the mora91A120Dias value for this DatosCuentaType.
     * 
     * @param mora91A120Dias
     */
    public void setMora91A120Dias(java.lang.Integer mora91A120Dias) {
        this.mora91A120Dias = mora91A120Dias;
    }


    /**
     * Gets the mora121A150Dias value for this DatosCuentaType.
     * 
     * @return mora121A150Dias
     */
    public java.lang.Integer getMora121A150Dias() {
        return mora121A150Dias;
    }


    /**
     * Sets the mora121A150Dias value for this DatosCuentaType.
     * 
     * @param mora121A150Dias
     */
    public void setMora121A150Dias(java.lang.Integer mora121A150Dias) {
        this.mora121A150Dias = mora121A150Dias;
    }


    /**
     * Gets the mora151A180Dias value for this DatosCuentaType.
     * 
     * @return mora151A180Dias
     */
    public java.lang.Integer getMora151A180Dias() {
        return mora151A180Dias;
    }


    /**
     * Sets the mora151A180Dias value for this DatosCuentaType.
     * 
     * @param mora151A180Dias
     */
    public void setMora151A180Dias(java.lang.Integer mora151A180Dias) {
        this.mora151A180Dias = mora151A180Dias;
    }


    /**
     * Gets the mora181A210Dias value for this DatosCuentaType.
     * 
     * @return mora181A210Dias
     */
    public java.lang.Integer getMora181A210Dias() {
        return mora181A210Dias;
    }


    /**
     * Sets the mora181A210Dias value for this DatosCuentaType.
     * 
     * @param mora181A210Dias
     */
    public void setMora181A210Dias(java.lang.Integer mora181A210Dias) {
        this.mora181A210Dias = mora181A210Dias;
    }


    /**
     * Gets the mora210A999Dias value for this DatosCuentaType.
     * 
     * @return mora210A999Dias
     */
    public java.lang.Integer getMora210A999Dias() {
        return mora210A999Dias;
    }


    /**
     * Sets the mora210A999Dias value for this DatosCuentaType.
     * 
     * @param mora210A999Dias
     */
    public void setMora210A999Dias(java.lang.Integer mora210A999Dias) {
        this.mora210A999Dias = mora210A999Dias;
    }


    /**
     * Gets the recargoCobranza1A30Dias value for this DatosCuentaType.
     * 
     * @return recargoCobranza1A30Dias
     */
    public java.lang.Integer getRecargoCobranza1A30Dias() {
        return recargoCobranza1A30Dias;
    }


    /**
     * Sets the recargoCobranza1A30Dias value for this DatosCuentaType.
     * 
     * @param recargoCobranza1A30Dias
     */
    public void setRecargoCobranza1A30Dias(java.lang.Integer recargoCobranza1A30Dias) {
        this.recargoCobranza1A30Dias = recargoCobranza1A30Dias;
    }


    /**
     * Gets the recargoCobranza31A60Dias value for this DatosCuentaType.
     * 
     * @return recargoCobranza31A60Dias
     */
    public java.lang.Integer getRecargoCobranza31A60Dias() {
        return recargoCobranza31A60Dias;
    }


    /**
     * Sets the recargoCobranza31A60Dias value for this DatosCuentaType.
     * 
     * @param recargoCobranza31A60Dias
     */
    public void setRecargoCobranza31A60Dias(java.lang.Integer recargoCobranza31A60Dias) {
        this.recargoCobranza31A60Dias = recargoCobranza31A60Dias;
    }


    /**
     * Gets the recargoCobranza61A90Dias value for this DatosCuentaType.
     * 
     * @return recargoCobranza61A90Dias
     */
    public java.lang.Integer getRecargoCobranza61A90Dias() {
        return recargoCobranza61A90Dias;
    }


    /**
     * Sets the recargoCobranza61A90Dias value for this DatosCuentaType.
     * 
     * @param recargoCobranza61A90Dias
     */
    public void setRecargoCobranza61A90Dias(java.lang.Integer recargoCobranza61A90Dias) {
        this.recargoCobranza61A90Dias = recargoCobranza61A90Dias;
    }


    /**
     * Gets the recargoCobranza91A120Dias value for this DatosCuentaType.
     * 
     * @return recargoCobranza91A120Dias
     */
    public java.lang.Integer getRecargoCobranza91A120Dias() {
        return recargoCobranza91A120Dias;
    }


    /**
     * Sets the recargoCobranza91A120Dias value for this DatosCuentaType.
     * 
     * @param recargoCobranza91A120Dias
     */
    public void setRecargoCobranza91A120Dias(java.lang.Integer recargoCobranza91A120Dias) {
        this.recargoCobranza91A120Dias = recargoCobranza91A120Dias;
    }


    /**
     * Gets the recargoCobranza121A150Dias value for this DatosCuentaType.
     * 
     * @return recargoCobranza121A150Dias
     */
    public java.lang.Integer getRecargoCobranza121A150Dias() {
        return recargoCobranza121A150Dias;
    }


    /**
     * Sets the recargoCobranza121A150Dias value for this DatosCuentaType.
     * 
     * @param recargoCobranza121A150Dias
     */
    public void setRecargoCobranza121A150Dias(java.lang.Integer recargoCobranza121A150Dias) {
        this.recargoCobranza121A150Dias = recargoCobranza121A150Dias;
    }


    /**
     * Gets the recargoCobranza151A180Dias value for this DatosCuentaType.
     * 
     * @return recargoCobranza151A180Dias
     */
    public java.lang.Integer getRecargoCobranza151A180Dias() {
        return recargoCobranza151A180Dias;
    }


    /**
     * Sets the recargoCobranza151A180Dias value for this DatosCuentaType.
     * 
     * @param recargoCobranza151A180Dias
     */
    public void setRecargoCobranza151A180Dias(java.lang.Integer recargoCobranza151A180Dias) {
        this.recargoCobranza151A180Dias = recargoCobranza151A180Dias;
    }


    /**
     * Gets the recargoCobranza181A210Dias value for this DatosCuentaType.
     * 
     * @return recargoCobranza181A210Dias
     */
    public java.lang.Integer getRecargoCobranza181A210Dias() {
        return recargoCobranza181A210Dias;
    }


    /**
     * Sets the recargoCobranza181A210Dias value for this DatosCuentaType.
     * 
     * @param recargoCobranza181A210Dias
     */
    public void setRecargoCobranza181A210Dias(java.lang.Integer recargoCobranza181A210Dias) {
        this.recargoCobranza181A210Dias = recargoCobranza181A210Dias;
    }


    /**
     * Gets the recargoCobranza210A999Dias value for this DatosCuentaType.
     * 
     * @return recargoCobranza210A999Dias
     */
    public java.lang.Integer getRecargoCobranza210A999Dias() {
        return recargoCobranza210A999Dias;
    }


    /**
     * Sets the recargoCobranza210A999Dias value for this DatosCuentaType.
     * 
     * @param recargoCobranza210A999Dias
     */
    public void setRecargoCobranza210A999Dias(java.lang.Integer recargoCobranza210A999Dias) {
        this.recargoCobranza210A999Dias = recargoCobranza210A999Dias;
    }


    /**
     * Gets the pagoMinimo value for this DatosCuentaType.
     * 
     * @return pagoMinimo
     */
    public java.lang.Integer getPagoMinimo() {
        return pagoMinimo;
    }


    /**
     * Sets the pagoMinimo value for this DatosCuentaType.
     * 
     * @param pagoMinimo
     */
    public void setPagoMinimo(java.lang.Integer pagoMinimo) {
        this.pagoMinimo = pagoMinimo;
    }


    /**
     * Gets the saldoColocacionNacional value for this DatosCuentaType.
     * 
     * @return saldoColocacionNacional
     */
    public java.lang.Integer getSaldoColocacionNacional() {
        return saldoColocacionNacional;
    }


    /**
     * Sets the saldoColocacionNacional value for this DatosCuentaType.
     * 
     * @param saldoColocacionNacional
     */
    public void setSaldoColocacionNacional(java.lang.Integer saldoColocacionNacional) {
        this.saldoColocacionNacional = saldoColocacionNacional;
    }


    /**
     * Gets the saldoColocacionInternacional value for this DatosCuentaType.
     * 
     * @return saldoColocacionInternacional
     */
    public java.lang.Double getSaldoColocacionInternacional() {
        return saldoColocacionInternacional;
    }


    /**
     * Sets the saldoColocacionInternacional value for this DatosCuentaType.
     * 
     * @param saldoColocacionInternacional
     */
    public void setSaldoColocacionInternacional(java.lang.Double saldoColocacionInternacional) {
        this.saldoColocacionInternacional = saldoColocacionInternacional;
    }


    /**
     * Gets the tasaInteresRotativo value for this DatosCuentaType.
     * 
     * @return tasaInteresRotativo
     */
    public java.lang.Double getTasaInteresRotativo() {
        return tasaInteresRotativo;
    }


    /**
     * Sets the tasaInteresRotativo value for this DatosCuentaType.
     * 
     * @param tasaInteresRotativo
     */
    public void setTasaInteresRotativo(java.lang.Double tasaInteresRotativo) {
        this.tasaInteresRotativo = tasaInteresRotativo;
    }


    /**
     * Gets the tasaInteresCuotas2A4 value for this DatosCuentaType.
     * 
     * @return tasaInteresCuotas2A4
     */
    public java.lang.Double getTasaInteresCuotas2A4() {
        return tasaInteresCuotas2A4;
    }


    /**
     * Sets the tasaInteresCuotas2A4 value for this DatosCuentaType.
     * 
     * @param tasaInteresCuotas2A4
     */
    public void setTasaInteresCuotas2A4(java.lang.Double tasaInteresCuotas2A4) {
        this.tasaInteresCuotas2A4 = tasaInteresCuotas2A4;
    }


    /**
     * Gets the tasaInteresCuotas5A24 value for this DatosCuentaType.
     * 
     * @return tasaInteresCuotas5A24
     */
    public java.lang.Double getTasaInteresCuotas5A24() {
        return tasaInteresCuotas5A24;
    }


    /**
     * Sets the tasaInteresCuotas5A24 value for this DatosCuentaType.
     * 
     * @param tasaInteresCuotas5A24
     */
    public void setTasaInteresCuotas5A24(java.lang.Double tasaInteresCuotas5A24) {
        this.tasaInteresCuotas5A24 = tasaInteresCuotas5A24;
    }


    /**
     * Gets the interesXCobrarOperador value for this DatosCuentaType.
     * 
     * @return interesXCobrarOperador
     */
    public java.lang.Integer getInteresXCobrarOperador() {
        return interesXCobrarOperador;
    }


    /**
     * Sets the interesXCobrarOperador value for this DatosCuentaType.
     * 
     * @param interesXCobrarOperador
     */
    public void setInteresXCobrarOperador(java.lang.Integer interesXCobrarOperador) {
        this.interesXCobrarOperador = interesXCobrarOperador;
    }


    /**
     * Gets the interesXCobrarCorrientes value for this DatosCuentaType.
     * 
     * @return interesXCobrarCorrientes
     */
    public java.lang.Integer getInteresXCobrarCorrientes() {
        return interesXCobrarCorrientes;
    }


    /**
     * Sets the interesXCobrarCorrientes value for this DatosCuentaType.
     * 
     * @param interesXCobrarCorrientes
     */
    public void setInteresXCobrarCorrientes(java.lang.Integer interesXCobrarCorrientes) {
        this.interesXCobrarCorrientes = interesXCobrarCorrientes;
    }


    /**
     * Gets the interesXCobrarPenales value for this DatosCuentaType.
     * 
     * @return interesXCobrarPenales
     */
    public java.lang.Integer getInteresXCobrarPenales() {
        return interesXCobrarPenales;
    }


    /**
     * Sets the interesXCobrarPenales value for this DatosCuentaType.
     * 
     * @param interesXCobrarPenales
     */
    public void setInteresXCobrarPenales(java.lang.Integer interesXCobrarPenales) {
        this.interesXCobrarPenales = interesXCobrarPenales;
    }


    /**
     * Gets the interesDevengadosOperador value for this DatosCuentaType.
     * 
     * @return interesDevengadosOperador
     */
    public java.lang.Integer getInteresDevengadosOperador() {
        return interesDevengadosOperador;
    }


    /**
     * Sets the interesDevengadosOperador value for this DatosCuentaType.
     * 
     * @param interesDevengadosOperador
     */
    public void setInteresDevengadosOperador(java.lang.Integer interesDevengadosOperador) {
        this.interesDevengadosOperador = interesDevengadosOperador;
    }


    /**
     * Gets the interesDevengadosCorrientes value for this DatosCuentaType.
     * 
     * @return interesDevengadosCorrientes
     */
    public java.lang.Integer getInteresDevengadosCorrientes() {
        return interesDevengadosCorrientes;
    }


    /**
     * Sets the interesDevengadosCorrientes value for this DatosCuentaType.
     * 
     * @param interesDevengadosCorrientes
     */
    public void setInteresDevengadosCorrientes(java.lang.Integer interesDevengadosCorrientes) {
        this.interesDevengadosCorrientes = interesDevengadosCorrientes;
    }


    /**
     * Gets the interesDevengadosPenales value for this DatosCuentaType.
     * 
     * @return interesDevengadosPenales
     */
    public java.lang.Integer getInteresDevengadosPenales() {
        return interesDevengadosPenales;
    }


    /**
     * Sets the interesDevengadosPenales value for this DatosCuentaType.
     * 
     * @param interesDevengadosPenales
     */
    public void setInteresDevengadosPenales(java.lang.Integer interesDevengadosPenales) {
        this.interesDevengadosPenales = interesDevengadosPenales;
    }


    /**
     * Gets the interesPercibidosOperador value for this DatosCuentaType.
     * 
     * @return interesPercibidosOperador
     */
    public java.lang.Integer getInteresPercibidosOperador() {
        return interesPercibidosOperador;
    }


    /**
     * Sets the interesPercibidosOperador value for this DatosCuentaType.
     * 
     * @param interesPercibidosOperador
     */
    public void setInteresPercibidosOperador(java.lang.Integer interesPercibidosOperador) {
        this.interesPercibidosOperador = interesPercibidosOperador;
    }


    /**
     * Gets the interesPercibidosCorrientes value for this DatosCuentaType.
     * 
     * @return interesPercibidosCorrientes
     */
    public java.lang.Integer getInteresPercibidosCorrientes() {
        return interesPercibidosCorrientes;
    }


    /**
     * Sets the interesPercibidosCorrientes value for this DatosCuentaType.
     * 
     * @param interesPercibidosCorrientes
     */
    public void setInteresPercibidosCorrientes(java.lang.Integer interesPercibidosCorrientes) {
        this.interesPercibidosCorrientes = interesPercibidosCorrientes;
    }


    /**
     * Gets the interesPercibidosPenales value for this DatosCuentaType.
     * 
     * @return interesPercibidosPenales
     */
    public java.lang.Integer getInteresPercibidosPenales() {
        return interesPercibidosPenales;
    }


    /**
     * Sets the interesPercibidosPenales value for this DatosCuentaType.
     * 
     * @param interesPercibidosPenales
     */
    public void setInteresPercibidosPenales(java.lang.Integer interesPercibidosPenales) {
        this.interesPercibidosPenales = interesPercibidosPenales;
    }


    /**
     * Gets the deudaTotal value for this DatosCuentaType.
     * 
     * @return deudaTotal
     */
    public java.lang.Double getDeudaTotal() {
        return deudaTotal;
    }


    /**
     * Sets the deudaTotal value for this DatosCuentaType.
     * 
     * @param deudaTotal
     */
    public void setDeudaTotal(java.lang.Double deudaTotal) {
        this.deudaTotal = deudaTotal;
    }


    /**
     * Gets the colocacionMes value for this DatosCuentaType.
     * 
     * @return colocacionMes
     */
    public java.lang.Integer getColocacionMes() {
        return colocacionMes;
    }


    /**
     * Sets the colocacionMes value for this DatosCuentaType.
     * 
     * @param colocacionMes
     */
    public void setColocacionMes(java.lang.Integer colocacionMes) {
        this.colocacionMes = colocacionMes;
    }


    /**
     * Gets the montoCompraMes value for this DatosCuentaType.
     * 
     * @return montoCompraMes
     */
    public java.lang.Integer getMontoCompraMes() {
        return montoCompraMes;
    }


    /**
     * Sets the montoCompraMes value for this DatosCuentaType.
     * 
     * @param montoCompraMes
     */
    public void setMontoCompraMes(java.lang.Integer montoCompraMes) {
        this.montoCompraMes = montoCompraMes;
    }


    /**
     * Gets the montoAvanceMes value for this DatosCuentaType.
     * 
     * @return montoAvanceMes
     */
    public java.lang.Integer getMontoAvanceMes() {
        return montoAvanceMes;
    }


    /**
     * Sets the montoAvanceMes value for this DatosCuentaType.
     * 
     * @param montoAvanceMes
     */
    public void setMontoAvanceMes(java.lang.Integer montoAvanceMes) {
        this.montoAvanceMes = montoAvanceMes;
    }


    /**
     * Gets the montoUltimoPagoPesos value for this DatosCuentaType.
     * 
     * @return montoUltimoPagoPesos
     */
    public java.lang.Integer getMontoUltimoPagoPesos() {
        return montoUltimoPagoPesos;
    }


    /**
     * Sets the montoUltimoPagoPesos value for this DatosCuentaType.
     * 
     * @param montoUltimoPagoPesos
     */
    public void setMontoUltimoPagoPesos(java.lang.Integer montoUltimoPagoPesos) {
        this.montoUltimoPagoPesos = montoUltimoPagoPesos;
    }


    /**
     * Gets the montoUltimoPagoDolar value for this DatosCuentaType.
     * 
     * @return montoUltimoPagoDolar
     */
    public java.lang.Double getMontoUltimoPagoDolar() {
        return montoUltimoPagoDolar;
    }


    /**
     * Sets the montoUltimoPagoDolar value for this DatosCuentaType.
     * 
     * @param montoUltimoPagoDolar
     */
    public void setMontoUltimoPagoDolar(java.lang.Double montoUltimoPagoDolar) {
        this.montoUltimoPagoDolar = montoUltimoPagoDolar;
    }


    /**
     * Gets the montoCobroAdministracion value for this DatosCuentaType.
     * 
     * @return montoCobroAdministracion
     */
    public java.lang.Integer getMontoCobroAdministracion() {
        return montoCobroAdministracion;
    }


    /**
     * Sets the montoCobroAdministracion value for this DatosCuentaType.
     * 
     * @param montoCobroAdministracion
     */
    public void setMontoCobroAdministracion(java.lang.Integer montoCobroAdministracion) {
        this.montoCobroAdministracion = montoCobroAdministracion;
    }


    /**
     * Gets the consumoPesos value for this DatosCuentaType.
     * 
     * @return consumoPesos
     */
    public java.lang.Integer getConsumoPesos() {
        return consumoPesos;
    }


    /**
     * Sets the consumoPesos value for this DatosCuentaType.
     * 
     * @param consumoPesos
     */
    public void setConsumoPesos(java.lang.Integer consumoPesos) {
        this.consumoPesos = consumoPesos;
    }


    /**
     * Gets the consumoDolar value for this DatosCuentaType.
     * 
     * @return consumoDolar
     */
    public java.lang.Double getConsumoDolar() {
        return consumoDolar;
    }


    /**
     * Sets the consumoDolar value for this DatosCuentaType.
     * 
     * @param consumoDolar
     */
    public void setConsumoDolar(java.lang.Double consumoDolar) {
        this.consumoDolar = consumoDolar;
    }


    /**
     * Gets the pagosPesosCiclo value for this DatosCuentaType.
     * 
     * @return pagosPesosCiclo
     */
    public java.lang.Integer getPagosPesosCiclo() {
        return pagosPesosCiclo;
    }


    /**
     * Sets the pagosPesosCiclo value for this DatosCuentaType.
     * 
     * @param pagosPesosCiclo
     */
    public void setPagosPesosCiclo(java.lang.Integer pagosPesosCiclo) {
        this.pagosPesosCiclo = pagosPesosCiclo;
    }


    /**
     * Gets the pagosDolarCiclo value for this DatosCuentaType.
     * 
     * @return pagosDolarCiclo
     */
    public java.lang.Double getPagosDolarCiclo() {
        return pagosDolarCiclo;
    }


    /**
     * Sets the pagosDolarCiclo value for this DatosCuentaType.
     * 
     * @param pagosDolarCiclo
     */
    public void setPagosDolarCiclo(java.lang.Double pagosDolarCiclo) {
        this.pagosDolarCiclo = pagosDolarCiclo;
    }


    /**
     * Gets the creditosPesosCiclo value for this DatosCuentaType.
     * 
     * @return creditosPesosCiclo
     */
    public java.lang.Integer getCreditosPesosCiclo() {
        return creditosPesosCiclo;
    }


    /**
     * Sets the creditosPesosCiclo value for this DatosCuentaType.
     * 
     * @param creditosPesosCiclo
     */
    public void setCreditosPesosCiclo(java.lang.Integer creditosPesosCiclo) {
        this.creditosPesosCiclo = creditosPesosCiclo;
    }


    /**
     * Gets the creditosDolarCiclo value for this DatosCuentaType.
     * 
     * @return creditosDolarCiclo
     */
    public java.lang.Double getCreditosDolarCiclo() {
        return creditosDolarCiclo;
    }


    /**
     * Sets the creditosDolarCiclo value for this DatosCuentaType.
     * 
     * @param creditosDolarCiclo
     */
    public void setCreditosDolarCiclo(java.lang.Double creditosDolarCiclo) {
        this.creditosDolarCiclo = creditosDolarCiclo;
    }


    /**
     * Gets the debitosPesosCiclo value for this DatosCuentaType.
     * 
     * @return debitosPesosCiclo
     */
    public java.lang.Integer getDebitosPesosCiclo() {
        return debitosPesosCiclo;
    }


    /**
     * Sets the debitosPesosCiclo value for this DatosCuentaType.
     * 
     * @param debitosPesosCiclo
     */
    public void setDebitosPesosCiclo(java.lang.Integer debitosPesosCiclo) {
        this.debitosPesosCiclo = debitosPesosCiclo;
    }


    /**
     * Gets the debitosDolarCiclo value for this DatosCuentaType.
     * 
     * @return debitosDolarCiclo
     */
    public java.lang.Double getDebitosDolarCiclo() {
        return debitosDolarCiclo;
    }


    /**
     * Sets the debitosDolarCiclo value for this DatosCuentaType.
     * 
     * @param debitosDolarCiclo
     */
    public void setDebitosDolarCiclo(java.lang.Double debitosDolarCiclo) {
        this.debitosDolarCiclo = debitosDolarCiclo;
    }


    /**
     * Gets the creditosMemoPesosCiclo value for this DatosCuentaType.
     * 
     * @return creditosMemoPesosCiclo
     */
    public java.lang.Integer getCreditosMemoPesosCiclo() {
        return creditosMemoPesosCiclo;
    }


    /**
     * Sets the creditosMemoPesosCiclo value for this DatosCuentaType.
     * 
     * @param creditosMemoPesosCiclo
     */
    public void setCreditosMemoPesosCiclo(java.lang.Integer creditosMemoPesosCiclo) {
        this.creditosMemoPesosCiclo = creditosMemoPesosCiclo;
    }


    /**
     * Gets the creditosMemoDolarCiclo value for this DatosCuentaType.
     * 
     * @return creditosMemoDolarCiclo
     */
    public java.lang.Double getCreditosMemoDolarCiclo() {
        return creditosMemoDolarCiclo;
    }


    /**
     * Sets the creditosMemoDolarCiclo value for this DatosCuentaType.
     * 
     * @param creditosMemoDolarCiclo
     */
    public void setCreditosMemoDolarCiclo(java.lang.Double creditosMemoDolarCiclo) {
        this.creditosMemoDolarCiclo = creditosMemoDolarCiclo;
    }


    /**
     * Gets the debitosMemoPesosCiclo value for this DatosCuentaType.
     * 
     * @return debitosMemoPesosCiclo
     */
    public java.lang.Integer getDebitosMemoPesosCiclo() {
        return debitosMemoPesosCiclo;
    }


    /**
     * Sets the debitosMemoPesosCiclo value for this DatosCuentaType.
     * 
     * @param debitosMemoPesosCiclo
     */
    public void setDebitosMemoPesosCiclo(java.lang.Integer debitosMemoPesosCiclo) {
        this.debitosMemoPesosCiclo = debitosMemoPesosCiclo;
    }


    /**
     * Gets the debitosMemoDolarCiclo value for this DatosCuentaType.
     * 
     * @return debitosMemoDolarCiclo
     */
    public java.lang.Double getDebitosMemoDolarCiclo() {
        return debitosMemoDolarCiclo;
    }


    /**
     * Sets the debitosMemoDolarCiclo value for this DatosCuentaType.
     * 
     * @param debitosMemoDolarCiclo
     */
    public void setDebitosMemoDolarCiclo(java.lang.Double debitosMemoDolarCiclo) {
        this.debitosMemoDolarCiclo = debitosMemoDolarCiclo;
    }


    /**
     * Gets the utilidadesXCobrarMonedaExtranjera value for this DatosCuentaType.
     * 
     * @return utilidadesXCobrarMonedaExtranjera
     */
    public java.lang.Double getUtilidadesXCobrarMonedaExtranjera() {
        return utilidadesXCobrarMonedaExtranjera;
    }


    /**
     * Sets the utilidadesXCobrarMonedaExtranjera value for this DatosCuentaType.
     * 
     * @param utilidadesXCobrarMonedaExtranjera
     */
    public void setUtilidadesXCobrarMonedaExtranjera(java.lang.Double utilidadesXCobrarMonedaExtranjera) {
        this.utilidadesXCobrarMonedaExtranjera = utilidadesXCobrarMonedaExtranjera;
    }


    /**
     * Gets the pagosXAplicarMonedaExtranjera value for this DatosCuentaType.
     * 
     * @return pagosXAplicarMonedaExtranjera
     */
    public java.lang.Double getPagosXAplicarMonedaExtranjera() {
        return pagosXAplicarMonedaExtranjera;
    }


    /**
     * Sets the pagosXAplicarMonedaExtranjera value for this DatosCuentaType.
     * 
     * @param pagosXAplicarMonedaExtranjera
     */
    public void setPagosXAplicarMonedaExtranjera(java.lang.Double pagosXAplicarMonedaExtranjera) {
        this.pagosXAplicarMonedaExtranjera = pagosXAplicarMonedaExtranjera;
    }


    /**
     * Gets the utilidadesXCobrarMonedaNacional value for this DatosCuentaType.
     * 
     * @return utilidadesXCobrarMonedaNacional
     */
    public java.lang.Integer getUtilidadesXCobrarMonedaNacional() {
        return utilidadesXCobrarMonedaNacional;
    }


    /**
     * Sets the utilidadesXCobrarMonedaNacional value for this DatosCuentaType.
     * 
     * @param utilidadesXCobrarMonedaNacional
     */
    public void setUtilidadesXCobrarMonedaNacional(java.lang.Integer utilidadesXCobrarMonedaNacional) {
        this.utilidadesXCobrarMonedaNacional = utilidadesXCobrarMonedaNacional;
    }


    /**
     * Gets the tasaInteresAvanceCtaCorta value for this DatosCuentaType.
     * 
     * @return tasaInteresAvanceCtaCorta
     */
    public java.lang.Double getTasaInteresAvanceCtaCorta() {
        return tasaInteresAvanceCtaCorta;
    }


    /**
     * Sets the tasaInteresAvanceCtaCorta value for this DatosCuentaType.
     * 
     * @param tasaInteresAvanceCtaCorta
     */
    public void setTasaInteresAvanceCtaCorta(java.lang.Double tasaInteresAvanceCtaCorta) {
        this.tasaInteresAvanceCtaCorta = tasaInteresAvanceCtaCorta;
    }


    /**
     * Gets the tasaInteresAvanceCtaLarga value for this DatosCuentaType.
     * 
     * @return tasaInteresAvanceCtaLarga
     */
    public java.lang.Double getTasaInteresAvanceCtaLarga() {
        return tasaInteresAvanceCtaLarga;
    }


    /**
     * Sets the tasaInteresAvanceCtaLarga value for this DatosCuentaType.
     * 
     * @param tasaInteresAvanceCtaLarga
     */
    public void setTasaInteresAvanceCtaLarga(java.lang.Double tasaInteresAvanceCtaLarga) {
        this.tasaInteresAvanceCtaLarga = tasaInteresAvanceCtaLarga;
    }


    /**
     * Gets the monto1 value for this DatosCuentaType.
     * 
     * @return monto1
     */
    public java.lang.Double getMonto1() {
        return monto1;
    }


    /**
     * Sets the monto1 value for this DatosCuentaType.
     * 
     * @param monto1
     */
    public void setMonto1(java.lang.Double monto1) {
        this.monto1 = monto1;
    }


    /**
     * Gets the monto2 value for this DatosCuentaType.
     * 
     * @return monto2
     */
    public java.lang.Double getMonto2() {
        return monto2;
    }


    /**
     * Sets the monto2 value for this DatosCuentaType.
     * 
     * @param monto2
     */
    public void setMonto2(java.lang.Double monto2) {
        this.monto2 = monto2;
    }


    /**
     * Gets the monto3 value for this DatosCuentaType.
     * 
     * @return monto3
     */
    public java.lang.Double getMonto3() {
        return monto3;
    }


    /**
     * Sets the monto3 value for this DatosCuentaType.
     * 
     * @param monto3
     */
    public void setMonto3(java.lang.Double monto3) {
        this.monto3 = monto3;
    }


    /**
     * Gets the numero1 value for this DatosCuentaType.
     * 
     * @return numero1
     */
    public java.lang.Integer getNumero1() {
        return numero1;
    }


    /**
     * Sets the numero1 value for this DatosCuentaType.
     * 
     * @param numero1
     */
    public void setNumero1(java.lang.Integer numero1) {
        this.numero1 = numero1;
    }


    /**
     * Gets the numero2 value for this DatosCuentaType.
     * 
     * @return numero2
     */
    public java.lang.Integer getNumero2() {
        return numero2;
    }


    /**
     * Sets the numero2 value for this DatosCuentaType.
     * 
     * @param numero2
     */
    public void setNumero2(java.lang.Integer numero2) {
        this.numero2 = numero2;
    }


    /**
     * Gets the numero3 value for this DatosCuentaType.
     * 
     * @return numero3
     */
    public java.lang.Integer getNumero3() {
        return numero3;
    }


    /**
     * Sets the numero3 value for this DatosCuentaType.
     * 
     * @param numero3
     */
    public void setNumero3(java.lang.Integer numero3) {
        this.numero3 = numero3;
    }


    /**
     * Gets the flag1 value for this DatosCuentaType.
     * 
     * @return flag1
     */
    public java.lang.String getFlag1() {
        return flag1;
    }


    /**
     * Sets the flag1 value for this DatosCuentaType.
     * 
     * @param flag1
     */
    public void setFlag1(java.lang.String flag1) {
        this.flag1 = flag1;
    }


    /**
     * Gets the flag2 value for this DatosCuentaType.
     * 
     * @return flag2
     */
    public java.lang.String getFlag2() {
        return flag2;
    }


    /**
     * Sets the flag2 value for this DatosCuentaType.
     * 
     * @param flag2
     */
    public void setFlag2(java.lang.String flag2) {
        this.flag2 = flag2;
    }


    /**
     * Gets the flag3 value for this DatosCuentaType.
     * 
     * @return flag3
     */
    public java.lang.String getFlag3() {
        return flag3;
    }


    /**
     * Sets the flag3 value for this DatosCuentaType.
     * 
     * @param flag3
     */
    public void setFlag3(java.lang.String flag3) {
        this.flag3 = flag3;
    }


    /**
     * Gets the string1 value for this DatosCuentaType.
     * 
     * @return string1
     */
    public java.lang.String getString1() {
        return string1;
    }


    /**
     * Sets the string1 value for this DatosCuentaType.
     * 
     * @param string1
     */
    public void setString1(java.lang.String string1) {
        this.string1 = string1;
    }


    /**
     * Gets the string2 value for this DatosCuentaType.
     * 
     * @return string2
     */
    public java.lang.String getString2() {
        return string2;
    }


    /**
     * Sets the string2 value for this DatosCuentaType.
     * 
     * @param string2
     */
    public void setString2(java.lang.String string2) {
        this.string2 = string2;
    }


    /**
     * Gets the string3 value for this DatosCuentaType.
     * 
     * @return string3
     */
    public java.lang.String getString3() {
        return string3;
    }


    /**
     * Sets the string3 value for this DatosCuentaType.
     * 
     * @param string3
     */
    public void setString3(java.lang.String string3) {
        this.string3 = string3;
    }


    /**
     * Gets the filler value for this DatosCuentaType.
     * 
     * @return filler
     */
    public java.lang.String getFiller() {
        return filler;
    }


    /**
     * Sets the filler value for this DatosCuentaType.
     * 
     * @param filler
     */
    public void setFiller(java.lang.String filler) {
        this.filler = filler;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosCuentaType)) return false;
        DatosCuentaType other = (DatosCuentaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.organizacion==null && other.getOrganizacion()==null) || 
             (this.organizacion!=null &&
              this.organizacion.equals(other.getOrganizacion()))) &&
            ((this.numeroCuenta==null && other.getNumeroCuenta()==null) || 
             (this.numeroCuenta!=null &&
              this.numeroCuenta.equals(other.getNumeroCuenta()))) &&
            ((this.logo==null && other.getLogo()==null) || 
             (this.logo!=null &&
              this.logo.equals(other.getLogo()))) &&
            ((this.descripcionLogo==null && other.getDescripcionLogo()==null) || 
             (this.descripcionLogo!=null &&
              this.descripcionLogo.equals(other.getDescripcionLogo()))) &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo()))) &&
            ((this.tipoCuenta==null && other.getTipoCuenta()==null) || 
             (this.tipoCuenta!=null &&
              this.tipoCuenta.equals(other.getTipoCuenta()))) &&
            ((this.relacionCuenta==null && other.getRelacionCuenta()==null) || 
             (this.relacionCuenta!=null &&
              this.relacionCuenta.equals(other.getRelacionCuenta()))) &&
            ((this.coberturaCuenta==null && other.getCoberturaCuenta()==null) || 
             (this.coberturaCuenta!=null &&
              this.coberturaCuenta.equals(other.getCoberturaCuenta()))) &&
            ((this.apellidoPaternoTitular==null && other.getApellidoPaternoTitular()==null) || 
             (this.apellidoPaternoTitular!=null &&
              this.apellidoPaternoTitular.equals(other.getApellidoPaternoTitular()))) &&
            ((this.apellidoMaternoTitular==null && other.getApellidoMaternoTitular()==null) || 
             (this.apellidoMaternoTitular!=null &&
              this.apellidoMaternoTitular.equals(other.getApellidoMaternoTitular()))) &&
            ((this.nombresTitular==null && other.getNombresTitular()==null) || 
             (this.nombresTitular!=null &&
              this.nombresTitular.equals(other.getNombresTitular()))) &&
            ((this.direccionParticular==null && other.getDireccionParticular()==null) || 
             (this.direccionParticular!=null &&
              this.direccionParticular.equals(other.getDireccionParticular()))) &&
            ((this.ciudadParticular==null && other.getCiudadParticular()==null) || 
             (this.ciudadParticular!=null &&
              this.ciudadParticular.equals(other.getCiudadParticular()))) &&
            ((this.comunaParticular==null && other.getComunaParticular()==null) || 
             (this.comunaParticular!=null &&
              this.comunaParticular.equals(other.getComunaParticular()))) &&
            ((this.regionParticular==null && other.getRegionParticular()==null) || 
             (this.regionParticular!=null &&
              this.regionParticular.equals(other.getRegionParticular()))) &&
            ((this.telefonoParticular==null && other.getTelefonoParticular()==null) || 
             (this.telefonoParticular!=null &&
              this.telefonoParticular.equals(other.getTelefonoParticular()))) &&
            ((this.direccionEnvioEstadoCuenta==null && other.getDireccionEnvioEstadoCuenta()==null) || 
             (this.direccionEnvioEstadoCuenta!=null &&
              this.direccionEnvioEstadoCuenta.equals(other.getDireccionEnvioEstadoCuenta()))) &&
            ((this.ciudadEnvioEstadoCuenta==null && other.getCiudadEnvioEstadoCuenta()==null) || 
             (this.ciudadEnvioEstadoCuenta!=null &&
              this.ciudadEnvioEstadoCuenta.equals(other.getCiudadEnvioEstadoCuenta()))) &&
            ((this.comunaEnvioEstadoCuenta==null && other.getComunaEnvioEstadoCuenta()==null) || 
             (this.comunaEnvioEstadoCuenta!=null &&
              this.comunaEnvioEstadoCuenta.equals(other.getComunaEnvioEstadoCuenta()))) &&
            ((this.regionEnvioEstadoCuenta==null && other.getRegionEnvioEstadoCuenta()==null) || 
             (this.regionEnvioEstadoCuenta!=null &&
              this.regionEnvioEstadoCuenta.equals(other.getRegionEnvioEstadoCuenta()))) &&
            ((this.telefonoEnvioEstadoCuenta==null && other.getTelefonoEnvioEstadoCuenta()==null) || 
             (this.telefonoEnvioEstadoCuenta!=null &&
              this.telefonoEnvioEstadoCuenta.equals(other.getTelefonoEnvioEstadoCuenta()))) &&
            ((this.codigoPostalEnvioEstadoCuenta==null && other.getCodigoPostalEnvioEstadoCuenta()==null) || 
             (this.codigoPostalEnvioEstadoCuenta!=null &&
              this.codigoPostalEnvioEstadoCuenta.equals(other.getCodigoPostalEnvioEstadoCuenta()))) &&
            ((this.direccionLaboral==null && other.getDireccionLaboral()==null) || 
             (this.direccionLaboral!=null &&
              this.direccionLaboral.equals(other.getDireccionLaboral()))) &&
            ((this.ciudadLaboral==null && other.getCiudadLaboral()==null) || 
             (this.ciudadLaboral!=null &&
              this.ciudadLaboral.equals(other.getCiudadLaboral()))) &&
            ((this.comunaLaboral==null && other.getComunaLaboral()==null) || 
             (this.comunaLaboral!=null &&
              this.comunaLaboral.equals(other.getComunaLaboral()))) &&
            ((this.regionLaboral==null && other.getRegionLaboral()==null) || 
             (this.regionLaboral!=null &&
              this.regionLaboral.equals(other.getRegionLaboral()))) &&
            ((this.telefonoLaboral==null && other.getTelefonoLaboral()==null) || 
             (this.telefonoLaboral!=null &&
              this.telefonoLaboral.equals(other.getTelefonoLaboral()))) &&
            ((this.direccionEmail==null && other.getDireccionEmail()==null) || 
             (this.direccionEmail!=null &&
              this.direccionEmail.equals(other.getDireccionEmail()))) &&
            ((this.rutdvCliente==null && other.getRutdvCliente()==null) || 
             (this.rutdvCliente!=null &&
              this.rutdvCliente.equals(other.getRutdvCliente()))) &&
            ((this.numeroCliente==null && other.getNumeroCliente()==null) || 
             (this.numeroCliente!=null &&
              this.numeroCliente.equals(other.getNumeroCliente()))) &&
            ((this.numeroRelacion==null && other.getNumeroRelacion()==null) || 
             (this.numeroRelacion!=null &&
              this.numeroRelacion.equals(other.getNumeroRelacion()))) &&
            ((this.numeroInterno==null && other.getNumeroInterno()==null) || 
             (this.numeroInterno!=null &&
              this.numeroInterno.equals(other.getNumeroInterno()))) &&
            ((this.numeroCuentaCorriente==null && other.getNumeroCuentaCorriente()==null) || 
             (this.numeroCuentaCorriente!=null &&
              this.numeroCuentaCorriente.equals(other.getNumeroCuentaCorriente()))) &&
            ((this.campana==null && other.getCampana()==null) || 
             (this.campana!=null &&
              this.campana.equals(other.getCampana()))) &&
            ((this.numeroInterno2==null && other.getNumeroInterno2()==null) || 
             (this.numeroInterno2!=null &&
              this.numeroInterno2.equals(other.getNumeroInterno2()))) &&
            ((this.sucursal==null && other.getSucursal()==null) || 
             (this.sucursal!=null &&
              this.sucursal.equals(other.getSucursal()))) &&
            ((this.cuentaTraspasoSaldos==null && other.getCuentaTraspasoSaldos()==null) || 
             (this.cuentaTraspasoSaldos!=null &&
              this.cuentaTraspasoSaldos.equals(other.getCuentaTraspasoSaldos()))) &&
            ((this.cantidadAdicionales==null && other.getCantidadAdicionales()==null) || 
             (this.cantidadAdicionales!=null &&
              this.cantidadAdicionales.equals(other.getCantidadAdicionales()))) &&
            ((this.codigoAutorizacionCC==null && other.getCodigoAutorizacionCC()==null) || 
             (this.codigoAutorizacionCC!=null &&
              this.codigoAutorizacionCC.equals(other.getCodigoAutorizacionCC()))) &&
            ((this.codigoVIP==null && other.getCodigoVIP()==null) || 
             (this.codigoVIP!=null &&
              this.codigoVIP.equals(other.getCodigoVIP()))) &&
            ((this.codigoMensajeMoraPagoMinimo==null && other.getCodigoMensajeMoraPagoMinimo()==null) || 
             (this.codigoMensajeMoraPagoMinimo!=null &&
              this.codigoMensajeMoraPagoMinimo.equals(other.getCodigoMensajeMoraPagoMinimo()))) &&
            ((this.codigoMovimiento==null && other.getCodigoMovimiento()==null) || 
             (this.codigoMovimiento!=null &&
              this.codigoMovimiento.equals(other.getCodigoMovimiento()))) &&
            ((this.porcentajePagoMinimo==null && other.getPorcentajePagoMinimo()==null) || 
             (this.porcentajePagoMinimo!=null &&
              this.porcentajePagoMinimo.equals(other.getPorcentajePagoMinimo()))) &&
            ((this.estadoCanales==null && other.getEstadoCanales()==null) || 
             (this.estadoCanales!=null &&
              this.estadoCanales.equals(other.getEstadoCanales()))) &&
            ((this.fechaDatos==null && other.getFechaDatos()==null) || 
             (this.fechaDatos!=null &&
              this.fechaDatos.equals(other.getFechaDatos()))) &&
            ((this.fechaApertura==null && other.getFechaApertura()==null) || 
             (this.fechaApertura!=null &&
              this.fechaApertura.equals(other.getFechaApertura()))) &&
            ((this.fechaModificacion==null && other.getFechaModificacion()==null) || 
             (this.fechaModificacion!=null &&
              this.fechaModificacion.equals(other.getFechaModificacion()))) &&
            ((this.fechaActivacionTarjeta==null && other.getFechaActivacionTarjeta()==null) || 
             (this.fechaActivacionTarjeta!=null &&
              this.fechaActivacionTarjeta.equals(other.getFechaActivacionTarjeta()))) &&
            ((this.fechaActivacionRenovacion==null && other.getFechaActivacionRenovacion()==null) || 
             (this.fechaActivacionRenovacion!=null &&
              this.fechaActivacionRenovacion.equals(other.getFechaActivacionRenovacion()))) &&
            ((this.fechaBloqueo1==null && other.getFechaBloqueo1()==null) || 
             (this.fechaBloqueo1!=null &&
              this.fechaBloqueo1.equals(other.getFechaBloqueo1()))) &&
            ((this.fechaBloqueo2==null && other.getFechaBloqueo2()==null) || 
             (this.fechaBloqueo2!=null &&
              this.fechaBloqueo2.equals(other.getFechaBloqueo2()))) &&
            ((this.fechaUltimoPagoPesos==null && other.getFechaUltimoPagoPesos()==null) || 
             (this.fechaUltimoPagoPesos!=null &&
              this.fechaUltimoPagoPesos.equals(other.getFechaUltimoPagoPesos()))) &&
            ((this.fechaUltimoPagoDolar==null && other.getFechaUltimoPagoDolar()==null) || 
             (this.fechaUltimoPagoDolar!=null &&
              this.fechaUltimoPagoDolar.equals(other.getFechaUltimoPagoDolar()))) &&
            ((this.fechaUltimaFacturacion==null && other.getFechaUltimaFacturacion()==null) || 
             (this.fechaUltimaFacturacion!=null &&
              this.fechaUltimaFacturacion.equals(other.getFechaUltimaFacturacion()))) &&
            ((this.fechaVencimientoPago==null && other.getFechaVencimientoPago()==null) || 
             (this.fechaVencimientoPago!=null &&
              this.fechaVencimientoPago.equals(other.getFechaVencimientoPago()))) &&
            ((this.fechaNacimientoTitular==null && other.getFechaNacimientoTitular()==null) || 
             (this.fechaNacimientoTitular!=null &&
              this.fechaNacimientoTitular.equals(other.getFechaNacimientoTitular()))) &&
            ((this.codigoBloqueo1==null && other.getCodigoBloqueo1()==null) || 
             (this.codigoBloqueo1!=null &&
              this.codigoBloqueo1.equals(other.getCodigoBloqueo1()))) &&
            ((this.codigoBloqueo2==null && other.getCodigoBloqueo2()==null) || 
             (this.codigoBloqueo2!=null &&
              this.codigoBloqueo2.equals(other.getCodigoBloqueo2()))) &&
            ((this.codigoBloqueoNumerico==null && other.getCodigoBloqueoNumerico()==null) || 
             (this.codigoBloqueoNumerico!=null &&
              this.codigoBloqueoNumerico.equals(other.getCodigoBloqueoNumerico()))) &&
            ((this.codigoMora==null && other.getCodigoMora()==null) || 
             (this.codigoMora!=null &&
              this.codigoMora.equals(other.getCodigoMora()))) &&
            ((this.codigoCarteraVencida==null && other.getCodigoCarteraVencida()==null) || 
             (this.codigoCarteraVencida!=null &&
              this.codigoCarteraVencida.equals(other.getCodigoCarteraVencida()))) &&
            ((this.codigoCobranza==null && other.getCodigoCobranza()==null) || 
             (this.codigoCobranza!=null &&
              this.codigoCobranza.equals(other.getCodigoCobranza()))) &&
            ((this.formaPago==null && other.getFormaPago()==null) || 
             (this.formaPago!=null &&
              this.formaPago.equals(other.getFormaPago()))) &&
            ((this.cicloFacturacion==null && other.getCicloFacturacion()==null) || 
             (this.cicloFacturacion!=null &&
              this.cicloFacturacion.equals(other.getCicloFacturacion()))) &&
            ((this.codigoFV==null && other.getCodigoFV()==null) || 
             (this.codigoFV!=null &&
              this.codigoFV.equals(other.getCodigoFV()))) &&
            ((this.codigoEmpresa==null && other.getCodigoEmpresa()==null) || 
             (this.codigoEmpresa!=null &&
              this.codigoEmpresa.equals(other.getCodigoEmpresa()))) &&
            ((this.codigoEnvioEstadoCuenta==null && other.getCodigoEnvioEstadoCuenta()==null) || 
             (this.codigoEnvioEstadoCuenta!=null &&
              this.codigoEnvioEstadoCuenta.equals(other.getCodigoEnvioEstadoCuenta()))) &&
            ((this.rebajaCobroAdministracion==null && other.getRebajaCobroAdministracion()==null) || 
             (this.rebajaCobroAdministracion!=null &&
              this.rebajaCobroAdministracion.equals(other.getRebajaCobroAdministracion()))) &&
            ((this.numeroMorasPeriodo==null && other.getNumeroMorasPeriodo()==null) || 
             (this.numeroMorasPeriodo!=null &&
              this.numeroMorasPeriodo.equals(other.getNumeroMorasPeriodo()))) &&
            ((this.numeroExcesosPeriodo==null && other.getNumeroExcesosPeriodo()==null) || 
             (this.numeroExcesosPeriodo!=null &&
              this.numeroExcesosPeriodo.equals(other.getNumeroExcesosPeriodo()))) &&
            ((this.numeroBloqueosXMoras==null && other.getNumeroBloqueosXMoras()==null) || 
             (this.numeroBloqueosXMoras!=null &&
              this.numeroBloqueosXMoras.equals(other.getNumeroBloqueosXMoras()))) &&
            ((this.numeroBloqueosXExcesos==null && other.getNumeroBloqueosXExcesos()==null) || 
             (this.numeroBloqueosXExcesos!=null &&
              this.numeroBloqueosXExcesos.equals(other.getNumeroBloqueosXExcesos()))) &&
            ((this.codigoAval==null && other.getCodigoAval()==null) || 
             (this.codigoAval!=null &&
              this.codigoAval.equals(other.getCodigoAval()))) &&
            ((this.codigoPromocion==null && other.getCodigoPromocion()==null) || 
             (this.codigoPromocion!=null &&
              this.codigoPromocion.equals(other.getCodigoPromocion()))) &&
            ((this.indicadorTarjetaOperador==null && other.getIndicadorTarjetaOperador()==null) || 
             (this.indicadorTarjetaOperador!=null &&
              this.indicadorTarjetaOperador.equals(other.getIndicadorTarjetaOperador()))) &&
            ((this.indicadorPIN==null && other.getIndicadorPIN()==null) || 
             (this.indicadorPIN!=null &&
              this.indicadorPIN.equals(other.getIndicadorPIN()))) &&
            ((this.indicadorCobroComision==null && other.getIndicadorCobroComision()==null) || 
             (this.indicadorCobroComision!=null &&
              this.indicadorCobroComision.equals(other.getIndicadorCobroComision()))) &&
            ((this.porcentajeExcesoComprasNacionales==null && other.getPorcentajeExcesoComprasNacionales()==null) || 
             (this.porcentajeExcesoComprasNacionales!=null &&
              this.porcentajeExcesoComprasNacionales.equals(other.getPorcentajeExcesoComprasNacionales()))) &&
            ((this.porcentajeExcesoComprasInternacionales==null && other.getPorcentajeExcesoComprasInternacionales()==null) || 
             (this.porcentajeExcesoComprasInternacionales!=null &&
              this.porcentajeExcesoComprasInternacionales.equals(other.getPorcentajeExcesoComprasInternacionales()))) &&
            ((this.medioEnvioEECCFisico==null && other.getMedioEnvioEECCFisico()==null) || 
             (this.medioEnvioEECCFisico!=null &&
              this.medioEnvioEECCFisico.equals(other.getMedioEnvioEECCFisico()))) &&
            ((this.tipoDireccionFisica==null && other.getTipoDireccionFisica()==null) || 
             (this.tipoDireccionFisica!=null &&
              this.tipoDireccionFisica.equals(other.getTipoDireccionFisica()))) &&
            ((this.tipoPago==null && other.getTipoPago()==null) || 
             (this.tipoPago!=null &&
              this.tipoPago.equals(other.getTipoPago()))) &&
            ((this.porcentajePagoFijo==null && other.getPorcentajePagoFijo()==null) || 
             (this.porcentajePagoFijo!=null &&
              this.porcentajePagoFijo.equals(other.getPorcentajePagoFijo()))) &&
            ((this.montoPagoFijo==null && other.getMontoPagoFijo()==null) || 
             (this.montoPagoFijo!=null &&
              this.montoPagoFijo.equals(other.getMontoPagoFijo()))) &&
            ((this.codigoEmbozado==null && other.getCodigoEmbozado()==null) || 
             (this.codigoEmbozado!=null &&
              this.codigoEmbozado.equals(other.getCodigoEmbozado()))) &&
            ((this.lineaLimites==null && other.getLineaLimites()==null) || 
             (this.lineaLimites!=null &&
              this.lineaLimites.equals(other.getLineaLimites()))) &&
            ((this.PCTPesos==null && other.getPCTPesos()==null) || 
             (this.PCTPesos!=null &&
              this.PCTPesos.equals(other.getPCTPesos()))) &&
            ((this.PCTDolar==null && other.getPCTDolar()==null) || 
             (this.PCTDolar!=null &&
              this.PCTDolar.equals(other.getPCTDolar()))) &&
            ((this.indicador3CPC==null && other.getIndicador3CPC()==null) || 
             (this.indicador3CPC!=null &&
              this.indicador3CPC.equals(other.getIndicador3CPC()))) &&
            ((this.indicadorExceso==null && other.getIndicadorExceso()==null) || 
             (this.indicadorExceso!=null &&
              this.indicadorExceso.equals(other.getIndicadorExceso()))) &&
            ((this.cupoNacional==null && other.getCupoNacional()==null) || 
             (this.cupoNacional!=null &&
              this.cupoNacional.equals(other.getCupoNacional()))) &&
            ((this.cupoInternacional==null && other.getCupoInternacional()==null) || 
             (this.cupoInternacional!=null &&
              this.cupoInternacional.equals(other.getCupoInternacional()))) &&
            ((this.cupoLinea2==null && other.getCupoLinea2()==null) || 
             (this.cupoLinea2!=null &&
              this.cupoLinea2.equals(other.getCupoLinea2()))) &&
            ((this.cupoVirtualNacional==null && other.getCupoVirtualNacional()==null) || 
             (this.cupoVirtualNacional!=null &&
              this.cupoVirtualNacional.equals(other.getCupoVirtualNacional()))) &&
            ((this.cupoVirtualInternacional==null && other.getCupoVirtualInternacional()==null) || 
             (this.cupoVirtualInternacional!=null &&
              this.cupoVirtualInternacional.equals(other.getCupoVirtualInternacional()))) &&
            ((this.deudaNacional==null && other.getDeudaNacional()==null) || 
             (this.deudaNacional!=null &&
              this.deudaNacional.equals(other.getDeudaNacional()))) &&
            ((this.deudaInternacional==null && other.getDeudaInternacional()==null) || 
             (this.deudaInternacional!=null &&
              this.deudaInternacional.equals(other.getDeudaInternacional()))) &&
            ((this.deudaLinea2==null && other.getDeudaLinea2()==null) || 
             (this.deudaLinea2!=null &&
              this.deudaLinea2.equals(other.getDeudaLinea2()))) &&
            ((this.deudaMoraNacional==null && other.getDeudaMoraNacional()==null) || 
             (this.deudaMoraNacional!=null &&
              this.deudaMoraNacional.equals(other.getDeudaMoraNacional()))) &&
            ((this.deudaMoraInternacional==null && other.getDeudaMoraInternacional()==null) || 
             (this.deudaMoraInternacional!=null &&
              this.deudaMoraInternacional.equals(other.getDeudaMoraInternacional()))) &&
            ((this.deudaNacionalFacturada==null && other.getDeudaNacionalFacturada()==null) || 
             (this.deudaNacionalFacturada!=null &&
              this.deudaNacionalFacturada.equals(other.getDeudaNacionalFacturada()))) &&
            ((this.deudaInternacionalFacturada==null && other.getDeudaInternacionalFacturada()==null) || 
             (this.deudaInternacionalFacturada!=null &&
              this.deudaInternacionalFacturada.equals(other.getDeudaInternacionalFacturada()))) &&
            ((this.disponibleNacional==null && other.getDisponibleNacional()==null) || 
             (this.disponibleNacional!=null &&
              this.disponibleNacional.equals(other.getDisponibleNacional()))) &&
            ((this.disponibleInternacional==null && other.getDisponibleInternacional()==null) || 
             (this.disponibleInternacional!=null &&
              this.disponibleInternacional.equals(other.getDisponibleInternacional()))) &&
            ((this.disponibleLinea2==null && other.getDisponibleLinea2()==null) || 
             (this.disponibleLinea2!=null &&
              this.disponibleLinea2.equals(other.getDisponibleLinea2()))) &&
            ((this.saldoCreditoCuotaCapital==null && other.getSaldoCreditoCuotaCapital()==null) || 
             (this.saldoCreditoCuotaCapital!=null &&
              this.saldoCreditoCuotaCapital.equals(other.getSaldoCreditoCuotaCapital()))) &&
            ((this.disponibleAvances==null && other.getDisponibleAvances()==null) || 
             (this.disponibleAvances!=null &&
              this.disponibleAvances.equals(other.getDisponibleAvances()))) &&
            ((this.disponibleAvancesDolar==null && other.getDisponibleAvancesDolar()==null) || 
             (this.disponibleAvancesDolar!=null &&
              this.disponibleAvancesDolar.equals(other.getDisponibleAvancesDolar()))) &&
            ((this.mora1A30Dias==null && other.getMora1A30Dias()==null) || 
             (this.mora1A30Dias!=null &&
              this.mora1A30Dias.equals(other.getMora1A30Dias()))) &&
            ((this.mora31A60Dias==null && other.getMora31A60Dias()==null) || 
             (this.mora31A60Dias!=null &&
              this.mora31A60Dias.equals(other.getMora31A60Dias()))) &&
            ((this.mora61A90Dias==null && other.getMora61A90Dias()==null) || 
             (this.mora61A90Dias!=null &&
              this.mora61A90Dias.equals(other.getMora61A90Dias()))) &&
            ((this.mora91A120Dias==null && other.getMora91A120Dias()==null) || 
             (this.mora91A120Dias!=null &&
              this.mora91A120Dias.equals(other.getMora91A120Dias()))) &&
            ((this.mora121A150Dias==null && other.getMora121A150Dias()==null) || 
             (this.mora121A150Dias!=null &&
              this.mora121A150Dias.equals(other.getMora121A150Dias()))) &&
            ((this.mora151A180Dias==null && other.getMora151A180Dias()==null) || 
             (this.mora151A180Dias!=null &&
              this.mora151A180Dias.equals(other.getMora151A180Dias()))) &&
            ((this.mora181A210Dias==null && other.getMora181A210Dias()==null) || 
             (this.mora181A210Dias!=null &&
              this.mora181A210Dias.equals(other.getMora181A210Dias()))) &&
            ((this.mora210A999Dias==null && other.getMora210A999Dias()==null) || 
             (this.mora210A999Dias!=null &&
              this.mora210A999Dias.equals(other.getMora210A999Dias()))) &&
            ((this.recargoCobranza1A30Dias==null && other.getRecargoCobranza1A30Dias()==null) || 
             (this.recargoCobranza1A30Dias!=null &&
              this.recargoCobranza1A30Dias.equals(other.getRecargoCobranza1A30Dias()))) &&
            ((this.recargoCobranza31A60Dias==null && other.getRecargoCobranza31A60Dias()==null) || 
             (this.recargoCobranza31A60Dias!=null &&
              this.recargoCobranza31A60Dias.equals(other.getRecargoCobranza31A60Dias()))) &&
            ((this.recargoCobranza61A90Dias==null && other.getRecargoCobranza61A90Dias()==null) || 
             (this.recargoCobranza61A90Dias!=null &&
              this.recargoCobranza61A90Dias.equals(other.getRecargoCobranza61A90Dias()))) &&
            ((this.recargoCobranza91A120Dias==null && other.getRecargoCobranza91A120Dias()==null) || 
             (this.recargoCobranza91A120Dias!=null &&
              this.recargoCobranza91A120Dias.equals(other.getRecargoCobranza91A120Dias()))) &&
            ((this.recargoCobranza121A150Dias==null && other.getRecargoCobranza121A150Dias()==null) || 
             (this.recargoCobranza121A150Dias!=null &&
              this.recargoCobranza121A150Dias.equals(other.getRecargoCobranza121A150Dias()))) &&
            ((this.recargoCobranza151A180Dias==null && other.getRecargoCobranza151A180Dias()==null) || 
             (this.recargoCobranza151A180Dias!=null &&
              this.recargoCobranza151A180Dias.equals(other.getRecargoCobranza151A180Dias()))) &&
            ((this.recargoCobranza181A210Dias==null && other.getRecargoCobranza181A210Dias()==null) || 
             (this.recargoCobranza181A210Dias!=null &&
              this.recargoCobranza181A210Dias.equals(other.getRecargoCobranza181A210Dias()))) &&
            ((this.recargoCobranza210A999Dias==null && other.getRecargoCobranza210A999Dias()==null) || 
             (this.recargoCobranza210A999Dias!=null &&
              this.recargoCobranza210A999Dias.equals(other.getRecargoCobranza210A999Dias()))) &&
            ((this.pagoMinimo==null && other.getPagoMinimo()==null) || 
             (this.pagoMinimo!=null &&
              this.pagoMinimo.equals(other.getPagoMinimo()))) &&
            ((this.saldoColocacionNacional==null && other.getSaldoColocacionNacional()==null) || 
             (this.saldoColocacionNacional!=null &&
              this.saldoColocacionNacional.equals(other.getSaldoColocacionNacional()))) &&
            ((this.saldoColocacionInternacional==null && other.getSaldoColocacionInternacional()==null) || 
             (this.saldoColocacionInternacional!=null &&
              this.saldoColocacionInternacional.equals(other.getSaldoColocacionInternacional()))) &&
            ((this.tasaInteresRotativo==null && other.getTasaInteresRotativo()==null) || 
             (this.tasaInteresRotativo!=null &&
              this.tasaInteresRotativo.equals(other.getTasaInteresRotativo()))) &&
            ((this.tasaInteresCuotas2A4==null && other.getTasaInteresCuotas2A4()==null) || 
             (this.tasaInteresCuotas2A4!=null &&
              this.tasaInteresCuotas2A4.equals(other.getTasaInteresCuotas2A4()))) &&
            ((this.tasaInteresCuotas5A24==null && other.getTasaInteresCuotas5A24()==null) || 
             (this.tasaInteresCuotas5A24!=null &&
              this.tasaInteresCuotas5A24.equals(other.getTasaInteresCuotas5A24()))) &&
            ((this.interesXCobrarOperador==null && other.getInteresXCobrarOperador()==null) || 
             (this.interesXCobrarOperador!=null &&
              this.interesXCobrarOperador.equals(other.getInteresXCobrarOperador()))) &&
            ((this.interesXCobrarCorrientes==null && other.getInteresXCobrarCorrientes()==null) || 
             (this.interesXCobrarCorrientes!=null &&
              this.interesXCobrarCorrientes.equals(other.getInteresXCobrarCorrientes()))) &&
            ((this.interesXCobrarPenales==null && other.getInteresXCobrarPenales()==null) || 
             (this.interesXCobrarPenales!=null &&
              this.interesXCobrarPenales.equals(other.getInteresXCobrarPenales()))) &&
            ((this.interesDevengadosOperador==null && other.getInteresDevengadosOperador()==null) || 
             (this.interesDevengadosOperador!=null &&
              this.interesDevengadosOperador.equals(other.getInteresDevengadosOperador()))) &&
            ((this.interesDevengadosCorrientes==null && other.getInteresDevengadosCorrientes()==null) || 
             (this.interesDevengadosCorrientes!=null &&
              this.interesDevengadosCorrientes.equals(other.getInteresDevengadosCorrientes()))) &&
            ((this.interesDevengadosPenales==null && other.getInteresDevengadosPenales()==null) || 
             (this.interesDevengadosPenales!=null &&
              this.interesDevengadosPenales.equals(other.getInteresDevengadosPenales()))) &&
            ((this.interesPercibidosOperador==null && other.getInteresPercibidosOperador()==null) || 
             (this.interesPercibidosOperador!=null &&
              this.interesPercibidosOperador.equals(other.getInteresPercibidosOperador()))) &&
            ((this.interesPercibidosCorrientes==null && other.getInteresPercibidosCorrientes()==null) || 
             (this.interesPercibidosCorrientes!=null &&
              this.interesPercibidosCorrientes.equals(other.getInteresPercibidosCorrientes()))) &&
            ((this.interesPercibidosPenales==null && other.getInteresPercibidosPenales()==null) || 
             (this.interesPercibidosPenales!=null &&
              this.interesPercibidosPenales.equals(other.getInteresPercibidosPenales()))) &&
            ((this.deudaTotal==null && other.getDeudaTotal()==null) || 
             (this.deudaTotal!=null &&
              this.deudaTotal.equals(other.getDeudaTotal()))) &&
            ((this.colocacionMes==null && other.getColocacionMes()==null) || 
             (this.colocacionMes!=null &&
              this.colocacionMes.equals(other.getColocacionMes()))) &&
            ((this.montoCompraMes==null && other.getMontoCompraMes()==null) || 
             (this.montoCompraMes!=null &&
              this.montoCompraMes.equals(other.getMontoCompraMes()))) &&
            ((this.montoAvanceMes==null && other.getMontoAvanceMes()==null) || 
             (this.montoAvanceMes!=null &&
              this.montoAvanceMes.equals(other.getMontoAvanceMes()))) &&
            ((this.montoUltimoPagoPesos==null && other.getMontoUltimoPagoPesos()==null) || 
             (this.montoUltimoPagoPesos!=null &&
              this.montoUltimoPagoPesos.equals(other.getMontoUltimoPagoPesos()))) &&
            ((this.montoUltimoPagoDolar==null && other.getMontoUltimoPagoDolar()==null) || 
             (this.montoUltimoPagoDolar!=null &&
              this.montoUltimoPagoDolar.equals(other.getMontoUltimoPagoDolar()))) &&
            ((this.montoCobroAdministracion==null && other.getMontoCobroAdministracion()==null) || 
             (this.montoCobroAdministracion!=null &&
              this.montoCobroAdministracion.equals(other.getMontoCobroAdministracion()))) &&
            ((this.consumoPesos==null && other.getConsumoPesos()==null) || 
             (this.consumoPesos!=null &&
              this.consumoPesos.equals(other.getConsumoPesos()))) &&
            ((this.consumoDolar==null && other.getConsumoDolar()==null) || 
             (this.consumoDolar!=null &&
              this.consumoDolar.equals(other.getConsumoDolar()))) &&
            ((this.pagosPesosCiclo==null && other.getPagosPesosCiclo()==null) || 
             (this.pagosPesosCiclo!=null &&
              this.pagosPesosCiclo.equals(other.getPagosPesosCiclo()))) &&
            ((this.pagosDolarCiclo==null && other.getPagosDolarCiclo()==null) || 
             (this.pagosDolarCiclo!=null &&
              this.pagosDolarCiclo.equals(other.getPagosDolarCiclo()))) &&
            ((this.creditosPesosCiclo==null && other.getCreditosPesosCiclo()==null) || 
             (this.creditosPesosCiclo!=null &&
              this.creditosPesosCiclo.equals(other.getCreditosPesosCiclo()))) &&
            ((this.creditosDolarCiclo==null && other.getCreditosDolarCiclo()==null) || 
             (this.creditosDolarCiclo!=null &&
              this.creditosDolarCiclo.equals(other.getCreditosDolarCiclo()))) &&
            ((this.debitosPesosCiclo==null && other.getDebitosPesosCiclo()==null) || 
             (this.debitosPesosCiclo!=null &&
              this.debitosPesosCiclo.equals(other.getDebitosPesosCiclo()))) &&
            ((this.debitosDolarCiclo==null && other.getDebitosDolarCiclo()==null) || 
             (this.debitosDolarCiclo!=null &&
              this.debitosDolarCiclo.equals(other.getDebitosDolarCiclo()))) &&
            ((this.creditosMemoPesosCiclo==null && other.getCreditosMemoPesosCiclo()==null) || 
             (this.creditosMemoPesosCiclo!=null &&
              this.creditosMemoPesosCiclo.equals(other.getCreditosMemoPesosCiclo()))) &&
            ((this.creditosMemoDolarCiclo==null && other.getCreditosMemoDolarCiclo()==null) || 
             (this.creditosMemoDolarCiclo!=null &&
              this.creditosMemoDolarCiclo.equals(other.getCreditosMemoDolarCiclo()))) &&
            ((this.debitosMemoPesosCiclo==null && other.getDebitosMemoPesosCiclo()==null) || 
             (this.debitosMemoPesosCiclo!=null &&
              this.debitosMemoPesosCiclo.equals(other.getDebitosMemoPesosCiclo()))) &&
            ((this.debitosMemoDolarCiclo==null && other.getDebitosMemoDolarCiclo()==null) || 
             (this.debitosMemoDolarCiclo!=null &&
              this.debitosMemoDolarCiclo.equals(other.getDebitosMemoDolarCiclo()))) &&
            ((this.utilidadesXCobrarMonedaExtranjera==null && other.getUtilidadesXCobrarMonedaExtranjera()==null) || 
             (this.utilidadesXCobrarMonedaExtranjera!=null &&
              this.utilidadesXCobrarMonedaExtranjera.equals(other.getUtilidadesXCobrarMonedaExtranjera()))) &&
            ((this.pagosXAplicarMonedaExtranjera==null && other.getPagosXAplicarMonedaExtranjera()==null) || 
             (this.pagosXAplicarMonedaExtranjera!=null &&
              this.pagosXAplicarMonedaExtranjera.equals(other.getPagosXAplicarMonedaExtranjera()))) &&
            ((this.utilidadesXCobrarMonedaNacional==null && other.getUtilidadesXCobrarMonedaNacional()==null) || 
             (this.utilidadesXCobrarMonedaNacional!=null &&
              this.utilidadesXCobrarMonedaNacional.equals(other.getUtilidadesXCobrarMonedaNacional()))) &&
            ((this.tasaInteresAvanceCtaCorta==null && other.getTasaInteresAvanceCtaCorta()==null) || 
             (this.tasaInteresAvanceCtaCorta!=null &&
              this.tasaInteresAvanceCtaCorta.equals(other.getTasaInteresAvanceCtaCorta()))) &&
            ((this.tasaInteresAvanceCtaLarga==null && other.getTasaInteresAvanceCtaLarga()==null) || 
             (this.tasaInteresAvanceCtaLarga!=null &&
              this.tasaInteresAvanceCtaLarga.equals(other.getTasaInteresAvanceCtaLarga()))) &&
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
        if (getOrganizacion() != null) {
            _hashCode += getOrganizacion().hashCode();
        }
        if (getNumeroCuenta() != null) {
            _hashCode += getNumeroCuenta().hashCode();
        }
        if (getLogo() != null) {
            _hashCode += getLogo().hashCode();
        }
        if (getDescripcionLogo() != null) {
            _hashCode += getDescripcionLogo().hashCode();
        }
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        if (getTipoCuenta() != null) {
            _hashCode += getTipoCuenta().hashCode();
        }
        if (getRelacionCuenta() != null) {
            _hashCode += getRelacionCuenta().hashCode();
        }
        if (getCoberturaCuenta() != null) {
            _hashCode += getCoberturaCuenta().hashCode();
        }
        if (getApellidoPaternoTitular() != null) {
            _hashCode += getApellidoPaternoTitular().hashCode();
        }
        if (getApellidoMaternoTitular() != null) {
            _hashCode += getApellidoMaternoTitular().hashCode();
        }
        if (getNombresTitular() != null) {
            _hashCode += getNombresTitular().hashCode();
        }
        if (getDireccionParticular() != null) {
            _hashCode += getDireccionParticular().hashCode();
        }
        if (getCiudadParticular() != null) {
            _hashCode += getCiudadParticular().hashCode();
        }
        if (getComunaParticular() != null) {
            _hashCode += getComunaParticular().hashCode();
        }
        if (getRegionParticular() != null) {
            _hashCode += getRegionParticular().hashCode();
        }
        if (getTelefonoParticular() != null) {
            _hashCode += getTelefonoParticular().hashCode();
        }
        if (getDireccionEnvioEstadoCuenta() != null) {
            _hashCode += getDireccionEnvioEstadoCuenta().hashCode();
        }
        if (getCiudadEnvioEstadoCuenta() != null) {
            _hashCode += getCiudadEnvioEstadoCuenta().hashCode();
        }
        if (getComunaEnvioEstadoCuenta() != null) {
            _hashCode += getComunaEnvioEstadoCuenta().hashCode();
        }
        if (getRegionEnvioEstadoCuenta() != null) {
            _hashCode += getRegionEnvioEstadoCuenta().hashCode();
        }
        if (getTelefonoEnvioEstadoCuenta() != null) {
            _hashCode += getTelefonoEnvioEstadoCuenta().hashCode();
        }
        if (getCodigoPostalEnvioEstadoCuenta() != null) {
            _hashCode += getCodigoPostalEnvioEstadoCuenta().hashCode();
        }
        if (getDireccionLaboral() != null) {
            _hashCode += getDireccionLaboral().hashCode();
        }
        if (getCiudadLaboral() != null) {
            _hashCode += getCiudadLaboral().hashCode();
        }
        if (getComunaLaboral() != null) {
            _hashCode += getComunaLaboral().hashCode();
        }
        if (getRegionLaboral() != null) {
            _hashCode += getRegionLaboral().hashCode();
        }
        if (getTelefonoLaboral() != null) {
            _hashCode += getTelefonoLaboral().hashCode();
        }
        if (getDireccionEmail() != null) {
            _hashCode += getDireccionEmail().hashCode();
        }
        if (getRutdvCliente() != null) {
            _hashCode += getRutdvCliente().hashCode();
        }
        if (getNumeroCliente() != null) {
            _hashCode += getNumeroCliente().hashCode();
        }
        if (getNumeroRelacion() != null) {
            _hashCode += getNumeroRelacion().hashCode();
        }
        if (getNumeroInterno() != null) {
            _hashCode += getNumeroInterno().hashCode();
        }
        if (getNumeroCuentaCorriente() != null) {
            _hashCode += getNumeroCuentaCorriente().hashCode();
        }
        if (getCampana() != null) {
            _hashCode += getCampana().hashCode();
        }
        if (getNumeroInterno2() != null) {
            _hashCode += getNumeroInterno2().hashCode();
        }
        if (getSucursal() != null) {
            _hashCode += getSucursal().hashCode();
        }
        if (getCuentaTraspasoSaldos() != null) {
            _hashCode += getCuentaTraspasoSaldos().hashCode();
        }
        if (getCantidadAdicionales() != null) {
            _hashCode += getCantidadAdicionales().hashCode();
        }
        if (getCodigoAutorizacionCC() != null) {
            _hashCode += getCodigoAutorizacionCC().hashCode();
        }
        if (getCodigoVIP() != null) {
            _hashCode += getCodigoVIP().hashCode();
        }
        if (getCodigoMensajeMoraPagoMinimo() != null) {
            _hashCode += getCodigoMensajeMoraPagoMinimo().hashCode();
        }
        if (getCodigoMovimiento() != null) {
            _hashCode += getCodigoMovimiento().hashCode();
        }
        if (getPorcentajePagoMinimo() != null) {
            _hashCode += getPorcentajePagoMinimo().hashCode();
        }
        if (getEstadoCanales() != null) {
            _hashCode += getEstadoCanales().hashCode();
        }
        if (getFechaDatos() != null) {
            _hashCode += getFechaDatos().hashCode();
        }
        if (getFechaApertura() != null) {
            _hashCode += getFechaApertura().hashCode();
        }
        if (getFechaModificacion() != null) {
            _hashCode += getFechaModificacion().hashCode();
        }
        if (getFechaActivacionTarjeta() != null) {
            _hashCode += getFechaActivacionTarjeta().hashCode();
        }
        if (getFechaActivacionRenovacion() != null) {
            _hashCode += getFechaActivacionRenovacion().hashCode();
        }
        if (getFechaBloqueo1() != null) {
            _hashCode += getFechaBloqueo1().hashCode();
        }
        if (getFechaBloqueo2() != null) {
            _hashCode += getFechaBloqueo2().hashCode();
        }
        if (getFechaUltimoPagoPesos() != null) {
            _hashCode += getFechaUltimoPagoPesos().hashCode();
        }
        if (getFechaUltimoPagoDolar() != null) {
            _hashCode += getFechaUltimoPagoDolar().hashCode();
        }
        if (getFechaUltimaFacturacion() != null) {
            _hashCode += getFechaUltimaFacturacion().hashCode();
        }
        if (getFechaVencimientoPago() != null) {
            _hashCode += getFechaVencimientoPago().hashCode();
        }
        if (getFechaNacimientoTitular() != null) {
            _hashCode += getFechaNacimientoTitular().hashCode();
        }
        if (getCodigoBloqueo1() != null) {
            _hashCode += getCodigoBloqueo1().hashCode();
        }
        if (getCodigoBloqueo2() != null) {
            _hashCode += getCodigoBloqueo2().hashCode();
        }
        if (getCodigoBloqueoNumerico() != null) {
            _hashCode += getCodigoBloqueoNumerico().hashCode();
        }
        if (getCodigoMora() != null) {
            _hashCode += getCodigoMora().hashCode();
        }
        if (getCodigoCarteraVencida() != null) {
            _hashCode += getCodigoCarteraVencida().hashCode();
        }
        if (getCodigoCobranza() != null) {
            _hashCode += getCodigoCobranza().hashCode();
        }
        if (getFormaPago() != null) {
            _hashCode += getFormaPago().hashCode();
        }
        if (getCicloFacturacion() != null) {
            _hashCode += getCicloFacturacion().hashCode();
        }
        if (getCodigoFV() != null) {
            _hashCode += getCodigoFV().hashCode();
        }
        if (getCodigoEmpresa() != null) {
            _hashCode += getCodigoEmpresa().hashCode();
        }
        if (getCodigoEnvioEstadoCuenta() != null) {
            _hashCode += getCodigoEnvioEstadoCuenta().hashCode();
        }
        if (getRebajaCobroAdministracion() != null) {
            _hashCode += getRebajaCobroAdministracion().hashCode();
        }
        if (getNumeroMorasPeriodo() != null) {
            _hashCode += getNumeroMorasPeriodo().hashCode();
        }
        if (getNumeroExcesosPeriodo() != null) {
            _hashCode += getNumeroExcesosPeriodo().hashCode();
        }
        if (getNumeroBloqueosXMoras() != null) {
            _hashCode += getNumeroBloqueosXMoras().hashCode();
        }
        if (getNumeroBloqueosXExcesos() != null) {
            _hashCode += getNumeroBloqueosXExcesos().hashCode();
        }
        if (getCodigoAval() != null) {
            _hashCode += getCodigoAval().hashCode();
        }
        if (getCodigoPromocion() != null) {
            _hashCode += getCodigoPromocion().hashCode();
        }
        if (getIndicadorTarjetaOperador() != null) {
            _hashCode += getIndicadorTarjetaOperador().hashCode();
        }
        if (getIndicadorPIN() != null) {
            _hashCode += getIndicadorPIN().hashCode();
        }
        if (getIndicadorCobroComision() != null) {
            _hashCode += getIndicadorCobroComision().hashCode();
        }
        if (getPorcentajeExcesoComprasNacionales() != null) {
            _hashCode += getPorcentajeExcesoComprasNacionales().hashCode();
        }
        if (getPorcentajeExcesoComprasInternacionales() != null) {
            _hashCode += getPorcentajeExcesoComprasInternacionales().hashCode();
        }
        if (getMedioEnvioEECCFisico() != null) {
            _hashCode += getMedioEnvioEECCFisico().hashCode();
        }
        if (getTipoDireccionFisica() != null) {
            _hashCode += getTipoDireccionFisica().hashCode();
        }
        if (getTipoPago() != null) {
            _hashCode += getTipoPago().hashCode();
        }
        if (getPorcentajePagoFijo() != null) {
            _hashCode += getPorcentajePagoFijo().hashCode();
        }
        if (getMontoPagoFijo() != null) {
            _hashCode += getMontoPagoFijo().hashCode();
        }
        if (getCodigoEmbozado() != null) {
            _hashCode += getCodigoEmbozado().hashCode();
        }
        if (getLineaLimites() != null) {
            _hashCode += getLineaLimites().hashCode();
        }
        if (getPCTPesos() != null) {
            _hashCode += getPCTPesos().hashCode();
        }
        if (getPCTDolar() != null) {
            _hashCode += getPCTDolar().hashCode();
        }
        if (getIndicador3CPC() != null) {
            _hashCode += getIndicador3CPC().hashCode();
        }
        if (getIndicadorExceso() != null) {
            _hashCode += getIndicadorExceso().hashCode();
        }
        if (getCupoNacional() != null) {
            _hashCode += getCupoNacional().hashCode();
        }
        if (getCupoInternacional() != null) {
            _hashCode += getCupoInternacional().hashCode();
        }
        if (getCupoLinea2() != null) {
            _hashCode += getCupoLinea2().hashCode();
        }
        if (getCupoVirtualNacional() != null) {
            _hashCode += getCupoVirtualNacional().hashCode();
        }
        if (getCupoVirtualInternacional() != null) {
            _hashCode += getCupoVirtualInternacional().hashCode();
        }
        if (getDeudaNacional() != null) {
            _hashCode += getDeudaNacional().hashCode();
        }
        if (getDeudaInternacional() != null) {
            _hashCode += getDeudaInternacional().hashCode();
        }
        if (getDeudaLinea2() != null) {
            _hashCode += getDeudaLinea2().hashCode();
        }
        if (getDeudaMoraNacional() != null) {
            _hashCode += getDeudaMoraNacional().hashCode();
        }
        if (getDeudaMoraInternacional() != null) {
            _hashCode += getDeudaMoraInternacional().hashCode();
        }
        if (getDeudaNacionalFacturada() != null) {
            _hashCode += getDeudaNacionalFacturada().hashCode();
        }
        if (getDeudaInternacionalFacturada() != null) {
            _hashCode += getDeudaInternacionalFacturada().hashCode();
        }
        if (getDisponibleNacional() != null) {
            _hashCode += getDisponibleNacional().hashCode();
        }
        if (getDisponibleInternacional() != null) {
            _hashCode += getDisponibleInternacional().hashCode();
        }
        if (getDisponibleLinea2() != null) {
            _hashCode += getDisponibleLinea2().hashCode();
        }
        if (getSaldoCreditoCuotaCapital() != null) {
            _hashCode += getSaldoCreditoCuotaCapital().hashCode();
        }
        if (getDisponibleAvances() != null) {
            _hashCode += getDisponibleAvances().hashCode();
        }
        if (getDisponibleAvancesDolar() != null) {
            _hashCode += getDisponibleAvancesDolar().hashCode();
        }
        if (getMora1A30Dias() != null) {
            _hashCode += getMora1A30Dias().hashCode();
        }
        if (getMora31A60Dias() != null) {
            _hashCode += getMora31A60Dias().hashCode();
        }
        if (getMora61A90Dias() != null) {
            _hashCode += getMora61A90Dias().hashCode();
        }
        if (getMora91A120Dias() != null) {
            _hashCode += getMora91A120Dias().hashCode();
        }
        if (getMora121A150Dias() != null) {
            _hashCode += getMora121A150Dias().hashCode();
        }
        if (getMora151A180Dias() != null) {
            _hashCode += getMora151A180Dias().hashCode();
        }
        if (getMora181A210Dias() != null) {
            _hashCode += getMora181A210Dias().hashCode();
        }
        if (getMora210A999Dias() != null) {
            _hashCode += getMora210A999Dias().hashCode();
        }
        if (getRecargoCobranza1A30Dias() != null) {
            _hashCode += getRecargoCobranza1A30Dias().hashCode();
        }
        if (getRecargoCobranza31A60Dias() != null) {
            _hashCode += getRecargoCobranza31A60Dias().hashCode();
        }
        if (getRecargoCobranza61A90Dias() != null) {
            _hashCode += getRecargoCobranza61A90Dias().hashCode();
        }
        if (getRecargoCobranza91A120Dias() != null) {
            _hashCode += getRecargoCobranza91A120Dias().hashCode();
        }
        if (getRecargoCobranza121A150Dias() != null) {
            _hashCode += getRecargoCobranza121A150Dias().hashCode();
        }
        if (getRecargoCobranza151A180Dias() != null) {
            _hashCode += getRecargoCobranza151A180Dias().hashCode();
        }
        if (getRecargoCobranza181A210Dias() != null) {
            _hashCode += getRecargoCobranza181A210Dias().hashCode();
        }
        if (getRecargoCobranza210A999Dias() != null) {
            _hashCode += getRecargoCobranza210A999Dias().hashCode();
        }
        if (getPagoMinimo() != null) {
            _hashCode += getPagoMinimo().hashCode();
        }
        if (getSaldoColocacionNacional() != null) {
            _hashCode += getSaldoColocacionNacional().hashCode();
        }
        if (getSaldoColocacionInternacional() != null) {
            _hashCode += getSaldoColocacionInternacional().hashCode();
        }
        if (getTasaInteresRotativo() != null) {
            _hashCode += getTasaInteresRotativo().hashCode();
        }
        if (getTasaInteresCuotas2A4() != null) {
            _hashCode += getTasaInteresCuotas2A4().hashCode();
        }
        if (getTasaInteresCuotas5A24() != null) {
            _hashCode += getTasaInteresCuotas5A24().hashCode();
        }
        if (getInteresXCobrarOperador() != null) {
            _hashCode += getInteresXCobrarOperador().hashCode();
        }
        if (getInteresXCobrarCorrientes() != null) {
            _hashCode += getInteresXCobrarCorrientes().hashCode();
        }
        if (getInteresXCobrarPenales() != null) {
            _hashCode += getInteresXCobrarPenales().hashCode();
        }
        if (getInteresDevengadosOperador() != null) {
            _hashCode += getInteresDevengadosOperador().hashCode();
        }
        if (getInteresDevengadosCorrientes() != null) {
            _hashCode += getInteresDevengadosCorrientes().hashCode();
        }
        if (getInteresDevengadosPenales() != null) {
            _hashCode += getInteresDevengadosPenales().hashCode();
        }
        if (getInteresPercibidosOperador() != null) {
            _hashCode += getInteresPercibidosOperador().hashCode();
        }
        if (getInteresPercibidosCorrientes() != null) {
            _hashCode += getInteresPercibidosCorrientes().hashCode();
        }
        if (getInteresPercibidosPenales() != null) {
            _hashCode += getInteresPercibidosPenales().hashCode();
        }
        if (getDeudaTotal() != null) {
            _hashCode += getDeudaTotal().hashCode();
        }
        if (getColocacionMes() != null) {
            _hashCode += getColocacionMes().hashCode();
        }
        if (getMontoCompraMes() != null) {
            _hashCode += getMontoCompraMes().hashCode();
        }
        if (getMontoAvanceMes() != null) {
            _hashCode += getMontoAvanceMes().hashCode();
        }
        if (getMontoUltimoPagoPesos() != null) {
            _hashCode += getMontoUltimoPagoPesos().hashCode();
        }
        if (getMontoUltimoPagoDolar() != null) {
            _hashCode += getMontoUltimoPagoDolar().hashCode();
        }
        if (getMontoCobroAdministracion() != null) {
            _hashCode += getMontoCobroAdministracion().hashCode();
        }
        if (getConsumoPesos() != null) {
            _hashCode += getConsumoPesos().hashCode();
        }
        if (getConsumoDolar() != null) {
            _hashCode += getConsumoDolar().hashCode();
        }
        if (getPagosPesosCiclo() != null) {
            _hashCode += getPagosPesosCiclo().hashCode();
        }
        if (getPagosDolarCiclo() != null) {
            _hashCode += getPagosDolarCiclo().hashCode();
        }
        if (getCreditosPesosCiclo() != null) {
            _hashCode += getCreditosPesosCiclo().hashCode();
        }
        if (getCreditosDolarCiclo() != null) {
            _hashCode += getCreditosDolarCiclo().hashCode();
        }
        if (getDebitosPesosCiclo() != null) {
            _hashCode += getDebitosPesosCiclo().hashCode();
        }
        if (getDebitosDolarCiclo() != null) {
            _hashCode += getDebitosDolarCiclo().hashCode();
        }
        if (getCreditosMemoPesosCiclo() != null) {
            _hashCode += getCreditosMemoPesosCiclo().hashCode();
        }
        if (getCreditosMemoDolarCiclo() != null) {
            _hashCode += getCreditosMemoDolarCiclo().hashCode();
        }
        if (getDebitosMemoPesosCiclo() != null) {
            _hashCode += getDebitosMemoPesosCiclo().hashCode();
        }
        if (getDebitosMemoDolarCiclo() != null) {
            _hashCode += getDebitosMemoDolarCiclo().hashCode();
        }
        if (getUtilidadesXCobrarMonedaExtranjera() != null) {
            _hashCode += getUtilidadesXCobrarMonedaExtranjera().hashCode();
        }
        if (getPagosXAplicarMonedaExtranjera() != null) {
            _hashCode += getPagosXAplicarMonedaExtranjera().hashCode();
        }
        if (getUtilidadesXCobrarMonedaNacional() != null) {
            _hashCode += getUtilidadesXCobrarMonedaNacional().hashCode();
        }
        if (getTasaInteresAvanceCtaCorta() != null) {
            _hashCode += getTasaInteresAvanceCtaCorta().hashCode();
        }
        if (getTasaInteresAvanceCtaLarga() != null) {
            _hashCode += getTasaInteresAvanceCtaLarga().hashCode();
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
        new org.apache.axis.description.TypeDesc(DatosCuentaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "datosCuentaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "organizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "logo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionLogo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "descripcionLogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "tipoCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relacionCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "relacionCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coberturaCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "coberturaCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoPaternoTitular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "apellidoPaternoTitular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoMaternoTitular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "apellidoMaternoTitular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombresTitular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "nombresTitular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionParticular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "direccionParticular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciudadParticular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "ciudadParticular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunaParticular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "comunaParticular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionParticular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "regionParticular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoParticular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "telefonoParticular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionEnvioEstadoCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "direccionEnvioEstadoCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciudadEnvioEstadoCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "ciudadEnvioEstadoCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunaEnvioEstadoCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "comunaEnvioEstadoCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionEnvioEstadoCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "regionEnvioEstadoCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoEnvioEstadoCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "telefonoEnvioEstadoCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPostalEnvioEstadoCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoPostalEnvioEstadoCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionLaboral");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "direccionLaboral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciudadLaboral");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "ciudadLaboral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunaLaboral");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "comunaLaboral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionLaboral");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "regionLaboral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoLaboral");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "telefonoLaboral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "direccionEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutdvCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "rutdvCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRelacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroRelacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroInterno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroInterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroInternoType"));
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
        elemField.setFieldName("campana");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "campana"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroInterno2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroInterno2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sucursal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "sucursal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaTraspasoSaldos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "cuentaTraspasoSaldos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidadAdicionales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "cantidadAdicionales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAutorizacionCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoAutorizacionCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoVIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoVIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoMensajeMoraPagoMinimo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoMensajeMoraPagoMinimo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoMovimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoMovimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porcentajePagoMinimo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "porcentajePagoMinimo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoCanales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "estadoCanales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaDatos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaDatos"));
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
        elemField.setFieldName("fechaModificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaModificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaActivacionTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaActivacionTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaActivacionRenovacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaActivacionRenovacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaBloqueo1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaBloqueo1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaBloqueo2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaBloqueo2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaUltimoPagoPesos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaUltimoPagoPesos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaUltimoPagoDolar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaUltimoPagoDolar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaUltimaFacturacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaUltimaFacturacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVencimientoPago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaVencimientoPago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimientoTitular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "fechaNacimientoTitular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoBloqueo1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoBloqueo1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoBloqueo2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoBloqueo2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoBloqueoNumerico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoBloqueoNumerico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoMora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoMora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCarteraVencida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoCarteraVencida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCobranza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoCobranza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaPago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "formaPago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cicloFacturacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "cicloFacturacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoFV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoFV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEnvioEstadoCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoEnvioEstadoCuenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rebajaCobroAdministracion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "rebajaCobroAdministracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroMorasPeriodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroMorasPeriodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroExcesosPeriodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroExcesosPeriodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroBloqueosXMoras");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroBloqueosXMoras"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroBloqueosXExcesos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "numeroBloqueosXExcesos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoAval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPromocion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoPromocion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadorTarjetaOperador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "indicadorTarjetaOperador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadorPIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "indicadorPIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadorCobroComision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "indicadorCobroComision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porcentajeExcesoComprasNacionales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "porcentajeExcesoComprasNacionales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porcentajeExcesoComprasInternacionales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "porcentajeExcesoComprasInternacionales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medioEnvioEECCFisico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "medioEnvioEECCFisico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDireccionFisica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "tipoDireccionFisica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "tipoPago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porcentajePagoFijo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "porcentajePagoFijo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoPagoFijo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "montoPagoFijo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEmbozado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "codigoEmbozado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineaLimites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "lineaLimites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCTPesos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "PCTPesos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCTDolar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "PCTDolar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicador3CPC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "indicador3CPC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadorExceso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "indicadorExceso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cupoNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "cupoNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cupoInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "cupoInternacional"));
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
        elemField.setFieldName("cupoVirtualNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "cupoVirtualNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cupoVirtualInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "cupoVirtualInternacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deudaNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "deudaNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deudaInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "deudaInternacional"));
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
        elemField.setFieldName("deudaMoraNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "deudaMoraNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deudaMoraInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "deudaMoraInternacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deudaNacionalFacturada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "deudaNacionalFacturada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deudaInternacionalFacturada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "deudaInternacionalFacturada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibleNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "disponibleNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibleInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "disponibleInternacional"));
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
        elemField.setFieldName("saldoCreditoCuotaCapital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "saldoCreditoCuotaCapital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibleAvances");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "disponibleAvances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibleAvancesDolar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "disponibleAvancesDolar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mora1A30Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "mora1a30Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mora31A60Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "mora31a60Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mora61A90Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "mora61a90Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mora91A120Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "mora91a120Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mora121A150Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "mora121a150Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mora151A180Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "mora151a180Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mora181A210Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "mora181a210Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mora210A999Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "mora210a999Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recargoCobranza1A30Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "recargoCobranza1a30Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recargoCobranza31A60Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "recargoCobranza31a60Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recargoCobranza61A90Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "recargoCobranza61a90Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recargoCobranza91A120Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "recargoCobranza91a120Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recargoCobranza121A150Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "recargoCobranza121a150Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recargoCobranza151A180Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "recargoCobranza151a180Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recargoCobranza181A210Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "recargoCobranza181a210Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recargoCobranza210A999Dias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "recargoCobranza210a999Dias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagoMinimo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "pagoMinimo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldoColocacionNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "saldoColocacionNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldoColocacionInternacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "saldoColocacionInternacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasaInteresRotativo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "tasaInteresRotativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasaInteresCuotas2A4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "tasaInteresCuotas2a4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasaInteresCuotas5A24");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "tasaInteresCuotas5a24"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interesXCobrarOperador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "interesXCobrarOperador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interesXCobrarCorrientes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "interesXCobrarCorrientes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interesXCobrarPenales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "interesXCobrarPenales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interesDevengadosOperador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "interesDevengadosOperador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interesDevengadosCorrientes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "interesDevengadosCorrientes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interesDevengadosPenales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "interesDevengadosPenales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interesPercibidosOperador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "interesPercibidosOperador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interesPercibidosCorrientes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "interesPercibidosCorrientes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interesPercibidosPenales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "interesPercibidosPenales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deudaTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "deudaTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colocacionMes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "colocacionMes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoCompraMes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "montoCompraMes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoAvanceMes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "montoAvanceMes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoUltimoPagoPesos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "montoUltimoPagoPesos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoUltimoPagoDolar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "montoUltimoPagoDolar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoCobroAdministracion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "montoCobroAdministracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumoPesos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "consumoPesos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumoDolar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "consumoDolar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagosPesosCiclo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "pagosPesosCiclo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagosDolarCiclo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "pagosDolarCiclo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditosPesosCiclo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "creditosPesosCiclo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditosDolarCiclo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "creditosDolarCiclo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitosPesosCiclo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "debitosPesosCiclo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitosDolarCiclo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "debitosDolarCiclo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditosMemoPesosCiclo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "creditosMemoPesosCiclo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditosMemoDolarCiclo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "creditosMemoDolarCiclo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitosMemoPesosCiclo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "debitosMemoPesosCiclo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitosMemoDolarCiclo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "debitosMemoDolarCiclo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilidadesXCobrarMonedaExtranjera");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "utilidadesXCobrarMonedaExtranjera"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagosXAplicarMonedaExtranjera");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "pagosXAplicarMonedaExtranjera"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilidadesXCobrarMonedaNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "utilidadesXCobrarMonedaNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasaInteresAvanceCtaCorta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "tasaInteresAvanceCtaCorta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasaInteresAvanceCtaLarga");
        elemField.setXmlName(new javax.xml.namespace.QName("http://osb.bancochile.cl/TarjetaCreditos/ConsultarSaldosResponse", "tasaInteresAvanceCtaLarga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
