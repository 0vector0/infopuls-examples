package course02.prj14;

import course02.prj14.gui.WeaterDisplayGui;
import course02.prj14.gui.WeatherDataGui;

public class WeaterStation {
	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		// WeaterDisplayGui weaterStationGui = new
		// WeaterDisplayGui(weatherData);
		// WeatherDataGui weatherDataGui = new WeatherDataGui(weatherData);

		// weatherDataGui.setVisible(true);
		// weaterStationGui.setVisible(true);

		weatherData.setMeasurement(80, 65, 30.4f);
		weatherData.setMeasurement(82, 70, 29.2f);
		weatherData.setMeasurement(78, 90, 29.2f);

	}
}
