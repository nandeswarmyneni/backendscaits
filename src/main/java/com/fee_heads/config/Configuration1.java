package com.fee_heads.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Configuration1 {

	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();

	}

}
