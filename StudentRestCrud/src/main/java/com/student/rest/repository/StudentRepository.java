package com.student.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.rest.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
