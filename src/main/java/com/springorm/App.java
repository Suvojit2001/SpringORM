package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entity.Student;


public class App {
	public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao dao = (StudentDao) context.getBean("studentDao");
        Student student=new Student(102,"suvojit","kolkata");
       int r =dao.insert(student);
       System.out.println(r + "  added");
       
    }
}
