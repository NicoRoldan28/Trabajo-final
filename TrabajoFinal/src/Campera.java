public class Campera extends Producto{

	public Campera(float talle, String color, float precio, String descripcion,int cantidad, String contraseņa,int dni) {
		super(talle, color, precio, descripcion, cantidad,contraseņa,dni);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		return "Campera"+super.toString(); 
	}
	
}
