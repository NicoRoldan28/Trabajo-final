public class Gerente extends Empleado{
	
	public Gerente(String nombre, String apellido, String domicilio, int cuil, String sexo, int dni,String contraseņa) 
	{
		super(nombre, apellido, domicilio, cuil, sexo, dni,contraseņa);
	}
	
	public String toString()
	{
		return "\n===> GERENTEEE " + super.toString();
	}
	
}
