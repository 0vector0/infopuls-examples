package course02.prj31server_calc_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	private Socket sock = null;

	private PrintWriter out = null;

	private BufferedReader in = null;

	// конструктор

	public Client(String ip, int port) throws IOException

	{
		// Устанавливаем соединение
		sock = new Socket(ip, port);

		// Получаем потоки ввода-вывода
		in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		out = new PrintWriter(sock.getOutputStream(), true);
	}

	// отправить запрос серверу и получить ответ
	private int sendQuery(int operation, int value1, int value2) throws IOException {

		// формирую запрос
		String query = operation + "#" + value1 + "#" + value2;
		// отправляю запрос
		out.println(query);
		// получаю ответ
		String response = in.readLine();
		String[] fields = response.split("#");
		if (fields.length != 2)
			throw new IOException("Invalid response from server");
		try {
			// Код завершения
			int comp_code = Integer.valueOf(fields[0]);

			// Результат операции
			int result = Integer.valueOf(fields[1]);
			if (comp_code == 0)
				return result;

			else

				throw new IOException(

						"Error while processing query");

		}

		catch (NumberFormatException e)

		{

			throw new IOException("Invalid response from server");

		}

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
	public void disconnect() throws IOException

	{
		sock.close();
	}

	// главный метод
	public static void main(String[] args) {

		try {
			Client client = new Client("localhost", 12345);
			// int a = client.sum(15, 20);
			// int b = client.sub(30, 38);
			// int c = client.sum(10, 20);
			// System.out.println(a);
			// System.out.println(b);
			// System.out.println(c);

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

		}

		catch (IOException e)

		{
			System.out.println("Возникла ошибка");
			e.printStackTrace();
		}
	}
}
