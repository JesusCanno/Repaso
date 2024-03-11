package MainBanco;

public class MainBanco {
	
	public static void main (String[] args) {
		Cliente cliente = new Cliente();
		cliente.crearCliente("","");
		Cuenta cuenta = new Cuenta("1234","","");
		cuenta.verCuenta();
	}

}
