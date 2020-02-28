package com.example.profession;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.profession.mapper")
public class ProfessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfessionApplication.class, args);
	}

}
