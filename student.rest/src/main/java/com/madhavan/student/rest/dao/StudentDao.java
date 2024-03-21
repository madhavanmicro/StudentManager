package com.madhavan.student.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madhavan.student.rest.model.Student;


@Repository
public interface StudentDao extends JpaRepository<Student,Integer> {

}
