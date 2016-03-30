package course02.prj31server_calc_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket server = null;
	private Socket sock = null;
	private PrintWriter out = null;
	private BufferedReader in = null;

	// запустить сервер
	public void start(int port) throws IOException {
		server = new ServerSocket(port);
		while (true) {
			// Принимаем соединение от нового клиента
			sock = server.accept();
			// Получаем потоки ввода-вывода
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out = new PrintWriter(sock.getOutputStream(), true);
			// Пока соединение активно, обрабатываем запросы
			while (processQuery())
				;
		}
	}

	// обработка запроса

	private boolean processQuery()

	{
		int result = 0; // Результат операции
		int comp_code = 0; // Код завершения
		try {
			// Получаю запрос от клиента
			String query = in.readLine();
			if (query == null)
				return false;
			// Разбиваю строку на поля, разделенные через $

			String[] fields = query.split("#");
			if (fields.length != 3) {
				comp_code = 1; // неверное количество параметров
			} else {
				try {
					int oper = Integer.valueOf(fields[0]);
					int v1 = Integer.valueOf(fields[1]);
					int v2 = Integer.valueOf(fields[2]);

					// int result = 0; // Результат операции
					switch (oper) {
					case 0:
						result = v1 + v2;
						// return true;
						break;
					case 1:
						result = v1 - v2;
						// return true;
						break;
					case 2:
						result = v1 * v2;
						// return true;
						break;
					case 3: {
						if (v2 != 0) {
							result = v1 / v2;
						} else {
							comp_code = 4;
						}
						break;
					}
					default:
						comp_code = 3;
						break;
					}
					// return true;
				} catch (NumberFormatException e) {
					comp_code = 3; // неверный тип параметров
				}
			}

			// Формирую ответ
			String response = comp_code + "#" + result;
			// Отправвляю клиенту
			out.println(response);
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	// главный метод
	public static void main(String[] args) {
		try {
			Server srv = new Server();
			srv.start(12345);
		} catch (IOException e) {
			System.out.println("Возникла ошибка");
		}
	}
}
