import java.util.*;
import java.util.Scanner;

/**
 * @author Antonio Fernández Villa 
 *
 */
	public class App {
	
	public static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();//Array de usuarios
	public static ArrayList<Libros> listaLibros = new ArrayList<Libros>();;//Array de libros
	public static ArrayList<Discos> listaDiscos = new ArrayList<Discos>();;//Array de discos
	public static ArrayList<Revistas> listaRevistas = new ArrayList<Revistas>();;//Array de revistas
	public static ArrayList<Peliculas> listaPeliculas = new ArrayList<Peliculas>();;//Array de peliculas

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
	listaLibros.add(0,new Libros("9788492719129", 1555, 209, "El lazarillo", "Moral", "Indice", "Desconocido", 209, "12/02/2009", 8));//Libro 1
	listaLibros.add(1,new Libros("8788492719129", 1605, 179, "Don quijote", "Comedia", "Indice", "Miguel De Cervantes", 309, "13/02/2009", 10));//Libro 1
	listaLibros.add(2,new Libros("7788492719129", 1555, 309, "El arte de la guerra", "Drama", "Indice", "Raul Checheno", 189, "14/02/2009", 5));//Libro 1
	
	listaDiscos.add(0,new Discos("12345678910111213", 1991, "Nevermind", "Nirvana", "Rock", "Cancion1-Cancion2", "CD", 235, "12/08/2019", 5.2));//Disco 1
	listaDiscos.add(1,new Discos("22345678910111213", 1996, "Ramours", "Fleetwood", "Rock", "Cancion1-Cancion2", "CD", 568, "13/08/2019", 9.2));//Disco 2
	listaDiscos.add(2,new Discos("32345678910111213", 1999, "Revolver", "The Beatles", "Rock", "Cancion1-Cancion2", "CD", 577, "14/08/2019", 7.2));//Disco 3
	
	listaRevistas.add(0,new Revistas("0788492719129", 2018, 309, "Revista 1", "Humor", "Indice", 429, "24/02/2009", 7.3));//Revistas 1
	listaRevistas.add(1,new Revistas("4788492719129", 2020, 409, "Revista 2", "Noticias", "Indice", 220, "24/02/2009", 4.3));//Revistas 2
	listaRevistas.add(2,new Revistas("6788492719129", 2021, 509, "Revista 3", "Pemas", "Indice", 829, "24/02/2009", 9.3));//Revistas 3
	
	listaPeliculas.add(0,new Peliculas("52345678910111213", 2001, "Titanic", "Juan", "CD", "Protagonista1", "Amor", "1:29", 409, "12/04/2021", 1.2));//Pelicula 1
	listaPeliculas.add(1,new Peliculas("52345678910111213", 2011, "Titanic2", "Juan2", "CD", "Protagonista2", "Amor2", "1:23", 609, "13/04/2021", 4.2));//Pelicula 2
	listaPeliculas.add(2,new Peliculas("52345678910111213", 2021, "Titanic3", "Juan3", "CD", "Protagonista3", "Amor3", "1:24", 239, "14/04/2021", 2.2));//Pelicula 3
	
	}
	public static  Libros obtenerLibro(int i) {
		
		return listaLibros.get(i);
	}
	/*
	 * 
	 */
	public static void recorrerLibros() {
		System.out.println(" ------------------");
		System.out.println("|Libros Disponibles|");
		System.out.println(" ------------------");

		for(Libros libro : listaLibros) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(libro.toString());
			System.out.println("---------------------------------------------------------------");

		}
	}
	public static void recorrerDiscos() {
		System.out.println(" ------------------");
		System.out.println("|Discos Disponibles|");
		System.out.println(" ------------------");

		for(Discos disco : listaDiscos) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(disco.toString());
			System.out.println("---------------------------------------------------------------");

		}
	}
	public static void recorrerRevistas() {
		System.out.println(" ------------------");
		System.out.println("|Revistas Disponibles|");
		System.out.println(" ------------------");

		for(Revistas revista : listaRevistas) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(revista.toString());
			System.out.println("---------------------------------------------------------------");

		}
	}
	public static void recorrerPeliculas() {
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
	 * Recorrer Administrador
	 */
	public static void recorrerLibrosAdmin() {
		System.out.println(" ------------------");
		System.out.println("|Libros Disponibles|");
		System.out.println(" ------------------");

		for(Libros libro : listaLibros) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(libro.toStringAdmin());
			System.out.println("---------------------------------------------------------------");

		}
	}
	public static void recorrerDiscosAdmin() {
		System.out.println(" ------------------");
		System.out.println("|Discos Disponibles|");
		System.out.println(" ------------------");

		for(Discos disco : listaDiscos) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(disco.toStringAdmin());
			System.out.println("---------------------------------------------------------------");

		}
	}
	public static void recorrerRevistasAdmin() {
		System.out.println(" ------------------");
		System.out.println("|Revistas Disponibles|");
		System.out.println(" ------------------");

		for(Revistas revista : listaRevistas) {
			System.out.println("---------------------------------------------------------------");
		    System.out.println(revista.toStringAdmin());
			System.out.println("---------------------------------------------------------------");

		}
	}
	public static void recorrerPeliculasAdmin() {
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
	public static int comprobarCuenta(String dni) {
		Usuario usBuscar = new Usuario(dni);
		Collections.sort(listaUsuarios);
		return Collections.binarySearch(listaUsuarios,usBuscar);
	}
	
	/*
	 * Añadir medios
	 */
	public static void añadirMedios() {
		Discos disco = new Discos();
		Libros libro = new Libros();//Objeto de Libros
		Revistas revista = new Revistas();
		Peliculas pelicula = new Peliculas();

		String opcionesMenu2 = "";
		System.out.println("¿Que tipo de medio quiere añadir? ");
		System.out.println("D--> Discos ");
		System.out.println("L--> Libros ");
		System.out.println("P--> Peliculas ");
		System.out.println("R--> Revistas ");

		opcionesMenu2 = teclado.next();
		
		switch(opcionesMenu2) {
			case "D":
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
				listaDiscos.add(disco);
				System.out.println("...disco agregado");
				break;
				
			case "L":
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
				disco.setFechaAdquisicion(fechaAdquisicionLibro);
				
				System.out.println("Precio de compra");
				double precioCompraLibro = teclado.nextDouble();
				disco.setPrecioCompra(precioCompraLibro);
				listaLibros.add(libro);
				System.out.println("...libro agregado");				
				break;
				
			case "P":
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
				listaPeliculas.add(pelicula);
				System.out.println("...pelicula agregada");	
				break;
				
			case "R":
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
				listaRevistas.add(revista);
				System.out.println("...revista agregada");	
				break;
			
			
				
		}
		menuAdministrador();
		
	}

	/*
	 * Borrar medios
	 */
	public static void  borrarMedios() {
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
				int indiceDisco = 0;
				System.out.println("Por favor, indique el numero de registro ");
				int numeroRegistro = teclado.nextInt();

				for(int i = 0; i < listaDiscos.size(); i++) {
					if(listaDiscos.get(i).getNumRegistro() == numeroRegistro) {
						indiceDisco = i;
					}else {
						System.out.println("No existe");
					}
					listaDiscos.remove(indiceDisco);
				}
				
				break;
			case "L":
				recorrerLibrosAdmin();
				System.out.println("Por favor, idique el numero de registro ");
				//int numRegistroLibro = teclado.nextInt();
				//int indiceLibro = listaLibros.indexOf(numRegistroLibro);
				//listaLibros.remove(indiceLibro);
				break;
			case "P":
				recorrerPeliculasAdmin();
				System.out.println("Por favor, idique el numero de registro ");
				//int numRegistroPelicula = teclado.nextInt();
				//int indicePelicula = listaPeliculas.indexOf(numRegistroPelicula);
				//listaPeliculas.remove(indicePelicula);
				break;
			case "R":
				recorrerRevistasAdmin();
				System.out.println("Por favor, idique el numero de registro ");
				//int numRegistroRevista = teclado.nextInt();
				//int indiceRevista = listaRevistas.indexOf(numRegistroRevista);
				//listaRevistas.remove(indiceRevista);
				break;
				
		}
		System.out.println("...medio eliminado");	
		menuAdministrador();
	}
	public static void modificarMedios() {
		System.out.println("¿Que tipo de medio quiere añadir? ");
		System.out.println("D--> Discos ");
		System.out.println("L--> Libros ");
		System.out.println("P--> Peliculas ");
		System.out.println("R--> Revistas ");
		String opcionesMenu4 = teclado.next();
		switch(opcionesMenu4){
			case "D":
				recorrerDiscosAdmin();
				
				break;
		}
	}
	/*
	 * Menu admin
	 */
	public static void menuAdministrador() {
		int opcionesMenu1;
		System.out.println("Bienvenido Administrador");
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

	}
	/*
	 * Menu usuario
	 */
	public static void menuUsuario(){
		System.out.println("Bienvenido " + "¿Que desea realizar?");
		System.out.println("1---> Comprar un articulo");
		System.out.println("2---> Enviar un articulo");
	}
	/*
	 * Menu de la aplicacion
	 * 
	 */
	public void menuApp() {
		
			int opcionesMenu=0;
			//do {
				System.out.println("Bienvenidos a La Medioteca");
				
				recorrerLibros();
				System.out.println();
				recorrerDiscos();
				System.out.println();
				recorrerRevistas();
				System.out.println();
				recorrerPeliculas();
				
				System.out.println("Que desea realizar?" + "\n" + "1--> Creacion de cuenta \n" + "2--> Ingrese a la cuenta");
				System.out.println("3--> Para salir");
				
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
						
						if (dni == "66520460B") {
							menuAdministrador();
						}
						else if (posicion == -1) {
							System.out.println("Usuario No Encontrado");
							menuApp();
							//opcionesMenu = 3;
						}
						else {
							usuarioLogado=listaUsuarios.get(posicion);	
							System.out.println("Encontrado");
							//menuUsuario();
							menuAdministrador();

						}
						break;
							
						}
					//}
			//while ((opcionesMenu==1)||(opcionesMenu==2));
			//System.out.println("Vuelva pronto");
		}
}



