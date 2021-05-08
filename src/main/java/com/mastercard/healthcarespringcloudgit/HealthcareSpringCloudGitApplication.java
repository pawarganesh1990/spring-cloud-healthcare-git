package com.mastercard.healthcarespringcloudgit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HealthcareSpringCloudGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareSpringCloudGitApplication.class, args);
	}

}
