package com.springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import com.springorm.entity.Student;


public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	@Transactional
	//save object
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i; 
	}
	
	// get a single object
	public Student getStudent(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		return student;
	}
	
	// get multiple object
	
	public List<Student> getAllStudents(){
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//deleting the data
	@Transactional
	public void deleteStudent(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
		
	}
	
	//update
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
		
	}
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
