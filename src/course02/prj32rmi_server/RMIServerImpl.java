package course02.prj32rmi_server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIServerImpl extends UnicastRemoteObject implements MyRMIServer {

	public RMIServerImpl() throws RemoteException {
	}

	public String hello() throws RemoteException {
		return "Hello from server!";
	}

}
