package com.example.demo.student;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
@AllArgsConstructor
public class StudentConfig {
    private final StudentRepository studentRepository;

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            var mariam = new StudentModel(
                    "Mariam",
                    "mariam@hmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5));

            var alex = new StudentModel(
                    "Alex",
                    "alex@hmail.com",
                    LocalDate.of(2010, Month.JANUARY, 5));

            studentRepository.saveAll(List.of(mariam, alex));
        };
    }
}
