package acc.br.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

@Entity
@Table
public class Student {
    
    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private int age;
    
}
