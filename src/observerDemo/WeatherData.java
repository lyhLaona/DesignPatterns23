package observerDemo;

import java.util.ArrayList;

public class WeatherData implements Subject{
	
	private ArrayList observer;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observer = new ArrayList();
	}

	@Override
	public void registerObserver(Observer o) {
		observer.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observer.indexOf(o);
		if(i >= 0){
			observer.remove(i);
		}	
	}

	@Override
	public void notifyObserver() {
		for(int i=0; i < observer.size(); i++){
			Observer ob = (Observer) observer.get(i);
			ob.update(temperature, humidity, pressure);
		}
	}

	
	// 当从气象台得到更新观测值时，我们通知观察者
	public void measurementsChanged(){
		notifyObserver();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}	
	
}
