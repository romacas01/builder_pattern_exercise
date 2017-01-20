package com.rodrigo.builder;

import com.rodrigo.entity.Television;

public class OldTelevisionBuilderChanning implements TelevisionBuilderChanning {
	
	Television tv;
	
	public OldTelevisionBuilderChanning() {
		this.tv = new Television();
	}

	@Override
	public OldTelevisionBuilderChanning buildScreenDisplayType() {
		tv.setScreenDisplayType("Black and white");
		return this;
	}

	@Override
	public OldTelevisionBuilderChanning buildChannels() {
		tv.setChannles(10);
		return this;
	}

	@Override
	public OldTelevisionBuilderChanning buildScreenSize() {
		tv.setScreenSize(50);
		return this;
	}

	@Override
	public Television getTv() {
		return tv;
	}

	

}
