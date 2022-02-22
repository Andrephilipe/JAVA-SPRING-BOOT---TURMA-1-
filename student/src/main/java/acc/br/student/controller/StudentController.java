package acc.br.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import acc.br.student.model.Student;
import acc.br.student.repository.StudentRepository;
import acc.br.student.service.StudentService;
import antlr.collections.List;


@RestController
public class StudentController {
    
    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    private List<Student> getAllStudent()
    {
        return studentService.findAll();
    }
    @GetMapping("/student/{id}")
    private Student getStudantById(@PathVariable int id){
        return studentService.findById(id).get();
    }

}
