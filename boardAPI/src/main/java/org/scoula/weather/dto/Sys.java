package org.scoula.weather.dto;

public class Sys{
	private String country;
	private int sunrise;
	private int sunset;

	public String getCountry(){
		return country;
	}

	public int getSunrise(){
		return sunrise;
	}

	public int getSunset(){
		return sunset;
	}
}
