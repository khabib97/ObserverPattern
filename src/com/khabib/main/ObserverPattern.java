package com.khabib.main;

import com.khabib.concrete.observable.WeatherData;
import com.khabib.concrete.observer.AverageWeatherObserver;
import com.khabib.concrete.observer.CurrentWeatherObserver;
import com.khabib.pattern.observer.WeatherObserver;

public class ObserverPattern {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		WeatherObserver currentWeatherObserver = new CurrentWeatherObserver(weatherData);
		WeatherObserver averageWeatherObserver = new AverageWeatherObserver(weatherData);
		
		weatherData.addWeatherObserver(currentWeatherObserver);
		weatherData.addWeatherObserver(averageWeatherObserver);
		
		weatherData.setMeasurement(33, 87, 1086);
		weatherData.setMeasurement(30, 82, 1006);
		weatherData.setMeasurement(29, 85, 1096);
		weatherData.setMeasurement(25, 92, 1056);
	}

}
