import java.util.Scanner;

public class Usuario {
	protected String dni;
	protected String nombre;
	protected String primerApellido;
	protected String segundoApellido;
	protected int edad;
	/*
	 *Contructor sin parametros
	 * 
	 */
	public Usuario() {
		
	}
	/*
	 * Constructor con parametros
	 * 
	 */
	public Usuario(String dni, String nombre, String primerApellido, String segundoApellido, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.edad = edad;
		
		
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}
	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	
	public void nuevoUsuario() {
		try (Scanner teclado = new Scanner(System.in)) {
		System.out.print("Para comenzar con la cracion de su cuenta le vamos a solicitar los siguientes datos: " + "\n" + "DNI: ");
		
		dni = teclado.next();
			
		System.out.print("Nombre: ");
		
		nombre = teclado.next();
		
		System.out.print("Primer apellido: ");
		primerApellido = teclado.next();
		
		System.out.print("Segundo apellido: ");
		segundoApellido = teclado.next();
		
		System.out.print("Edad: ");
		edad = teclado.nextInt();
		
		
		}
	}
	
	

}
