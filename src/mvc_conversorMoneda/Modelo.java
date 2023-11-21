package mvc_conversorMoneda;

public class Modelo {
	 private Double moneda;
	 private Double cantidad;
	 private Double resultado;
	 
	 public void setMoneda(Double moneda) {
	  this.moneda = moneda;
	 }
	 public void setCantidad(Double cantidad) {
	  this.cantidad = cantidad; 
	 }
	 public Double getResultado() {
	  return resultado;
	 }
	 public void convetirDolarAPeso() {
	  resultado = cantidad * moneda;
	 }
	 public void convertirPesoADolar() {
	  resultado = cantidad * moneda;
	 }
}
