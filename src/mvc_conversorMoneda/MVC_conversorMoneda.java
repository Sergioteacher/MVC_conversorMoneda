package mvc_conversorMoneda;

public class MVC_conversorMoneda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola salida de consola");
		System.out.println("...");
		System.out.println("... iniciando los objetos ...");
		Modelo mi_objeto_modelo = new Modelo();
		Vista mi_objeto_vista = new Vista();
		Controlador el_controlador = new Controlador(mi_objeto_modelo,mi_objeto_vista);
		el_controlador.iniciarVista();
	}

}
