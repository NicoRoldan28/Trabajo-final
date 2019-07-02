public class Proveedor extends Persona{
	
	public Proveedor(String nombre, String apellido, String domicilio, int cuil, String sexo, int dni,String contraseña ) 
	{
		super(nombre, apellido, domicilio, cuil, sexo, dni,contraseña);
	}
	
	public String toString()
	{
		return "\n===> PROVEEDOR " + super.toString();
	}
	
	
}
