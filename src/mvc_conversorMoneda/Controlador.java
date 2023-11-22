package mvc_conversorMoneda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class Controlador implements ActionListener {


 private Modelo mi_modelo;
 private Vista mi_vista;
 private Double cantidad;
 
 public Controlador(Modelo mi_modelo, Vista mi_vista) {
  this.mi_modelo = mi_modelo;
  this.mi_vista = mi_vista;
  
  this.mi_vista.euros.addActionListener(this);
  this.mi_vista.dolares.addActionListener(this);
 }
 public void iniciarVista() {
  mi_vista.setTitle("¡ Conversor Euro - Dolar !");
  mi_vista.pack();
  mi_vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  mi_vista.setLocationRelativeTo(null);
  mi_vista.setVisible(true);  
 }
 
 public void actionPerformed(ActionEvent evento) {
	  if(mi_vista.euros == evento.getSource()) {
	   if(!"".equals(mi_vista.campoTexto.getText())) {
	    try{
	     cantidad = Double.parseDouble(mi_vista.campoTexto.getText());
	     mi_modelo.setCantidad(cantidad);
	     mi_modelo.setMoneda(0.92);
	     mi_modelo.convetirDolarAEuro();;
	     mi_vista.lResultado.setText(mi_modelo.getResultado().toString());
	    }catch(NumberFormatException e) {
	     mi_vista.lResultado.setText("Introduzca una cantidad valida...");
	    }
	   }
	  }
	  else if(mi_vista.dolares == evento.getSource()) {
	   if(!"".equals(mi_vista.campoTexto.getText())) {
	    try{
	     cantidad = Double.parseDouble(mi_vista.campoTexto.getText());
	     mi_modelo.setCantidad(cantidad);
	     mi_modelo.setMoneda(1.09);
	     mi_modelo.convertirEuroADolar();;
	     mi_vista.lResultado.setText(mi_modelo.getResultado().toString());
	    }catch(NumberFormatException e) {
	     mi_vista.lResultado.setText("Introduzca una cantidad valida...");
	    }
	   }
	  }
	 }
 

}