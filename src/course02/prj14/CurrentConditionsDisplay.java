package course02.prj14;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float tempereature;
	private float humidity;
	// private Subject weatherData;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	// @Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
		WeatherData weatherData = (WeatherData)obs; 
		this.tempereature = weatherData.getTempretature();
		this.humidity = weatherData.getHumidity();
		display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + tempereature + "F degrees and " + humidity + "% humiditi");
	}


}
