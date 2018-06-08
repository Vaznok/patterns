package com.epam.learning.observer.jdk.observers;

import com.epam.learning.observer.jdk.WeatherData;
import com.epam.learning.observer.util.HeatIndexDisplay;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temprature;
    private float humidity;
    private float pressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temprature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
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
