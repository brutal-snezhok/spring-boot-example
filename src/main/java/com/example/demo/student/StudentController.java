package com.example.demo.student;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/all")
    public List<StudentModel> getStudents() {
        return studentService.getStudents();
    }
}
