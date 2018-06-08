package com.epam.learning.observer.custom.observers;

import com.epam.learning.observer.custom.Subject;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temprature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public void update(float temprature, float humidity, float pressure) {
        this.temprature = temprature;
        this.humidity = humidity;
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{" +
                "temprature=" + temprature +
                ", humidity=" + humidity +
                '}';
    }
}
