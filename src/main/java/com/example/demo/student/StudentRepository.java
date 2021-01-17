package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // unnecessary annotation
public interface StudentRepository extends JpaRepository<StudentModel, Long> {
}
