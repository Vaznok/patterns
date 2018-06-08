package com.epam.learning.observer.custom;

import com.epam.learning.observer.custom.observers.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
