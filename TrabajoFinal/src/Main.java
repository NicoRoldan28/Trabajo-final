import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		utilPractice util=new utilPractice();
		String inicialMessage= "\"=============================================================\n";
		inicialMessage += "========= BIENVENIDO A NUESTRA TIENDA DE ROPA ONLINE =========\n";
		inicialMessage += "==============================================================\n";
		String principalMenu = "\n\n=> MENU PRINCIPAL \n1.MENU ADMINISTRACION \n2.MENU USUARIO \n0.SALIR";
		String secondMenu="\n=> MENU ADMINISTRADOR \n1.INGRESAR COMO EMPLEADO \n2.REGISTRARSE \n0.SALIR";
		String lastExMenu="\n=> MENU USUARIO \n1.INGRESAR COMO CLIENTE \n2.INGRESAR COMO PROVEEDOR \n3.REGISTRARSE \n0.SALIR";
		
		
		String cont= "s";
		int principalSelect=0;
		int secondSelect=0;
		Scanner scanner =new Scanner(System.in);
		System.out.println(inicialMessage);
		System.out.print("Seleccione: ");
		
		while(cont.equals("s")||cont.equals("S"))
		{
			System.out.println(principalMenu);
			principalSelect =scanner.nextInt();
			if (principalSelect ==1)
			{
			System.out.println(secondMenu);
			secondSelect= scanner.nextInt();
			switch(secondSelect)
			{
			case (1):
				util.ingresoEmpleado();
				//System.out.println("Ingresamos Menu empleado");
				break;
			case (2):
				util.registroEmpleado();
				//System.out.println("Nos registramos");
				break;
			case(0):
				System.out.println("Salimos");
				break;
			}
			}
			else if(principalSelect ==2)
			{
				System.out.println(lastExMenu);
				secondSelect=scanner.nextInt();
				switch(secondSelect)
				{
				case (1):
					util.ingresoCliente();
					//System.out.println("Ingresamos como cliente");
					break;
				case (2):
					util.ingresoProveedor();
					//System.out.println("Ingresamos como proveedor");
					break;
				case(3):
					util.registroUsuario();
					//System.out.println("Nos registramos");
					break;
				case(0):
					System.out.println("Salimos");
				break;
				
				}
			}
			else if(principalSelect ==0)
			{
				System.out.println("\nNi no vimo prro");
				cont= "no";
			}
		}
	}
	
	catch (Exception e)
	{
		System.out.println("\n\t=====>HUBO UN ERROR!!!\n"+ e.getMessage());
	}
}
}