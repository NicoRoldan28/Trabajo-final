public class Vendedor extends Empleado {
	
	public Vendedor(String nombre, String apellido, String domicilio, int cuil, String sexo, int dni,String contraseņa) 
	{
		super(nombre, apellido, domicilio, cuil, sexo, dni,contraseņa);
	}
	public String toString()
	{
		return "\n===> VENDEDORRR " + super.toString();
	}
	
}