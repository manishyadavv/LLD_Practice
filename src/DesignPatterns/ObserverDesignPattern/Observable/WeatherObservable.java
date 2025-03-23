package DesignPatterns.ObserverDesignPattern.Observable;


//https://www.youtube.com/watch?v=Ep9_Zcgst3U&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=5
public interface WeatherObservable {

    public void add();

    public void remove();
    public void notifyAllObservers();
    public void updateTemperature(int temperature);


}
