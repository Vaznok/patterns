package com.epam.learning.observer.jdk.observers;

import com.epam.learning.observer.jdk.WeatherData;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temprature;
    private float humidity;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
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
            display();
        }
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{" +
                "temprature=" + temprature +
                ", humidity=" + humidity +
                '}';
    }
}
