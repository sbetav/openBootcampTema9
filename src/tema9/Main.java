package tema9;

public class Main {
	
	public static void main (String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.edad = 20;
		cliente1.nombre = "Ryan";
		cliente1.credito = 1000;
		
		System.out.println("***CLIENTE***");
		System.out.println();
		System.out.println("Edad: "+cliente1.edad);
		System.out.println("Nombre: "+cliente1.nombre);
		System.out.println("Credito: "+cliente1.credito);
		
		Trabajador trabajador1 = new Trabajador();
		trabajador1.salario = 750;
		
		
		System.out.println();
		System.out.println("***TRABAJADOR***");
		System.out.println("Salario: "+cliente1.credito);
		
	}
	
	
}

