
public class Empleado extends Persona {
	
	private float salario=25000;
	public Empleado(String nombre, String apellido, String domicilio, int cuil, String sexo, int dni,String contraseņa) 
	{
		super(nombre, apellido, domicilio, cuil, sexo, dni,contraseņa);
	}
	public String toString()
	{
		return ""+super.toString();
		
	}
}
