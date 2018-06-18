package com.ryanjasany.Service;

import com.ryanjasany.Dao.FakeStudentDaoImpl;
import com.ryanjasany.Dao.MySQLDaoImpl;
import com.ryanjasany.Dao.StudentDao;
import com.ryanjasany.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    MySQLDaoImpl mySQLDao;

    public Collection<Student> getAllStudents(){

        return this.mySQLDao.findAll();
    }

    public Student getStudentById(int id){

        return this.mySQLDao.findById(id).orElse(new Student());
    }

    public void removeStudentById(int id) {

        this.mySQLDao.deleteById(id);

    }

    public void updateStudent(Student student){

        this.mySQLDao.saveAndFlush(student);
    }

    public void insertStudent(Student student) {

        this.mySQLDao.save(student);
    }
}
