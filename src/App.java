import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	public static  boolean validarDni(String dni) {
		
		return dni.matches("^[0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
		
	}
	
	public static boolean validarNombre(String nombre) {

        return nombre.matches("^([A-Z]{1}[a-z]+[ ]*){1,5}$");

    }
	public static boolean validarPrimerApellido(String primerApellido) {

        return primerApellido.matches("^([A-Z]{1}[a-z]+[ ]*){1}$");

    }
	public static boolean validarSegundoApellido(String segundoApellido) {

        return segundoApellido.matches("^([A-Z]{1}[a-z]+[ ]*){1}$");

    }
	public static boolean validarEdad(String edad1) {

        return edad1.matches("^[12-99]{2}$");

    }

	
	/*
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		//App aplicacion = new App();//Objeto de aplicacion
		
		
		ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>(); // ArrayList de usuarios
		
		Usuario usuario = new Usuario();//Objeto de usuarios
		
		
		
		listaUsuarios.add(new Usuario("26520460B", "Antonio", "Fernández", "Villa", 20));
		
		listaUsuarios.add(new Usuario("26520460B", "Antonio", "Fernández", "Villa", 20));
		
		listaUsuarios.add(new Usuario("26520460B", "Antonio", "Fernández", "Villa", 20));
		
		listaUsuarios.add(new Usuario("26520460B", "Antonio", "Fernández", "Villa", 20));
		
		try (Scanner teclado = new Scanner(System.in)) {
		
		System.out.println("Bienvenidoa a la Medioteca");
		System.out.println("¿Que desea realizar?" + "\n" + "1--> Creacion de cuenta");
		
		int opcionesMenu = teclado.nextInt();
		
		switch(opcionesMenu) {
		
			case 1:
					System.out.print("Para comenzar con la cracion de su cuenta le vamos a solicitar los siguientes datos: " + "\n" + "DNI: ");
					String dni = teclado.next();
					
					if (validarDni(dni) == false) {
						do {
								
							System.out.println("Prueba de nuevo, los caracteres introducidos no son validos. Verifica que la letra sea mayuscula");
							dni = teclado.next();
						
						}while(validarDni(dni) != true);	
					}else {
						System.out.println("Su dni no esta registrado");
						
					}
					usuario.setDni(dni);
					/*
					 * Validacion de nombre
					 */
					System.out.print("Nombre: ");
					String nombre = teclado.next();
					
					while(validarNombre(nombre) == false) {
					
							System.out.println("Prueba de nuevo los caracteres no son validos." + "\n" + "Verifica que la letra de cada palabra esta en mayuscula" );
							nombre = teclado.next();
							
					}
					usuario.setNombre(nombre);
					/*
					 * 
					 */
					
					System.out.print("Primer apellido: ");
					String primerApellido = teclado.next();
					
					while(validarPrimerApellido(primerApellido) == false) {
						
						System.out.println("Prueba de nuevo, los caracteres no son validos." + "\n" + "Verifica que la letra de la esta en mayuscula" );
						primerApellido = teclado.next();
						
					}
					usuario.setPrimerApellido(primerApellido);
					/*
					 * 
					 */
					
					System.out.print("Segundo apellido: ");
					String segundoApellido = teclado.next();
					
					while(validarSegundoApellido(segundoApellido) == false) {
						
						System.out.println("Prueba de nuevo, los caracteres no son validos." + "\n" + "Verifica que la letra de la esta en mayuscula" );
						segundoApellido = teclado.next();
						
					}
				
					usuario.setSegundoApellido(segundoApellido);
					/*
					 * 
					 */
					
					System.out.print("Edad: ");
					String edad1 = teclado.next();
					
					while(validarEdad(edad1) == false) {
						
						System.out.println("Prueba de nuevo, los caracteres no son validos." + "\n" + "El rango de edad valido es 12-99" );
						edad1 = teclado.next();
						
					}
					int edad = Integer.parseInt(edad1);
					
					usuario.setEdad(edad);
					

					
					
					
		
					listaUsuarios.add(new Usuario(dni,nombre, primerApellido, segundoApellido, edad));
					
					System.out.println(usuario.toString());
						
		}
		
		
		
		
		
		
		
		
		
		
		
		}
		

	}

	
	

}
