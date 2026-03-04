package com.refactoring.projects.project02;

public class ModificarPrecio {

	final double COMISION = 1.05;
	final double DESCUENTO = 0.9;
	final double DESCUENTO_POR_VOLUMEN = 0.95;

	public ModificarPrecio() {
		super();
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