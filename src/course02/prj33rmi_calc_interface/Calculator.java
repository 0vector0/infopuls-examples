package course02.prj33rmi_calc_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

	public int sum(Operands o) throws RemoteException;

	public int sub(Operands o) throws RemoteException;

}
