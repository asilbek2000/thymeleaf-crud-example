package com.example.mvccrud.repository;

import com.example.mvccrud.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepository extends JpaRepository<Course, Long> {

}

