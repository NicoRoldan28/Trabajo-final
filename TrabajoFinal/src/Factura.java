public class Factura extends Comprobante{

	private float Total;
	private ItemProducto item;
	private Cliente cliente;
	private String descripcion;
	private static int numero;
	private static char tipo;
	
	public Factura(ItemProducto item,Cliente cliente,String descripcion)
	{
		super(numero,tipo,cliente.getCodigoUnico());
		//setTotal(total);
		setItem(item);
		setCliente(cliente);
		setDescripcion(descripcion);
	}

	public float getTotal() {
		return Total;
	}

	public void setTotal(float total) {
		Total = total;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	public void listarXcliente(Cliente cliente)
	{
		if(Factura.this.getCliente()==cliente)
				{
				
				}
	}
	public String toString()
	{
		String messageFormat="Factura ("+super.toString()+""+getCliente()+"Total %.2f,"+item.toString()+ "Descripcion %s)";
		return String.format(messageFormat, calcularTotal(),getDescripcion())+super.toString();
	}
	
}