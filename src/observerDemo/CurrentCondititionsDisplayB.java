package observerDemo;

import java.util.Observable;
import java.util.Observer;

public class CurrentCondititionsDisplayB implements Observer,DisplayElement{
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentCondititionsDisplayB(Observable ob){
		this.observable = ob;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions:" + temperature +" F degerees and "
				+ humidity + "% humdity"
				);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherDataB){
			WeatherDataB dataB = (WeatherDataB) obs;
			this.temperature = dataB.getTemperature();
			this.humidity = dataB.gethumidity();
			display();
		}
		
	}

}
