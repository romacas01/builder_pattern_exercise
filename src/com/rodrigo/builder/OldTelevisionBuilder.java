package com.rodrigo.builder;

import com.rodrigo.entity.Television;

public class OldTelevisionBuilder implements TelevisionBuilder {
	
	Television tv;
	
	public OldTelevisionBuilder() {
		this.tv = new Television();
	}

	@Override
	public void buildScreenDisplayType() {
		tv.setScreenDisplayType("Black and white");
	}

	@Override
	public void buildChannels() {
		tv.setChannles(10);
	}

	@Override
	public void buildScreenSize() {
		tv.setScreenSize(50);
	}

	@Override
	public Television getTv() {
		return tv;
	}

	

}
