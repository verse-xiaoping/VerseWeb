package com.verse.github;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.verse.github.dao.mapper")
public class VerseWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerseWebApplication.class, args);
	}

}
