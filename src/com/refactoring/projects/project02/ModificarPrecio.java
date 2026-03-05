package com.refactoring.projects.project02;

/**
 * Clase base con métodos para modificar precios.
 * Incluye comisiones, descuentos y descuentos por volumen.
 */
public class ModificarPrecio {

    /** Comisión del 5% para pago con tarjeta */
	final double COMISION = 1.05;
    
    /** Descuento del 10% para clientes registrados */
	final double DESCUENTO = 0.9;
    
    /** Descuento del 5% por compras de más de 10 unidades */
	final double DESCUENTO_POR_VOLUMEN = 0.95;
    /**
     * Constructor de la clase.
     */
    public ModificarPrecio() {
        super();
    }

    /**
     * Aplica la comisión del 5% por pago con tarjeta.
     * @param precioAplicar el precio al que aplicar la comisión
     * @return el precio con la comisión añadida
     */
    public double aplicarComisionTarjeta(double precioAplicar) {
        return precioAplicar * COMISION;
    }

    /**
     * Aplica la comisión según el método de pago seleccionado.
     * @param precioAplicar el precio base
     * @param tipoPago el método de pago (enum TipoPago)
     * @return el precio con la comisión aplicada
     */
    public double aplicarComision(double precioAplicar, TipoPago tipoPago) {
        return precioAplicar * tipoPago.getComision();
    }

    /**
     * Aplica el descuento del 10% para clientes registrados.
     * @param precioAplicar el precio al que aplicar el descuento
     * @return el precio con el descuento aplicado
     */
    public double aplicarDescuento(double precioAplicar) {
        return precioAplicar * DESCUENTO;
    }

    /**
     * Aplica el descuento del 5% por volumen (más de 10 unidades).
     * @param precioAplicar el precio al que aplicar el descuento
     * @return el precio con el descuento aplicado
     */
    public double aplicarDescuentoPorVolumen(double precioAplicar) {
        return precioAplicar * DESCUENTO_POR_VOLUMEN;
    }
}





