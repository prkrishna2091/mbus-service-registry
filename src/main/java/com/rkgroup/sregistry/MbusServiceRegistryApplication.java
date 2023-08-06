package com.rkgroup.sregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MbusServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbusServiceRegistryApplication.class, args);
	}

}
