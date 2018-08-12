package com.headsfirst.ObserverPattern.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
