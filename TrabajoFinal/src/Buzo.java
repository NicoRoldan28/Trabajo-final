public class Buzo extends Producto {

	public Buzo(float talle, String color, float precio, String descripcion,int cantidad, String contrase�a,int dni) {
		super(talle, color, precio, descripcion, cantidad,contrase�a,dni);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		return "Buzo"+super.toString(); 
	}
}
