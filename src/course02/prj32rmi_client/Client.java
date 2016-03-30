package course02.prj32rmi_client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

		MyRMIServer s = (MyRMIServer) Naming.lookup("//127.0.0.1/SayHello");

		String message = s.hello();

		System.out.println(message);

	}

}
