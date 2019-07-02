import java.util.ArrayList;
import java.util.List;

public class MiColeccion <t extends Base>{

	List <t>list;
	
	public MiColeccion()
	{
		list=new ArrayList<>();
	}
	
	
	public Object get(int valor) throws Exception{
		Persona persona=null;
		try
		{
			for( t person : list )
			{
				if (person.getDni()==valor)
				{	
					persona=(Persona) person;
				}
			}
		}
		catch(Exception e)
		{
			throw new Exception("Hubo un inconveniente");
		}
		return persona;
	}
	
	
	void add(t obj) throws Exception
	{
	try{
			if ( get(obj.getDni())==null)
			{
				list.add(obj);
				System.out.println("Se ha agregado correctamente");
			}
			else {
				System.out.println("No se ha podido agregar");
			}
			
		}
	catch(ClassCastException c) {
		throw new Exception("El objeto que intenta ingresar no es perteneciente a ninguna clase que existe");
		}
	catch(Exception e){
		throw new Exception("El objeto que intenta ingresar es Null");
		}
	
	}
	
	
	
	boolean existe(int code) throws Exception
	{
		boolean existe=false;
		try {
		for (t obj:list)
		{
			if (obj.getCodigoUnico()==code)
			{
				existe=true;
			}
		}
		}
		catch(Exception e) {
			throw new Exception("Hubo un inconveniente en la busqueda del Codigo Unico, intente mas tarde ");
		}
		
		return existe;
	}
	
	
	boolean existeXcontraseña(String Contraseña)throws Exception
	{
		boolean existe=false;
		try {

		for (t List :list)
		{
			if (List.getContraseña().equals(Contraseña))
			{
				existe=true;
			}
		}
		}
		catch (Exception e)
		{
			throw new Exception("No existe una persona con esa contraseña");
		}
		
		return existe;
	}
	
	
	int get(String Contraseña) throws Exception
	{
		int lugar=-1;
		try {
			for (t List :list)
			{
				if (List.getContraseña().equals(Contraseña))
				{
					lugar=list.indexOf(List);
					
				}
			}
		}
		catch (Exception e)
		{
			throw new Exception("No existe una persona con esa contraseña");
		}
		
		return lugar;
	}
	
	int getXcodigo(int codo) throws Exception
	{
		int lugar=-1;
		try {
			for (t List :list)
			{
				if (List.getCodigoUnico()==codo)
				{
					lugar=list.indexOf(List);
				}
			}
		}
		catch(Exception e)
		{
			throw new Exception("No existe persona registrada con ese Codigo Unico");
		}
		
		return lugar;
	}
	
	void Listar() throws Exception
	{
		try {
		for(t List : list)
				{
				System.out.println(List.toString());
				}
			}
		catch (Exception e)
		{
			throw new Exception("Hubo un inconveniente con el listado, intente mas tarde!");
		}
	}

}
