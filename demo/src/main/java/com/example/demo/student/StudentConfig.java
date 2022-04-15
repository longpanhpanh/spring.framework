package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student longlong = new Student(
                    "Long",
                    "longlong@gmail.com",
                    LocalDate.of(1997, Month.OCTOBER, 01));

            Student panhpanh = new Student(
                    "Panh",
                    "panhpanh@gmail.com",
                    LocalDate.of(1997, Month.AUGUST, 22));

            repository.saveAll(
                    List.of(longlong, panhpanh)
            );
        };
    }
}
