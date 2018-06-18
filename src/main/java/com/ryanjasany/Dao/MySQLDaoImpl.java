package com.ryanjasany.Dao;

import com.ryanjasany.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
@Qualifier("MySQL")
public interface MySQLDaoImpl extends JpaRepository<Student, Integer> {



}
