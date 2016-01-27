package course02.prj14;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float tempereature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + tempereature + "F degrees and " + humidity + "% humiditi");
	}

	@Override
	public void update(float tempereature, float humidity, float pressure) {
		this.tempereature = tempereature;
		this.humidity = humidity;
		display();
	}

}
