package course02.prj31server_calc_ser;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerObj {

	private ServerSocket server = null;
	private Socket sock = null;
	private ObjectOutputStream out = null;
	private ObjectInputStream in = null;

	// запустить сервер
	public void start(int port) throws IOException {
		server = new ServerSocket(port);
		while (true) {
			// Принимаем соединение от нового клиента
			sock = server.accept();
			// Получаем потоки ввода-вывода
			in = new ObjectInputStream(sock.getInputStream());
			out = new ObjectOutputStream(sock.getOutputStream());
			// Пока соединение активно, обрабатываем запросы
			while (processQuery()) {
			}
		}
	}

	// обработка запроса
	private boolean processQuery() {
		try {
			// Получаю запрос от клиента
			Calc calc = null;
			try {
				calc = (Calc) in.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			int oper = calc.oper; // Операция
			int v1 = calc.v1; // Число 1
			int v2 = calc.v2; // Число 2

			// Считаю результат
			// int result = 0; // Результат операции
			switch (oper) {
			case 0:
				calc.result = v1 + v2;
				break;
			case 1:
				calc.result = v1 - v2;
				break;
			case 2:
				calc.result = v1 * v2;
				break;
			case 3: {
				if (v2 != 0) {
					calc.result = v1 / v2;
				}
				break;
			}
			default:
				break;
			}
			// result = (oper == 0) ? (v1 + v2) : (v1 - v2);
			// Отправляю результат клиенту
			out.writeObject(calc);
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	// главный метод
	public static void main(String[] args) {
		try {
			ServerObj srv = new ServerObj();
			srv.start(12345);
		} catch (IOException e) {
			System.out.println("Возникла ошибка");
		}
	}
}