package com.wooweb.boardhcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BoardhcodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardhcodeApplication.class, args);
	}

}
