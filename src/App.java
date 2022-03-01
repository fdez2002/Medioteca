import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>(); // ArrayList de usuarios
		
		Usuario usuario = new Usuario();//Objeto de usuarios
		
		listaUsuarios.add(new Usuario("111111B", "Antonio", "Fernández", "Villa", 20));
		
		listaUsuarios.add(new Usuario("222222C", "Antonio", "Fernández", "Villa", 20));
		
		listaUsuarios.add(new Usuario("133333B", "Antonio", "Fernández", "Villa", 20));
		
		listaUsuarios.add(new Usuario("1444444B", "Antonio", "Fernández", "Villa", 20));
		
		try (Scanner teclado = new Scanner(System.in)) {
						
		
		
		System.out.println("Bienvenidoa a la Medioteca");
		System.out.println("¿Que desea realizar?" + "\n" + "1--> Creacion de cuenta");
		
		int opcionesMenu = teclado.nextInt();
		
		switch(opcionesMenu) {
			case 1:
					System.out.print("Para comenzar con la cracion de su cuenta le vamos a solicitar los siguientes datos: " + "\n" + "DNI: ");
					String dni = teclado.next();
					
					do {
						
						usuario.setDni(dni);
						System.out.println("Preueba de nuevo");
						dni = teclado.next();

					}while(usuario.validarDni() != false);
					
					System.out.print("Nombre: ");
					String nombre = teclado.next();
					usuario.setNombre(nombre);
					
					System.out.print("Primer apellido: ");
					String primerApellido = teclado.next();
					usuario.setPrimerApellido(primerApellido);
					
					System.out.print("Segundo apellido: ");
					String segundoApellido = teclado.next();
					usuario.setSegundoApellido(segundoApellido);
					
					System.out.print("Edad: ");
					int edad = teclado.nextInt();
					usuario.setEdad(edad);
					
		
			listaUsuarios.add(new Usuario(dni,nombre, primerApellido, segundoApellido, edad));
					
					System.out.println(usuario.toString());
						
		}
		
		
		
		
		
		
		
		
		
		
		
		}
		

	}
	
	

}
