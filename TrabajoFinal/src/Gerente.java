public class Gerente extends Empleado{
	
	public Gerente(String nombre, String apellido, String domicilio, int cuil, String sexo, int dni,String contrase�a) 
	{
		super(nombre, apellido, domicilio, cuil, sexo, dni,contrase�a);
	}
	
	public String toString()
	{
		return "\n===> GERENTEEE " + super.toString();
	}
	
}
