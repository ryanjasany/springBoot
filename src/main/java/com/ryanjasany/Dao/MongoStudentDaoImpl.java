package com.ryanjasany.Dao;

import com.ryanjasany.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.Collection;

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao {

    Connection mongoConnection;

    @Override
    public Collection<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDb(Student student) {

    }
}
