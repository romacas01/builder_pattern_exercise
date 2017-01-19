package com.rodrigo.generator;

import com.rodrigo.builder.TelevisionBuilder;
import com.rodrigo.entity.Television;

public class TelevisionGenerator {

	TelevisionBuilder tvb;
	
	public TelevisionGenerator(TelevisionBuilder tvb) {
		this.tvb = tvb;
	}
	
	public void makeTv() {
		this.tvb.buildChannels();
		this.tvb.buildScreenDisplayType();
		this.tvb.buildScreenSize();
	}
	
	public Television getTv() {
		return this.tvb.getTv();
	}
}
