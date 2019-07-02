import java.util.ArrayList;
import java.util.List;

public class Negocio {
	
	MiColeccion <Empleado> Empleados;
	MiColeccion <Proveedor> Proveedores;
	MiColeccion <Cliente> Clientes;
	MiColeccion <Producto> Productos;
	private List <Comprobante> Comprobantes;
	MiColeccion <Producto> ProductosToProveedor;
	
	public Negocio()
	{
		Empleados=new MiColeccion<>();
		Proveedores=new MiColeccion<>();
		Clientes=new MiColeccion<>();
		Productos=new MiColeccion<>();
		Comprobantes=new ArrayList<>();
		ProductosToProveedor=new MiColeccion<>();
		
	}
	
	public List<Comprobante> getListComp()
	{
		return this.Comprobantes;
	}
	
public void Mostrarcompro()
{
	for(Comprobante asd:Comprobantes)
	{
		System.out.println(asd.toString());
	}
}
	
	
	public void add(Object obj) throws Exception
	{
		try {
		if (obj != null)
		{
			Comprobantes.add((Comprobante) obj);
		}
		}
		catch (ClassCastException c)
		{
			throw new Exception("El objeto que desea agregar no es un comprobante");
		}
		catch (Exception e)
		{
			throw new Exception("El objeto que intenta agregar es Null");
		}
	}

	
	public void listarTodo() throws Exception
	{
		try {
			for( Comprobante Comp : Comprobantes)
			{
				System.out.println(Comp.toString());
			}
		}
		catch(Exception e)
		{
			throw new Exception("Hubo un inconveniente al mostrar la lista, por favor intente mas tarde!");
		}
	}
	
	public void listar(int numero) throws Exception
	{
		try {
			for( Comprobante Comp : Comprobantes)
			{				
				if(Comp.getCodCliente()==numero)
				{
						System.out.println(Comp.toString());
				}
			}
		}
		catch(Exception e)
		{
			throw new Exception("Hubo un inconveniente al mostrar la lista, por favor intente mas tarde!");
		}
		
	}
}
