package com.khabib.concrete.observer;

import com.khabib.concrete.observable.WeatherData;
import com.khabib.helper.DisplayElement;
import com.khabib.pattern.observer.WeatherObserver;

public class CurrentWeatherObserver implements WeatherObserver, DisplayElement {
	
	private WeatherData weatherData;
	
	public CurrentWeatherObserver(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

	@Override
	public void display() {
		System.out.println("Current Weather:");
		System.out.printf("Temperature: %f, Humidity: %f, Pressure: %f \n", weatherData.getTemperature(), weatherData.getHumidity(), weatherData.getPressure());

	}

	@Override
	public void update() {
		display();

	}

}
