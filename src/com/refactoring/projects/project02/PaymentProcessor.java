package com.refactoring.projects.project02;

public class PaymentProcessor {

    final double COMISION = 1.05;
    final double DESCUENTO = 0.9;
    final double DESCUENTO_POR_VOLUMEN = 0.95;
    
	// AÑADIR ENUM
   public double calcularTotal(double precio, String tipoPago, boolean esCliente, int cantidad) {
        double total = precio * cantidad;
        
        
        if (tipoPago.equals("tarjeta")) {
            total = total * COMISION; // 5% comisión
        }
        if (esCliente) {
            total = total * DESCUENTO; // 10% descuento
        }
        if (cantidad > 10) {
            total = total * DESCUENTO_POR_VOLUMEN; // 5% descuento por volumen
        }
        return total;
    }
}
