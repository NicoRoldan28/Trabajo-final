public class Vendedor extends Empleado {
	
	public Vendedor(String nombre, String apellido, String domicilio, int cuil, String sexo, int dni,String contrase�a) 
	{
		super(nombre, apellido, domicilio, cuil, sexo, dni,contrase�a);
	}
	public String toString()
	{
		return "\n===> VENDEDORRR " + super.toString();
	}
	
}