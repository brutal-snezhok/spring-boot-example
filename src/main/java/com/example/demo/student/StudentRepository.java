package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // unnecessary annotation
public interface StudentRepository extends JpaRepository<StudentModel, Long> {

    @Query("SELECT s FROM StudentModel s WHERE s.email = ?1")
    Optional<StudentModel> findStudentByEmail(String email);
}
