package course02.prj33rmi_calc_server;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

	public static void main(String[] args) throws RemoteException, MalformedURLException {

		CalculatorImpl helloImpl = new CalculatorImpl();

		Registry registry = LocateRegistry.createRegistry(123);

		registry.rebind("Calc", helloImpl);

		System.out.println("Server started!");

	}

}