package course02.prj32rmi_server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRMIServer extends Remote

{
	public String hello() throws RemoteException;

}
