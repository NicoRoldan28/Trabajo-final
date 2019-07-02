public class Vendedor extends Empleado {
	
	public Vendedor(String nombre, String apellido, String domicilio, int cuil, String sexo, int dni,String contraseña) 
	{
		super(nombre, apellido, domicilio, cuil, sexo, dni,contraseña);
	}
	public String toString()
	{
		return "\n===> VENDEDORRR " + super.toString();
	}
	
}