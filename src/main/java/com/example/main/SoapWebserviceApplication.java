package com.example.main;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapWebserviceApplication {


	public static void main(String[] args) {
		SpringApplication.run(SoapWebserviceApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	//http://localhost:8089/ws/studentDetailsWsdl.wsdl
}
