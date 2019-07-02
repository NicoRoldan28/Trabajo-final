
public class Base {
	
	private int codigoUnico;
	private String contrase�a;
	private static int CodigoCont=0;
	private int dni;
	
	public Base(String contrase�a,int dni)
	{
		setCodigoUnico();
		setContrase�a(contrase�a);
		setDni(dni);		
	}
	
	public void setDni(int dni)
	{
		this.dni=dni;
	}
	public int getDni()
	{
		return dni;
	}
	public void setContrase�a(String contrase�a)
	{
		this.contrase�a=contrase�a;
	}
	public String getContrase�a()
	{
		return this.contrase�a;
	}
	public int AutoIncrementarCodigo()
	{
		CodigoCont++;
		return CodigoCont;
	}
	private void setCodigoUnico()
	{
		codigoUnico=AutoIncrementarCodigo();
	}
	public int getCodigoUnico()
	{
		return this.codigoUnico;
	}
	public String toString()
	{
		String messageFormat="CodigoUnico %d,Dni %d,Contrase�a %s)";
		return String.format(messageFormat, getCodigoUnico(),getDni(),getContrase�a());
	}
}
