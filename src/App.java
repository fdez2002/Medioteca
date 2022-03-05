import java.util.*;
import java.util.Scanner;

/**
 * @author Antonio Fernández Villa 
 *
 */
	public class App {
	
	public ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();//Array de usuarios
	public ArrayList<Libros> listaLibros = new ArrayList<Libros>();;//Array de libros
	public ArrayList<Discos> listaDiscos = new ArrayList<Discos>();;//Array de discos
	public ArrayList<Revistas> listaRevistas = new ArrayList<Revistas>();;//Array de revistas
	public ArrayList<Peliculas> listaPeliculas = new ArrayList<Peliculas>();;//Array de peliculas

	public Usuario usuarioLogado = new Usuario();//Objeto de usuarios
	public Libros libro = new Libros();//Objeto de Libros
	public Discos disco = new Discos();
	public Revistas revista = new Revistas();
	
	public static Scanner teclado = new Scanner(System.in); //Escaner para la introducion de datos por teclado
	/*
	 * Constructor con usuarios ya logeados
	 */
	public App() {
	
	//listaUsuarios = new ArrayList<Usuario>(); // ArrayList de usuarios

	listaUsuarios.add(new Usuario("36520460B", "Antonio", "Fernandez", "Villa", 20));//Usuario 1
	listaUsuarios.add(new Usuario("26520460B", "Julia", "Perez", "Garrido", 16));//Usuario 2
	listaUsuarios.add(new Usuario("56520460B", "Juan", "Baena", "Valcarcel", 45));//Usuario 3
	listaUsuarios.add(new Usuario("66520460B", "Sara", "Peñafiel", "Diaz", 20));//Usuario 4
	
	//listaLibros = new Arraylist<Libros>();
	listaLibros.add(new Libros("9788492719129", 1555, 209, "El lazarillo", "Moral", "Indice", "Desconocido", 209, "12/02/2009", 8));//Libro 1
	listaLibros.add(new Libros("8788492719129", 1605, 179, "Don quijote", "Comedia", "Indice", "Miguel De Cervantes", 309, "13/02/2009", 10));//Libro 1
	listaLibros.add(new Libros("7788492719129", 1555, 309, "El arte de la guerra", "Drama", "Indice", "Raul Checheno", 189, "14/02/2009", 5));//Libro 1
	
	listaDiscos.add(new Discos("12345678910111213", 1991, "Nevermind", "Nirvana", "Rock", "Cancion1-Cancion2", "CD", 577, "12/08/2019", 5.2));//Disco 1
	listaDiscos.add(new Discos("22345678910111213", 1996, "Ramours", "Fleetwood", "Rock", "Cancion1-Cancion2", "CD", 568, "13/08/2019", 9.2));//Disco 2
	listaDiscos.add(new Discos("32345678910111213", 1999, "Revolver", "The Beatles", "Rock", "Cancion1-Cancion2", "CD", 577, "14/08/2019", 7.2));//Disco 3
	
	listaRevistas.add(new Revistas("0788492719129", 2018, 309, "Revista 1", "Humor", "Indice", 429, "24/02/2009", 7.3));//Revistas 1
	listaRevistas.add(new Revistas("4788492719129", 2020, 409, "Revista 2", "Noticias", "Indice", 729, "24/02/2009", 4.3));//Revistas 2
	listaRevistas.add(new Revistas("6788492719129", 2021, 509, "Revista 3", "Pemas", "Indice", 829, "24/02/2009", 9.3));//Revistas 3
	
	listaPeliculas.add(new Peliculas("52345678910111213", 2001, "Titanic", "Juan", "CD", "Protagonista1", "Amor", "1:29", 409, "12/04/2021", 1.2));//Pelicula 1
	listaPeliculas.add(new Peliculas("52345678910111213", 2011, "Titanic2", "Juan2", "CD", "Protagonista2", "Amor2", "1:23", 609, "13/04/2021", 4.2));//Pelicula 2
	listaPeliculas.add(new Peliculas("52345678910111213", 2021, "Titanic3", "Juan3", "CD", "Protagonista3", "Amor3", "1:24", 239, "14/04/2021", 2.2));//Pelicula 3
	
	}
	public void recorrerLibros() {
		System.out.println(" ------------------");
		System.out.println("|Libros Disponibles|");
		System.out.println(" ------------------");

		for(Libros libro : listaLibros) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(libro.toString());
			System.out.println("---------------------------------------------------------------");

		}
	}
	public void recorrerDiscos() {
		System.out.println(" ------------------");
		System.out.println("|Discos Disponibles|");
		System.out.println(" ------------------");

		for(Discos disco : listaDiscos) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(disco.toString());
			System.out.println("---------------------------------------------------------------");

		}
	}
	public void recorrerRevistas() {
		System.out.println(" ------------------");
		System.out.println("|Revistas Disponibles|");
		System.out.println(" ------------------");

		for(Revistas revista : listaRevistas) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(revista.toString());
			System.out.println("---------------------------------------------------------------");

		}
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
				
				recorrerLibros();
				System.out.println();
				recorrerDiscos();
				System.out.println();
				recorrerRevistas();
				
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



