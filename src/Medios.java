
public abstract class Medios {
	
	/*
	 * Atributos
	 */
	protected int numRegistro;
	protected int fechaAdquisicion;
	protected float precioCompra;
	
	/*
	 * Constructor sin parametros
	 */
	
	public Medios() {}
	
	/*
	 * Constructor con parámetros
	 * 
	 */
	public Medios (int numRegistro, int fechaAdquisicion, float precioCompra) {
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
	public int getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	/**
	 * @param fechaAdquisicion the fechaAdquisicion to set
	 */
	public void setFechaAdquisicion(int fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

	/**
	 * @return the precioCompra
	 */
	public float getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}
	

}
