
public class Cliente extends Persona {
	
	public Cliente(String nombre, String apellido, String domicilio, int cuil, String sexo, int dni,String contraseña) {
		super(nombre, apellido, domicilio, cuil, sexo, dni,contraseña);
	}
	
	public String toString()
	{
		return "\n===> CLIENTEEEE " + super.toString();
	}
	
	
}
