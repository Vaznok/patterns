package com.epam.learning.observer.custom;

import com.epam.learning.observer.custom.observers.CurrentConditionDisplay;
import com.epam.learning.observer.custom.observers.ForecastDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurementsChanged(80,65,14);
        System.out.println("data changed");
        weatherData.setMeasurementsChanged(70,35,24);
        System.out.println("data changed");
        weatherData.setMeasurementsChanged(85,23,11);
    }
}
