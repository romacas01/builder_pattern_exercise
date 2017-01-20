package com.rodrigo.builder;

import com.rodrigo.entity.Television;

public interface TelevisionBuilderChanning {

	TelevisionBuilderChanning buildScreenDisplayType();
	TelevisionBuilderChanning buildChannels();
	TelevisionBuilderChanning buildScreenSize();
	Television getTv();
}

