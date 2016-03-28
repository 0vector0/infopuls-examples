package course02.prj33rmi_calc_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

	public int sum(int x, int y) throws RemoteException;

	public int sub(int x, int y) throws RemoteException;

}
