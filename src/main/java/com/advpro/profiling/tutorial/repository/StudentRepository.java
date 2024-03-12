package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = """
            SELECT * from students where gpa = (
            \tSELECT MAX(gpa) FROM students
            )
            limit 1""", nativeQuery = true)
    List<Student> getStudentWithHighestGpa();
}