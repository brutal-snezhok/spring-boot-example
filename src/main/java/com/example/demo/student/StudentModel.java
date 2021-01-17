package com.example.demo.student;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;
}
