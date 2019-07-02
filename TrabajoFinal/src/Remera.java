public class Remera extends Producto{

	public Remera(float talle, String color, float precio, String descripcion,int cantidad, String contraseña,int dni) {
		super(talle, color, precio, descripcion,cantidad,contraseña,dni);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		return "Remera "+super.toString(); 
	}
}
