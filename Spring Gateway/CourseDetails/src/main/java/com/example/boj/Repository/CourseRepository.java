package com.example.boj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.boj.Model.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

}
