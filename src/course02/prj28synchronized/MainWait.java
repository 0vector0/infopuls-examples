package course02.prj28synchronized;

public class MainWait {

	public static void main(String[] args) {

		// Первая военная задача. Темной-темной ночью прапорщики Иванов, Петров
		// и Нечепорчук занимаются хищением военного имущества со склада родной
		// военной части. Будучи умными людьми и отличниками боевой и строевой
		// подготовки, прапорщики ввели разделение труда:
		// Иванов выносит имущество со склада, Петров грузит его в грузовик, а
		// Нечепорчук подсчитывает рыночную стоимость добычи. Требуется
		// составить многопоточное приложение, моделирующее деятельность
		// прапорщиков. При решении использовать парадигму
		// «производитель-потребитель» с активным ожиданием.

		MyQ ivanToPetrov = new MyQ();
		MyQ petrovToNechep = new MyQ();

		new Ivanov(ivanToPetrov);
		new Petrov(ivanToPetrov, petrovToNechep);
		// new Petrov(ivanToPetrov, petrovToNechep);
		new Necheporchuk(petrovToNechep);

		// System.out.println("Остановка");

	}

}
