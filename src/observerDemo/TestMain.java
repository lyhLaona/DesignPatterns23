package observerDemo;

public class TestMain {

	public static void main(String[] args) {
		/**
		 *  自己编写的 observer
		 */
		WeatherData weatherData = new WeatherData();
		CurrentCondititionsDisplay condititionsDisplay = new CurrentCondititionsDisplay(weatherData);
		weatherData.setMeasurements(11, 12, 13.4f);
		weatherData.setMeasurements(21, 22, 23.4f);
		weatherData.setMeasurements(31, 32, 33.4f);
//		weatherData.removeObserver(condititionsDisplay);
//		StatisticsDisplay s = new StatisticsDisplay(weatherData);
//		weatherData.setMeasurements(41, 42, 43.4f);
//		weatherData.setMeasurements(51, 52, 53.4f);
//		weatherData.setMeasurements(61, 62, 63.4F);
		
		System.out.println();
		
		/**
		 *  jdk 自带的 observer
		 */
		WeatherDataB dataB = new WeatherDataB();
		CurrentCondititionsDisplayB currentCondititionsDisplayB = new CurrentCondititionsDisplayB(dataB);
		dataB.setMeasurements(11, 12, 13.4f);
		dataB.setMeasurements(21, 22, 23.4f);
		dataB.setMeasurements(31, 32, 33.4f);
		
	}
	
}
