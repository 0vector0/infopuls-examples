package course02.prj34_xml;

public class Country

{

	public int code; // Уникальный код страны
	public String name; // Название страны

	public Country(int inCode, String inName)

	{
		// ... инициализация полей
		this.code = inCode;
		this.name = inName;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}

}
