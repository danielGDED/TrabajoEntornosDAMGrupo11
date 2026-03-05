package com.refactoring.projects.project02;


/**
 * Procesador de pagos que calcula el total de una compra.
 * Aplica comisiones según el método de pago y descuentos especiales.
 */


public class PaymentProcessor extends ModificarPrecio {

    /**
     * Calcula el precio total aplicando comisiones y descuentos.
     * 
     * El cálculo sigue este orden:
     * 1. Subtotal (precio × cantidad)
     * 2. Comisión según método de pago
     * 3. Descuento si es cliente
     * 4. Descuento por volumen si compra más de 10 unidades
     * 
     * @param precio el precio unitario del producto
     * @param tipoPago el método de pago (EFECTIVO, TARJETA, TRANSFERENCIA)
     * @param esCliente true si el comprador es cliente registrado
     * @param cantidad el número de unidades a comprar
     * @return el total final con todos los ajustes aplicados
     * @return -1 si los datos de entrada no son válidos
     */
	
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
}
