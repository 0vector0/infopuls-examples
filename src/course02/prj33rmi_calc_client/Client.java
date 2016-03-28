package course02.prj33rmi_calc_client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import course02.prj33rmi_calc_interface.Calculator;
import course02.prj33rmi_calc_interface.Operands;

public class Client {

	public static void main(String[] args) throws NotBoundException, MalformedURLException {

		String url = "//localhost:123/Calc";

		Calculator Q;
		try {
			Q = (Calculator) Naming.lookup(url);
			System.out.println("RMI object found");

			Operands q = new Operands(20, 10);

			int x = Q.sum(q);
			int y = Q.sub(q);

			System.out.println(x);
			System.out.println(y);

		} catch (RemoteException e) {
			System.out.println("server not found");
			// e.printStackTrace();

		}

	}

}