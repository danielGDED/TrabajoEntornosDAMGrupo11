package com.refactoring.projects.project02;

/**
 * Enumeración con los métodos de pago disponibles.
 * Cada método tiene asociada una comisión.
 */
public enum TipoPago {
    
    /** Pago en efectivo sin comisión */
    EFECTIVO(1.0),
    
    /** Pago con tarjeta: 5% de comisión */
    TARJETA(1.05),
    
    /** Transferencia bancaria: 2% de comisión */
    TRANSFERENCIA(1.02);

    private final double comision;

    /**
     * Constructor del enum.
     * Asigna la comisión a cada método de pago.
     */
    TipoPago(double comision) {
        this.comision = comision;
    }

    /**
     * Obtiene la comisión de este método de pago.
     * @return el factor de comisión (ej: 1.05)
     */
    public double getComision() {
        return comision;
    }
}