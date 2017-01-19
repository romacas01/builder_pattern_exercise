package com.rodrigo.builder;

import com.rodrigo.entity.Television;

public class NewTelevisionBuilder implements TelevisionBuilder{

	Television tv;
	
	public NewTelevisionBuilder() {
		this.tv = new Television();
	}
	
	@Override
	public void buildScreenDisplayType() {
		tv.setScreenDisplayType("Colored");
	}

	@Override
	public void buildChannels() {
		tv.setChannles(50);
	}

	@Override
	public void buildScreenSize() {
		tv.setScreenSize(60);
	}

	@Override
	public Television getTv() {
		return tv;
	}

}
