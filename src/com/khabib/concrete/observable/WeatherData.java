package com.khabib.concrete.observable;

import java.util.ArrayList;
import java.util.List;

import com.khabib.pattern.observable.WeatherObservable;
import com.khabib.pattern.observer.WeatherObserver;

public class WeatherData implements WeatherObservable {
	
	List<WeatherObserver> weatherObserverList;
    private float temperature;
    private float humidity;
    private float pressure;
	
	
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	public void setMeasurement(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyUpdateToObservers();
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public WeatherData() {
		weatherObserverList = new ArrayList<WeatherObserver>();
	}

	@Override
	public void addWeatherObserver(WeatherObserver weatherObserver) {
		weatherObserverList.add(weatherObserver);
	}

	@Override
	public void removeWeatherObserver(WeatherObserver weatherObserver) {
		if (weatherObserverList.contains(weatherObserver)) {
			weatherObserverList.remove(weatherObserver);
		}
	}

	@Override
	public void notifyUpdateToObservers() {
		for (WeatherObserver weatherObserver : weatherObserverList) {
			weatherObserver.update();
		}
	}

}
