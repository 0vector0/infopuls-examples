package course02.prj30socket;

//: c15:WhoAmI.java
//Нахождение вашего сетевого адреса, когда
//вы соединены с Internet'ом.
//{Запускается руками} Должно быть установлено соединение с Internet
//{Args: www.google.com}
import java.net.InetAddress;

public class WhoAmI {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.err.println("Usage: WhoAmI MachineName");
			System.exit(1);
		}
		InetAddress a = InetAddress.getByName(args[0]);
		System.out.println(a);
	}
} // /:~
