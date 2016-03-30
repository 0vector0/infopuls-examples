package course02.prj31server_calc_ser;

import java.io.Serializable;

public class Calc implements Serializable {

	int oper; // Операция
	int v1; // Число 1
	int v2; // Число 2
	int result;

	public Calc(int oper, int v1, int v2) {
		super();
		this.oper = oper;
		this.v1 = v1;
		this.v2 = v2;
	}

}
