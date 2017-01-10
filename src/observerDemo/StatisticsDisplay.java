package observerDemo;

public class StatisticsDisplay implements Observer,DisplayElement{
	private float temperature;  //温度
	private float humidity;     //湿度
	private Subject weatherData;//主题
	private float minValue;
	private float maxValue;
	private float averageValue;
	
	public StatisticsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println();
		System.out.println("--------StatisticsDisplay------------");
		System.out.println("最小观测值："+minValue);
		System.out.println("最大观测值："+maxValue);
		System.out.println("平均观测值："+averageValue);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		float val[] = {temp,humidity,pressure};
		minValue = maxValue = val[0];
		for(int i=0;i<val.length;i++){
			if(val[i]>maxValue){
				maxValue = val[i];
			}
			if(val[i]<minValue){
				minValue = val[i];
			}
		}
		averageValue = (temp+humidity+pressure)/3;
		
		display();
	}

}
