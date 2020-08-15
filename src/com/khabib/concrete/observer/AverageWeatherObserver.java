package com.khabib.concrete.observer;

import java.util.ArrayList;
import java.util.List;

import com.khabib.concrete.observable.WeatherData;
import com.khabib.helper.DisplayElement;
import com.khabib.pattern.observer.WeatherObserver;

public class AverageWeatherObserver implements DisplayElement, WeatherObserver {
	
	private WeatherData weatherData;
	private List<Float> temperatureList;
	private List<Float> humidityList;
	private List<Float> pressureList;

	public AverageWeatherObserver(WeatherData weatherData) {
		this.weatherData = weatherData;
		
		temperatureList = new ArrayList<Float>();
		humidityList = new ArrayList<Float>();
		pressureList = new ArrayList<Float>();
	}
	@Override
	public void update() {
		temperatureList.add(weatherData.getTemperature());
		humidityList.add(weatherData.getHumidity());
		pressureList.add(weatherData.getPressure());
		display();

	}

	private float calculateAvgFromList(List<Float> dataList) {
		float result = 0;
		for (float fdata : dataList) {
			result = result + fdata;
		}
		return result/ dataList.size();
	}
	
	@Override
	public void display() {
		System.out.println("Average Weather:");
		System.out.printf("Temperature: %f, Humidity: %f, Pressure: %f \n", calculateAvgFromList(temperatureList), calculateAvgFromList(humidityList), calculateAvgFromList(pressureList));
	}

}
