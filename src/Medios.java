
public abstract class Medios{
	
	/*
	 * Atributos
	 */
	protected int numRegistro;
	protected String fechaAdquisicion;
	protected double precioCompra;
	protected int ejemplares;
	
	/*
	 * Constructor sin parametros
	 */
	
	public Medios() {}
	
	/*
	 * Constructor con par�metros
	 * 
	 */
	public Medios (int numRegistro, String fechaAdquisicion, double precioCompra, int ejemplares) {
		this.numRegistro = numRegistro;
		this.fechaAdquisicion = fechaAdquisicion;
		this.precioCompra = precioCompra;
		this.ejemplares = ejemplares;
	}

	/**
	 * @return the numRegistro
	 */
	public int getNumRegistro() {
		return numRegistro;
	}

	/**
	 * @param numRegistro the numRegistro to set
	 */
	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}

	/**
	 * @return the fechaAdquisicion
	 */
	public String getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	/**
	 * @param fechaAdquisicion the fechaAdquisicion to set
	 */
	public void setFechaAdquisicion(String fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}
	/**
	 * 
	 * @param ejemplares
	 */
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	/*
	 * @return the ejemplares
	 */
	public int getEjemplares() {
		return ejemplares;
	}

	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public Medios(int numRegistro) {
		this.numRegistro = numRegistro;
	}
	
	
	

}
