package com.rodrigo.builder;

import com.rodrigo.entity.Television;

public interface TelevisionBuilder {

	void buildScreenDisplayType();
	void buildChannels();
	void buildScreenSize();
	Television getTv();
}
