package com.rodrigo.entity;

public class Television implements TelevisionBluePrint{
	
	private int channels;
	private String screenDisplayType;
	private int screenSize;

	@Override
	public void setChannles(int channels) {
		this.channels = channels;
	}
	
	public int getChannels() {
		return this.channels;
	}

	@Override
	public void setScreenDisplayType(String screenDisplayType) {
		this.screenDisplayType = screenDisplayType;
	}
	
	public String getScreenDisplayType() {
		return this.screenDisplayType;
	}

	@Override
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	
	public int getScreenSize() {
		return this.screenSize;
	}


}
