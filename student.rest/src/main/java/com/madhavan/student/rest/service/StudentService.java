package com.madhavan.student.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhavan.student.rest.dao.StudentDao;
import com.madhavan.student.rest.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao repo;

	public void add(Student s) {
		repo.save(s);

	}

	public List<Student> getAll() {

		List<Student> students = repo.findAll();
		return students;
	}

	public void remove(Integer id) {
		repo.deleteById(id);

	}

	public Student getById(Integer id) {

		return repo.findById(id).orElse(new Student());
	}

}
