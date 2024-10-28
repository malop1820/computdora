package proyectoRopa;

public class Ropa {
	private String clave;
	private String marca;
	private float precio;
	private int existencia;
	
	public Ropa() {
	}
	
	

	public Ropa(String claver, String marca, float precio, int existencia) {
		super();
		this.clave = claver;
		this.marca = marca;
		this.precio = precio;
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "Ropa [clave=" + clave + ", marca=" + marca + ", precio=" + precio + ", existencia=" + existencia
				+ "]";
	}



	public String getClave() {
		return clave;
	}



	public void setClave(String clave) {
		this.clave = clave;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}



	public int getExistencia() {
		return existencia;
	}



	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	
	
	
	
}

