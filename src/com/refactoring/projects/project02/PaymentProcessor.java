package com.refactoring.projects.project02;

public class PaymentProcessor {

    final double COMISION = 1.05;
    final double DESCUENTO = 0.9;
    final double DESCUENTO_POR_VOLUMEN = 0.95;
    
	// AÑADIR ENUM
   public double calcularTotal(double precio, TipoPago tipoPago, boolean esCliente, int cantidad) {
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
   public double aplicarComisionTarjeta(double precioAplicar) {
	   return precioAplicar * COMISION;
   }
   public double aplicarDescuento(double precioAplicar) {
	   return precioAplicar * DESCUENTO;
   }
   public double aplicarDescuentoPorVolumen(double precioAplicar) {
	   return precioAplicar * DESCUENTO_POR_VOLUMEN;
   }
}
