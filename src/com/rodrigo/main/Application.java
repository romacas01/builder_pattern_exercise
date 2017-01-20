package com.rodrigo.main;

import com.rodrigo.builder.LcdTelevisionBuilder;
import com.rodrigo.builder.NewTelevisionBuilder;
import com.rodrigo.builder.OldTelevisionBuilder;
import com.rodrigo.builder.OldTelevisionBuilderChanning;
import com.rodrigo.entity.Television;
import com.rodrigo.generator.TelevisionGenerator;

public class Application {

	public static void main(String[] args) {

        OldTelevisionBuilder otb = new OldTelevisionBuilder();
        NewTelevisionBuilder ntb = new NewTelevisionBuilder();
        LcdTelevisionBuilder ltb = new LcdTelevisionBuilder();
        
        TelevisionGenerator tvg1 = new TelevisionGenerator(otb);
        TelevisionGenerator tvg2 = new TelevisionGenerator(ntb);
        TelevisionGenerator tvg3 = new TelevisionGenerator(ltb);
        
        tvg1.makeTv();
        Television tv1 = tvg1.getTv();
        System.out.println("The first television has " + tv1.getChannels() + " channels, displays the screen on " +
                            tv1.getScreenDisplayType() + " and is " + tv1.getScreenSize() + " inches big.");
	
        tvg2.makeTv();
        Television tv2 = tvg2.getTv();
        System.out.println("The second television has " + tv2.getChannels() + " channels, displays the screen on " +
                            tv2.getScreenDisplayType() + " and is " + tv2.getScreenSize() + " inches big.");
	
        tvg3.makeTv();
        Television tv3 = tvg3.getTv();
        System.out.println("The third television has " + tv3.getChannels() + " channels, displays the screen on " +
                            tv3.getScreenDisplayType() + " and is " + tv3.getScreenSize() + " inches big.");
	
        System.out.println("==================================================================================================");
	    
        System.out.println("Executing with channing methods");
        
        OldTelevisionBuilderChanning otb2 = new OldTelevisionBuilderChanning();
        otb2.buildScreenDisplayType().buildChannels().buildScreenSize();
        Television tv4 = otb2.getTv();
        System.out.println("The fouth television has " + tv4.getChannels() + " channels, displays the screen on " +
                tv4.getScreenDisplayType() + " and is " + tv4.getScreenSize() + " inches big.");
	}

}
