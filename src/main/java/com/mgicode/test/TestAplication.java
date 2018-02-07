package com.mgicode.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TestAplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(TestAplication.class).web(false).run(args);
	}
}
