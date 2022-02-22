package acc.br.student.services;
import java.util.ArrayList;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acc.br.student.model.Student;
import acc.br.student.repository.StudentRepository;
//import antlr.collections.List;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudent()
    {
        List<Student> students = new ArrayList<Student>();
        studentRepository.findAll().forEach(student -> students.add(student));
        return students;
    }

    public Student getStudentById(int id)
    {
        return studentRepository.findById(id).get();
    }

    public void saveOrUpdate(Student student)
    {
        studentRepository.save(student);
    }

    public void delete(int id)
    {
        studentRepository.deleteById(id);
    }

	public void save(Student student) {
	}
}
