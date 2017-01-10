package observerDemo;

public class CurrentCondititionsDisplay implements Observer,DisplayElement{
	private float temperature;  //温度
	private float humidity;     //湿度
	private Subject weatherData;//主题
	
	public CurrentCondititionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions:" + temperature +" F degerees and "
				+ humidity + "% humdity"
				);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
