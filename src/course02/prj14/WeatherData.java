package course02.prj14;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float tempretature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			// Observer observer = observers.get(i);
			observers.get(i).update(tempretature, humidity, pressure);
		}
	}

	public void measurementChanged() {
		notifyObserver();
	}

	public void setMeasurement(float tempretature, float humidity, float pressure) {
		this.tempretature = tempretature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	// Другие методы WeatherData
}
