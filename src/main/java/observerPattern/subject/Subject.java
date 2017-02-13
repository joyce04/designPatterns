package observerPattern.subject;

import observerPattern.observer.Observer;

public interface Subject {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObservers();
}
