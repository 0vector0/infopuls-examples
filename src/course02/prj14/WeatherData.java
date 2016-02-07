package course02.prj14;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {

	// private ArrayList<Observer> observers;
	private float tempretature;
	private float humidity;
	private float pressure;

	public WeatherData() {
	}



	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurement(float tempretature, float humidity, float pressure) {
		this.tempretature = tempretature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public float getTempretature() {
		return tempretature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	// Другие методы WeatherData
}
