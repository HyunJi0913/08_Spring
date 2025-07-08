package org.scoula.weather.dto;

public class Wind{
	private int deg;
	private Object speed;
	private Object gust;

	public int getDeg(){
		return deg;
	}

	public Object getSpeed(){
		return speed;
	}

	public Object getGust(){
		return gust;
	}
}
