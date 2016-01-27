package course02.prj14;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float tempretature;
	private float maxTemperature;
	private float minTemperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("maxTemperature " + maxTemperature);
		System.out.println("minTemperature " + minTemperature);
		// System.out.println(humidity);
		// System.out.println(pressure);

	}

	@Override
	public void update(float tempretature, float humidity, float pressure) {
		this.tempretature = tempretature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		if (tempretature > maxTemperature) {
			maxTemperature = tempretature;
		}

		// TODO поиск минимальной температуры!!!
		minTemperature = tempretature;
		if (tempretature < minTemperature) {
			minTemperature = tempretature;
		}
		display();

	}

}
