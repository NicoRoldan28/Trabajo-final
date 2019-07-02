public class ItemProducto {
	
	private int IdProducto;
	private int cantidad;
	private float PrecioHistorico;
	public ItemProducto(int idProducto,int cantidad,float precioHistorico)
	{
		setIdProducto(idProducto);
		setCantidad(cantidad);
		setPrecioHistorico(precioHistorico);
	}
	
	
	public int getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(int idProducto) {
		IdProducto = idProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecioHistorico() {
		return PrecioHistorico;
	}
	public void setPrecioHistorico(float precioHistorico) {
		PrecioHistorico = precioHistorico;
	}
	
	public String toString()
	{
		String messageFormat="ItemDelProducto (Id %d,Cantidad %d,PrecioHistorico %f)";
		return String.format(messageFormat,getIdProducto(),getCantidad(),getPrecioHistorico());
	}
	
}
