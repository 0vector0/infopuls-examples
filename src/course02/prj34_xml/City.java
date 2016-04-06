package course02.prj34_xml;

//Класс "Город"

public class City

{
	public int code; // Уникальный код города
	public String name; // Название города
	public boolean isCapital; // Признак столицы
	public int count; // Количество жителей
	public Country country; // Страна

	public City(int inCode, String inName, boolean inCapital, int inCount, Country inCountry)

	{
		// ... инициализация полей
		this.code = inCode;
		this.name = inName;
		this.isCapital = inCapital;
		this.count = inCount;
		this.country = inCountry;
	}

	@Override
	public String toString() {
		return "City [code=" + code + ", name=" + name + ", isCapital=" + isCapital + ", count=" + count + ", country="
				+ country + "]";
	}

}
