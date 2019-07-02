public class Persona extends Base {
	
	private String nombre;
	private String apellido;
	private String domicilio;
	private int cuil;
	private String sexo;
	private int dni;
	private String contraseña;
	
	public Persona(String nombre, String apellido, String domicilio, int cuil, String sexo, int dni,String contraseña) {
		super(contraseña,dni);
		setNombre(nombre);
		setApellido(apellido);
		setDomicilio(domicilio);
		setCuil(cuil);
		setSexo(sexo);
		System.out.println(super.getDni());
		//setDni(dni);
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

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getCuil() {
		return cuil;
	}

	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo=sexo;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String toString()
	{
		String messageFormat="(Nombre %s,Apellido %s,Domicilio %s,Cuil %d,Sexo %s,";
		return String.format(messageFormat,getNombre(),getApellido(),getDomicilio(),getCuil(),getSexo())+ super.toString();
	}
	
}