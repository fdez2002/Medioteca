import java.util.*;
import java.util.Scanner;

/**
 * @author Antonio Fernández Villa 
 *
 */
	public class App {
	
	public ArrayList<Usuario> listaUsuarios;//Array de usuarios

	public Usuario usuarioLogado = new Usuario();//Objeto de usuarios
	
	public static Scanner teclado = new Scanner(System.in); //Escaner para la introducion de datos por teclado
	/*
	 * Constructor con usuarios ya logeados
	 */
	public App() {
	
	listaUsuarios = new ArrayList<Usuario>(); // ArrayList de usuarios

	listaUsuarios.add(new Usuario("36520460B", "Antonio", "Fernandez", "Villa", 20));
	
	listaUsuarios.add(new Usuario("26520460B", "Julia", "Perez", "Garrido", 16));
	
	listaUsuarios.add(new Usuario("56520460B", "Juan", "Baena", "Valcarcel", 45));
	
	listaUsuarios.add(new Usuario("66520460B", "Sara", "Peñafiel", "Diaz", 20));
	
	}
	
	/*
	 * Validacion de DNI
	 */
	public static  boolean validarDni(String dni) {
		
		return dni.matches("^[0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
		
	}
	/*
	 * Validacion nombre
	 */
	
	public static boolean validarNombre(String nombre) {

        return nombre.matches("^([A-Z]{1}[a-z]+[ ]*){1,5}$");

    }
	/*
	 * validacionFirstapellido
	 */
	public static boolean validarPrimerApellido(String primerApellido) {

        return primerApellido.matches("^([A-Z]{1}[a-z]+[ ]*){1}$");

    }
	/*
	 * Validacion segundo apellido
	 */
	public static boolean validarSegundoApellido(String segundoApellido) {

        return segundoApellido.matches("^([A-Z]{1}[a-z]+[ ]*){1}$");

    }
	/*
	 * Validacion edad
	 */
	public static boolean validarEdad(String edad1) {

        return edad1.matches("^[12-99]{2}$");

    }
	/*
	 * Creacion nueva cuenta
	 */
	public  static Usuario nuevaCuenta() {
		
		Usuario usuario = new Usuario();//Objeto de usuarios


		System.out.print("Para comenzar con la cracion de su cuenta le vamos a solicitar los siguientes datos: " + "\n" + "DNI: ");
		String dni = teclado.next();
		
		//DNI
		if (validarDni(dni) == false) {
			do {
					
				System.out.println("Prueba de nuevo, los caracteres introducidos no son validos. Verifica que la letra sea mayuscula");
				dni = teclado.next();
			
			}while(validarDni(dni) != true);	
		}else {
			System.out.println("Su dni no esta registrado");
			
		}
		usuario.setDni(dni);
		
		//Nombre
		System.out.print("Nombre: ");
		String nombre = teclado.next();
		
		while(validarNombre(nombre) == false) {
		
				System.out.println("Prueba de nuevo los caracteres no son validos." + "\n" + "Verifica que la letra de cada palabra esta en mayuscula" );
				nombre = teclado.next();
				
		}
		usuario.setNombre(nombre);
	
		//Primer apellido
		System.out.print("Primer apellido: ");
		String primerApellido = teclado.next();
		
		while(validarPrimerApellido(primerApellido) == false) {
			
			System.out.println("Prueba de nuevo, los caracteres no son validos." + "\n" + "Verifica que la letra de la esta en mayuscula" );
			primerApellido = teclado.next();
			
		}
		usuario.setPrimerApellido(primerApellido);
		
		//Segundo Apellido
		System.out.print("Segundo apellido: ");
		String segundoApellido = teclado.next();
		
		while(validarSegundoApellido(segundoApellido) == false) {
			
			System.out.println("Prueba de nuevo, los caracteres no son validos." + "\n" + "Verifica que la letra de la esta en mayuscula" );
			segundoApellido = teclado.next();
			
		}
		usuario.setSegundoApellido(segundoApellido);
		
		//Edad
		System.out.print("Edad: ");
		String edad1 = teclado.next();
		
		while(validarEdad(edad1) == false) {
			
			System.out.println("Prueba de nuevo, los caracteres no son validos." + "\n" + "El rango de edad valido es 12-99" );
			edad1 = teclado.next();
			
		}
		int edad = Integer.parseInt(edad1);
		
		usuario.setEdad(edad);
		
		return usuario;
	}
	/*
	 * Ingresar a la cuenta
	 * 
	 */
	public int comprobarCuenta(String dni) {
		Usuario usBuscar = new Usuario(dni);
		Collections.sort(listaUsuarios);
		return Collections.binarySearch(listaUsuarios,usBuscar);
	}
	/*
	 * Menu de la aplicacion
	 * 
	 */
	public void menuApp() {
		
			int opcionesMenu=0;
			do {
				System.out.println("Bienvenidoa a la Medioteca");
				System.out.println("Que desea realizar?" + "\n" + "1--> Creacion de cuenta \n" + "2--> Ingrese a la cuenta");
				System.out.println("3 --> Para salir");
				
				opcionesMenu = teclado.nextInt();
				//teclado.nextLine();//Limpiamos buffer de entrada
				
				switch(opcionesMenu) {
				
					case 1:
						Usuario nuevo=nuevaCuenta();
						listaUsuarios.add(nuevo);
						System.out.println(nuevo.toString());
						break;
						
					case 2:
						System.out.println("Ingrese su DNI");
						String dni = teclado.next();
						
						int posicion=comprobarCuenta(dni);//Se comprueba si existe la cuenta
						
						if (posicion == -1) {
							System.out.println("Usuario No Encontrado");
							opcionesMenu = 3;
							//no encontrado;
						}
						else {
							usuarioLogado=listaUsuarios.get(posicion);	
							System.out.println("Encontrado");

						}
						break;
						
						
								
						}
					}
			while ((opcionesMenu==1)||(opcionesMenu==2));
		}
}


