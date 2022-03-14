import java.util.*;
import java.util.Scanner;

/**
 * 
 * @author Antonio Fernández Villa
 * Programa orientado a la gestion de una medioteca, una collecion de medios
 * los culaes se realizan una serie de funciones para la gestion de la misma.
 * Los medio disponibles son: libros, revistas, discos, y peluculas introducidos
 * en sus respectivas clases coectados por herencia mediante una clase pruncipal
 * llamada Medios la cual comparte atributos que sirven para las anteriores clases
 * La clase App se encarga del funcionamiento y gestion de estos medios con los diferentes 
 * metodos y con la crecaion de arrayList que almacenaran los articulos.
 * Cuenta con una clase Usuario
 * 
 *
 */
	public class App {
	
	private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();//Array de usuarios
	private static ArrayList<Libros> listaLibros = new ArrayList<Libros>();;//Array de libros
	private static ArrayList<Discos> listaDiscos = new ArrayList<Discos>();;//Array de discos
	private static ArrayList<Revistas> listaRevistas = new ArrayList<Revistas>();;//Array de revistas
	private static ArrayList<Peliculas> listaPeliculas = new ArrayList<Peliculas>();;//Array de peliculas

	public static Usuario usuarioLogado = new Usuario();//Objeto de usuarios
	public static Libros libro = new Libros();//Objeto de Libros
	public static Discos disco = new Discos();
	public static Revistas revista = new Revistas();
	public static Peliculas pelicula = new Peliculas();
	
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
	listaLibros.add(0,new Libros("9788492719129", 1555, 209, "El lazarillo", "Moral", "Indice", "Desconocido", 209, "12/02/2009", 8, 1));//Libro 1
	listaLibros.add(1,new Libros("8788492719129", 1605, 179, "Don quijote", "Comedia", "Indice", "Miguel De Cervantes", 309, "13/02/2009", 10 ,3));//Libro 1
	listaLibros.add(2,new Libros("7788492719129", 1555, 309, "El arte de la guerra", "Drama", "Indice", "Raul Checheno", 189, "14/02/2009", 5, 6));//Libro 1
	
	listaDiscos.add(0,new Discos("12345678910111213", 1991, "Nevermind", "Nirvana", "Rock", "Cancion1-Cancion2", "CD", 235, "12/08/2019", 5.2, 8));//Disco 1
	listaDiscos.add(1,new Discos("22345678910111213", 1996, "Ramours", "Fleetwood", "Rock", "Cancion1-Cancion2", "CD", 568, "13/08/2019", 9.2, 5));//Disco 2
	listaDiscos.add(2,new Discos("32345678910111213", 1999, "Revolver", "The Beatles", "Rock", "Cancion1-Cancion2", "CD", 577, "14/08/2019", 7.2, 2));//Disco 3
	
	listaRevistas.add(0,new Revistas("0788492719129", 2018, 309, "Revista 1", "Humor", "Indice", 429, "24/02/2009", 7.3, 9));//Revistas 1
	listaRevistas.add(1,new Revistas("4788492719129", 2020, 409, "Revista 2", "Noticias", "Indice", 220, "24/02/2009", 4.3, 3));//Revistas 2
	listaRevistas.add(2,new Revistas("6788492719129", 2021, 509, "Revista 3", "Pemas", "Indice", 829, "24/02/2009", 9.3, 5));//Revistas 3
	
	listaPeliculas.add(0,new Peliculas("52345678910111213", 2001, "Titanic", "Juan", "CD", "Protagonista1", "Amor", "1:29", 409, "12/04/2021", 1.2, 2));//Pelicula 1
	listaPeliculas.add(1,new Peliculas("52345678910111213", 2011, "Titanic2", "Juan2", "CD", "Protagonista2", "Amor2", "1:23", 609, "13/04/2021", 4.2, 3));//Pelicula 2
	listaPeliculas.add(2,new Peliculas("52345678910111213", 2021, "Titanic3", "Juan3", "CD", "Protagonista3", "Amor3", "1:24", 239, "14/04/2021", 2.2, 4));//Pelicula 3
	
	}
	public static  Libros obtenerLibro(int i) {
		
		return listaLibros.get(i);
	}
	/*
	 * Muestra los libros disponibles
	 */
	private static void recorrerLibros() {
		System.out.println(" ------------------");
		System.out.println("|Libros Disponibles|");
		System.out.println(" ------------------");

		for(Libros libro : listaLibros) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(libro.toString());
			System.out.println("---------------------------------------------------------------");

		}
	}
	/**
	 * Muestra al usuario los discos
	 */
	private static void recorrerDiscos() {
		System.out.println(" ------------------");
		System.out.println("|Discos Disponibles|");
		System.out.println(" ------------------");

		for(Discos disco : listaDiscos) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(disco.toString());
			System.out.println("---------------------------------------------------------------");

		}
	}
	/*
	 * Muestra al usuario las revistas
	 */
	private static void recorrerRevistas() {
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
	 * Muestra al usuario las peliculas
	 */
	private static void recorrerPeliculas() {
		System.out.println(" ------------------");
		System.out.println("|Peliculas Disponibles|");
		System.out.println(" ------------------");

		for(Peliculas pelicula : listaPeliculas) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(pelicula.toString());
			System.out.println("---------------------------------------------------------------");

		}
	}
	/*
	 * Muestra la informacion al administrador que no le interesa al usuario normal
	 */
	private static void recorrerLibrosAdmin() {
		System.out.println(" ------------------");
		System.out.println("|Libros Disponibles|");
		System.out.println(" ------------------");

		for(Libros libro : listaLibros) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(libro.toStringAdmin());
			System.out.println("---------------------------------------------------------------");

		}
	}
	/*
	 * Recorre los discos con toda su informacion al administrador
	 */
	private static void recorrerDiscosAdmin() {
		System.out.println(" ------------------");
		System.out.println("|Discos Disponibles|");
		System.out.println(" ------------------");

		for(Discos disco : listaDiscos) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(disco.toStringAdmin());
			System.out.println("---------------------------------------------------------------");

		}
	}
	/*
	 * Muestra las revistas con todos sus datos al administrador
	 */
	private static void recorrerRevistasAdmin() {
		System.out.println(" ------------------");
		System.out.println("|Revistas Disponibles|");
		System.out.println(" ------------------");

		for(Revistas revista : listaRevistas) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(revista.toStringAdmin());
			System.out.println("---------------------------------------------------------------");

		}
	}
	/*
	 * Muestra las peliculas con todos sus datos al administrador
	 */
	private static void recorrerPeliculasAdmin() {
		System.out.println(" ------------------");
		System.out.println("|Peliculas Disponibles|");
		System.out.println(" ------------------");

		for(Peliculas pelicula : listaPeliculas) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(pelicula.toStringAdmin());
			System.out.println("---------------------------------------------------------------");

		}
	}
	
	/*
	 * Validacion de DNI
	 * Expresion regular que nos indica si el dni es correcto o no validando el formato de la cadena
	 * El metodo matches nos indica si se cumple
	 * (^$--> Obliga al programa que el dato introducido debe empezar y terminar como se indica INICIO y Final)
	 * [0-9]--> Lo que esta incluido en este caso los numeros del 0 al 9
	 * {7,8}--> Nuemero de repeticiones
	 * []--> Letras que son validas para un dni
	 */
	private static  boolean validarDni(String dni) {
		
		return dni.matches("^[0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
		
	}
	/*
	 * Validacion nombre
	 * Empezaria con una letra mayuscula
	 * + nos indica que tiene que estar una letra mayuscula y algunas minusculas
	 * * 0 o varios
	 */
	
	private static boolean validarNombre(String nombre) {

        return nombre.matches("^([A-Z]{1}[a-z]+[ ]*){1,5}$");

    }
	/*
	 * validacionFirstapellido
	 */
	private static boolean validarPrimerApellido(String primerApellido) {

        return primerApellido.matches("^([A-Z]{1}[a-z]+[ ]*){1}$");

    }
	/*
	 * Validacion segundo apellido
	 */
	private static boolean validarSegundoApellido(String segundoApellido) {

        return segundoApellido.matches("^([A-Z]{1}[a-z]+[ ]*){1}$");

    }
	/*
	 * Validacion edad
	 */
	private static boolean validarEdad(String edad1) {

        return edad1.matches("^[12-99]{2}$");

    }
	/*
	 * Creacion nueva cuenta, permite al usuario crear una cuenta con la peticion de los datos
	 * dichos datos se almacenan en un array de usuario
	 */
	private  static Usuario nuevaCuenta() {
		
		Usuario usuario = new Usuario();//Objeto de usuarios


		System.out.print("Para comenzar con la cracion de su cuenta le vamos a solicitar los siguientes datos: " + "\n" + "DNI: ");
		String dni = teclado.next();
		
		//LLama al metodo dni y nos dice si ese dni es valido o no
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
	 * Ingresar a la cuenta, se comprobara si el dni esta loggeado o no
	 * 
	 */
	public static int comprobarCuenta(String dni) {
		Usuario usBuscar = new Usuario(dni);
		Collections.sort(listaUsuarios);
		return Collections.binarySearch(listaUsuarios,usBuscar);
	}
	/**
	 * Permite al administrador crear un nuevo disco
	 * Mismos metodos se usaran para la modificacion de datos
	 */
	private static void datosDisco() {
		System.out.println("ISMN");
		String ismn = teclado.next();
		disco.setIsmn(ismn);
		
		System.out.println("Año de publicacion");
		int anoPublicacion = teclado.nextInt();
		disco.setAnoPublicacion(anoPublicacion);
		
		System.out.println("Titulo");
		String titulo = teclado.next();
		disco.setTitulo(titulo);
		
		System.out.println("Interprete");
		String interprete = teclado.next();
		disco.setInterprete(interprete);
		
		System.out.println("Estilo");
		String estilo = teclado.next();
		disco.setEstilo(estilo);
		
		System.out.println("Canciones con formato " + "Ej: Cancion-Cancion" );
		String canciones = teclado.next();
		disco.setCanciones(canciones);
		
		System.out.println("Sporte");
		String soporte = teclado.next();
		disco.setSoporte(soporte);
		
		System.out.println("Numero de registro");
		int numRegistro = teclado.nextInt();
		disco.setNumRegistro(numRegistro);
		
		System.out.println("Fecha de adquisicion, con formato DD/MM/YYYY");
		String fechaAdquisicion = teclado.next();
		disco.setFechaAdquisicion(fechaAdquisicion);
		
		System.out.println("Precio de compra");
		double precioCompra = teclado.nextDouble();
		disco.setPrecioCompra(precioCompra);
		
		System.out.println("Ejemplares");
		int ejemplar = teclado.nextInt();
		disco.setEjemplares(ejemplar);
	}
	/**
	 * Permite al administrador crear un nuevo Libro
	 * Mismos metodos se usaran para la modificacion de datos
	 */

	private static void datosLibro() {
		System.out.println("ISBM");
		String isbm = teclado.next();
		libro.setIsbm(isbm);
		
		System.out.println("Año de publicacion");
		int annoPublicacion = teclado.nextInt();
		libro.setAnoPublicacion(annoPublicacion);
		
		System.out.println("Numero de pagina");
		int numPagina = teclado.nextInt();
		libro.setNumPaginas(numPagina);
		
		System.out.println("Titulo");
		String tituloLibro = teclado.next();
		libro.setTitulo(tituloLibro);
		
		System.out.println("Tematica");
		String tematica = teclado.next();
		libro.setTematica(tematica);
		
		System.out.println("Indice");
		String indice = teclado.next();
		libro.setIndice(indice);
		
		System.out.println("Autor");
		String autor = teclado.next();
		libro.setAutor(autor);
		
		System.out.println("Numero de registro");
		int numRegistroLibro = teclado.nextInt();
		libro.setNumRegistro(numRegistroLibro);
		
		System.out.println("Fecha de adquisicion, con formato DD/MM/YYYY");
		String fechaAdquisicionLibro = teclado.next();
		libro.setFechaAdquisicion(fechaAdquisicionLibro);
		
		System.out.println("Precio de compra");
		double precioCompraLibro = teclado.nextDouble();
		libro.setPrecioCompra(precioCompraLibro);
		
		System.out.println("Ejemplares");
		int ejemplar = teclado.nextInt();
		libro.setEjemplares(ejemplar);
	}
	/**
	 * Permite al administrador crear una nueva pelicula
	 * Mismos metodos se usaran para la modificacion de datos
	 */
	private static void datosPelicula() {
		System.out.println("ISAM");
		String isam = teclado.next();
		pelicula.setIsan(isam);
		
		System.out.println("Año de publicacion");
		int anoPublicacionPelicula = teclado.nextInt();
		pelicula.setAnoPublicacion(anoPublicacionPelicula);
		
		System.out.println("Titulo");
		String tituloPelicula = teclado.next();
		pelicula.setTitulo(tituloPelicula);
		
		System.out.println("Soporte");
		String soportePelicula = teclado.next();
		pelicula.setSoporte(soportePelicula);
		
		System.out.println("Protagonista");
		String protagonista = teclado.next();
		pelicula.setProtagonista(protagonista);
		
		System.out.println("Estilo");
		String estiloPelicula = teclado.next();
		pelicula.setEstilo(estiloPelicula);
		
		System.out.println("Duracion");
		String duracion = teclado.next();
		pelicula.setDuracion(duracion);
		
		System.out.println("Numero de registro");
		int numRegistroPelicula = teclado.nextInt();
		pelicula.setNumRegistro(numRegistroPelicula);
		
		System.out.println("Fecha de adquisicion, con formato DD/MM/YYYY");
		String fechaAdquisicionPelicula = teclado.next();
		pelicula.setFechaAdquisicion(fechaAdquisicionPelicula);
		
		System.out.println("Precio de compra");
		double precioCompraPelicula = teclado.nextDouble();
		pelicula.setPrecioCompra(precioCompraPelicula);
		
		System.out.println("Ejemplares");
		int ejemplar = teclado.nextInt();
		pelicula.setEjemplares(ejemplar);
	}
	/**
	 * Permite al administrador crear una nueva revista
	 * Mismos metodos se usaran para la modificacion de datos
	 */
	private static void datosRevista() {
		System.out.println("Año de publicacion");
		int annoRevista = teclado.nextInt();
		revista.setAnoPublicacion(annoRevista);
		
		System.out.println("Numero de pagina");
		int numPaginaRevista = teclado.nextInt();
		revista.setNumPaginas(numPaginaRevista);
		
		System.out.println("Titulo");
		String tituloRevista = teclado.next();
		revista.setTitulo(tituloRevista);
		
		System.out.println("Numero de registro");
		int numRegistroRevista = teclado.nextInt();
		revista.setNumRegistro(numRegistroRevista);
		
		System.out.println("Fecha de adquisicion, con formato DD/MM/YYYY");
		String fechaAdquisicionRevista = teclado.next();
		revista.setFechaAdquisicion(fechaAdquisicionRevista);
		
		System.out.println("Precio de compra");
		double precioCompraRevista = teclado.nextDouble();
		revista.setPrecioCompra(precioCompraRevista);
		
		System.out.println("Ejemplares");
		int ejemplar = teclado.nextInt();
		revista.setEjemplares(ejemplar);
	}
	/*
	 * Añadir medios, le pregunta al admin que medios quiere añadir, sabiendo esto se le redirigira al dicho medio
	 */
	private static void añadirMedios() {
		
		String opcionesMenu2 = "";
		System.out.println("¿Que tipo de medio quiere añadir? ");
		System.out.println("D--> Discos ");
		System.out.println("L--> Libros ");
		System.out.println("P--> Peliculas ");
		System.out.println("R--> Revistas ");

		opcionesMenu2 = teclado.next();
		
		switch(opcionesMenu2) {
			case "D":
				datosDisco();
				listaDiscos.add(disco);
				System.out.println("...disco agregado");
				break;
				
			case "L":
				datosLibro();
				listaLibros.add(libro);
				System.out.println("...libro agregado");				
				break;
				
			case "P":
				datosPelicula();
				listaPeliculas.add(pelicula);
				System.out.println("...pelicula agregada");	
				break;
				
			case "R":
				datosRevista();
				listaRevistas.add(revista);
				System.out.println("...revista agregada");	
				break;
			
				
		}
		menuAdministrador();
		
	}
	/**
	 * Estos metodos nos permiten saber la posicion de los arrayList sabiendo un dato de dentro del ArrayList
	 * @param numeroRegistro
	 * @return
	 */
	private static boolean encontrarPosicionDiscos(int numeroRegistro ){
		boolean indice = false;
		int i;
		
		for(i = 0; i < listaDiscos.size(); i++) {
			if(listaDiscos.get(i).getNumRegistro() == numeroRegistro) {
				return true;

			}else {
				
			}
		}

		return indice;
	}
	/**
	 * 
	 * @param numeroRegistro
	 * @return
	 */
	private static int posicionDiscos(int numeroRegistro ){
		
		int indice = 0;
		for(int i = 0; i < listaDiscos.size(); i++) {
			if(listaDiscos.get(i).getNumRegistro() == numeroRegistro) {
				indice = i;
			}else {
			}
		}
		return indice;
	}
	/**
	 * 
	 * @param numeroRegistro
	 * @return
	 */

	private static boolean  encontrarPosicionLibros(int numeroRegistro){
		boolean indice = false;
		int i;
		
		for(i = 0; i < listaLibros.size(); i++) {
			if(listaLibros.get(i).getNumRegistro() == numeroRegistro) {
				return true;

			}else {
				
			}
		}

		return indice;
	}
	/**
	 * 
	 * @param numeroRegistro
	 * @return
	 */
	private static int posicionLibros(int numeroRegistro ){
		int indice = 0;

		if(encontrarPosicionDiscos(numeroRegistro) == true) {
			for(int i = 0; i < listaLibros.size(); i++) {
				if(listaLibros.get(i).getNumRegistro() == numeroRegistro) {
					indice = i;

				} 
			}
		}else {
			}
		return indice;
	}
	/**
	 * 
	 * @param numeroRegistro
	 * @return
	 */
	
	private static boolean  encontrarPosicionPeliculas(int numeroRegistro){
		boolean indice = false;
		int i;
		
		for(i = 0; i < listaPeliculas.size(); i++) {
			if(listaPeliculas.get(i).getNumRegistro() == numeroRegistro) {
				return true;

			}else {
				
			}
		}

		return indice;
	}
	/**
	 * 
	 * @param numeroRegistro
	 * @return
	 */
	private static int posicionPeliculas(int numeroRegistro ){
		int indice = 0;

		if(encontrarPosicionDiscos(numeroRegistro) == true) {
			for(int i = 0; i < listaPeliculas.size(); i++) {
				if(listaPeliculas.get(i).getNumRegistro() == numeroRegistro) {
					indice = i;

				} 
			}
		}else {
			}
		return indice;
	}
	/**
	 * 
	 * @param numeroRegistro
	 * @return
	 */
	private static boolean  encontrarPosicionRevistas(int numeroRegistro){
		boolean indice = false;
		int i;
		
		for(i = 0; i < listaRevistas.size(); i++) {
			if(listaRevistas.get(i).getNumRegistro() == numeroRegistro) {
				return true;

			}else {
				
			}
		}

		return indice;
	}
	/**
	 * 
	 * @param numeroRegistro
	 * @return
	 */
	private static int posicionRevistas(int numeroRegistro ){
		int indice = 0;

		if(encontrarPosicionDiscos(numeroRegistro) == true) {
			for(int i = 0; i < listaRevistas.size(); i++) {
				if(listaRevistas.get(i).getNumRegistro() == numeroRegistro) {
					indice = i;

				} 
			}
		}else {
			}
		return indice;
	}
	/*
	 * Borrar medios, permite al admin borra algun medio introduciendo el numero de registro de dicho medio
	 */
	private static void  borrarMedios() {
		String opcionesMenu3 = "";
		System.out.println("¿Que tipo de medio quiere eliminar? ");
		System.out.println("D--> Discos ");
		System.out.println("L--> Libros ");
		System.out.println("P--> Peliculas ");
		System.out.println("R--> Revistas ");

		opcionesMenu3 = teclado.next();
		switch(opcionesMenu3){
			case "D":
				recorrerDiscosAdmin();
				System.out.println("Por favor, idique el numero de registro del disco ");
				int numeroRegistro = teclado.nextInt();
				
				encontrarPosicionDiscos(numeroRegistro);
				
				if (encontrarPosicionDiscos(numeroRegistro) == true) {
						listaDiscos.remove(posicionDiscos(numeroRegistro));
						System.out.println("...medio eliminado");	
				}else {
					System.out.println("medio no encontrado");	

				}

				break;
			case "L":
				recorrerLibrosAdmin();
				
				System.out.println("Por favor, idique el numero de registro del disco ");
				numeroRegistro = teclado.nextInt();
				
				encontrarPosicionLibros(numeroRegistro);	
				
				if (encontrarPosicionLibros(numeroRegistro) == true) {
					listaDiscos.remove(posicionLibros(numeroRegistro));
					System.out.println("...medio eliminado");	
				}else {
				System.out.println("medio no encontrado");	

				}

				break;
			case "P":
				recorrerPeliculasAdmin();
				
				System.out.println("Por favor, idique el numero de registro del disco ");
				numeroRegistro = teclado.nextInt();
				
				encontrarPosicionPeliculas(numeroRegistro);	
				
				if (encontrarPosicionPeliculas(numeroRegistro) == true) {
					listaDiscos.remove(posicionPeliculas(numeroRegistro));
					System.out.println("...medio eliminado");	
				}else {
				System.out.println("medio no encontrado");	

				}
				
				break;
			case "R":
				recorrerRevistasAdmin();
				
				System.out.println("Por favor, idique el numero de registro del disco ");
				numeroRegistro = teclado.nextInt();
				
				encontrarPosicionRevistas(numeroRegistro);
				if (encontrarPosicionRevistas(numeroRegistro) == true) {
					listaDiscos.remove(posicionRevistas(numeroRegistro));
					System.out.println("...medio eliminado");	
				}else {
				System.out.println("medio no encontrado");	

				}

				break;
				
		}
		menuAdministrador();
	}
	/**
	 * Menu para modificar los medios
	 */
	
	private static void modificarMedios() {
		System.out.println("¿Que tipo de medio quiere modificar? ");
		System.out.println("D--> Discos ");
		System.out.println("L--> Libros ");
		System.out.println("P--> Peliculas ");
		System.out.println("R--> Revistas ");
		String opcionesMenu4 = teclado.next();
		
		switch(opcionesMenu4){
			case "D":
				recorrerDiscosAdmin();
				
				System.out.println("Por favor, idique el numero de registro del disco ");
				int numeroRegistro = teclado.nextInt();

				datosDisco();
				listaDiscos.set(posicionDiscos(numeroRegistro), disco);
				
				menuAdministrador();
				break;
			case "L":
				recorrerLibrosAdmin();
				
				System.out.println("Por favor, idique el numero de registro del disco ");
				numeroRegistro = teclado.nextInt();

				datosLibro();
				listaLibros.set(posicionLibros(numeroRegistro), libro);
				
				menuAdministrador();
				break;
			case "P":
				recorrerPeliculasAdmin();
				
				System.out.println("Por favor, idique el numero de registro del disco ");
				numeroRegistro = teclado.nextInt();

				datosPelicula();
				listaPeliculas.set(posicionPeliculas(numeroRegistro), pelicula);
				
				menuAdministrador();
				break;
			case "R":
				recorrerRevistasAdmin();
				
				System.out.println("Por favor, idique el numero de registro del disco ");
				numeroRegistro = teclado.nextInt();

				datosRevista();
				listaRevistas.set(posicionRevistas(numeroRegistro), revista);
				
				menuAdministrador();
				break;
		}
	}
	
	/*
	 * Menu admin, controla y redirige al administrador a la tarea que quiera realizar
	 */
	private static void menuAdministrador() {
		int opcionesMenu1;
		System.out.println("1---> Añadir medios");
		System.out.println("2---> Modificar datos de medios");
		System.out.println("3--> Borrar medios");
		System.out.println("Cualquier otro numero para salir");
		
		opcionesMenu1 = teclado.nextInt();
		
		switch(opcionesMenu1) {
			case 1:
				añadirMedios();
				break;
			case 2:
				modificarMedios();
				break;
			case 3:
				borrarMedios();
				break;
			
		}
		despedida();
	}
	/*
	 * Menu usuario
	 */
	private static void menuUsuario(){
		System.out.println("Bienvenido " + "¿Que desea realizar?");
		System.out.println("1---> Comprar un articulo");
		System.out.println("2---> Enviar un articulo");
	}
	/*
	 * Menu de la aplicacion, controla al usuario y sirve como loggeo para el adiminsitrador, es el menu principal
	 * 
	 */
	public  void menuApp() {
		
			int opcionesMenu=0;
		
				System.out.println("Bienvenidos a La Medioteca");
				
				recorrerLibros();
				System.out.println();
				recorrerDiscos();
				System.out.println();
				recorrerRevistas();
				System.out.println();
				recorrerPeliculas();
				do {
				System.out.println("Que desea realizar?" + "\n" + "1--> Creacion de cuenta \n" + "2--> Ingrese a la cuenta");
				//System.out.println("3--> Para salir");
				
				opcionesMenu = teclado.nextInt();
				String dni = "";

				switch(opcionesMenu) {
					case 1:
						Usuario nuevo=nuevaCuenta();
						listaUsuarios.add(nuevo);
						System.out.println(nuevo.toString());
						break;
						
					case 2:
						
						try {
							System.out.println("Ingrese su DNI");
							dni = teclado.next();
						}catch(IndexOutOfBoundsException e){
							System.out.println("DNI no valido");

						}
						int posicion=comprobarCuenta(dni);//Se comprueba si existe la cuenta

						
						if (posicion == -1) {
							System.out.println("Usuario No Encontrado");
							menuApp();
						}
						else {
							usuarioLogado=listaUsuarios.get(posicion);	
							System.out.println("Encontrado");
							menuUsuario();
							

						}
						break;
					case 3:
						despedida();
						break;
					case 4:
						int contrasena = teclado.nextInt();
						if (contrasena == 123) {
							System.out.println("Bienvenido Administrador");
							menuAdministrador();
						}
						break;
							
				}
				}while((opcionesMenu != 1) || (opcionesMenu != 2)|| (opcionesMenu != 3 ));
					
	
	}
	/**
	 * 
	 */
	public static void despedida() {
		System.out.println("Vuelva pronto");
	}
}



