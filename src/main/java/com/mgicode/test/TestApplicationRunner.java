package com.mgicode.test;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;



@Component
public class TestApplicationRunner implements ApplicationRunner{

	
    @Override
    public void run(ApplicationArguments args) throws Exception {
           	
    	System.out.println("===MyApplicationRunner==="+ Arrays.asList(args.getSourceArgs()));
        System.out.println("===getOptionNames========"+args.getOptionNames());
        System.out.println("===getOptionValues======="+args.getOptionValues("config"));
        System.out.println("==getOptionValues========"+args.getOptionValues("spring.io"));
     
        
      //  ===MyApplicationRunner===[--config=d:dessd/esdd, --spring.io=desd]
      //  ===getOptionNames========[spring.io, config]
      //  ===getOptionValues=======[d:dessd/esdd]
      //  ==getOptionValues========[desd]
    
    }
}


//--config=d:dessd/esdd --spring.io