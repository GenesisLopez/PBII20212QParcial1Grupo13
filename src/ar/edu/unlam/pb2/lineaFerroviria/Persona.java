package ar.edu.unlam.pb2.lineaFerroviria;


public abstract class Persona implements DescuentoPersona{

	private Integer dni;
	private String nombre;
	private String apellido;
	private Sube sube;
	
	

	public Persona(Integer dni, String nombre, String apellido, Sube sube) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sube = sube;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Sube getSube() {
		return sube;
	}

	public void setSube(Sube sube) {
		this.sube = sube;
	}
	

}
