package com.mgicode.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLiner implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
	  System.out.println("this is enter");
    // Put your logic here
	  for (String arg:args) {
		  
		  System.out.println(arg);
	  }
  }

}

//mvn install
//java   -Dmde=2332 -Dpath=sedss -Dmdes=dsedd -jar mgicode-interface-test-1.0-SNAPSHOT.jar


//java   -jar mgicode-interface-test-1.0-SNAPSHOT.jar  --config=d:dessd/esdd --spring.io=desd
