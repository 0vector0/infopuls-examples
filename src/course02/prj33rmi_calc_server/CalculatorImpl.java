package course02.prj33rmi_calc_server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import course02.prj33rmi_calc_interface.Calculator;
import course02.prj33rmi_calc_interface.Operands;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

	public CalculatorImpl() throws RemoteException {

		super();

	}

	public int sum(Operands o) throws RemoteException {

		return o.x + o.y;

	}

	public int sub(Operands o) throws RemoteException {

		return o.x - o.y;
	}

}
