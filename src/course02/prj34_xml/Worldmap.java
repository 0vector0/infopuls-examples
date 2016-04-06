package course02.prj34_xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Worldmap

{

	// Массив стран
	private ArrayList<Country> countries;

	// Массив городов
	private ArrayList<City> cities;

	public Worldmap() {
		countries = new ArrayList<>();
		cities = new ArrayList<>();
	}

	// Записать данные в файл XML
	public void saveToFile(String filename)

	{

	}

	// Прочитать данные из файла XML
	public void loadFromFile(String filename)

	{
		DocumentBuilderFactory dbf = null;
		DocumentBuilder db = null;
		try

		{
			dbf = DocumentBuilderFactory.newInstance();
			db = dbf.newDocumentBuilder();
		}

		catch (ParserConfigurationException e) {
		}

		Document doc = null;
		try {
			doc = db.parse(new File("xml\\" + filename + ".xml"));
		} catch (SAXException ex) {
			System.out.println("file is not correct");
		}

		catch (IOException ex) {
			System.out.println("file not found");
		}

		// Получаем корневой элемент
		Element root = doc.getDocumentElement();
		if (root.getTagName().equals("map"))

		{

			// Получаем коллекцию стран
			NodeList listCountries = root.getElementsByTagName("country");

			// Проходим по странам
			for (int i = 0; i < listCountries.getLength(); i++) {
				// Получаем текущую срану
				Element country = (Element) listCountries.item(i);
				String countryCode = country.getAttribute("id");
				String countryName = country.getAttribute("name");
				int countryCodeInt = Integer.parseInt(countryCode);
				Country currentCountry = new Country(countryCodeInt, countryName);
				// System.out.println(currentCountry);
				countries.add(currentCountry);

				// System.out.println(countryCode + " " + countryName + ":");

				// Получаем коллекцию городов для страны
				NodeList listCities = country.getElementsByTagName("city");

				// Проходим по городам
				for (int j = 0; j < listCities.getLength(); j++) {

					// Получаем текущий город
					Element city = (Element) listCities.item(j);
					String cityCode = city.getAttribute("id");
					int cityCodeInt = Integer.parseInt(cityCode);
					String cityName = city.getAttribute("name");
					String cityCapital = city.getAttribute("iscap");
					// int cityCapitalInt = Integer.parseInt(cityCapital);
					boolean cityCapitalBollean = (cityCapital.equals("1") ? true : false);
					// if (cityCapitalInt == 1) {
					// cityCapitalBollean = true;
					// }
					String cityCount = city.getAttribute("count");
					int cityCountInt = Integer.parseInt(cityCount);
					City currentCity = new City(cityCodeInt, cityName, cityCapitalBollean, cityCountInt,
							currentCountry);
					// System.out.println(currentCity);
					cities.add(currentCity);

				}

			}

		}

	}

	// Добавить новую страну
	public void addCountry(int code, String name) {

		// countries.
		// если страны с заданным кодом в массиве countries еще нет -
		// добавляем новую страну в массив
		// в противном случае генерируем исключение

	}

	// Получить страну c заданным кодом

	public Country getCountry(int code)

	{
		// возвращаем страну с заданным кодом
		// если страны с заданным кодом в массиве countries нет -
		// генерируем исключение
		return null;
	}

	// Получить страну c заданным номером

	public Country getCountryInd(int index)

	{
		// возвращаем страну с заданным порядковым номером
		// если номер выходит за границы индексов массива -
		// генерируем исключение
		return null;
	}

	// Получить количество стран
	public int countCountries() {
		// возвращаем количество стран
		return countries.size();
	}

	// Удалить страну
	public void deleteCountry(int code)

	{

		// Удаляем страну с заданным кодом, а также все города,
		// ссылающиеся на данну страну
		// Если страны с заданным кодом в массиве countries нет -
		// генерируем исключение

	}

	// Добавить новый город для заданной страны
	public void addCity(int code, String name, boolean isCapital, int count, int countryCode)

	{
		// если город с заданным кодом code уже есть
		// - генерируем исключение
		// если страны с заданным кодом countryCode нет
		// - генерируем исключение
		// в противном случае, добавляем новый город
	}

	public void printCountries() {
		for (Country currCountry : countries) {
			System.out.println(currCountry.name);
			for (City curCity : cities) {
				if (curCity.country.equals(currCountry)) {
					System.out.println(curCity.name);
				}
			}
			System.out.println();
		}
	}
}
