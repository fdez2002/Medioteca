
public class Usuario implements Comparable<Usuario> {
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
	public Usuario(String admi) {
		this.dni=admi;
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
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/*
	 * 
	 */
	@Override
	public String toString(){
		return "Sus datos son " + "\n" + "Dni: " + dni + "\n" + "Nombre: " + nombre + "\n" + "Primer Apellido: " + primerApellido + "\n" 
											+ "Segund Apellido: " + segundoApellido + "\n" + "Edad: " + edad + "\n";
		
	}
	
	public int compareTo(Usuario o){
		return this.dni.compareTo(o.dni);
	}
	
	public boolean equals(Usuario o){
		return this.dni.equals(o.dni);
	}
	

}
