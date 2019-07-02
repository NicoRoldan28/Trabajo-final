public class Comprobante {
	
	 private int numero;
	 private static int numeroCont=0;
	 private char tipo;
	 private int codCliente;
	 
	 public Comprobante(int numero,char tipo,int codCliente)
	 {
		 setNumero(numero);
		 setTipo(tipo);
		 setCodCliente(codCliente);
		 
	 }
	 public int getCodCliente()
	 {
		 return codCliente;
	 }
	 public void setCodCliente(int numero)
	 {
		 codCliente=numero;
	 }
	public void setNumero(int numero)
	{
		this.numero=numeroCont++;
	}
	private void setCodigoUnico()
	{
		numeroCont=AutoIncrementarCodigo();
	}
	private int AutoIncrementarCodigo()
	{
		numeroCont++;
		return numeroCont;
	}
	public int getNumero()
	{
		return numero;
	}
	public void setTipo(char tipo)
	{
		this.tipo=tipo;
	}
	public char getTipo()
	{
		return tipo;
	}

	/*public String toString()
	{
		String messageFormat= "Comproprante (Numero %d,TipoDeFactura %c)";
		return String.format(messageFormat,getNumero(),getTipo());
	}
	*/
	public String toString()
	{
		String messageFormat= "Comproprante (Numero %d,TipoDeFactura %c)";
		return String.format(messageFormat,getNumero(),getTipo());
	}
}	
