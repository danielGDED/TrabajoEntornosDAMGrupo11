package com.refactoring.projects.project02;

public class PaymentProcessor extends ModificarPrecio {

    // AÑADIR ENUM
   public double calcularTotal(double precio, String tipoPago, boolean esCliente, int cantidad) {
        double total = precio * cantidad;
        
        
        if (tipoPago.equals("tarjeta")) {
             total = aplicarComisionTarjeta(total); // 5% comisión
        }
        if (esCliente) {
            total =  aplicarDescuento(total);// 10% descuento
        }
        if (cantidad > 10) {
            total = aplicarDescuentoPorVolumen(total); // 5% descuento por volumen
        }
        return total;
    }
}
