public class Pantalon extends Producto{

	public Pantalon(float talle, String color, float precio, String descripcion,int cantidad, String contraseņa,int dni) {
		super(talle, color, precio, descripcion,cantidad, contraseņa,dni);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		return "Pantalon"+super.toString(); 
	}
	
	
}
