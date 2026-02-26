package com.refactoring.projects.project02;

public class PaymentProcessor {

	// AÑADIR ENUM
   public double calcularTotal(double precio, String tipoPago, boolean esCliente, int cantidad) {
        double total = precio * cantidad;
        if (tipoPago.equals("tarjeta")) {
            total = total * 1.05; // 5% comisión
        }
        if (esCliente) {
            total = total * 0.9; // 10% descuento
        }
        if (cantidad > 10) {
            total = total * 0.95; // 5% descuento por volumen
        }
        return total;
    }
}