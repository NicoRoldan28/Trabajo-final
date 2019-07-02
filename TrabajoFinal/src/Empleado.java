
public class Empleado extends Persona {
	
	private float salario=25000;
	public Empleado(String nombre, String apellido, String domicilio, int cuil, String sexo, int dni,String contraseña) 
	{
		super(nombre, apellido, domicilio, cuil, sexo, dni,contraseña);
	}
	public String toString()
	{
		return ""+super.toString();
		
	}
}
