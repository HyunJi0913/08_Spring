package org.scoula.weather.dto;

public class Main{
	private Object temp;
	private Object temp_Min;
	private int grndLevel;
	private int humidity;
	private int pressure;
	private int seaLevel;
	private Object feelsLike;
	private Object temp_Max;

	public Object getTemp(){
		return temp;
	}

	public Object getTempMin(){
		return temp_Min;
	}

	public int getGrndLevel(){
		return grndLevel;
	}

	public int getHumidity(){
		return humidity;
	}

	public int getPressure(){
		return pressure;
	}

	public int getSeaLevel(){
		return seaLevel;
	}

	public Object getFeelsLike(){
		return feelsLike;
	}

	public Object getTempMax(){
		return temp_Max;
	}
}
