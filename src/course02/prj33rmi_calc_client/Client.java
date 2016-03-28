package course02.prj33rmi_calc_client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import course02.prj33rmi_calc_interface.Calculator;

public class Client {

	public static void main(String[] args) throws NotBoundException, RemoteException, MalformedURLException {

		String url = "//localhost:123/Calc";

		Calculator Q = (Calculator) Naming.lookup(url);

		System.out.println("RMI object found");

		int x = Q.sum(10, 20);

		int y = Q.sub(10, 4);

		System.out.println(x);

		System.out.println(y);

	}

}