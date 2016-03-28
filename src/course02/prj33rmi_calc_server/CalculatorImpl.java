package course02.prj33rmi_calc_server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import course02.prj33rmi_calc_interface.Calculator;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

	public CalculatorImpl() throws RemoteException {
		super();
	}

	public int sum(int x, int y) throws RemoteException {
		return x + y;
	}

	public int sub(int x, int y) throws RemoteException {
		return x - y;
	}
}
