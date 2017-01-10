package observerDemo;

import java.util.Observable;

public class WeatherDataB extends Observable{

	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherDataB(){}
	
	public void measurementsChanged(){
		/**
		 *  在使用 notifyObservers() 之前，先调用 setChanged() 来指示状态已经改变
		 */
		setChanged();
		/**
		 * 我们没有调用 notifyObservers() 传送数据对象，这表示我们采用的做法是 “拉”
		 */
		notifyObservers();
	}
	
	public void setMeasurements(float temperature ,float humidity ,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature(){
		return temperature;
	}
	
	public float gethumidity(){
		return humidity;
	}
	
	public float getPressure(){
		return pressure;
	}
	
}
