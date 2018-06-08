package com.epam.learning.observer.jdk;

import com.epam.learning.observer.jdk.observers.CurrentConditionDisplay;
import com.epam.learning.observer.jdk.observers.ForecastDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurementsChanged(20,35,4);
        System.out.println("data changed");
        weatherData.setMeasurementsChanged(30,15,2);
        System.out.println("data changed");
        weatherData.setMeasurementsChanged(25,3,1);
    }
}
