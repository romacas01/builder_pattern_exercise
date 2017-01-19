package com.rodrigo.builder;

import com.rodrigo.entity.Television;

public class LcdTelevisionBuilder implements TelevisionBuilder{
	
	Television tv;
	
	public LcdTelevisionBuilder() {
		this.tv = new Television();
	}

	@Override
	public void buildScreenDisplayType() {
	    tv.setScreenDisplayType("16,777,216 colours");		
	}

	@Override
	public void buildChannels() {
		tv.setChannles(120);
	}

	@Override
	public void buildScreenSize() {
		tv.setScreenSize(70);
	}

	@Override
	public Television getTv() {
		return tv;
	}

}
