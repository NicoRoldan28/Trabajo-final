public class Producto extends Base{
	
	private float talle;
	private String color;
	private float precio;
	private String descripcion;
	private int cantidad;
	
	public Producto(float talle,String color,float precio,String descripcion,int cantidad,String contraseña,int dni)
	{
		super(contraseña,dni);
		setTalle(talle);
		setColor(color);
		setPrecio(precio);
		setDescripcion(descripcion);
		setCantidad(cantidad);
	}
	
	public void setCantidad(int cantidad)
	{
		this.cantidad=cantidad;
	}
	public int getCantidad()
	{
		return cantidad;
	}
	public float getTalle() {
		return talle;
	}

	public void setTalle(float talle) {
		this.talle = talle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
	public String toString()
	{
		String messageFormat="Producto = (Talle %.2f,Id %s,Color %s,Precio %.2f,Descripcion %s,Cantidad %d)";
		return String.format(messageFormat,getTalle(),super.getCodigoUnico(),getColor(),getPrecio(),getDescripcion(),getCantidad());
	}
	
}