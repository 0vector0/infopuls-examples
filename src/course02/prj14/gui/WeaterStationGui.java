package course02.prj14.gui;

import course02.prj14.WeatherData;
import course02.prj14.gui.WeaterDisplayGui;
import course02.prj14.gui.WeatherDataGui;

public class WeaterStationGui {
	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();

		WeaterDisplayGui weaterStationGui = new WeaterDisplayGui(weatherData);
		WeatherDataGui weatherDataGui = new WeatherDataGui(weatherData);

		weatherDataGui.setVisible(true);
		weaterStationGui.setVisible(true);

	}
}
