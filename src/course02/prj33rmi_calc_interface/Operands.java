package course02.prj33rmi_calc_interface;

import java.io.Serializable;

public class Operands implements Serializable

{

	public int x;
	public int y;

	public Operands(int v1, int v2) {

		x = v1;
		y = v2;
	}
}
