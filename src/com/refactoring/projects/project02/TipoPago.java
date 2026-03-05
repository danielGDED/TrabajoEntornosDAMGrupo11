package com.refactoring.projects.project02;

public enum TipoPago {

    EFECTIVO(1.0),
    TARJETA(1.05),
    TRANSFERENCIA(1.02);

    private final double comision;

    TipoPago(double comision) {
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }
}

