package course02.prj31server_calc_ser;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientObj {

	private Socket sock = null;
	private ObjectOutputStream out = null;
	private ObjectInputStream in = null;

	// конструктор
	public ClientObj(String ip, int port) throws IOException {
		// Устанавливаем соединение
		sock = new Socket(ip, port);
		// Получаем потоки ввода-вывода
		in = new ObjectInputStream(sock.getInputStream());
		out = new ObjectOutputStream(sock.getOutputStream());
	}

	// отправить запрос серверу и получить ответ

	private int sendQuery(int operation, int value1, int value2) throws IOException

	{
		Calc calc = new Calc(operation, value1, value2);
		// отправляю запрос
		out.writeObject(calc);

		// получаю ответ
		Calc resCalc = null;
		try {
			resCalc = (Calc) in.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resCalc.result;
	}

	// посчитать сумму чисел
	public int sum(int value1, int value2) throws IOException

	{
		return sendQuery(0, value1, value2);
	}

	// посчитать разность чисел
	public int sub(int value1, int value2) throws IOException

	{
		return sendQuery(1, value1, value2);
	}

	public int multiplication(int value1, int value2) throws IOException

	{
		return sendQuery(2, value1, value2);
	}

	public int division(int value1, int value2) throws IOException

	{
		return sendQuery(3, value1, value2);
	}

	// отсоединиться
	public void disconnect() throws IOException {
		sock.close();
	}

	// главный метод
	public static void main(String[] args) {
		try {
			ClientObj client = new ClientObj("localhost", 12345);
			int a = client.sum(15, 20);
			int b = client.sub(30, 38);
			int c = client.sum(100, 200);
			int d = client.multiplication(100, 200);
			int e = client.division(200, 50);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			client.disconnect();
		} catch (IOException e) {
			System.out.println("Возникла ошибка");
		}
	}
}