package com.jdbcon.JDBCex;

import com.jdbcon.JDBCex.model.Student;
import com.jdbcon.JDBCex.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JdbCexApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(JdbCexApplication.class, args);
		Student s =context.getBean(Student.class);

		s.setRollNo(104);
		s.setName("amar");
		s.setMark(65);

		StudentService service= context.getBean(StudentService.class);

		service.addStudent(s);


		List<Student> students = service.getStudents();
		System.out.println(students);

	}

}
