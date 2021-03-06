package com.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMainEmployeeProducerApplication {

	public static void main( final String[] args ) {
		SpringApplication.run( SpringBootMainEmployeeProducerApplication.class, args );
	}

}
