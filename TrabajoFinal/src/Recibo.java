public class Recibo extends Comprobante{
	
	private Proveedor proveedor;
	private float total;
	private String descripcion;
	private int cod;
	private ItemProducto item;	
	private static int numero;
	private static char tipo;
	
	public Recibo(String descripcion,int cod,ItemProducto item)
	{
		super(numero,tipo,cod);
		setProveedor(proveedor);
		setTotal(total);
		setDescripcion(descripcion);
		setItem(item);
	}
	
	
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ItemProducto getItem() {
		return item;
	}
	public void setItem(ItemProducto item) {
		this.item = item;
	}
	public float calcularTotal()
	{
		float total=0;
		total+=item.getPrecioHistorico()*item.getCantidad();
		return total;
	}
	
	public String toString()
	{
		String messageFormat="Recibo ("+super.toString()+"Total %2.f,"+item.toString()+ "Descripcion %s)";
		return String.format(messageFormat, calcularTotal(),getDescripcion());
	}
}