package com.vits.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vits.dto.Student;

@Repository
public interface StudentDetailsDao extends CrudRepository<Student,Integer>{

}
