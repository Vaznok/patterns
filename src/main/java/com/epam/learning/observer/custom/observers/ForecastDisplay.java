package com.epam.learning.observer.custom.observers;

import com.epam.learning.observer.util.HeatIndexDisplay;
import com.epam.learning.observer.custom.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temprature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temprature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public String toString() {
        return "ForecastDisplay{" +
                "temperature=" + temprature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", heatindex=" + HeatIndexDisplay.computeHeatIndex(temprature, humidity) + '}';
    }
}
