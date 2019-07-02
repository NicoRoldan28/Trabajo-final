
public class Base {
	
	private int codigoUnico;
	private String contraseña;
	private static int CodigoCont=0;
	private int dni;
	
	public Base(String contraseña,int dni)
	{
		setCodigoUnico();
		setContraseña(contraseña);
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
	public void setContraseña(String contraseña)
	{
		this.contraseña=contraseña;
	}
	public String getContraseña()
	{
		return this.contraseña;
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
		String messageFormat="CodigoUnico %d,Dni %d,Contraseña %s)";
		return String.format(messageFormat, getCodigoUnico(),getDni(),getContraseña());
	}
}
