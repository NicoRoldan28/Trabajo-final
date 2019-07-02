import java.util.Scanner;

public class utilPractice {
	Negocio negocio=new Negocio();
	
	//private Scanner scanner;
	public void ingresoEmpleado()
	{
		try {
		
		Scanner scanner=new Scanner(System.in);
		

		
		System.out.println("Ingrese contraseña");
		String contra=scanner.next();
		int lugar=-1;
		int i=0;
	
		lugar=negocio.Empleados.get(contra);
		if ((negocio.Empleados.existeXcontraseña(contra)==true)&&(lugar>=0))
		{
	
			negocio.Empleados.list.get(lugar);
			
			System.out.println("Ingresamos como empleado");
			String principalMenu = "\n\n=> MENU EMPLEADO\n1.VER PERFIL\n2.MODIFICAR DATOS\n3.VER MERCADERIA \n4.COMPRAR MERCADERIA \n0.SALIR";
			String cont= "s";
			int secondSelect=0;
			System.out.println(principalMenu);
			System.out.print("Seleccione: ");
			
			while(cont.equals("s")||cont.equals("S"))
			{
				secondSelect= scanner.nextInt();
				switch(secondSelect)
				{
				case (1):
					System.out.println(negocio.Empleados.list.get(lugar).toString());
					System.out.println("Vemos nuestros datos");
					
				System.out.println(principalMenu);
					break;
				case (2):
					System.out.println("\n\n=> MENU DE MODIFICACION\n1.DOMICILIO\n2.CONTRASEÑA\n");
					i=scanner.nextInt();
					if(i==1)
					{
						System.out.println("Ingrese el nuevo domicilio");
						String domicilio=scanner.next();
						negocio.Empleados.list.get(lugar).setDomicilio(domicilio);
					}
					else if(i==2)
					{
						System.out.println("Ingrese la nueva contraseña");
						String contraseña=scanner.next();
						negocio.Empleados.list.get(lugar).setContraseña(contraseña);
					}
					System.out.println("Modificamos nuestra informacion");
				System.out.println(principalMenu);
					break;
				case (3):
					System.out.println("Vemos mercaderia");
				negocio.Productos.Listar();
				System.out.println(principalMenu);
				break;
				
				case(4):
					if(negocio.Empleados.list.get(lugar).getClass()== Gerente.class)
					{
						System.out.println("podes comprar");
						System.out.println("Entramos en el proceso para la compra de la mercaderia");
						System.out.println("Vemos toda la mercaderia disponible para comprar independientemente del proveedor");
						System.out.println("\n");
						negocio.ProductosToProveedor.Listar();
						System.out.println("\n");
						
						System.out.println("ingrese el id de la mercaderia que quiere comprar");
						int id=scanner.nextInt();
						if (negocio.ProductosToProveedor.existe(id)==true)
						{
							int lugar3=negocio.ProductosToProveedor.getXcodigo(id);
							System.out.println("Ingrese la cantidad de mercaderia que quiere del producto");
							int cant=scanner.nextInt();
							if(negocio.ProductosToProveedor.list.get(lugar3).getCantidad()>=cant)
							{
								System.out.println("ahora si podemos comprar");
								System.out.println("creamos el recibo");
								ItemProducto item=new ItemProducto(id,cant,negocio.ProductosToProveedor.list.get(lugar3).getPrecio());
								
								Recibo recibo=new Recibo("compra",negocio.Empleados.list.get(lugar).getCodigoUnico(),item);
								//System.out.println(recibo.toString());
								System.out.println("\n");
								System.out.println("\n");
								
								//negocio.Comprobantes.add(recibo);
								negocio.Productos.list.add(negocio.ProductosToProveedor.list.get(lugar3));
								//negocio.Productos.add(negocio.ProductosToProveedor.list.get(lugar3));
								//negocio.ProductosToProveedor.list.get(lugar3).setCantidad(cant);
								negocio.ProductosToProveedor.list.get(lugar3).setCantidad(negocio.ProductosToProveedor.list.get(lugar3).getCantidad()-cant);
								
								
								System.out.println("ahora si compramos");
							}
							else
							{
								System.out.println("no hay la cantidad de stock necesario para cubrir nuestra demanda");
							}
						}
						else
						{
							System.out.println("no hay un producto con ese id");
						}
					}
					else
					{
						System.out.println("solo la clase gerente puede comprar");
					}
				System.out.println("\n");
				
				System.out.println(principalMenu);
					break;
				case(0):
					System.out.println("Salimos");
					cont="n";
				break;
				default:
					System.out.println("Apretaste cualquiera, volves para atras!");
					cont = "S";
                break;
				}
			}
		}

		else
		{
			System.out.println("la contraseña no corresponde con un empleado registrado");
		}
	
		}
		catch (Exception e)
		{
			System.out.println("Hubo un error\n"+e.getMessage());
		}
	}
	
	public void registroEmpleado()
	{
		
		try
		{
		String nombre;
		String apellido;
		String domicilio;
		String contraseña;
		int Cuil;
		int Dni;
		String Sexo;
		
		Scanner scanner=new Scanner(System.in);
		String principalMenu = "\n\n=> MENU REGISTRO\n1.REGISTRO CAJERO\n2.REGISTRO VENDEDOR \n3.REGISTRO ENCARGADO \n0.SALIR";
		String cont= "s";
		int secondSelect=0;
		System.out.println(principalMenu);
		System.out.print("Seleccione: ");
		
		while(cont.equals("s")||cont.equals("S"))
		{
			secondSelect= scanner.nextInt();
			switch(secondSelect)
			{
			case 1:
				
				System.out.println("Ingrese el nombre");
				nombre=scanner.next();
				System.out.println("Ingrese el apellido");
				apellido=scanner.next();
				System.out.println("Ingrese la contraseña");
				contraseña=scanner.next();
				System.out.println("Ingrese el domicilio");
				domicilio=scanner.next();
				System.out.println("Ingrese el cuil");
				Cuil=scanner.nextInt();
				System.out.println("Ingrese el Dni");
				Dni=scanner.nextInt();
				System.out.println("Ingrese el sexo");
				Sexo=scanner.next();
				
				Cajero cajero=new Cajero(nombre,apellido,domicilio,Cuil,Sexo,Dni,contraseña);

				negocio.Empleados.add(cajero);
				System.out.println(principalMenu);
				break;
				
			case 2:
				/*
				System.out.println("Ingrese el nombre");
				nombre=scanner.next();
				System.out.println("Ingrese el apellido");
				apellido=scanner.next();
				System.out.println("Ingrese la contraseña");
				contraseña=scanner.next();
				System.out.println("Ingrese el domicilio");
				domicilio=scanner.next();
				System.out.println("Ingrese el cuil");
				Cuil=scanner.nextInt();
				System.out.println("Ingrese el Dni");
				Dni=scanner.nextInt();
				System.out.println("Ingrese el sexo");
				Sexo=scanner.next();
				*/
				Vendedor vendedor=new Vendedor("alan","jimenez","mosconi",1534,"m",1214,"123");		
				System.out.println(principalMenu);
				negocio.Empleados.add(vendedor);
				break;
				
				
			case(3):
				/*
				System.out.println("Ingrese el nombre");
				nombre=scanner.next();
				System.out.println("Ingrese el apellido");
				apellido=scanner.next();
				System.out.println("Ingrese la contraseña");
				contraseña=scanner.next();
				System.out.println("Ingrese el domicilio");
				domicilio=scanner.next();
				System.out.println("Ingrese el cuil");
				Cuil=scanner.nextInt();
				System.out.println("Ingrese el Dni");
				Dni=scanner.nextInt();
				System.out.println("Ingrese el sexo");
				Sexo=scanner.next();
				*/
				
				Gerente gerente =new Gerente("nico","roldan","aguado",1234,"m",1234,"1234");
				negocio.Empleados.add(gerente);
				System.out.println(principalMenu);
				
				break;
			case(0):
				System.out.println("Salimos");
				cont="n";
			break;
			default:
                System.out.println("Apretaste cualquiera, volves para atras!");
                cont = "S";
            break;
			}
		}
		}
		catch(Exception e)
		{
			System.out.println("Hubo un error \n"+e.getMessage());	
		}
		
	}
	public void ingresoCliente()
	{
		try {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese contraseña");
		String contra=scanner.next();
		int lugar=-1;
		int lugar2=-1;
		int i=0;
		
		lugar=negocio.Clientes.get(contra);
		if((negocio.Clientes.existeXcontraseña(contra)==true)&&(lugar>=0))
		{
			System.out.println("Ingresamos como cliente");
			String principalMenu = "\n\n=> MENU CLIENTE\n1.VER PERFIL\n2.MODIFICAR DATOS \n3.VER PRODUCTOS \n4.COMPRAR PRODUCTOS \n5.VER COMPROBANTES\n0.SALIR";
			String cont= "s";
			int secondSelect=0;
			System.out.println(principalMenu);
			System.out.print("Seleccione: ");
			
			while(cont.equals("s")||cont.equals("S"))
			{
				secondSelect= scanner.nextInt();
				switch(secondSelect)
				{
				
				case (1):
					
					System.out.println(negocio.Clientes.list.get(lugar).toString());
					System.out.println("Vemos nuestros datos");
				System.out.println(principalMenu);
				
					break;
					
				case (2):
					
					System.out.println("\n\n=> MENU DE MODIFICACION\n1.DOMICILIO\n2.CONTRASEÑA\n");
					i=scanner.nextInt();
					if(i==1)
					{
					System.out.println("Ingrese el nuevo domicilio");
					String domicilio=scanner.next();
					negocio.Clientes.list.get(lugar).setDomicilio(domicilio);
					}
					else if(i==2)
					{
					System.out.println("Ingrese la nueva contraseña");
					String contraseña=scanner.next();
					negocio.Clientes.list.get(lugar).setContraseña(contraseña);
					}
					System.out.println("Modificamos nuestra informacion");
				System.out.println(principalMenu);
				
					break;
				
				case(3):
					System.out.println("Vemos productos");
					negocio.Productos.Listar();
				System.out.println(principalMenu);
					break;
					
					
				case(4):
						
					System.out.println("Compramos productos");
					System.out.println("Ingrese el id del producto que quiere comprar");
					int f=scanner.nextInt();
					if(negocio.Productos.existe(f)==true)
					{
						System.out.println("Existe el id y entramos");
						System.out.println("Ingrese la cantidad de stock que quiere del producto");
						int cant=scanner.nextInt();
						lugar2=negocio.Productos.getXcodigo(f);
						if(negocio.Productos.list.get(lugar2).getCantidad()>=cant)
						{
						ItemProducto item=new ItemProducto(lugar2,cant,negocio.Productos.list.get(lugar2).getPrecio());
						System.out.println("hacemos la factura para el cliente");
						Factura fact=new Factura(item,negocio.Clientes.list.get(lugar),"compra");
						System.out.println("vemos factura");
						System.out.println(fact.toString());
						negocio.Comprobantes.add(fact);
						negocio.Productos.list.get(lugar2).setCantidad(negocio.Productos.list.get(lugar2).getCantidad()-cant);
						System.out.println("ahora si compramos productos");
						}
						else
						{
							System.out.println("no hay stock de ese producto");
						}
					}
					else
					{
						System.out.println("no existe el id del producto");
					}
					
					System.out.println(principalMenu);
				
				
				
				
				
					break;
				case(5):
					System.out.println("Vemos nuestros comprobantes");
					System.out.println("id nuestro"+negocio.Clientes.list.get(lugar).getCodigoUnico());
					System.out.println("mostramos nuestras facturas");
					negocio.listar(negocio.Clientes.list.get(lugar).getCodigoUnico());
					

				System.out.println(principalMenu);
					break;
				case(0):
					System.out.println("Salimos");
					cont="n";
				break;
				default:
					System.out.println("Apretaste cualquiera, volves para atras!");
					cont = "S";
                break;
				}
			}
		}
		else
		{
			System.out.println("No existe un Usuario con esa contraseña");
		}
		}
		catch (Exception e)
		{
			System.out.println("Hubo un problema \n"+ e.getMessage());
		}
	}
	
	
	public void ingresoProveedor()
	{
		try
		{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese contraseña");
		String contra=scanner.next();
		int lugar=-1;
		int i=0;
		
		lugar=negocio.Proveedores.get(contra);
		//System.out.println(" lugar contraseña prov"+ lugar);
		//System.out.println(" contraseña prov"+ contra);
		if((negocio.Proveedores.existeXcontraseña(contra)==true)&&(lugar>=0))
		{
			Buzo buzo2=new Buzo(1.2f,"marron",800.f,"descripcion",12,"0",0);
			Campera campera2=new Campera(1.2f,"negra",2300.f,"descripcion",31,"0",0);
			Remera remera2=new Remera(1.2f,"roja",450.f,"descripcion",23,"0",0);
			Pantalon pantalon2=new Pantalon(1.2f,"azul",2550.f,"descripcion",15,"0",0);

			Buzo buzo3=new Buzo(1.2f,"marron",800.f,"descripcion",50,"0",0);
			Campera campera3=new Campera(1.2f,"negra",2300.f,"descripcion",25,"0",0);
			Remera remera3=new Remera(1.2f,"roja",450.f,"descripcion",41,"0",0);
			Pantalon pantalon3=new Pantalon(4.1f,"blanco",2550.f,"descripcion",20,"0",0);
			System.out.println("Ingresamos como proveedor");
			String principalMenu = "\n\n=> MENU PROVEEDOR\n1.VER PERFIL\n2.MODIFICAR DATOS \n3.INGRESAR MERCADERIA\n4.VER MERCADERIA\n0.SALIR";
			String cont= "s";
			int secondSelect=0;
			System.out.println(principalMenu);
			System.out.print("Seleccione: ");
			
			while(cont.equals("s")||cont.equals("S"))
			{
				secondSelect= scanner.nextInt();
				switch(secondSelect)
				{
				
				case (1):	
					System.out.println(negocio.Proveedores.list.get(lugar).toString());
					System.out.println("Vemos nuestros datos");
				System.out.println(principalMenu);
					break;
					
				case (2):
					
				System.out.println("\\n\\n=> MENU DE MODIFICACION\\n1.DOMICILIO\\n2.CONTRASEÑA\\n");
				i=scanner.nextInt();
				if(i==1)
				{
				System.out.println("Ingrese el nuevo domicilio");
				String domicilio=scanner.next();
				negocio.Proveedores.list.get(lugar).setDomicilio(domicilio);
				}
				else if(i==2)
				{
				System.out.println("Ingrese la nueva contraseña");
				String contraseña=scanner.next();
				negocio.Clientes.list.get(lugar).setContraseña(contraseña);
				}
				System.out.println(principalMenu);
				break;
				case (3):
					System.out.println("\n\n=> MENU DE AGREGAR MERCADERIA\n1.PANTALON\n2.REMERA\n3.BUSO\n4.CAMPERA\n");
				i=scanner.nextInt();
				if(i==1)
				{
					Pantalon pantalon=new Pantalon(1.2f,"azul",2550.f,"descripcion",1,"0",0);
					//negocio.Productos.list.add(pantalon);
					negocio.ProductosToProveedor.list.add(pantalon);
					//negocio.ProductosToProveedor.add(pantalon);
					System.out.println("Agregamos pantalon");
				}
				else if(i==2)
				{
					Remera remera=new Remera(1.2f,"roja",450.f,"descripcion",5,"0",0);
					//gocio.ProductosToProveedor.add(remera);
					negocio.ProductosToProveedor.list.add(remera);
					//negocio.Productos.list.add(remera);
					System.out.println("Agregamos remera");
				}
				else if(i==3)
				{
					Buzo buzo=new Buzo(1.2f,"marron",800.f,"descripcion",4,"0",0);
					//negocio.ProductosToProveedor.add(buzo);
					negocio.ProductosToProveedor.list.add(buzo);
					//negocio.Productos.list.add(buzo);
					System.out.println("Agregamos buzo");
				}
				else if (i==4)
				{
					Campera campera=new Campera(1.2f,"negra",2300.f,"descripcion",2,"0",0);
					//negocio.Productos.list.add(campera);
					negocio.ProductosToProveedor.list.add(campera);
					//negocio.ProductosToProveedor.add(campera);
					System.out.println("Agregamos campera");
				}
				System.out.println(principalMenu);
				break;
				case (4):
					negocio.ProductosToProveedor.Listar();
				System.out.println(principalMenu);
				break;
				
				case(0):
					System.out.println("Salimos");
					cont="n";
				break;
				default:
					System.out.println("Apretaste cualquiera, volves para atras!");
					cont = "S";
                break;
				}
			}
		}
		else
		{
			System.out.println("No existe un proveedor con esa contraseña");
		}
		}
		catch(Exception e)
		{
			System.out.println("Hubo un error\n"+e.getMessage());	
		}
		
	}
	public void registroUsuario()
	{
		try {
		Scanner scanner=new Scanner(System.in);
		//Negocio negocio=new Negocio();
		String nombre;
		String apellido;
		String domicilio;
		int Cuil;
		int Dni;
		String Sexo;
		String contraseña;
		
		String principalMenu = "\n\n=> MENU REGISTRO\n1.REGISTRO CLIENTE\n2.REGISTRO PROVEEDOR\n0.SALIR";
		String cont= "s";
		int secondSelect=0;
		System.out.println(principalMenu);
		System.out.print("Seleccione: ");
		
		while(cont.equals("s")||cont.equals("S"))
		{
			secondSelect= scanner.nextInt();
			switch(secondSelect)
			{
			case (1):
				
				System.out.println("Registro cliente\n");
			/*
			System.out.println("Ingrese el nombre");
			nombre=scanner.next();
			System.out.println("Ingrese el apellido");
			apellido=scanner.next();
			System.out.println("Ingrese la contraseña");
			contraseña=scanner.next();
			System.out.println("Ingrese el domicilio");
			domicilio=scanner.next();
			System.out.println("Ingrese el cuil");
			Cuil=scanner.nextInt();
			System.out.println("Ingrese el Dni");
			Dni=scanner.nextInt();
			System.out.println("Ingrese el sexo");
			Sexo=scanner.next();
			*/
			System.out.println("Nos registramos como cliente");
			Cliente cliente=new Cliente("alejo","suarez","marcone",1234,"m",5234,"12");
			negocio.Clientes.add(cliente);
			System.out.println(principalMenu);
			
				break;
				
			case (2):
				
				System.out.println("Registro Proveedor\n");
			/*
			System.out.println("Ingrese el nombre");
			nombre=scanner.next();
			System.out.println("Ingrese el apellido");
			apellido=scanner.next();
			System.out.println("Ingrese la contraseña");
			contraseña=scanner.next();
			System.out.println("Ingrese el domicilio");
			domicilio=scanner.next();
			System.out.println("Ingrese el cuil");
			Cuil=scanner.nextInt();
			System.out.println("Ingrese el Dni");
			Dni=scanner.nextInt();
			System.out.println("Ingrese el sexo");
			Sexo=scanner.next();
			*/
			
			  Proveedor proveedor=new Proveedor("susana","martinez","dsadsa",1234,"m",1634,"7");
				//System.out.println("Nos registramos como proveedor");
				negocio.Proveedores.add(proveedor);
			System.out.println(principalMenu);
			
				break;
			case(0):
				System.out.println("Salimos");
				cont="n";
			break;
			default:
                System.out.println("Apretaste cualquiera, volves para atras!");
                cont = "S";
            break;
			}
		}
		}
		catch(Exception e)
		{
			System.out.println("Hubo un error \n"+e.getMessage());
		}
		
	}
}
