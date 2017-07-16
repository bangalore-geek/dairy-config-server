package com.dairy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DairyConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DairyConfigServerApplication.class, args);
	}
}
