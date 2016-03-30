package course02.prj31server_calc_ser;

import java.util.Formatter;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Formatter formatter = new Formatter(Locale.ROOT);
		formatter.format("%.2E\n", 100.0 / 3.0); // 1
		formatter.format("%.2f", 100.0 / 3.0); // 2
		System.out.println(formatter);

		Boolean bool = new Boolean(false);
	}
}
