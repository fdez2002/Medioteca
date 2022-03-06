
public abstract class Medios {
	
	/*
	 * Atributos
	 */
	protected int numRegistro;
	protected String fechaAdquisicion;
	protected double precioCompra;
	
	/*
	 * Constructor sin parametros
	 */
	
	public Medios() {}
	
	/*
	 * Constructor con parámetros
	 * 
	 */
	public Medios (int numRegistro, String fechaAdquisicion, double precioCompra) {
		this.numRegistro = numRegistro;
		this.fechaAdquisicion = fechaAdquisicion;
		this.precioCompra = precioCompra;
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
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	
	

}
