package com.khabib.pattern.observable;

import com.khabib.pattern.observer.*;

public interface WeatherObservable {
	
	public void addWeatherObserver(WeatherObserver weatherObserver );
	public void removeWeatherObserver(WeatherObserver weatherObserver);
	public void notifyUpdateToObservers();

}
